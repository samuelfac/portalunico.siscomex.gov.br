
package br.gov.siscomex.portalunico.lpco.detalharpedido;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListaCamposNcm {

    @SerializedName("codigo")
    @Expose
    private String codigo;
    @SerializedName("listaValor")
    @Expose
    private List<String> listaValor = new ArrayList<String>();

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<String> getListaValor() {
        return listaValor;
    }

    public void setListaValor(List<String> listaValor) {
        this.listaValor = listaValor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ListaCamposNcm.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("codigo");
        sb.append('=');
        sb.append(((this.codigo == null)?"<null>":this.codigo));
        sb.append(',');
        sb.append("listaValor");
        sb.append('=');
        sb.append(((this.listaValor == null)?"<null>":this.listaValor));
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
        result = ((result* 31)+((this.codigo == null)? 0 :this.codigo.hashCode()));
        result = ((result* 31)+((this.listaValor == null)? 0 :this.listaValor.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListaCamposNcm) == false) {
            return false;
        }
        ListaCamposNcm rhs = ((ListaCamposNcm) other);
        return (((this.codigo == rhs.codigo)||((this.codigo!= null)&&this.codigo.equals(rhs.codigo)))&&((this.listaValor == rhs.listaValor)||((this.listaValor!= null)&&this.listaValor.equals(rhs.listaValor))));
    }

}
