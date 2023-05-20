package br.com.fujideia.iesp.tecback.model.DTO;

import br.com.fujideia.iesp.tecback.model.Genero;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Builder
@Data
public class FilmeDTO implements Serializable {

    private String titulo;

    private int classe_indicativa;

    private String diretor;

    private String idioma;

    private String legenda;

    @Column(name = "ds_sinopse", length = 500)
    private String sinopse;
}

//tabela na qual são adicionados filmes com suas informações são escritas e o usuario pode visualizar.