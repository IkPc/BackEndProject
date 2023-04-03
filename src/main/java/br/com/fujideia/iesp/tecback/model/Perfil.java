package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "tb_perfil")
public class Perfil implements Serializable {

    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Integer id;

    private String nome;

    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private Usuario usuario;

    @JoinColumn(name = "endereco_id", referencedColumnName = "id")
    private Endereco endereco;
}
