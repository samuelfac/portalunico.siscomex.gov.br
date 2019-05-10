
package br.gov.siscomex.portalunico.cct.consultadocumentotransportemictifdtaidat;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VeiculoFerroviario {

    @SerializedName("prefixoTrem")
    @Expose
    private String prefixoTrem;
    @SerializedName("quantidadeVagoes")
    @Expose
    private Integer quantidadeVagoes;

    public String getPrefixoTrem() {
        return prefixoTrem;
    }

    public void setPrefixoTrem(String prefixoTrem) {
        this.prefixoTrem = prefixoTrem;
    }

    public Integer getQuantidadeVagoes() {
        return quantidadeVagoes;
    }

    public void setQuantidadeVagoes(Integer quantidadeVagoes) {
        this.quantidadeVagoes = quantidadeVagoes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VeiculoFerroviario.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("prefixoTrem");
        sb.append('=');
        sb.append(((this.prefixoTrem == null)?"<null>":this.prefixoTrem));
        sb.append(',');
        sb.append("quantidadeVagoes");
        sb.append('=');
        sb.append(((this.quantidadeVagoes == null)?"<null>":this.quantidadeVagoes));
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
        result = ((result* 31)+((this.prefixoTrem == null)? 0 :this.prefixoTrem.hashCode()));
        result = ((result* 31)+((this.quantidadeVagoes == null)? 0 :this.quantidadeVagoes.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VeiculoFerroviario) == false) {
            return false;
        }
        VeiculoFerroviario rhs = ((VeiculoFerroviario) other);
        return (((this.prefixoTrem == rhs.prefixoTrem)||((this.prefixoTrem!= null)&&this.prefixoTrem.equals(rhs.prefixoTrem)))&&((this.quantidadeVagoes == rhs.quantidadeVagoes)||((this.quantidadeVagoes!= null)&&this.quantidadeVagoes.equals(rhs.quantidadeVagoes))));
    }

}
