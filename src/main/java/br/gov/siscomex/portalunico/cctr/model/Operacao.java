package br.gov.siscomex.portalunico.cctr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Operacao", propOrder =
        {"listaMensagem", "id"
        })

@XmlRootElement(name = "Operacao")
public class Operacao {

    @XmlElement(name = "listaMensagem")
    @ApiModelProperty(value = "")
    @Valid
    private List<MensagemServico> listaMensagem = null;

    @XmlElement(name = "id")
    @ApiModelProperty(value = "")
    private String id = null;

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

    /**
     * Get listaMensagem
     *
     * @return listaMensagem
     **/
    @JsonProperty("listaMensagem")
    public List<MensagemServico> getListaMensagem() {
        return listaMensagem;
    }

    public void setListaMensagem(List<MensagemServico> listaMensagem) {
        this.listaMensagem = listaMensagem;
    }

    public Operacao listaMensagem(List<MensagemServico> listaMensagem) {
        this.listaMensagem = listaMensagem;
        return this;
    }

    public Operacao addListaMensagemItem(MensagemServico listaMensagemItem) {
        this.listaMensagem.add(listaMensagemItem);
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Operacao id(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class Operacao {\n" +
                "    listaMensagem: " + toIndentedString(listaMensagem) + "\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "}";
        return sb;
    }
}
