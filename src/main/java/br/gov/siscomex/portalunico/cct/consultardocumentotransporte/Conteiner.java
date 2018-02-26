
package br.gov.siscomex.portalunico.cct.consultardocumentotransporte;

import java.util.LinkedHashSet;
import java.util.Set;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Conteiner {

    @SerializedName("numeroConteiner")
    @Expose
    private String numeroConteiner;
    @SerializedName("tara")
    @Expose
    private Double tara;
    @SerializedName("lacres")
    @Expose
    private Set<String> lacres = new LinkedHashSet<String>();

    public String getNumeroConteiner() {
        return numeroConteiner;
    }

    public void setNumeroConteiner(String numeroConteiner) {
        this.numeroConteiner = numeroConteiner;
    }

    public Double getTara() {
        return tara;
    }

    public void setTara(Double tara) {
        this.tara = tara;
    }

    public Set<String> getLacres() {
        return lacres;
    }

    public void setLacres(Set<String> lacres) {
        this.lacres = lacres;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Conteiner.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("numeroConteiner");
        sb.append('=');
        sb.append(((this.numeroConteiner == null)?"<null>":this.numeroConteiner));
        sb.append(',');
        sb.append("tara");
        sb.append('=');
        sb.append(((this.tara == null)?"<null>":this.tara));
        sb.append(',');
        sb.append("lacres");
        sb.append('=');
        sb.append(((this.lacres == null)?"<null>":this.lacres));
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
        result = ((result* 31)+((this.numeroConteiner == null)? 0 :this.numeroConteiner.hashCode()));
        result = ((result* 31)+((this.tara == null)? 0 :this.tara.hashCode()));
        result = ((result* 31)+((this.lacres == null)? 0 :this.lacres.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Conteiner) == false) {
            return false;
        }
        Conteiner rhs = ((Conteiner) other);
        return ((((this.numeroConteiner == rhs.numeroConteiner)||((this.numeroConteiner!= null)&&this.numeroConteiner.equals(rhs.numeroConteiner)))&&((this.tara == rhs.tara)||((this.tara!= null)&&this.tara.equals(rhs.tara))))&&((this.lacres == rhs.lacres)||((this.lacres!= null)&&this.lacres.equals(rhs.lacres))));
    }

}
