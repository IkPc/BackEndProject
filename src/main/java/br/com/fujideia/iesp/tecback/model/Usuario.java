package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "tb_usuario")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Integer id;

    private String nome;
    private String numero;
    private String cpf;
    private Email email;
    private Date data_nasc;
    private String senha;


    @JoinColumn(name = "endereco_id", referencedColumnName = "id")
    private Endereco endereco;
}
