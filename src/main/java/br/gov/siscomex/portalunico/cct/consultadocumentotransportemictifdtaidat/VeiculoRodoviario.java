
package br.gov.siscomex.portalunico.cct.consultadocumentotransportemictifdtaidat;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VeiculoRodoviario {

    @SerializedName("cpjCnpjResponsavel")
    @Expose
    private String cpjCnpjResponsavel;
    @SerializedName("nomeResponsavel")
    @Expose
    private String nomeResponsavel;
    @SerializedName("veiculo")
    @Expose
    private Veiculo veiculo;
    @SerializedName("reboques")
    @Expose
    private List<Reboque> reboques = new ArrayList<Reboque>();

    public String getCpjCnpjResponsavel() {
        return cpjCnpjResponsavel;
    }

    public void setCpjCnpjResponsavel(String cpjCnpjResponsavel) {
        this.cpjCnpjResponsavel = cpjCnpjResponsavel;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public List<Reboque> getReboques() {
        return reboques;
    }

    public void setReboques(List<Reboque> reboques) {
        this.reboques = reboques;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VeiculoRodoviario.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cpjCnpjResponsavel");
        sb.append('=');
        sb.append(((this.cpjCnpjResponsavel == null)?"<null>":this.cpjCnpjResponsavel));
        sb.append(',');
        sb.append("nomeResponsavel");
        sb.append('=');
        sb.append(((this.nomeResponsavel == null)?"<null>":this.nomeResponsavel));
        sb.append(',');
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
        result = ((result* 31)+((this.cpjCnpjResponsavel == null)? 0 :this.cpjCnpjResponsavel.hashCode()));
        result = ((result* 31)+((this.reboques == null)? 0 :this.reboques.hashCode()));
        result = ((result* 31)+((this.nomeResponsavel == null)? 0 :this.nomeResponsavel.hashCode()));
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
        return (((((this.veiculo == rhs.veiculo)||((this.veiculo!= null)&&this.veiculo.equals(rhs.veiculo)))&&((this.cpjCnpjResponsavel == rhs.cpjCnpjResponsavel)||((this.cpjCnpjResponsavel!= null)&&this.cpjCnpjResponsavel.equals(rhs.cpjCnpjResponsavel))))&&((this.reboques == rhs.reboques)||((this.reboques!= null)&&this.reboques.equals(rhs.reboques))))&&((this.nomeResponsavel == rhs.nomeResponsavel)||((this.nomeResponsavel!= null)&&this.nomeResponsavel.equals(rhs.nomeResponsavel))));
    }

}
