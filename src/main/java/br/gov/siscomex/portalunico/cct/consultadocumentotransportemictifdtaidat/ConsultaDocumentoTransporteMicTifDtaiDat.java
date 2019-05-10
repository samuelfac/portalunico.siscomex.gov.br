
package br.gov.siscomex.portalunico.cct.consultadocumentotransportemictifdtaidat;

import java.util.LinkedHashSet;
import java.util.Set;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConsultaDocumentoTransporteMicTifDtaiDat {

    @SerializedName("documentosTransporte")
    @Expose
    private Set<DocumentosTransporte> documentosTransporte = new LinkedHashSet<DocumentosTransporte>();

    public Set<DocumentosTransporte> getDocumentosTransporte() {
        return documentosTransporte;
    }

    public void setDocumentosTransporte(Set<DocumentosTransporte> documentosTransporte) {
        this.documentosTransporte = documentosTransporte;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConsultaDocumentoTransporteMicTifDtaiDat.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("documentosTransporte");
        sb.append('=');
        sb.append(((this.documentosTransporte == null)?"<null>":this.documentosTransporte));
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
        result = ((result* 31)+((this.documentosTransporte == null)? 0 :this.documentosTransporte.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConsultaDocumentoTransporteMicTifDtaiDat) == false) {
            return false;
        }
        ConsultaDocumentoTransporteMicTifDtaiDat rhs = ((ConsultaDocumentoTransporteMicTifDtaiDat) other);
        return ((this.documentosTransporte == rhs.documentosTransporte)||((this.documentosTransporte!= null)&&this.documentosTransporte.equals(rhs.documentosTransporte)));
    }

}
