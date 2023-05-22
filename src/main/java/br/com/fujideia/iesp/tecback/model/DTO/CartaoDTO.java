package br.com.fujideia.iesp.tecback.model.DTO;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Builder
@Data
public class CartaoDTO implements Serializable {

    private String nome;
    private Integer numero;
    private Date vencimento;

    private Integer cvc;
}

//tabela de cartão como uma forma de pagamento (simplificado e com validations).