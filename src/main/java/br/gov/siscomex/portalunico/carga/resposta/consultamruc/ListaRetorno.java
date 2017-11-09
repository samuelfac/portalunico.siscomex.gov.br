
package br.gov.siscomex.portalunico.carga.resposta.consultamruc;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListaRetorno {

    @SerializedName("numeroMRUC")
    @Expose
    private String numeroMRUC;
    @SerializedName("documentosCarga")
    @Expose
    private List<DocumentosCarga> documentosCarga = null;
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

}
