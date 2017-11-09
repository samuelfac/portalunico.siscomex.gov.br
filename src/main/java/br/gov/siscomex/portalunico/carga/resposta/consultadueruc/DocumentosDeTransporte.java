
package br.gov.siscomex.portalunico.carga.resposta.consultadueruc;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DocumentosDeTransporte {

    @SerializedName("numeroDocumento")
    @Expose
    private String numeroDocumento;
    @SerializedName("tipoDocumento")
    @Expose
    private String tipoDocumento;
    @SerializedName("identificacaoVeiculo")
    @Expose
    private String identificacaoVeiculo;

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getIdentificacaoVeiculo() {
        return identificacaoVeiculo;
    }

    public void setIdentificacaoVeiculo(String identificacaoVeiculo) {
        this.identificacaoVeiculo = identificacaoVeiculo;
    }

}
