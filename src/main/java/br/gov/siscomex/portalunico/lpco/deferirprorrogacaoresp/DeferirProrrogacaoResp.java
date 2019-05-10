
package br.gov.siscomex.portalunico.lpco.deferirprorrogacaoresp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DeferirProrrogacaoResp {

    @SerializedName("situacao")
    @Expose
    private Situacao situacao;
    @SerializedName("novaDataFimVigencia")
    @Expose
    private String novaDataFimVigencia;

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public String getNovaDataFimVigencia() {
        return novaDataFimVigencia;
    }

    public void setNovaDataFimVigencia(String novaDataFimVigencia) {
        this.novaDataFimVigencia = novaDataFimVigencia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DeferirProrrogacaoResp.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("situacao");
        sb.append('=');
        sb.append(((this.situacao == null)?"<null>":this.situacao));
        sb.append(',');
        sb.append("novaDataFimVigencia");
        sb.append('=');
        sb.append(((this.novaDataFimVigencia == null)?"<null>":this.novaDataFimVigencia));
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
        result = ((result* 31)+((this.situacao == null)? 0 :this.situacao.hashCode()));
        result = ((result* 31)+((this.novaDataFimVigencia == null)? 0 :this.novaDataFimVigencia.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeferirProrrogacaoResp) == false) {
            return false;
        }
        DeferirProrrogacaoResp rhs = ((DeferirProrrogacaoResp) other);
        return (((this.situacao == rhs.situacao)||((this.situacao!= null)&&this.situacao.equals(rhs.situacao)))&&((this.novaDataFimVigencia == rhs.novaDataFimVigencia)||((this.novaDataFimVigencia!= null)&&this.novaDataFimVigencia.equals(rhs.novaDataFimVigencia))));
    }

}
