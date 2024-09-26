package br.gov.siscomex.portalunico.cct_imp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Desunitizacoes", propOrder =
        {"desunitizacao"
        })

@XmlRootElement(name = "Desunitizacoes")
/**
 * Lista das desunitizações
 **/
@ApiModel(description = "Lista das desunitizações")
public class Desunitizacoes {

    @XmlElement(name = "desunitizacao", required = true)
    @ApiModelProperty(required = true, value = "Lista das desunitizações")
    @Valid
    /**
     * Lista das desunitizações
     **/
    private List<Desunitizacao> desunitizacao = new ArrayList<>();

    /**
     * Lista das desunitizações
     *
     * @return desunitizacao
     **/
    @JsonProperty("desunitizacao")
    @NotNull
    public List<Desunitizacao> getDesunitizacao() {
        return desunitizacao;
    }

    public void setDesunitizacao(List<Desunitizacao> desunitizacao) {
        this.desunitizacao = desunitizacao;
    }

    public Desunitizacoes desunitizacao(List<Desunitizacao> desunitizacao) {
        this.desunitizacao = desunitizacao;
        return this;
    }

    public Desunitizacoes addDesunitizacaoItem(Desunitizacao desunitizacaoItem) {
        this.desunitizacao.add(desunitizacaoItem);
        return this;
    }


    @Override
    public String toString() {

        String sb = "class Desunitizacoes {\n" +
                "    desunitizacao: " + toIndentedString(desunitizacao) + "\n" +
                "}";
        return sb;
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
}

