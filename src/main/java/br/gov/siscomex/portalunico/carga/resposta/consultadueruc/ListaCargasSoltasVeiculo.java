
package br.gov.siscomex.portalunico.carga.resposta.consultadueruc;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListaCargasSoltasVeiculo {

    @SerializedName("tipoEmbalagem")
    @Expose
    private Integer tipoEmbalagem;
    @SerializedName("quantidade")
    @Expose
    private Integer quantidade;

    public Integer getTipoEmbalagem() {
        return tipoEmbalagem;
    }

    public void setTipoEmbalagem(Integer tipoEmbalagem) {
        this.tipoEmbalagem = tipoEmbalagem;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

}
