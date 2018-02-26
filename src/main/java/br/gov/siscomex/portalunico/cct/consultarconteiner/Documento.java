
package br.gov.siscomex.portalunico.cct.consultarconteiner;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Documento {

    @SerializedName("numeroDUE")
    @Expose
    private String numeroDUE;
    @SerializedName("numeroRUC")
    @Expose
    private String numeroRUC;

    public String getNumeroDUE() {
        return numeroDUE;
    }

    public void setNumeroDUE(String numeroDUE) {
        this.numeroDUE = numeroDUE;
    }

    public String getNumeroRUC() {
        return numeroRUC;
    }

    public void setNumeroRUC(String numeroRUC) {
        this.numeroRUC = numeroRUC;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Documento.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("numeroDUE");
        sb.append('=');
        sb.append(((this.numeroDUE == null)?"<null>":this.numeroDUE));
        sb.append(',');
        sb.append("numeroRUC");
        sb.append('=');
        sb.append(((this.numeroRUC == null)?"<null>":this.numeroRUC));
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
        result = ((result* 31)+((this.numeroRUC == null)? 0 :this.numeroRUC.hashCode()));
        result = ((result* 31)+((this.numeroDUE == null)? 0 :this.numeroDUE.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Documento) == false) {
            return false;
        }
        Documento rhs = ((Documento) other);
        return (((this.numeroRUC == rhs.numeroRUC)||((this.numeroRUC!= null)&&this.numeroRUC.equals(rhs.numeroRUC)))&&((this.numeroDUE == rhs.numeroDUE)||((this.numeroDUE!= null)&&this.numeroDUE.equals(rhs.numeroDUE))));
    }

}
