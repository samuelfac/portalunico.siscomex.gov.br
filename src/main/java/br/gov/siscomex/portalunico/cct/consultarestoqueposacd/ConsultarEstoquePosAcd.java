
package br.gov.siscomex.portalunico.cct.consultarestoqueposacd;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConsultarEstoquePosAcd {

    @SerializedName("lista")
    @Expose
    private List<Listum> lista = new ArrayList<Listum>();

    public List<Listum> getLista() {
        return lista;
    }

    public void setLista(List<Listum> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConsultarEstoquePosAcd.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lista");
        sb.append('=');
        sb.append(((this.lista == null)?"<null>":this.lista));
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
        result = ((result* 31)+((this.lista == null)? 0 :this.lista.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConsultarEstoquePosAcd) == false) {
            return false;
        }
        ConsultarEstoquePosAcd rhs = ((ConsultarEstoquePosAcd) other);
        return ((this.lista == rhs.lista)||((this.lista!= null)&&this.lista.equals(rhs.lista)));
    }

}
