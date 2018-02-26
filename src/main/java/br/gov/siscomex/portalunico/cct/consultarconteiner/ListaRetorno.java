
package br.gov.siscomex.portalunico.cct.consultarconteiner;

import java.util.LinkedHashSet;
import java.util.Set;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListaRetorno {

    @SerializedName("numeroConteiner")
    @Expose
    private String numeroConteiner;
    @SerializedName("pesoBruto")
    @Expose
    private Double pesoBruto;
    @SerializedName("tara")
    @Expose
    private Double tara;
    @SerializedName("lacres")
    @Expose
    private Set<String> lacres = new LinkedHashSet<String>();
    @SerializedName("documentosCarga")
    @Expose
    private Set<DocumentosCarga> documentosCarga = new LinkedHashSet<DocumentosCarga>();
    @SerializedName("permiteMovimentacao")
    @Expose
    private Boolean permiteMovimentacao;

    public String getNumeroConteiner() {
        return numeroConteiner;
    }

    public void setNumeroConteiner(String numeroConteiner) {
        this.numeroConteiner = numeroConteiner;
    }

    public Double getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(Double pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    public Double getTara() {
        return tara;
    }

    public void setTara(Double tara) {
        this.tara = tara;
    }

    public Set<String> getLacres() {
        return lacres;
    }

    public void setLacres(Set<String> lacres) {
        this.lacres = lacres;
    }

    public Set<DocumentosCarga> getDocumentosCarga() {
        return documentosCarga;
    }

    public void setDocumentosCarga(Set<DocumentosCarga> documentosCarga) {
        this.documentosCarga = documentosCarga;
    }

    public Boolean getPermiteMovimentacao() {
        return permiteMovimentacao;
    }

    public void setPermiteMovimentacao(Boolean permiteMovimentacao) {
        this.permiteMovimentacao = permiteMovimentacao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ListaRetorno.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("numeroConteiner");
        sb.append('=');
        sb.append(((this.numeroConteiner == null)?"<null>":this.numeroConteiner));
        sb.append(',');
        sb.append("pesoBruto");
        sb.append('=');
        sb.append(((this.pesoBruto == null)?"<null>":this.pesoBruto));
        sb.append(',');
        sb.append("tara");
        sb.append('=');
        sb.append(((this.tara == null)?"<null>":this.tara));
        sb.append(',');
        sb.append("lacres");
        sb.append('=');
        sb.append(((this.lacres == null)?"<null>":this.lacres));
        sb.append(',');
        sb.append("documentosCarga");
        sb.append('=');
        sb.append(((this.documentosCarga == null)?"<null>":this.documentosCarga));
        sb.append(',');
        sb.append("permiteMovimentacao");
        sb.append('=');
        sb.append(((this.permiteMovimentacao == null)?"<null>":this.permiteMovimentacao));
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
        result = ((result* 31)+((this.lacres == null)? 0 :this.lacres.hashCode()));
        result = ((result* 31)+((this.numeroConteiner == null)? 0 :this.numeroConteiner.hashCode()));
        result = ((result* 31)+((this.pesoBruto == null)? 0 :this.pesoBruto.hashCode()));
        result = ((result* 31)+((this.tara == null)? 0 :this.tara.hashCode()));
        result = ((result* 31)+((this.permiteMovimentacao == null)? 0 :this.permiteMovimentacao.hashCode()));
        result = ((result* 31)+((this.documentosCarga == null)? 0 :this.documentosCarga.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListaRetorno) == false) {
            return false;
        }
        ListaRetorno rhs = ((ListaRetorno) other);
        return (((((((this.lacres == rhs.lacres)||((this.lacres!= null)&&this.lacres.equals(rhs.lacres)))&&((this.numeroConteiner == rhs.numeroConteiner)||((this.numeroConteiner!= null)&&this.numeroConteiner.equals(rhs.numeroConteiner))))&&((this.pesoBruto == rhs.pesoBruto)||((this.pesoBruto!= null)&&this.pesoBruto.equals(rhs.pesoBruto))))&&((this.tara == rhs.tara)||((this.tara!= null)&&this.tara.equals(rhs.tara))))&&((this.permiteMovimentacao == rhs.permiteMovimentacao)||((this.permiteMovimentacao!= null)&&this.permiteMovimentacao.equals(rhs.permiteMovimentacao))))&&((this.documentosCarga == rhs.documentosCarga)||((this.documentosCarga!= null)&&this.documentosCarga.equals(rhs.documentosCarga))));
    }

}
