package br.com.fujideia.iesp.tecback.model.DTO;

import br.com.fujideia.iesp.tecback.model.Boleto;
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
public class BoletoDTO implements Serializable {

    private String cod_de_barra;
    private Date vencimento;
    private Usuario nome;
}

//tabela de boleto referente a um tipo de pagamento.