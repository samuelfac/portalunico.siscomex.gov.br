
package br.gov.siscomex.portalunico.lpco.consultarexigencias;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Situacao {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("descricao")
    @Expose
    private String descricao;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Situacao.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("descricao");
        sb.append('=');
        sb.append(((this.descricao == null)?"<null>":this.descricao));
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
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.descricao == null)? 0 :this.descricao.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Situacao) == false) {
            return false;
        }
        Situacao rhs = ((Situacao) other);
        return (((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id)))&&((this.descricao == rhs.descricao)||((this.descricao!= null)&&this.descricao.equals(rhs.descricao))));
    }

}
