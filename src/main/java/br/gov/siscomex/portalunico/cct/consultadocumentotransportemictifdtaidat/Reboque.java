
package br.gov.siscomex.portalunico.cct.consultadocumentotransportemictifdtaidat;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Reboque {

    @SerializedName("placa")
    @Expose
    private String placa;
    @SerializedName("tara")
    @Expose
    private Double tara;
    @SerializedName("lacres")
    @Expose
    private List<String> lacres = new ArrayList<String>();

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Double getTara() {
        return tara;
    }

    public void setTara(Double tara) {
        this.tara = tara;
    }

    public List<String> getLacres() {
        return lacres;
    }

    public void setLacres(List<String> lacres) {
        this.lacres = lacres;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Reboque.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("placa");
        sb.append('=');
        sb.append(((this.placa == null)?"<null>":this.placa));
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
        result = ((result* 31)+((this.tara == null)? 0 :this.tara.hashCode()));
        result = ((result* 31)+((this.lacres == null)? 0 :this.lacres.hashCode()));
        result = ((result* 31)+((this.placa == null)? 0 :this.placa.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Reboque) == false) {
            return false;
        }
        Reboque rhs = ((Reboque) other);
        return ((((this.tara == rhs.tara)||((this.tara!= null)&&this.tara.equals(rhs.tara)))&&((this.lacres == rhs.lacres)||((this.lacres!= null)&&this.lacres.equals(rhs.lacres))))&&((this.placa == rhs.placa)||((this.placa!= null)&&this.placa.equals(rhs.placa))));
    }

}
