package api_rest_attornatus.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rua;

    private String cidade;

    private String logradouro;

    private String cep;

    @ManyToOne(cascade = CascadeType.ALL)
    private Pessoa pessoa;

    public Long getId() {
      return id;
    }

    public void setId(Long id) {
      this.id = id;
    }

    public String getRua() {
      return rua;
    }

    public void setRua(String rua) {
      this.rua = rua;
    }

    public String getCidade() {
      return cidade;
    }

    public void setCidade(String cidade) {
      this.cidade = cidade;
    }

    public String getLogradouro() {
      return logradouro;
  }


  public void setLogradouro(String logradouro) {
      this.logradouro = logradouro;
  }

    public String getCep() {
      return cep;
    }

    public void setCep(String cep) {
      this.cep = cep;
    }

    public Pessoa getPessoa() {
      return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
      this.pessoa = pessoa;
    }


}

