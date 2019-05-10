
package br.gov.siscomex.portalunico.cct.consultadocumentotransportemictifdtaidat;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Conteinere {

    @SerializedName("identificacao")
    @Expose
    private String identificacao;
    @SerializedName("tara")
    @Expose
    private Double tara;
    @SerializedName("lacres")
    @Expose
    private List<String> lacres = new ArrayList<String>();

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
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
        sb.append(Conteinere.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("identificacao");
        sb.append('=');
        sb.append(((this.identificacao == null)?"<null>":this.identificacao));
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
        result = ((result* 31)+((this.identificacao == null)? 0 :this.identificacao.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Conteinere) == false) {
            return false;
        }
        Conteinere rhs = ((Conteinere) other);
        return ((((this.tara == rhs.tara)||((this.tara!= null)&&this.tara.equals(rhs.tara)))&&((this.lacres == rhs.lacres)||((this.lacres!= null)&&this.lacres.equals(rhs.lacres))))&&((this.identificacao == rhs.identificacao)||((this.identificacao!= null)&&this.identificacao.equals(rhs.identificacao))));
    }

}
