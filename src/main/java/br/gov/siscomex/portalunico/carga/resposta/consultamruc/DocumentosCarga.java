
package br.gov.siscomex.portalunico.carga.resposta.consultamruc;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DocumentosCarga {

    @SerializedName("nivel")
    @Expose
    private String nivel;
    @SerializedName("documentos")
    @Expose
    private List<Documento> documentos = null;

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public List<Documento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<Documento> documentos) {
        this.documentos = documentos;
    }

}
