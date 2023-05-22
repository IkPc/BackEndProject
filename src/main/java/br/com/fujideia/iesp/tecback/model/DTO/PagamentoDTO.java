package br.com.fujideia.iesp.tecback.model.DTO;

import br.com.fujideia.iesp.tecback.model.Pagamento;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Builder
@Data
public class PagamentoDTO implements Serializable {

    private Date data_venc;
    private Pagamento id;
}

//tabela sobre a forma de pagamento escolhida pelo usuario.