package api_rest_attornatus.controller;

import java.net.URI;
import java.util.List;
import java.util.Map;

import javax.tools.DocumentationTool.Location;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import api_rest_attornatus.model.Pessoa;
import api_rest_attornatus.repository.PessoaRepository;
import api_rest_attornatus.repository.ResourceNotFoundException;
import jakarta.servlet.Servlet;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
  
  private final PessoaRepository pessoaRepository;

  public PessoaController(PessoaRepository pessoaRepository){
    this.pessoaRepository = pessoaRepository;
  }

  @PostMapping
  public ResponseEntity<Pessoa> criarPessoa(@RequestBody Pessoa pessoa) {
    Pessoa pessoaSalva = pessoaRepository.save(pessoa);
    URI location = ServletUriComponentsBuilder
    .fromCurrentRequest().path("{id}")
    .buildAndExpand(pessoaSalva.getId()).toUri();
    return ResponseEntity.created(location).body(pessoaSalva);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Pessoa> editarPessoa(@PathVariable Long id, 
  @RequestBody Pessoa pessoa) {
    Pessoa pessoaSalva = pessoaRepository.findById(id)
    .map(p->{
      p.setNome(pessoa.getNome());
      p.setDataDeNascimento(pessoa.getDataDeNascimento());
      return pessoaRepository.save(p);
    }).orElseThrow(()-> new ResourceNotFoundException("Pessoa com id " + id + " não encontrada"));
    return ResponseEntity.ok(pessoaSalva);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Pessoa> consultarPessoa(@PathVariable Long id) {
    Pessoa pessoa = pessoaRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Pessoa com id " + id + " não encontrada"));
    return ResponseEntity.ok(pessoa);
  }

  @GetMapping
  public List<Pessoa> listarPessoas() {
    return pessoaRepository.findAll();
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> excluirPessoa(@PathVariable Long id) {
    pessoaRepository.deleteById(id);
    return ResponseEntity.noContent().build();
  }
}
