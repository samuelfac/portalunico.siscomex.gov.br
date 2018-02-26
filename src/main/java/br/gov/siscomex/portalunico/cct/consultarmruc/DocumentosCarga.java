
package br.gov.siscomex.portalunico.cct.consultarmruc;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DocumentosCarga {

    @SerializedName("nivel")
    @Expose
    private String nivel;
    @SerializedName("documentos")
    @Expose
    private List<Documento> documentos = new ArrayList<Documento>();

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DocumentosCarga.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("nivel");
        sb.append('=');
        sb.append(((this.nivel == null)?"<null>":this.nivel));
        sb.append(',');
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
        result = ((result* 31)+((this.nivel == null)? 0 :this.nivel.hashCode()));
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
        return (((this.nivel == rhs.nivel)||((this.nivel!= null)&&this.nivel.equals(rhs.nivel)))&&((this.documentos == rhs.documentos)||((this.documentos!= null)&&this.documentos.equals(rhs.documentos))));
    }

}
