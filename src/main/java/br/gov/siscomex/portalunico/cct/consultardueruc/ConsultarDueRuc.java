
package br.gov.siscomex.portalunico.cct.consultardueruc;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConsultarDueRuc {

    @SerializedName("listaRetorno")
    @Expose
    private List<ListaRetorno> listaRetorno = new ArrayList<ListaRetorno>();
    @SerializedName("listaMensagem")
    @Expose
    private List<ListaMensagem> listaMensagem = new ArrayList<ListaMensagem>();

    public List<ListaRetorno> getListaRetorno() {
        return listaRetorno;
    }

    public void setListaRetorno(List<ListaRetorno> listaRetorno) {
        this.listaRetorno = listaRetorno;
    }

    public List<ListaMensagem> getListaMensagem() {
        return listaMensagem;
    }

    public void setListaMensagem(List<ListaMensagem> listaMensagem) {
        this.listaMensagem = listaMensagem;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConsultarDueRuc.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("listaRetorno");
        sb.append('=');
        sb.append(((this.listaRetorno == null)?"<null>":this.listaRetorno));
        sb.append(',');
        sb.append("listaMensagem");
        sb.append('=');
        sb.append(((this.listaMensagem == null)?"<null>":this.listaMensagem));
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
        result = ((result* 31)+((this.listaRetorno == null)? 0 :this.listaRetorno.hashCode()));
        result = ((result* 31)+((this.listaMensagem == null)? 0 :this.listaMensagem.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConsultarDueRuc) == false) {
            return false;
        }
        ConsultarDueRuc rhs = ((ConsultarDueRuc) other);
        return (((this.listaRetorno == rhs.listaRetorno)||((this.listaRetorno!= null)&&this.listaRetorno.equals(rhs.listaRetorno)))&&((this.listaMensagem == rhs.listaMensagem)||((this.listaMensagem!= null)&&this.listaMensagem.equals(rhs.listaMensagem))));
    }

}
