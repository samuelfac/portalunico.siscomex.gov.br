
package br.gov.siscomex.portalunico.carga.resposta.consultadocumentotransporte;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListaMensagem {

    @SerializedName("codigo")
    @Expose
    private String codigo;
    @SerializedName("mensagem")
    @Expose
    private String mensagem;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

}
