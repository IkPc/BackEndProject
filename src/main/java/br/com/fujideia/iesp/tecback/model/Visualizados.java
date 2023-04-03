package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_genero")
public class Visualizados {

    @Id
    @Column(nullable = false)
    private Integer id;

    @JoinColumn
    private Filme filme;{
        int min_atual;
    }

    @JoinColumn
    private Series series;{
        int min_atual;
    }


}
