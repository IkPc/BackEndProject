package br.com.fujideia.iesp.tecback.model.DTO;

import br.com.fujideia.iesp.tecback.model.Cartao;
import br.com.fujideia.iesp.tecback.model.Usuario;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "tb_cartao")
public class CartaoDTO implements Serializable {

    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Integer id;
    private String nome;
    private Integer numero;
    private Date vencimento;
    @Column(length = 3)
    private Integer cvc;
}

//tabela de cartão referente a um tipo de pagamento(com informações
// sobre o usuario e o cartão) como uma forma de pagamento.