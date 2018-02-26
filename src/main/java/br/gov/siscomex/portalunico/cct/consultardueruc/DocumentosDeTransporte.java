
package br.gov.siscomex.portalunico.cct.consultardueruc;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DocumentosDeTransporte.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("numeroDocumento");
        sb.append('=');
        sb.append(((this.numeroDocumento == null)?"<null>":this.numeroDocumento));
        sb.append(',');
        sb.append("tipoDocumento");
        sb.append('=');
        sb.append(((this.tipoDocumento == null)?"<null>":this.tipoDocumento));
        sb.append(',');
        sb.append("identificacaoVeiculo");
        sb.append('=');
        sb.append(((this.identificacaoVeiculo == null)?"<null>":this.identificacaoVeiculo));
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
        result = ((result* 31)+((this.tipoDocumento == null)? 0 :this.tipoDocumento.hashCode()));
        result = ((result* 31)+((this.numeroDocumento == null)? 0 :this.numeroDocumento.hashCode()));
        result = ((result* 31)+((this.identificacaoVeiculo == null)? 0 :this.identificacaoVeiculo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DocumentosDeTransporte) == false) {
            return false;
        }
        DocumentosDeTransporte rhs = ((DocumentosDeTransporte) other);
        return ((((this.tipoDocumento == rhs.tipoDocumento)||((this.tipoDocumento!= null)&&this.tipoDocumento.equals(rhs.tipoDocumento)))&&((this.numeroDocumento == rhs.numeroDocumento)||((this.numeroDocumento!= null)&&this.numeroDocumento.equals(rhs.numeroDocumento))))&&((this.identificacaoVeiculo == rhs.identificacaoVeiculo)||((this.identificacaoVeiculo!= null)&&this.identificacaoVeiculo.equals(rhs.identificacaoVeiculo))));
    }

}
