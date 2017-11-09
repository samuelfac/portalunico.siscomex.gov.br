
package br.gov.siscomex.portalunico.carga.resposta.consultadocumentotransporte;

import java.util.Set;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Conteiner {

    @SerializedName("numeroConteiner")
    @Expose
    private String numeroConteiner;
    @SerializedName("tara")
    @Expose
    private Float tara;
    @SerializedName("lacres")
    @Expose
    private Set<String> lacres = null;

    public String getNumeroConteiner() {
        return numeroConteiner;
    }

    public void setNumeroConteiner(String numeroConteiner) {
        this.numeroConteiner = numeroConteiner;
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
