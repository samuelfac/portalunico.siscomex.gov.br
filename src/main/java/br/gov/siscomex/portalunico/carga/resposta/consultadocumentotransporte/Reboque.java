
package br.gov.siscomex.portalunico.carga.resposta.consultadocumentotransporte;

import java.util.Set;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Reboque {

    @SerializedName("placa")
    @Expose
    private String placa;
    @SerializedName("tara")
    @Expose
    private Float tara;
    @SerializedName("lacres")
    @Expose
    private Set<String> lacres = null;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Float getTara() {
        return tara;
    }

    public void setTara(Float tara) {
        this.tara = tara;
    }

    public Set<String> getLacres() {
        return lacres;
    }

    public void setLacres(Set<String> lacres) {
        this.lacres = lacres;
    }

}
