
package br.gov.siscomex.portalunico.cct.consultadocumentotransportemictifdtaidat;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LocalEstoque {

    @SerializedName("urf")
    @Expose
    private Urf urf;
    @SerializedName("ra")
    @Expose
    private Ra ra;
    @SerializedName("responsavel")
    @Expose
    private Responsavel responsavel;
    @SerializedName("coordenadas")
    @Expose
    private Coordenadas coordenadas;

    public Urf getUrf() {
        return urf;
    }

    public void setUrf(Urf urf) {
        this.urf = urf;
    }

    public Ra getRa() {
        return ra;
    }

    public void setRa(Ra ra) {
        this.ra = ra;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    public Coordenadas getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(Coordenadas coordenadas) {
        this.coordenadas = coordenadas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LocalEstoque.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("urf");
        sb.append('=');
        sb.append(((this.urf == null)?"<null>":this.urf));
        sb.append(',');
        sb.append("ra");
        sb.append('=');
        sb.append(((this.ra == null)?"<null>":this.ra));
        sb.append(',');
        sb.append("responsavel");
        sb.append('=');
        sb.append(((this.responsavel == null)?"<null>":this.responsavel));
        sb.append(',');
        sb.append("coordenadas");
        sb.append('=');
        sb.append(((this.coordenadas == null)?"<null>":this.coordenadas));
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
        result = ((result* 31)+((this.urf == null)? 0 :this.urf.hashCode()));
        result = ((result* 31)+((this.coordenadas == null)? 0 :this.coordenadas.hashCode()));
        result = ((result* 31)+((this.responsavel == null)? 0 :this.responsavel.hashCode()));
        result = ((result* 31)+((this.ra == null)? 0 :this.ra.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LocalEstoque) == false) {
            return false;
        }
        LocalEstoque rhs = ((LocalEstoque) other);
        return (((((this.urf == rhs.urf)||((this.urf!= null)&&this.urf.equals(rhs.urf)))&&((this.coordenadas == rhs.coordenadas)||((this.coordenadas!= null)&&this.coordenadas.equals(rhs.coordenadas))))&&((this.responsavel == rhs.responsavel)||((this.responsavel!= null)&&this.responsavel.equals(rhs.responsavel))))&&((this.ra == rhs.ra)||((this.ra!= null)&&this.ra.equals(rhs.ra))));
    }

}
