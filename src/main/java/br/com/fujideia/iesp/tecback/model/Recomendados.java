package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "tb_genero")
public class Recomendados {

    @Id
    @Column(nullable = false)
    private Integer id;

    private Date data;

    @ManyToOne
   @JoinColumn
    private Filme filme;

    @ManyToOne
   @JoinColumn
    private Series series;

}

//tabela onde a netflix filtra o conteudo assistido pelo usuario onde ele analisa os generos
//mais frequentes e manda um filme/serie de genero parecido.