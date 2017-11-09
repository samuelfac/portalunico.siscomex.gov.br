
package br.gov.siscomex.portalunico.carga.resposta.consultadueruc;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConsultaDueRuc {

    @SerializedName("listaRetorno")
    @Expose
    private List<ListaRetorno> listaRetorno = null;
    @SerializedName("listaMensagem")
    @Expose
    private List<ListaMensagem> listaMensagem = null;

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

}
