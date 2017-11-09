
package br.gov.siscomex.portalunico.carga.resposta.consultaconteiner;

import java.util.List;
import java.util.Set;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConsultaConteiner {

    @SerializedName("listaRetorno")
    @Expose
    private Set<ListaRetorno> listaRetorno = null;
    @SerializedName("listaMensagem")
    @Expose
    private List<ListaMensagem> listaMensagem = null;

    public Set<ListaRetorno> getListaRetorno() {
        return listaRetorno;
    }

    public void setListaRetorno(Set<ListaRetorno> listaRetorno) {
        this.listaRetorno = listaRetorno;
    }

    public List<ListaMensagem> getListaMensagem() {
        return listaMensagem;
    }

    public void setListaMensagem(List<ListaMensagem> listaMensagem) {
        this.listaMensagem = listaMensagem;
    }

}
