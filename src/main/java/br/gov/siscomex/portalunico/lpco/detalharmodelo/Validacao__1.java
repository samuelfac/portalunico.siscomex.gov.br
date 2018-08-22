
package br.gov.siscomex.portalunico.lpco.detalharmodelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Validacao__1 {

    @SerializedName("obrigatorio")
    @Expose
    private Boolean obrigatorio;
    @SerializedName("permiteMultiplosValores")
    @Expose
    private Boolean permiteMultiplosValores;
    @SerializedName("mascara")
    @Expose
    private String mascara;
    @SerializedName("tamanhoMaximo")
    @Expose
    private Integer tamanhoMaximo;
    @SerializedName("qtdCasasDecimais")
    @Expose
    private Integer qtdCasasDecimais;

    public Boolean getObrigatorio() {
        return obrigatorio;
    }

    public void setObrigatorio(Boolean obrigatorio) {
        this.obrigatorio = obrigatorio;
    }

    public Boolean getPermiteMultiplosValores() {
        return permiteMultiplosValores;
    }

    public void setPermiteMultiplosValores(Boolean permiteMultiplosValores) {
        this.permiteMultiplosValores = permiteMultiplosValores;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public Integer getTamanhoMaximo() {
        return tamanhoMaximo;
    }

    public void setTamanhoMaximo(Integer tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
    }

    public Integer getQtdCasasDecimais() {
        return qtdCasasDecimais;
    }

    public void setQtdCasasDecimais(Integer qtdCasasDecimais) {
        this.qtdCasasDecimais = qtdCasasDecimais;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Validacao__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("obrigatorio");
        sb.append('=');
        sb.append(((this.obrigatorio == null)?"<null>":this.obrigatorio));
        sb.append(',');
        sb.append("permiteMultiplosValores");
        sb.append('=');
        sb.append(((this.permiteMultiplosValores == null)?"<null>":this.permiteMultiplosValores));
        sb.append(',');
        sb.append("mascara");
        sb.append('=');
        sb.append(((this.mascara == null)?"<null>":this.mascara));
        sb.append(',');
        sb.append("tamanhoMaximo");
        sb.append('=');
        sb.append(((this.tamanhoMaximo == null)?"<null>":this.tamanhoMaximo));
        sb.append(',');
        sb.append("qtdCasasDecimais");
        sb.append('=');
        sb.append(((this.qtdCasasDecimais == null)?"<null>":this.qtdCasasDecimais));
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
        result = ((result* 31)+((this.permiteMultiplosValores == null)? 0 :this.permiteMultiplosValores.hashCode()));
        result = ((result* 31)+((this.qtdCasasDecimais == null)? 0 :this.qtdCasasDecimais.hashCode()));
        result = ((result* 31)+((this.obrigatorio == null)? 0 :this.obrigatorio.hashCode()));
        result = ((result* 31)+((this.mascara == null)? 0 :this.mascara.hashCode()));
        result = ((result* 31)+((this.tamanhoMaximo == null)? 0 :this.tamanhoMaximo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Validacao__1) == false) {
            return false;
        }
        Validacao__1 rhs = ((Validacao__1) other);
        return ((((((this.permiteMultiplosValores == rhs.permiteMultiplosValores)||((this.permiteMultiplosValores!= null)&&this.permiteMultiplosValores.equals(rhs.permiteMultiplosValores)))&&((this.qtdCasasDecimais == rhs.qtdCasasDecimais)||((this.qtdCasasDecimais!= null)&&this.qtdCasasDecimais.equals(rhs.qtdCasasDecimais))))&&((this.obrigatorio == rhs.obrigatorio)||((this.obrigatorio!= null)&&this.obrigatorio.equals(rhs.obrigatorio))))&&((this.mascara == rhs.mascara)||((this.mascara!= null)&&this.mascara.equals(rhs.mascara))))&&((this.tamanhoMaximo == rhs.tamanhoMaximo)||((this.tamanhoMaximo!= null)&&this.tamanhoMaximo.equals(rhs.tamanhoMaximo))));
    }

}
