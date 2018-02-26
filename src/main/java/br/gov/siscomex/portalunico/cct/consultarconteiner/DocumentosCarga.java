
package br.gov.siscomex.portalunico.cct.consultarconteiner;

import java.util.LinkedHashSet;
import java.util.Set;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DocumentosCarga {

    @SerializedName("documentos")
    @Expose
    private Set<Documento> documentos = new LinkedHashSet<Documento>();

    public Set<Documento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(Set<Documento> documentos) {
        this.documentos = documentos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DocumentosCarga.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("documentos");
        sb.append('=');
        sb.append(((this.documentos == null)?"<null>":this.documentos));
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
        result = ((result* 31)+((this.documentos == null)? 0 :this.documentos.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DocumentosCarga) == false) {
            return false;
        }
        DocumentosCarga rhs = ((DocumentosCarga) other);
        return ((this.documentos == rhs.documentos)||((this.documentos!= null)&&this.documentos.equals(rhs.documentos)));
    }

}
