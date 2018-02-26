
package br.gov.siscomex.portalunico.due.consultardadosresumidos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Exportadore {

    @SerializedName("numero")
    @Expose
    private String numero;
    @SerializedName("tipo")
    @Expose
    private String tipo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Exportadore.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("numero");
        sb.append('=');
        sb.append(((this.numero == null)?"<null>":this.numero));
        sb.append(',');
        sb.append("tipo");
        sb.append('=');
        sb.append(((this.tipo == null)?"<null>":this.tipo));
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
        result = ((result* 31)+((this.numero == null)? 0 :this.numero.hashCode()));
        result = ((result* 31)+((this.tipo == null)? 0 :this.tipo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Exportadore) == false) {
            return false;
        }
        Exportadore rhs = ((Exportadore) other);
        return (((this.numero == rhs.numero)||((this.numero!= null)&&this.numero.equals(rhs.numero)))&&((this.tipo == rhs.tipo)||((this.tipo!= null)&&this.tipo.equals(rhs.tipo))));
    }

}
