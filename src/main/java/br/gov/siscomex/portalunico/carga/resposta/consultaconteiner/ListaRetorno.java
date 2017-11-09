
package br.gov.siscomex.portalunico.carga.resposta.consultaconteiner;

import java.util.Set;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListaRetorno {

    @SerializedName("numeroConteiner")
    @Expose
    private String numeroConteiner;
    @SerializedName("pesoBruto")
    @Expose
    private Float pesoBruto;
    @SerializedName("tara")
    @Expose
    private Float tara;
    @SerializedName("lacres")
    @Expose
    private Set<String> lacres = null;
    @SerializedName("documentosCarga")
    @Expose
    private Set<DocumentosCarga> documentosCarga = null;
    @SerializedName("permiteMovimentacao")
    @Expose
    private Boolean permiteMovimentacao;

    public String getNumeroConteiner() {
        return numeroConteiner;
    }

    public void setNumeroConteiner(String numeroConteiner) {
        this.numeroConteiner = numeroConteiner;
    }

    public Float getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(Float pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    public Float getTara() {
        return tara;
    }

    public void setTara(Float tara) {
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

}
