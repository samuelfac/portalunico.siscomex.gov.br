
package br.gov.siscomex.portalunico.cct.consultardueruc;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListaCargasSoltasVeiculo {

    @SerializedName("tipoEmbalagem")
    @Expose
    private Integer tipoEmbalagem;
    @SerializedName("quantidade")
    @Expose
    private Integer quantidade;

    public Integer getTipoEmbalagem() {
        return tipoEmbalagem;
    }

    public void setTipoEmbalagem(Integer tipoEmbalagem) {
        this.tipoEmbalagem = tipoEmbalagem;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ListaCargasSoltasVeiculo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tipoEmbalagem");
        sb.append('=');
        sb.append(((this.tipoEmbalagem == null)?"<null>":this.tipoEmbalagem));
        sb.append(',');
        sb.append("quantidade");
        sb.append('=');
        sb.append(((this.quantidade == null)?"<null>":this.quantidade));
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
        result = ((result* 31)+((this.quantidade == null)? 0 :this.quantidade.hashCode()));
        result = ((result* 31)+((this.tipoEmbalagem == null)? 0 :this.tipoEmbalagem.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListaCargasSoltasVeiculo) == false) {
            return false;
        }
        ListaCargasSoltasVeiculo rhs = ((ListaCargasSoltasVeiculo) other);
        return (((this.quantidade == rhs.quantidade)||((this.quantidade!= null)&&this.quantidade.equals(rhs.quantidade)))&&((this.tipoEmbalagem == rhs.tipoEmbalagem)||((this.tipoEmbalagem!= null)&&this.tipoEmbalagem.equals(rhs.tipoEmbalagem))));
    }

}
