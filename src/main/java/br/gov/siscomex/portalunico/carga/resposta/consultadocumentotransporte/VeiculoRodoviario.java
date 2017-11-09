
package br.gov.siscomex.portalunico.carga.resposta.consultadocumentotransporte;

import java.util.Set;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VeiculoRodoviario {

    @SerializedName("veiculo")
    @Expose
    private Veiculo veiculo;
    @SerializedName("reboques")
    @Expose
    private Set<Reboque> reboques = null;

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Set<Reboque> getReboques() {
        return reboques;
    }

    public void setReboques(Set<Reboque> reboques) {
        this.reboques = reboques;
    }

}
