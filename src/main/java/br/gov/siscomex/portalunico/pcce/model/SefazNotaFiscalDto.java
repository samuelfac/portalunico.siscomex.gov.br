package br.gov.siscomex.portalunico.pcce.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SefazNotaFiscalDto", propOrder =
        {"chaveAcessoNotaFiscal"
        })

@XmlRootElement(name = "SefazNotaFiscalDto")
/**
 * Dados de notas fiscais de ICMS com pagamento fracionado
 **/
@ApiModel(description = "Dados de notas fiscais de ICMS com pagamento fracionado")
public class SefazNotaFiscalDto {

    @XmlElement(name = "chaveAcessoNotaFiscal", required = true)
    @ApiModelProperty(example = "29231275174629000157550010000018941232250733", required = true, value = "Número da chave de acesso da nota fiscal <br>Tamanho: 44")
    /**
     * Número da chave de acesso da nota fiscal <br>Tamanho: 44
     **/
    private String chaveAcessoNotaFiscal = null;

    /**
     * Número da chave de acesso da nota fiscal &lt;br&gt;Tamanho: 44
     *
     * @return chaveAcessoNotaFiscal
     **/
    @JsonProperty("chaveAcessoNotaFiscal")
    @NotNull
    public String getChaveAcessoNotaFiscal() {
        return chaveAcessoNotaFiscal;
    }

    public void setChaveAcessoNotaFiscal(String chaveAcessoNotaFiscal) {
        this.chaveAcessoNotaFiscal = chaveAcessoNotaFiscal;
    }

    public SefazNotaFiscalDto chaveAcessoNotaFiscal(String chaveAcessoNotaFiscal) {
        this.chaveAcessoNotaFiscal = chaveAcessoNotaFiscal;
        return this;
    }


    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private static String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    @Override
    public String toString() {

        String sb = "class SefazNotaFiscalDto {\n" +
                "    chaveAcessoNotaFiscal: " + toIndentedString(chaveAcessoNotaFiscal) + "\n" +
                "}";
        return sb;
    }
}
