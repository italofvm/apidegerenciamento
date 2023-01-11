package api_rest_attornatus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import api_rest_attornatus.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
