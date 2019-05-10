
package br.gov.siscomex.portalunico.cct.consultadocumentotransportemictifdtaidat;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Carga {

    @SerializedName("numeroDue")
    @Expose
    private String numeroDue;
    @SerializedName("numeroRuc")
    @Expose
    private String numeroRuc;
    @SerializedName("tipoCarga")
    @Expose
    private Object tipoCarga;
    @SerializedName("siglaUnidadeMedida")
    @Expose
    private String siglaUnidadeMedida;
    @SerializedName("quantidadeManifestada")
    @Expose
    private Double quantidadeManifestada;

    public String getNumeroDue() {
        return numeroDue;
    }

    public void setNumeroDue(String numeroDue) {
        this.numeroDue = numeroDue;
    }

    public String getNumeroRuc() {
        return numeroRuc;
    }

    public void setNumeroRuc(String numeroRuc) {
        this.numeroRuc = numeroRuc;
    }

    public Object getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(Object tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public String getSiglaUnidadeMedida() {
        return siglaUnidadeMedida;
    }

    public void setSiglaUnidadeMedida(String siglaUnidadeMedida) {
        this.siglaUnidadeMedida = siglaUnidadeMedida;
    }

    public Double getQuantidadeManifestada() {
        return quantidadeManifestada;
    }

    public void setQuantidadeManifestada(Double quantidadeManifestada) {
        this.quantidadeManifestada = quantidadeManifestada;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Carga.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("numeroDue");
        sb.append('=');
        sb.append(((this.numeroDue == null)?"<null>":this.numeroDue));
        sb.append(',');
        sb.append("numeroRuc");
        sb.append('=');
        sb.append(((this.numeroRuc == null)?"<null>":this.numeroRuc));
        sb.append(',');
        sb.append("tipoCarga");
        sb.append('=');
        sb.append(((this.tipoCarga == null)?"<null>":this.tipoCarga));
        sb.append(',');
        sb.append("siglaUnidadeMedida");
        sb.append('=');
        sb.append(((this.siglaUnidadeMedida == null)?"<null>":this.siglaUnidadeMedida));
        sb.append(',');
        sb.append("quantidadeManifestada");
        sb.append('=');
        sb.append(((this.quantidadeManifestada == null)?"<null>":this.quantidadeManifestada));
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
        result = ((result* 31)+((this.numeroRuc == null)? 0 :this.numeroRuc.hashCode()));
        result = ((result* 31)+((this.quantidadeManifestada == null)? 0 :this.quantidadeManifestada.hashCode()));
        result = ((result* 31)+((this.numeroDue == null)? 0 :this.numeroDue.hashCode()));
        result = ((result* 31)+((this.tipoCarga == null)? 0 :this.tipoCarga.hashCode()));
        result = ((result* 31)+((this.siglaUnidadeMedida == null)? 0 :this.siglaUnidadeMedida.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Carga) == false) {
            return false;
        }
        Carga rhs = ((Carga) other);
        return ((((((this.numeroRuc == rhs.numeroRuc)||((this.numeroRuc!= null)&&this.numeroRuc.equals(rhs.numeroRuc)))&&((this.quantidadeManifestada == rhs.quantidadeManifestada)||((this.quantidadeManifestada!= null)&&this.quantidadeManifestada.equals(rhs.quantidadeManifestada))))&&((this.numeroDue == rhs.numeroDue)||((this.numeroDue!= null)&&this.numeroDue.equals(rhs.numeroDue))))&&((this.tipoCarga == rhs.tipoCarga)||((this.tipoCarga!= null)&&this.tipoCarga.equals(rhs.tipoCarga))))&&((this.siglaUnidadeMedida == rhs.siglaUnidadeMedida)||((this.siglaUnidadeMedida!= null)&&this.siglaUnidadeMedida.equals(rhs.siglaUnidadeMedida))));
    }

}
