
package br.gov.siscomex.portalunico.cct.consultarmruc;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListaRetorno {

    @SerializedName("numeroMRUC")
    @Expose
    private String numeroMRUC;
    @SerializedName("documentosCarga")
    @Expose
    private List<DocumentosCarga> documentosCarga = new ArrayList<DocumentosCarga>();
    @SerializedName("permiteMovimentacao")
    @Expose
    private Boolean permiteMovimentacao;

    public String getNumeroMRUC() {
        return numeroMRUC;
    }

    public void setNumeroMRUC(String numeroMRUC) {
        this.numeroMRUC = numeroMRUC;
    }

    public List<DocumentosCarga> getDocumentosCarga() {
        return documentosCarga;
    }

    public void setDocumentosCarga(List<DocumentosCarga> documentosCarga) {
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
        sb.append("numeroMRUC");
        sb.append('=');
        sb.append(((this.numeroMRUC == null)?"<null>":this.numeroMRUC));
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
        result = ((result* 31)+((this.permiteMovimentacao == null)? 0 :this.permiteMovimentacao.hashCode()));
        result = ((result* 31)+((this.documentosCarga == null)? 0 :this.documentosCarga.hashCode()));
        result = ((result* 31)+((this.numeroMRUC == null)? 0 :this.numeroMRUC.hashCode()));
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
        return ((((this.permiteMovimentacao == rhs.permiteMovimentacao)||((this.permiteMovimentacao!= null)&&this.permiteMovimentacao.equals(rhs.permiteMovimentacao)))&&((this.documentosCarga == rhs.documentosCarga)||((this.documentosCarga!= null)&&this.documentosCarga.equals(rhs.documentosCarga))))&&((this.numeroMRUC == rhs.numeroMRUC)||((this.numeroMRUC!= null)&&this.numeroMRUC.equals(rhs.numeroMRUC))));
    }

}
