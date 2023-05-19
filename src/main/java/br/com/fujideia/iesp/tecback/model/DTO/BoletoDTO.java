package br.com.fujideia.iesp.tecback.model.DTO;

import br.com.fujideia.iesp.tecback.model.Boleto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "tb_boleto")
public class BoletoDTO implements Serializable {
    private Boleto id;
    private Boleto cod_de_barra;
    private Boleto vencimento;
    private Boleto nome;
}

//tabela de boleto referente a um tipo de pagamento.