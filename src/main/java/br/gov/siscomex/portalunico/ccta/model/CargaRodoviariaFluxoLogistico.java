package br.gov.siscomex.portalunico.ccta.model;

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
@XmlType(name = "CargaRodoviariaFluxoLogistico", propOrder =
        {"bloqueiosBaixados", "viagens", "situacaoAtual", "bloqueiosAtivos"
        })

@XmlRootElement(name = "CargaRodoviariaFluxoLogistico")
public class CargaRodoviariaFluxoLogistico {

    @XmlElement(name = "bloqueiosBaixados")
    @ApiModelProperty(value = "")
    @Valid
    private List<BloqueioConsultaCarga> bloqueiosBaixados = null;

    @XmlElement(name = "viagens")
    @ApiModelProperty(value = "")
    @Valid
    private List<CargaRodoviariaDetalhadaViagem> viagens = null;

    @XmlElement(name = "situacaoAtual")
    @ApiModelProperty(value = "")
    @Valid
    private CargaRodoviariaDetalhadaSituacao situacaoAtual = null;

    @XmlElement(name = "bloqueiosAtivos")
    @ApiModelProperty(value = "")
    @Valid
    private List<BloqueioConsultaCarga> bloqueiosAtivos = null;

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
     * Get bloqueiosBaixados
     *
     * @return bloqueiosBaixados
     **/
    @JsonProperty("bloqueiosBaixados")
    public List<BloqueioConsultaCarga> getBloqueiosBaixados() {
        return bloqueiosBaixados;
    }

    public void setBloqueiosBaixados(List<BloqueioConsultaCarga> bloqueiosBaixados) {
        this.bloqueiosBaixados = bloqueiosBaixados;
    }

    public CargaRodoviariaFluxoLogistico bloqueiosBaixados(List<BloqueioConsultaCarga> bloqueiosBaixados) {
        this.bloqueiosBaixados = bloqueiosBaixados;
        return this;
    }

    public CargaRodoviariaFluxoLogistico addBloqueiosBaixadosItem(BloqueioConsultaCarga bloqueiosBaixadosItem) {
        this.bloqueiosBaixados.add(bloqueiosBaixadosItem);
        return this;
    }

    /**
     * Get viagens
     *
     * @return viagens
     **/
    @JsonProperty("viagens")
    public List<CargaRodoviariaDetalhadaViagem> getViagens() {
        return viagens;
    }

    public void setViagens(List<CargaRodoviariaDetalhadaViagem> viagens) {
        this.viagens = viagens;
    }

    public CargaRodoviariaFluxoLogistico viagens(List<CargaRodoviariaDetalhadaViagem> viagens) {
        this.viagens = viagens;
        return this;
    }

    public CargaRodoviariaFluxoLogistico addViagensItem(CargaRodoviariaDetalhadaViagem viagensItem) {
        this.viagens.add(viagensItem);
        return this;
    }

    /**
     * Get situacaoAtual
     *
     * @return situacaoAtual
     **/
    @JsonProperty("situacaoAtual")
    public CargaRodoviariaDetalhadaSituacao getSituacaoAtual() {
        return situacaoAtual;
    }

    public void setSituacaoAtual(CargaRodoviariaDetalhadaSituacao situacaoAtual) {
        this.situacaoAtual = situacaoAtual;
    }

    public CargaRodoviariaFluxoLogistico situacaoAtual(CargaRodoviariaDetalhadaSituacao situacaoAtual) {
        this.situacaoAtual = situacaoAtual;
        return this;
    }

    /**
     * Get bloqueiosAtivos
     *
     * @return bloqueiosAtivos
     **/
    @JsonProperty("bloqueiosAtivos")
    public List<BloqueioConsultaCarga> getBloqueiosAtivos() {
        return bloqueiosAtivos;
    }

    public void setBloqueiosAtivos(List<BloqueioConsultaCarga> bloqueiosAtivos) {
        this.bloqueiosAtivos = bloqueiosAtivos;
    }

    public CargaRodoviariaFluxoLogistico bloqueiosAtivos(List<BloqueioConsultaCarga> bloqueiosAtivos) {
        this.bloqueiosAtivos = bloqueiosAtivos;
        return this;
    }

    public CargaRodoviariaFluxoLogistico addBloqueiosAtivosItem(BloqueioConsultaCarga bloqueiosAtivosItem) {
        this.bloqueiosAtivos.add(bloqueiosAtivosItem);
        return this;
    }

    @Override
    public String toString() {

        String sb = "class CargaRodoviariaFluxoLogistico {\n" +
                "    bloqueiosBaixados: " + toIndentedString(bloqueiosBaixados) + "\n" +
                "    viagens: " + toIndentedString(viagens) + "\n" +
                "    situacaoAtual: " + toIndentedString(situacaoAtual) + "\n" +
                "    bloqueiosAtivos: " + toIndentedString(bloqueiosAtivos) + "\n" +
                "}";
        return sb;
    }
}
