
package br.gov.siscomex.portalunico.lpco.detalharpedido;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListaVinculo {

    @SerializedName("dataVinculo")
    @Expose
    private String dataVinculo;
    @SerializedName("numeroDocumento")
    @Expose
    private String numeroDocumento;
    @SerializedName("numeroDocumentoItem")
    @Expose
    private Integer numeroDocumentoItem;
    @SerializedName("dataACD")
    @Expose
    private String dataACD;
    @SerializedName("dataDesembaraco")
    @Expose
    private String dataDesembaraco;
    @SerializedName("dataCCE")
    @Expose
    private String dataCCE;
    @SerializedName("dataAverbacao")
    @Expose
    private String dataAverbacao;
    @SerializedName("dataDesvinculacao")
    @Expose
    private String dataDesvinculacao;
    @SerializedName("quantidadeComercial")
    @Expose
    private String quantidadeComercial;
    @SerializedName("quantidadeUnidadeEstatistica")
    @Expose
    private String quantidadeUnidadeEstatistica;
    @SerializedName("vmle")
    @Expose
    private String vmle;

    public String getDataVinculo() {
        return dataVinculo;
    }

    public void setDataVinculo(String dataVinculo) {
        this.dataVinculo = dataVinculo;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Integer getNumeroDocumentoItem() {
        return numeroDocumentoItem;
    }

    public void setNumeroDocumentoItem(Integer numeroDocumentoItem) {
        this.numeroDocumentoItem = numeroDocumentoItem;
    }

    public String getDataACD() {
        return dataACD;
    }

    public void setDataACD(String dataACD) {
        this.dataACD = dataACD;
    }

    public String getDataDesembaraco() {
        return dataDesembaraco;
    }

    public void setDataDesembaraco(String dataDesembaraco) {
        this.dataDesembaraco = dataDesembaraco;
    }

    public String getDataCCE() {
        return dataCCE;
    }

    public void setDataCCE(String dataCCE) {
        this.dataCCE = dataCCE;
    }

    public String getDataAverbacao() {
        return dataAverbacao;
    }

    public void setDataAverbacao(String dataAverbacao) {
        this.dataAverbacao = dataAverbacao;
    }

    public String getDataDesvinculacao() {
        return dataDesvinculacao;
    }

    public void setDataDesvinculacao(String dataDesvinculacao) {
        this.dataDesvinculacao = dataDesvinculacao;
    }

    public String getQuantidadeComercial() {
        return quantidadeComercial;
    }

    public void setQuantidadeComercial(String quantidadeComercial) {
        this.quantidadeComercial = quantidadeComercial;
    }

    public String getQuantidadeUnidadeEstatistica() {
        return quantidadeUnidadeEstatistica;
    }

    public void setQuantidadeUnidadeEstatistica(String quantidadeUnidadeEstatistica) {
        this.quantidadeUnidadeEstatistica = quantidadeUnidadeEstatistica;
    }

    public String getVmle() {
        return vmle;
    }

    public void setVmle(String vmle) {
        this.vmle = vmle;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ListaVinculo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dataVinculo");
        sb.append('=');
        sb.append(((this.dataVinculo == null)?"<null>":this.dataVinculo));
        sb.append(',');
        sb.append("numeroDocumento");
        sb.append('=');
        sb.append(((this.numeroDocumento == null)?"<null>":this.numeroDocumento));
        sb.append(',');
        sb.append("numeroDocumentoItem");
        sb.append('=');
        sb.append(((this.numeroDocumentoItem == null)?"<null>":this.numeroDocumentoItem));
        sb.append(',');
        sb.append("dataACD");
        sb.append('=');
        sb.append(((this.dataACD == null)?"<null>":this.dataACD));
        sb.append(',');
        sb.append("dataDesembaraco");
        sb.append('=');
        sb.append(((this.dataDesembaraco == null)?"<null>":this.dataDesembaraco));
        sb.append(',');
        sb.append("dataCCE");
        sb.append('=');
        sb.append(((this.dataCCE == null)?"<null>":this.dataCCE));
        sb.append(',');
        sb.append("dataAverbacao");
        sb.append('=');
        sb.append(((this.dataAverbacao == null)?"<null>":this.dataAverbacao));
        sb.append(',');
        sb.append("dataDesvinculacao");
        sb.append('=');
        sb.append(((this.dataDesvinculacao == null)?"<null>":this.dataDesvinculacao));
        sb.append(',');
        sb.append("quantidadeComercial");
        sb.append('=');
        sb.append(((this.quantidadeComercial == null)?"<null>":this.quantidadeComercial));
        sb.append(',');
        sb.append("quantidadeUnidadeEstatistica");
        sb.append('=');
        sb.append(((this.quantidadeUnidadeEstatistica == null)?"<null>":this.quantidadeUnidadeEstatistica));
        sb.append(',');
        sb.append("vmle");
        sb.append('=');
        sb.append(((this.vmle == null)?"<null>":this.vmle));
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
        result = ((result* 31)+((this.dataDesembaraco == null)? 0 :this.dataDesembaraco.hashCode()));
        result = ((result* 31)+((this.quantidadeUnidadeEstatistica == null)? 0 :this.quantidadeUnidadeEstatistica.hashCode()));
        result = ((result* 31)+((this.quantidadeComercial == null)? 0 :this.quantidadeComercial.hashCode()));
        result = ((result* 31)+((this.dataDesvinculacao == null)? 0 :this.dataDesvinculacao.hashCode()));
        result = ((result* 31)+((this.vmle == null)? 0 :this.vmle.hashCode()));
        result = ((result* 31)+((this.dataAverbacao == null)? 0 :this.dataAverbacao.hashCode()));
        result = ((result* 31)+((this.dataVinculo == null)? 0 :this.dataVinculo.hashCode()));
        result = ((result* 31)+((this.numeroDocumentoItem == null)? 0 :this.numeroDocumentoItem.hashCode()));
        result = ((result* 31)+((this.numeroDocumento == null)? 0 :this.numeroDocumento.hashCode()));
        result = ((result* 31)+((this.dataACD == null)? 0 :this.dataACD.hashCode()));
        result = ((result* 31)+((this.dataCCE == null)? 0 :this.dataCCE.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListaVinculo) == false) {
            return false;
        }
        ListaVinculo rhs = ((ListaVinculo) other);
        return ((((((((((((this.dataDesembaraco == rhs.dataDesembaraco)||((this.dataDesembaraco!= null)&&this.dataDesembaraco.equals(rhs.dataDesembaraco)))&&((this.quantidadeUnidadeEstatistica == rhs.quantidadeUnidadeEstatistica)||((this.quantidadeUnidadeEstatistica!= null)&&this.quantidadeUnidadeEstatistica.equals(rhs.quantidadeUnidadeEstatistica))))&&((this.quantidadeComercial == rhs.quantidadeComercial)||((this.quantidadeComercial!= null)&&this.quantidadeComercial.equals(rhs.quantidadeComercial))))&&((this.dataDesvinculacao == rhs.dataDesvinculacao)||((this.dataDesvinculacao!= null)&&this.dataDesvinculacao.equals(rhs.dataDesvinculacao))))&&((this.vmle == rhs.vmle)||((this.vmle!= null)&&this.vmle.equals(rhs.vmle))))&&((this.dataAverbacao == rhs.dataAverbacao)||((this.dataAverbacao!= null)&&this.dataAverbacao.equals(rhs.dataAverbacao))))&&((this.dataVinculo == rhs.dataVinculo)||((this.dataVinculo!= null)&&this.dataVinculo.equals(rhs.dataVinculo))))&&((this.numeroDocumentoItem == rhs.numeroDocumentoItem)||((this.numeroDocumentoItem!= null)&&this.numeroDocumentoItem.equals(rhs.numeroDocumentoItem))))&&((this.numeroDocumento == rhs.numeroDocumento)||((this.numeroDocumento!= null)&&this.numeroDocumento.equals(rhs.numeroDocumento))))&&((this.dataACD == rhs.dataACD)||((this.dataACD!= null)&&this.dataACD.equals(rhs.dataACD))))&&((this.dataCCE == rhs.dataCCE)||((this.dataCCE!= null)&&this.dataCCE.equals(rhs.dataCCE))));
    }

}
