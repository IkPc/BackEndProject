package br.com.fujideia.iesp.tecback.model.DTO;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Builder
@Data
public class EnderecoDTO implements Serializable {

    //coluna para que seja descrito o endereço (rua, numero, etc.)
    @Column(name = "ds_endereco", length = 500)
    private String endereco;
}

//tabela referente ao endereço que envia fatura e localiza o usuario que possui cadastro na netflix.