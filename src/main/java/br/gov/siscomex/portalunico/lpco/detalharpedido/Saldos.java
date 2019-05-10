
package br.gov.siscomex.portalunico.lpco.detalharpedido;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Saldos {

    @SerializedName("titulo")
    @Expose
    private String titulo;
    @SerializedName("saldoQuantidadeComercial")
    @Expose
    private Double saldoQuantidadeComercial;
    @SerializedName("saldoQuantidadeEstatistica")
    @Expose
    private Double saldoQuantidadeEstatistica;
    @SerializedName("saldoVMLE")
    @Expose
    private Double saldoVMLE;
    @SerializedName("saldoPesoLiquido")
    @Expose
    private Double saldoPesoLiquido;
    @SerializedName("saldoValorFinanciado")
    @Expose
    private Double saldoValorFinanciado;
    @SerializedName("saldoValorCondicaoVenda")
    @Expose
    private Double saldoValorCondicaoVenda;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getSaldoQuantidadeComercial() {
        return saldoQuantidadeComercial;
    }

    public void setSaldoQuantidadeComercial(Double saldoQuantidadeComercial) {
        this.saldoQuantidadeComercial = saldoQuantidadeComercial;
    }

    public Double getSaldoQuantidadeEstatistica() {
        return saldoQuantidadeEstatistica;
    }

    public void setSaldoQuantidadeEstatistica(Double saldoQuantidadeEstatistica) {
        this.saldoQuantidadeEstatistica = saldoQuantidadeEstatistica;
    }

    public Double getSaldoVMLE() {
        return saldoVMLE;
    }

    public void setSaldoVMLE(Double saldoVMLE) {
        this.saldoVMLE = saldoVMLE;
    }

    public Double getSaldoPesoLiquido() {
        return saldoPesoLiquido;
    }

    public void setSaldoPesoLiquido(Double saldoPesoLiquido) {
        this.saldoPesoLiquido = saldoPesoLiquido;
    }

    public Double getSaldoValorFinanciado() {
        return saldoValorFinanciado;
    }

    public void setSaldoValorFinanciado(Double saldoValorFinanciado) {
        this.saldoValorFinanciado = saldoValorFinanciado;
    }

    public Double getSaldoValorCondicaoVenda() {
        return saldoValorCondicaoVenda;
    }

    public void setSaldoValorCondicaoVenda(Double saldoValorCondicaoVenda) {
        this.saldoValorCondicaoVenda = saldoValorCondicaoVenda;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Saldos.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("titulo");
        sb.append('=');
        sb.append(((this.titulo == null)?"<null>":this.titulo));
        sb.append(',');
        sb.append("saldoQuantidadeComercial");
        sb.append('=');
        sb.append(((this.saldoQuantidadeComercial == null)?"<null>":this.saldoQuantidadeComercial));
        sb.append(',');
        sb.append("saldoQuantidadeEstatistica");
        sb.append('=');
        sb.append(((this.saldoQuantidadeEstatistica == null)?"<null>":this.saldoQuantidadeEstatistica));
        sb.append(',');
        sb.append("saldoVMLE");
        sb.append('=');
        sb.append(((this.saldoVMLE == null)?"<null>":this.saldoVMLE));
        sb.append(',');
        sb.append("saldoPesoLiquido");
        sb.append('=');
        sb.append(((this.saldoPesoLiquido == null)?"<null>":this.saldoPesoLiquido));
        sb.append(',');
        sb.append("saldoValorFinanciado");
        sb.append('=');
        sb.append(((this.saldoValorFinanciado == null)?"<null>":this.saldoValorFinanciado));
        sb.append(',');
        sb.append("saldoValorCondicaoVenda");
        sb.append('=');
        sb.append(((this.saldoValorCondicaoVenda == null)?"<null>":this.saldoValorCondicaoVenda));
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
        result = ((result* 31)+((this.saldoVMLE == null)? 0 :this.saldoVMLE.hashCode()));
        result = ((result* 31)+((this.saldoValorFinanciado == null)? 0 :this.saldoValorFinanciado.hashCode()));
        result = ((result* 31)+((this.saldoQuantidadeEstatistica == null)? 0 :this.saldoQuantidadeEstatistica.hashCode()));
        result = ((result* 31)+((this.saldoQuantidadeComercial == null)? 0 :this.saldoQuantidadeComercial.hashCode()));
        result = ((result* 31)+((this.saldoValorCondicaoVenda == null)? 0 :this.saldoValorCondicaoVenda.hashCode()));
        result = ((result* 31)+((this.titulo == null)? 0 :this.titulo.hashCode()));
        result = ((result* 31)+((this.saldoPesoLiquido == null)? 0 :this.saldoPesoLiquido.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Saldos) == false) {
            return false;
        }
        Saldos rhs = ((Saldos) other);
        return ((((((((this.saldoVMLE == rhs.saldoVMLE)||((this.saldoVMLE!= null)&&this.saldoVMLE.equals(rhs.saldoVMLE)))&&((this.saldoValorFinanciado == rhs.saldoValorFinanciado)||((this.saldoValorFinanciado!= null)&&this.saldoValorFinanciado.equals(rhs.saldoValorFinanciado))))&&((this.saldoQuantidadeEstatistica == rhs.saldoQuantidadeEstatistica)||((this.saldoQuantidadeEstatistica!= null)&&this.saldoQuantidadeEstatistica.equals(rhs.saldoQuantidadeEstatistica))))&&((this.saldoQuantidadeComercial == rhs.saldoQuantidadeComercial)||((this.saldoQuantidadeComercial!= null)&&this.saldoQuantidadeComercial.equals(rhs.saldoQuantidadeComercial))))&&((this.saldoValorCondicaoVenda == rhs.saldoValorCondicaoVenda)||((this.saldoValorCondicaoVenda!= null)&&this.saldoValorCondicaoVenda.equals(rhs.saldoValorCondicaoVenda))))&&((this.titulo == rhs.titulo)||((this.titulo!= null)&&this.titulo.equals(rhs.titulo))))&&((this.saldoPesoLiquido == rhs.saldoPesoLiquido)||((this.saldoPesoLiquido!= null)&&this.saldoPesoLiquido.equals(rhs.saldoPesoLiquido))));
    }

}
