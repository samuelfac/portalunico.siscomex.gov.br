
package br.gov.siscomex.portalunico.due.consultardadosresumidos;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConsultarDadosResumidos {

    @SerializedName("numeroDUE")
    @Expose
    private String numeroDUE;
    @SerializedName("numeroRUC")
    @Expose
    private String numeroRUC;
    @SerializedName("situacaoDUE")
    @Expose
    private Integer situacaoDUE;
    @SerializedName("dataSituacaoDUE")
    @Expose
    private String dataSituacaoDUE;
    @SerializedName("indicadorBloqueio")
    @Expose
    private Integer indicadorBloqueio;
    @SerializedName("controleAdministrativo")
    @Expose
    private Integer controleAdministrativo;
    @SerializedName("uaEmbarque")
    @Expose
    private String uaEmbarque;
    @SerializedName("uaDespacho")
    @Expose
    private String uaDespacho;
    @SerializedName("responsavelUADespacho")
    @Expose
    private Object responsavelUADespacho;
    @SerializedName("codigoRecintoAduaneiroDespacho")
    @Expose
    private String codigoRecintoAduaneiroDespacho;
    @SerializedName("codigoRecintoAduaneiroEmbarque")
    @Expose
    private String codigoRecintoAduaneiroEmbarque;
    @SerializedName("latitudeDespacho")
    @Expose
    private String latitudeDespacho;
    @SerializedName("longitudeDespacho")
    @Expose
    private String longitudeDespacho;
    @SerializedName("declarante")
    @Expose
    private Declarante declarante;
    @SerializedName("exportadores")
    @Expose
    private List<Exportadore> exportadores = new ArrayList<Exportadore>();
    @SerializedName("situacaoCarga")
    @Expose
    private List<Integer> situacaoCarga = new ArrayList<Integer>();

    public String getNumeroDUE() {
        return numeroDUE;
    }

    public void setNumeroDUE(String numeroDUE) {
        this.numeroDUE = numeroDUE;
    }

    public String getNumeroRUC() {
        return numeroRUC;
    }

    public void setNumeroRUC(String numeroRUC) {
        this.numeroRUC = numeroRUC;
    }

    public Integer getSituacaoDUE() {
        return situacaoDUE;
    }

    public void setSituacaoDUE(Integer situacaoDUE) {
        this.situacaoDUE = situacaoDUE;
    }

    public String getDataSituacaoDUE() {
        return dataSituacaoDUE;
    }

    public void setDataSituacaoDUE(String dataSituacaoDUE) {
        this.dataSituacaoDUE = dataSituacaoDUE;
    }

    public Integer getIndicadorBloqueio() {
        return indicadorBloqueio;
    }

    public void setIndicadorBloqueio(Integer indicadorBloqueio) {
        this.indicadorBloqueio = indicadorBloqueio;
    }

    public Integer getControleAdministrativo() {
        return controleAdministrativo;
    }

    public void setControleAdministrativo(Integer controleAdministrativo) {
        this.controleAdministrativo = controleAdministrativo;
    }

    public String getUaEmbarque() {
        return uaEmbarque;
    }

    public void setUaEmbarque(String uaEmbarque) {
        this.uaEmbarque = uaEmbarque;
    }

    public String getUaDespacho() {
        return uaDespacho;
    }

    public void setUaDespacho(String uaDespacho) {
        this.uaDespacho = uaDespacho;
    }

    public Object getResponsavelUADespacho() {
        return responsavelUADespacho;
    }

    public void setResponsavelUADespacho(Object responsavelUADespacho) {
        this.responsavelUADespacho = responsavelUADespacho;
    }

    public String getCodigoRecintoAduaneiroDespacho() {
        return codigoRecintoAduaneiroDespacho;
    }

    public void setCodigoRecintoAduaneiroDespacho(String codigoRecintoAduaneiroDespacho) {
        this.codigoRecintoAduaneiroDespacho = codigoRecintoAduaneiroDespacho;
    }

    public String getCodigoRecintoAduaneiroEmbarque() {
        return codigoRecintoAduaneiroEmbarque;
    }

    public void setCodigoRecintoAduaneiroEmbarque(String codigoRecintoAduaneiroEmbarque) {
        this.codigoRecintoAduaneiroEmbarque = codigoRecintoAduaneiroEmbarque;
    }

    public String getLatitudeDespacho() {
        return latitudeDespacho;
    }

    public void setLatitudeDespacho(String latitudeDespacho) {
        this.latitudeDespacho = latitudeDespacho;
    }

    public String getLongitudeDespacho() {
        return longitudeDespacho;
    }

    public void setLongitudeDespacho(String longitudeDespacho) {
        this.longitudeDespacho = longitudeDespacho;
    }

    public Declarante getDeclarante() {
        return declarante;
    }

    public void setDeclarante(Declarante declarante) {
        this.declarante = declarante;
    }

    public List<Exportadore> getExportadores() {
        return exportadores;
    }

    public void setExportadores(List<Exportadore> exportadores) {
        this.exportadores = exportadores;
    }

    public List<Integer> getSituacaoCarga() {
        return situacaoCarga;
    }

    public void setSituacaoCarga(List<Integer> situacaoCarga) {
        this.situacaoCarga = situacaoCarga;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConsultarDadosResumidos.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("numeroDUE");
        sb.append('=');
        sb.append(((this.numeroDUE == null)?"<null>":this.numeroDUE));
        sb.append(',');
        sb.append("numeroRUC");
        sb.append('=');
        sb.append(((this.numeroRUC == null)?"<null>":this.numeroRUC));
        sb.append(',');
        sb.append("situacaoDUE");
        sb.append('=');
        sb.append(((this.situacaoDUE == null)?"<null>":this.situacaoDUE));
        sb.append(',');
        sb.append("dataSituacaoDUE");
        sb.append('=');
        sb.append(((this.dataSituacaoDUE == null)?"<null>":this.dataSituacaoDUE));
        sb.append(',');
        sb.append("indicadorBloqueio");
        sb.append('=');
        sb.append(((this.indicadorBloqueio == null)?"<null>":this.indicadorBloqueio));
        sb.append(',');
        sb.append("controleAdministrativo");
        sb.append('=');
        sb.append(((this.controleAdministrativo == null)?"<null>":this.controleAdministrativo));
        sb.append(',');
        sb.append("uaEmbarque");
        sb.append('=');
        sb.append(((this.uaEmbarque == null)?"<null>":this.uaEmbarque));
        sb.append(',');
        sb.append("uaDespacho");
        sb.append('=');
        sb.append(((this.uaDespacho == null)?"<null>":this.uaDespacho));
        sb.append(',');
        sb.append("responsavelUADespacho");
        sb.append('=');
        sb.append(((this.responsavelUADespacho == null)?"<null>":this.responsavelUADespacho));
        sb.append(',');
        sb.append("codigoRecintoAduaneiroDespacho");
        sb.append('=');
        sb.append(((this.codigoRecintoAduaneiroDespacho == null)?"<null>":this.codigoRecintoAduaneiroDespacho));
        sb.append(',');
        sb.append("codigoRecintoAduaneiroEmbarque");
        sb.append('=');
        sb.append(((this.codigoRecintoAduaneiroEmbarque == null)?"<null>":this.codigoRecintoAduaneiroEmbarque));
        sb.append(',');
        sb.append("latitudeDespacho");
        sb.append('=');
        sb.append(((this.latitudeDespacho == null)?"<null>":this.latitudeDespacho));
        sb.append(',');
        sb.append("longitudeDespacho");
        sb.append('=');
        sb.append(((this.longitudeDespacho == null)?"<null>":this.longitudeDespacho));
        sb.append(',');
        sb.append("declarante");
        sb.append('=');
        sb.append(((this.declarante == null)?"<null>":this.declarante));
        sb.append(',');
        sb.append("exportadores");
        sb.append('=');
        sb.append(((this.exportadores == null)?"<null>":this.exportadores));
        sb.append(',');
        sb.append("situacaoCarga");
        sb.append('=');
        sb.append(((this.situacaoCarga == null)?"<null>":this.situacaoCarga));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.exportadores == null)? 0 :this.exportadores.hashCode()));
        result = ((result* 31)+((this.responsavelUADespacho == null)? 0 :this.responsavelUADespacho.hashCode()));
        result = ((result* 31)+((this.declarante == null)? 0 :this.declarante.hashCode()));
        result = ((result* 31)+((this.numeroRUC == null)? 0 :this.numeroRUC.hashCode()));
        result = ((result* 31)+((this.uaDespacho == null)? 0 :this.uaDespacho.hashCode()));
        result = ((result* 31)+((this.codigoRecintoAduaneiroEmbarque == null)? 0 :this.codigoRecintoAduaneiroEmbarque.hashCode()));
        result = ((result* 31)+((this.latitudeDespacho == null)? 0 :this.latitudeDespacho.hashCode()));
        result = ((result* 31)+((this.longitudeDespacho == null)? 0 :this.longitudeDespacho.hashCode()));
        result = ((result* 31)+((this.indicadorBloqueio == null)? 0 :this.indicadorBloqueio.hashCode()));
        result = ((result* 31)+((this.numeroDUE == null)? 0 :this.numeroDUE.hashCode()));
        result = ((result* 31)+((this.situacaoDUE == null)? 0 :this.situacaoDUE.hashCode()));
        result = ((result* 31)+((this.dataSituacaoDUE == null)? 0 :this.dataSituacaoDUE.hashCode()));
        result = ((result* 31)+((this.situacaoCarga == null)? 0 :this.situacaoCarga.hashCode()));
        result = ((result* 31)+((this.uaEmbarque == null)? 0 :this.uaEmbarque.hashCode()));
        result = ((result* 31)+((this.controleAdministrativo == null)? 0 :this.controleAdministrativo.hashCode()));
        result = ((result* 31)+((this.codigoRecintoAduaneiroDespacho == null)? 0 :this.codigoRecintoAduaneiroDespacho.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConsultarDadosResumidos) == false) {
            return false;
        }
        ConsultarDadosResumidos rhs = ((ConsultarDadosResumidos) other);
        return (((((((((((((((((this.exportadores == rhs.exportadores)||((this.exportadores!= null)&&this.exportadores.equals(rhs.exportadores)))&&((this.responsavelUADespacho == rhs.responsavelUADespacho)||((this.responsavelUADespacho!= null)&&this.responsavelUADespacho.equals(rhs.responsavelUADespacho))))&&((this.declarante == rhs.declarante)||((this.declarante!= null)&&this.declarante.equals(rhs.declarante))))&&((this.numeroRUC == rhs.numeroRUC)||((this.numeroRUC!= null)&&this.numeroRUC.equals(rhs.numeroRUC))))&&((this.uaDespacho == rhs.uaDespacho)||((this.uaDespacho!= null)&&this.uaDespacho.equals(rhs.uaDespacho))))&&((this.codigoRecintoAduaneiroEmbarque == rhs.codigoRecintoAduaneiroEmbarque)||((this.codigoRecintoAduaneiroEmbarque!= null)&&this.codigoRecintoAduaneiroEmbarque.equals(rhs.codigoRecintoAduaneiroEmbarque))))&&((this.latitudeDespacho == rhs.latitudeDespacho)||((this.latitudeDespacho!= null)&&this.latitudeDespacho.equals(rhs.latitudeDespacho))))&&((this.longitudeDespacho == rhs.longitudeDespacho)||((this.longitudeDespacho!= null)&&this.longitudeDespacho.equals(rhs.longitudeDespacho))))&&((this.indicadorBloqueio == rhs.indicadorBloqueio)||((this.indicadorBloqueio!= null)&&this.indicadorBloqueio.equals(rhs.indicadorBloqueio))))&&((this.numeroDUE == rhs.numeroDUE)||((this.numeroDUE!= null)&&this.numeroDUE.equals(rhs.numeroDUE))))&&((this.situacaoDUE == rhs.situacaoDUE)||((this.situacaoDUE!= null)&&this.situacaoDUE.equals(rhs.situacaoDUE))))&&((this.dataSituacaoDUE == rhs.dataSituacaoDUE)||((this.dataSituacaoDUE!= null)&&this.dataSituacaoDUE.equals(rhs.dataSituacaoDUE))))&&((this.situacaoCarga == rhs.situacaoCarga)||((this.situacaoCarga!= null)&&this.situacaoCarga.equals(rhs.situacaoCarga))))&&((this.uaEmbarque == rhs.uaEmbarque)||((this.uaEmbarque!= null)&&this.uaEmbarque.equals(rhs.uaEmbarque))))&&((this.controleAdministrativo == rhs.controleAdministrativo)||((this.controleAdministrativo!= null)&&this.controleAdministrativo.equals(rhs.controleAdministrativo))))&&((this.codigoRecintoAduaneiroDespacho == rhs.codigoRecintoAduaneiroDespacho)||((this.codigoRecintoAduaneiroDespacho!= null)&&this.codigoRecintoAduaneiroDespacho.equals(rhs.codigoRecintoAduaneiroDespacho))));
    }

}
