
package br.gov.siscomex.portalunico.lpco.detalharmodelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Modelo {

    @SerializedName("orgaoAnuente")
    @Expose
    private String orgaoAnuente;
    @SerializedName("codigo")
    @Expose
    private String codigo;
    @SerializedName("informacoesExportadorImportador")
    @Expose
    private String informacoesExportadorImportador;
    @SerializedName("informacoesAnuente")
    @Expose
    private String informacoesAnuente;
    @SerializedName("exibirInformacaoAdicional")
    @Expose
    private Boolean exibirInformacaoAdicional;
    @SerializedName("requerCatalogoProduto")
    @Expose
    private Boolean requerCatalogoProduto;

    public String getOrgaoAnuente() {
        return orgaoAnuente;
    }

    public void setOrgaoAnuente(String orgaoAnuente) {
        this.orgaoAnuente = orgaoAnuente;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getInformacoesExportadorImportador() {
        return informacoesExportadorImportador;
    }

    public void setInformacoesExportadorImportador(String informacoesExportadorImportador) {
        this.informacoesExportadorImportador = informacoesExportadorImportador;
    }

    public String getInformacoesAnuente() {
        return informacoesAnuente;
    }

    public void setInformacoesAnuente(String informacoesAnuente) {
        this.informacoesAnuente = informacoesAnuente;
    }

    public Boolean getExibirInformacaoAdicional() {
        return exibirInformacaoAdicional;
    }

    public void setExibirInformacaoAdicional(Boolean exibirInformacaoAdicional) {
        this.exibirInformacaoAdicional = exibirInformacaoAdicional;
    }

    public Boolean getRequerCatalogoProduto() {
        return requerCatalogoProduto;
    }

    public void setRequerCatalogoProduto(Boolean requerCatalogoProduto) {
        this.requerCatalogoProduto = requerCatalogoProduto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Modelo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("orgaoAnuente");
        sb.append('=');
        sb.append(((this.orgaoAnuente == null)?"<null>":this.orgaoAnuente));
        sb.append(',');
        sb.append("codigo");
        sb.append('=');
        sb.append(((this.codigo == null)?"<null>":this.codigo));
        sb.append(',');
        sb.append("informacoesExportadorImportador");
        sb.append('=');
        sb.append(((this.informacoesExportadorImportador == null)?"<null>":this.informacoesExportadorImportador));
        sb.append(',');
        sb.append("informacoesAnuente");
        sb.append('=');
        sb.append(((this.informacoesAnuente == null)?"<null>":this.informacoesAnuente));
        sb.append(',');
        sb.append("exibirInformacaoAdicional");
        sb.append('=');
        sb.append(((this.exibirInformacaoAdicional == null)?"<null>":this.exibirInformacaoAdicional));
        sb.append(',');
        sb.append("requerCatalogoProduto");
        sb.append('=');
        sb.append(((this.requerCatalogoProduto == null)?"<null>":this.requerCatalogoProduto));
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
        result = ((result* 31)+((this.codigo == null)? 0 :this.codigo.hashCode()));
        result = ((result* 31)+((this.requerCatalogoProduto == null)? 0 :this.requerCatalogoProduto.hashCode()));
        result = ((result* 31)+((this.orgaoAnuente == null)? 0 :this.orgaoAnuente.hashCode()));
        result = ((result* 31)+((this.exibirInformacaoAdicional == null)? 0 :this.exibirInformacaoAdicional.hashCode()));
        result = ((result* 31)+((this.informacoesAnuente == null)? 0 :this.informacoesAnuente.hashCode()));
        result = ((result* 31)+((this.informacoesExportadorImportador == null)? 0 :this.informacoesExportadorImportador.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Modelo) == false) {
            return false;
        }
        Modelo rhs = ((Modelo) other);
        return (((((((this.codigo == rhs.codigo)||((this.codigo!= null)&&this.codigo.equals(rhs.codigo)))&&((this.requerCatalogoProduto == rhs.requerCatalogoProduto)||((this.requerCatalogoProduto!= null)&&this.requerCatalogoProduto.equals(rhs.requerCatalogoProduto))))&&((this.orgaoAnuente == rhs.orgaoAnuente)||((this.orgaoAnuente!= null)&&this.orgaoAnuente.equals(rhs.orgaoAnuente))))&&((this.exibirInformacaoAdicional == rhs.exibirInformacaoAdicional)||((this.exibirInformacaoAdicional!= null)&&this.exibirInformacaoAdicional.equals(rhs.exibirInformacaoAdicional))))&&((this.informacoesAnuente == rhs.informacoesAnuente)||((this.informacoesAnuente!= null)&&this.informacoesAnuente.equals(rhs.informacoesAnuente))))&&((this.informacoesExportadorImportador == rhs.informacoesExportadorImportador)||((this.informacoesExportadorImportador!= null)&&this.informacoesExportadorImportador.equals(rhs.informacoesExportadorImportador))));
    }

}
