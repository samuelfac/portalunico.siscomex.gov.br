
package br.gov.siscomex.portalunico.catp.produto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Atributo {

    @SerializedName("atributo")
    @Expose
    private String atributo;
    @SerializedName("valor")
    @Expose
    private String valor;

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Atributo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("atributo");
        sb.append('=');
        sb.append(((this.atributo == null)?"<null>":this.atributo));
        sb.append(',');
        sb.append("valor");
        sb.append('=');
        sb.append(((this.valor == null)?"<null>":this.valor));
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
        result = ((result* 31)+((this.valor == null)? 0 :this.valor.hashCode()));
        result = ((result* 31)+((this.atributo == null)? 0 :this.atributo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Atributo) == false) {
            return false;
        }
        Atributo rhs = ((Atributo) other);
        return (((this.valor == rhs.valor)||((this.valor!= null)&&this.valor.equals(rhs.valor)))&&((this.atributo == rhs.atributo)||((this.atributo!= null)&&this.atributo.equals(rhs.atributo))));
    }

}
