
package br.gov.siscomex.portalunico.carga.resposta.consultamruc;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListaMensagem {

    @SerializedName("mensagem")
    @Expose
    private String mensagem;
    @SerializedName("codigoErro")
    @Expose
    private String codigoErro;

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getCodigoErro() {
        return codigoErro;
    }

    public void setCodigoErro(String codigoErro) {
        this.codigoErro = codigoErro;
    }

}
