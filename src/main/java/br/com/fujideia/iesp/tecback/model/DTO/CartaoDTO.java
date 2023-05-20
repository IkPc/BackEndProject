package br.com.fujideia.iesp.tecback.model.DTO;

import br.com.fujideia.iesp.tecback.model.Cartao;
import br.com.fujideia.iesp.tecback.model.Usuario;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

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