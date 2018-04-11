
package br.gov.siscomex.portalunico.lpco.incluirexigencia;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IncluirExigencia {

    @SerializedName("justificativa")
    @Expose
    private String justificativa;

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IncluirExigencia.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("justificativa");
        sb.append('=');
        sb.append(((this.justificativa == null)?"<null>":this.justificativa));
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
        result = ((result* 31)+((this.justificativa == null)? 0 :this.justificativa.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IncluirExigencia) == false) {
            return false;
        }
        IncluirExigencia rhs = ((IncluirExigencia) other);
        return ((this.justificativa == rhs.justificativa)||((this.justificativa!= null)&&this.justificativa.equals(rhs.justificativa)));
    }

}
