package com.example.api.Endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Endereco{
    private String logradouro;
    private String bairro;
    private String cep;
    private String complemento;
    private String numero;
    private String uf;
    private String cidade;

    public Endereco(DadosEndereco dadosEndereco){
        this.logradouro = dadosEndereco.logradouro();
        this.bairro = dadosEndereco.bairro();
        this.cep = dadosEndereco.cep();
        this.complemento = dadosEndereco.complemento();
        this.numero = dadosEndereco.numero();
        this.uf = dadosEndereco.uf();
        this.cidade = dadosEndereco.cidade();

    }
}
