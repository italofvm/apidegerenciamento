package api_rest_attornatus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api_rest_attornatus.model.Endereco;
import api_rest_attornatus.model.Pessoa;
import api_rest_attornatus.repository.EnderecoRepository;
import api_rest_attornatus.repository.PessoaRepository;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {

  @Autowired
  private PessoaRepository pessoaRepository;

  @Autowired
  private EnderecoRepository enderecoRepository;

  @PostMapping
  public Pessoa createPessoa(@RequestBody Pessoa pessoa) {
    return pessoaRepository.save(pessoa);
  }

  @PutMapping
  public Pessoa updatePessoa(@RequestBody Pessoa pessoa) {
    return pessoaRepository.save(pessoa);
  }

  @GetMapping("/{id}")
  public Pessoa getPessoa(@PathVariable Long id) {
    return pessoaRepository.findById(id).orElse(null);
  }

  @GetMapping
  public List<Pessoa> listPessoas() {
    return pessoaRepository.findAll();
  }

  @DeleteMapping("/{id}")
  public void deletePessoa(@PathVariable Long id){
    pessoaRepository.deleteById(id);
  }

  @PostMapping("/{id}/endereco")
  public Endereco createEndereco(@PathVariable Long id, @RequestBody Endereco endereco) {
    Pessoa pessoa = pessoaRepository.findById(id).orElse(null);
    if (pessoa != null) {
      endereco.setPessoa(pessoa);
      return enderecoRepository.save(endereco);
    }
    return null;
  }

}
