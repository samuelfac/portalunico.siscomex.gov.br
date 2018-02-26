
package br.gov.siscomex.portalunico.cct.consultardocumentotransporte;

import java.util.LinkedHashSet;
import java.util.Set;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VeiculoRodoviario {

    @SerializedName("veiculo")
    @Expose
    private Veiculo veiculo;
    @SerializedName("reboques")
    @Expose
    private Set<Reboque> reboques = new LinkedHashSet<Reboque>();

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Set<Reboque> getReboques() {
        return reboques;
    }

    public void setReboques(Set<Reboque> reboques) {
        this.reboques = reboques;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VeiculoRodoviario.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("veiculo");
        sb.append('=');
        sb.append(((this.veiculo == null)?"<null>":this.veiculo));
        sb.append(',');
        sb.append("reboques");
        sb.append('=');
        sb.append(((this.reboques == null)?"<null>":this.reboques));
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
        result = ((result* 31)+((this.veiculo == null)? 0 :this.veiculo.hashCode()));
        result = ((result* 31)+((this.reboques == null)? 0 :this.reboques.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VeiculoRodoviario) == false) {
            return false;
        }
        VeiculoRodoviario rhs = ((VeiculoRodoviario) other);
        return (((this.veiculo == rhs.veiculo)||((this.veiculo!= null)&&this.veiculo.equals(rhs.veiculo)))&&((this.reboques == rhs.reboques)||((this.reboques!= null)&&this.reboques.equals(rhs.reboques))));
    }

}
