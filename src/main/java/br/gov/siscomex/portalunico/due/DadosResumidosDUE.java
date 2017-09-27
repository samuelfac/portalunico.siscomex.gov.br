
package br.gov.siscomex.portalunico.due;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "numeroDUE",
    "numeroRUC",
    "situacaoDUE",
    "dataSituacaoDUE",
    "situacaoCarga",
    "controleAdministrativo",
    "indicadorBloqueio",
    "declarante",
    "exportadores",
    "codigoRecintoAduaneiroDespacho",
    "coordenadasDespacho",
    "responsaveluaDespacho",
    "uaDespacho",
    "codigoRecintoAduaneiroEmbarque",
    "uaEmbarque"
})
public class DadosResumidosDUE implements Serializable
{

    @JsonProperty("numeroDUE")
    private String numeroDUE;
    @JsonProperty("numeroRUC")
    private String numeroRUC;
    @JsonProperty("situacaoDUE")
    private Integer situacaoDUE;
    @JsonProperty("dataSituacaoDUE")
    private String dataSituacaoDUE;
    @JsonProperty("situacaoCarga")
    private List<Integer> situacaoCarga = null;
    @JsonProperty("controleAdministrativo")
    private Integer controleAdministrativo;
    @JsonProperty("indicadorBloqueio")
    private Integer indicadorBloqueio;
    @JsonProperty("declarante")
    private Declarante declarante;
    @JsonProperty("exportadores")
    private List<Exportadore> exportadores = null;
    @JsonProperty("codigoRecintoAduaneiroDespacho")
    private String codigoRecintoAduaneiroDespacho;
    @JsonProperty("coordenadasDespacho")
    private String coordenadasDespacho;
    @JsonProperty("responsaveluaDespacho")
    private Object responsaveluaDespacho;
    @JsonProperty("uaDespacho")
    private String uaDespacho;
    @JsonProperty("codigoRecintoAduaneiroEmbarque")
    private String codigoRecintoAduaneiroEmbarque;
    @JsonProperty("uaEmbarque")
    private String uaEmbarque;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2577499295168303405L;

    @JsonProperty("numeroDUE")
    public String getNumeroDUE() {
        return numeroDUE;
    }

    @JsonProperty("numeroDUE")
    public void setNumeroDUE(String numeroDUE) {
        this.numeroDUE = numeroDUE;
    }

    @JsonProperty("numeroRUC")
    public String getNumeroRUC() {
        return numeroRUC;
    }

    @JsonProperty("numeroRUC")
    public void setNumeroRUC(String numeroRUC) {
        this.numeroRUC = numeroRUC;
    }

    @JsonProperty("situacaoDUE")
    public Integer getSituacaoDUE() {
        return situacaoDUE;
    }

    @JsonProperty("situacaoDUE")
    public void setSituacaoDUE(Integer situacaoDUE) {
        this.situacaoDUE = situacaoDUE;
    }

    @JsonProperty("dataSituacaoDUE")
    public String getDataSituacaoDUE() {
        return dataSituacaoDUE;
    }

    @JsonProperty("dataSituacaoDUE")
    public void setDataSituacaoDUE(String dataSituacaoDUE) {
        this.dataSituacaoDUE = dataSituacaoDUE;
    }

    @JsonProperty("situacaoCarga")
    public List<Integer> getSituacaoCarga() {
        return situacaoCarga;
    }

    @JsonProperty("situacaoCarga")
    public void setSituacaoCarga(List<Integer> situacaoCarga) {
        this.situacaoCarga = situacaoCarga;
    }

    @JsonProperty("controleAdministrativo")
    public Integer getControleAdministrativo() {
        return controleAdministrativo;
    }

    @JsonProperty("controleAdministrativo")
    public void setControleAdministrativo(Integer controleAdministrativo) {
        this.controleAdministrativo = controleAdministrativo;
    }

    @JsonProperty("indicadorBloqueio")
    public Integer getIndicadorBloqueio() {
        return indicadorBloqueio;
    }

    @JsonProperty("indicadorBloqueio")
    public void setIndicadorBloqueio(Integer indicadorBloqueio) {
        this.indicadorBloqueio = indicadorBloqueio;
    }

    @JsonProperty("declarante")
    public Declarante getDeclarante() {
        return declarante;
    }

    @JsonProperty("declarante")
    public void setDeclarante(Declarante declarante) {
        this.declarante = declarante;
    }

    @JsonProperty("exportadores")
    public List<Exportadore> getExportadores() {
        return exportadores;
    }

    @JsonProperty("exportadores")
    public void setExportadores(List<Exportadore> exportadores) {
        this.exportadores = exportadores;
    }

    @JsonProperty("codigoRecintoAduaneiroDespacho")
    public String getCodigoRecintoAduaneiroDespacho() {
        return codigoRecintoAduaneiroDespacho;
    }

    @JsonProperty("codigoRecintoAduaneiroDespacho")
    public void setCodigoRecintoAduaneiroDespacho(String codigoRecintoAduaneiroDespacho) {
        this.codigoRecintoAduaneiroDespacho = codigoRecintoAduaneiroDespacho;
    }

    @JsonProperty("coordenadasDespacho")
    public String getCoordenadasDespacho() {
        return coordenadasDespacho;
    }

    @JsonProperty("coordenadasDespacho")
    public void setCoordenadasDespacho(String coordenadasDespacho) {
        this.coordenadasDespacho = coordenadasDespacho;
    }

    @JsonProperty("responsaveluaDespacho")
    public Object getResponsaveluaDespacho() {
        return responsaveluaDespacho;
    }

    @JsonProperty("responsaveluaDespacho")
    public void setResponsaveluaDespacho(Object responsaveluaDespacho) {
        this.responsaveluaDespacho = responsaveluaDespacho;
    }

    @JsonProperty("uaDespacho")
    public String getUaDespacho() {
        return uaDespacho;
    }

    @JsonProperty("uaDespacho")
    public void setUaDespacho(String uaDespacho) {
        this.uaDespacho = uaDespacho;
    }

    @JsonProperty("codigoRecintoAduaneiroEmbarque")
    public String getCodigoRecintoAduaneiroEmbarque() {
        return codigoRecintoAduaneiroEmbarque;
    }

    @JsonProperty("codigoRecintoAduaneiroEmbarque")
    public void setCodigoRecintoAduaneiroEmbarque(String codigoRecintoAduaneiroEmbarque) {
        this.codigoRecintoAduaneiroEmbarque = codigoRecintoAduaneiroEmbarque;
    }

    @JsonProperty("uaEmbarque")
    public String getUaEmbarque() {
        return uaEmbarque;
    }

    @JsonProperty("uaEmbarque")
    public void setUaEmbarque(String uaEmbarque) {
        this.uaEmbarque = uaEmbarque;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
