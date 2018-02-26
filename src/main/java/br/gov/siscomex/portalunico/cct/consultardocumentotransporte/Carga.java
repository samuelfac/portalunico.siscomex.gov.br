
package br.gov.siscomex.portalunico.cct.consultardocumentotransporte;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Carga {

    @SerializedName("numeroDue")
    @Expose
    private String numeroDue;
    @SerializedName("numeroRuc")
    @Expose
    private String numeroRuc;
    @SerializedName("conteiner")
    @Expose
    private Conteiner conteiner;

    public String getNumeroDue() {
        return numeroDue;
    }

    public void setNumeroDue(String numeroDue) {
        this.numeroDue = numeroDue;
    }

    public String getNumeroRuc() {
        return numeroRuc;
    }

    public void setNumeroRuc(String numeroRuc) {
        this.numeroRuc = numeroRuc;
    }

    public Conteiner getConteiner() {
        return conteiner;
    }

    public void setConteiner(Conteiner conteiner) {
        this.conteiner = conteiner;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Carga.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("numeroDue");
        sb.append('=');
        sb.append(((this.numeroDue == null)?"<null>":this.numeroDue));
        sb.append(',');
        sb.append("numeroRuc");
        sb.append('=');
        sb.append(((this.numeroRuc == null)?"<null>":this.numeroRuc));
        sb.append(',');
        sb.append("conteiner");
        sb.append('=');
        sb.append(((this.conteiner == null)?"<null>":this.conteiner));
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
        result = ((result* 31)+((this.numeroRuc == null)? 0 :this.numeroRuc.hashCode()));
        result = ((result* 31)+((this.numeroDue == null)? 0 :this.numeroDue.hashCode()));
        result = ((result* 31)+((this.conteiner == null)? 0 :this.conteiner.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Carga) == false) {
            return false;
        }
        Carga rhs = ((Carga) other);
        return ((((this.numeroRuc == rhs.numeroRuc)||((this.numeroRuc!= null)&&this.numeroRuc.equals(rhs.numeroRuc)))&&((this.numeroDue == rhs.numeroDue)||((this.numeroDue!= null)&&this.numeroDue.equals(rhs.numeroDue))))&&((this.conteiner == rhs.conteiner)||((this.conteiner!= null)&&this.conteiner.equals(rhs.conteiner))));
    }

}
