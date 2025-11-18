package br.gov.siscomex.portalunico.cctr.model;

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
@XmlType(name = "ManifestacoesNacionais", propOrder =
        {"manifestacao"
        })

@XmlRootElement(name = "ManifestacoesNacionais")
/**
 * Manifestos de documentos de transporte<br>Máximo de ocorrências: 1
 **/
@ApiModel(description = "Manifestos de documentos de transporte<br>Máximo de ocorrências: 1")
public class ManifestacoesNacionais {

    @XmlElement(name = "manifestacao", required = true)
    @ApiModelProperty(required = true, value = "Manifesto de documento de transporte")
    @Valid
    /**
     * Manifesto de documento de transporte
     **/
    private List<Manifestacao> manifestacao = new ArrayList<>();

    /**
     * Manifesto de documento de transporte
     *
     * @return manifestacao
     **/
    @JsonProperty("manifestacao")
    @NotNull
    public List<Manifestacao> getManifestacao() {
        return manifestacao;
    }

    public void setManifestacao(List<Manifestacao> manifestacao) {
        this.manifestacao = manifestacao;
    }

    public ManifestacoesNacionais manifestacao(List<Manifestacao> manifestacao) {
        this.manifestacao = manifestacao;
        return this;
    }

    public ManifestacoesNacionais addManifestacaoItem(Manifestacao manifestacaoItem) {
        this.manifestacao.add(manifestacaoItem);
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

        String sb = "class ManifestacoesNacionais {\n" +
                "    manifestacao: " + toIndentedString(manifestacao) + "\n" +
                "}";
        return sb;
    }
}
