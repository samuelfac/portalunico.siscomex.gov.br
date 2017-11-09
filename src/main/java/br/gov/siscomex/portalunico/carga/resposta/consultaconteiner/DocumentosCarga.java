
package br.gov.siscomex.portalunico.carga.resposta.consultaconteiner;

import java.util.Set;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DocumentosCarga {

    @SerializedName("documentos")
    @Expose
    private Set<Documento> documentos = null;

    public Set<Documento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(Set<Documento> documentos) {
        this.documentos = documentos;
    }

}
