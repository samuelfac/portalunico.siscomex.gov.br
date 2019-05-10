
package br.gov.siscomex.portalunico.lpco.detalharprorrogacao;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DetalharProrrogacao {

    @SerializedName("situacao")
    @Expose
    private Situacao situacao;
    @SerializedName("novaDataFimVigencia")
    @Expose
    private String novaDataFimVigencia;
    @SerializedName("dataInicioVigencia")
    @Expose
    private String dataInicioVigencia;
    @SerializedName("dataFimVigencia")
    @Expose
    private String dataFimVigencia;
    @SerializedName("dataCadastroSolicitacao")
    @Expose
    private String dataCadastroSolicitacao;
    @SerializedName("dataUltimaAlteracao")
    @Expose
    private String dataUltimaAlteracao;
    @SerializedName("justificativa")
    @Expose
    private String justificativa;

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

    public String getDataInicioVigencia() {
        return dataInicioVigencia;
    }

    public void setDataInicioVigencia(String dataInicioVigencia) {
        this.dataInicioVigencia = dataInicioVigencia;
    }

    public String getDataFimVigencia() {
        return dataFimVigencia;
    }

    public void setDataFimVigencia(String dataFimVigencia) {
        this.dataFimVigencia = dataFimVigencia;
    }

    public String getDataCadastroSolicitacao() {
        return dataCadastroSolicitacao;
    }

    public void setDataCadastroSolicitacao(String dataCadastroSolicitacao) {
        this.dataCadastroSolicitacao = dataCadastroSolicitacao;
    }

    public String getDataUltimaAlteracao() {
        return dataUltimaAlteracao;
    }

    public void setDataUltimaAlteracao(String dataUltimaAlteracao) {
        this.dataUltimaAlteracao = dataUltimaAlteracao;
    }

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DetalharProrrogacao.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("situacao");
        sb.append('=');
        sb.append(((this.situacao == null)?"<null>":this.situacao));
        sb.append(',');
        sb.append("novaDataFimVigencia");
        sb.append('=');
        sb.append(((this.novaDataFimVigencia == null)?"<null>":this.novaDataFimVigencia));
        sb.append(',');
        sb.append("dataInicioVigencia");
        sb.append('=');
        sb.append(((this.dataInicioVigencia == null)?"<null>":this.dataInicioVigencia));
        sb.append(',');
        sb.append("dataFimVigencia");
        sb.append('=');
        sb.append(((this.dataFimVigencia == null)?"<null>":this.dataFimVigencia));
        sb.append(',');
        sb.append("dataCadastroSolicitacao");
        sb.append('=');
        sb.append(((this.dataCadastroSolicitacao == null)?"<null>":this.dataCadastroSolicitacao));
        sb.append(',');
        sb.append("dataUltimaAlteracao");
        sb.append('=');
        sb.append(((this.dataUltimaAlteracao == null)?"<null>":this.dataUltimaAlteracao));
        sb.append(',');
        sb.append("justificativa");
        sb.append('=');
        sb.append(((this.justificativa == null)?"<null>":this.justificativa));
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
        result = ((result* 31)+((this.dataUltimaAlteracao == null)? 0 :this.dataUltimaAlteracao.hashCode()));
        result = ((result* 31)+((this.situacao == null)? 0 :this.situacao.hashCode()));
        result = ((result* 31)+((this.justificativa == null)? 0 :this.justificativa.hashCode()));
        result = ((result* 31)+((this.dataCadastroSolicitacao == null)? 0 :this.dataCadastroSolicitacao.hashCode()));
        result = ((result* 31)+((this.dataFimVigencia == null)? 0 :this.dataFimVigencia.hashCode()));
        result = ((result* 31)+((this.dataInicioVigencia == null)? 0 :this.dataInicioVigencia.hashCode()));
        result = ((result* 31)+((this.novaDataFimVigencia == null)? 0 :this.novaDataFimVigencia.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DetalharProrrogacao) == false) {
            return false;
        }
        DetalharProrrogacao rhs = ((DetalharProrrogacao) other);
        return ((((((((this.dataUltimaAlteracao == rhs.dataUltimaAlteracao)||((this.dataUltimaAlteracao!= null)&&this.dataUltimaAlteracao.equals(rhs.dataUltimaAlteracao)))&&((this.situacao == rhs.situacao)||((this.situacao!= null)&&this.situacao.equals(rhs.situacao))))&&((this.justificativa == rhs.justificativa)||((this.justificativa!= null)&&this.justificativa.equals(rhs.justificativa))))&&((this.dataCadastroSolicitacao == rhs.dataCadastroSolicitacao)||((this.dataCadastroSolicitacao!= null)&&this.dataCadastroSolicitacao.equals(rhs.dataCadastroSolicitacao))))&&((this.dataFimVigencia == rhs.dataFimVigencia)||((this.dataFimVigencia!= null)&&this.dataFimVigencia.equals(rhs.dataFimVigencia))))&&((this.dataInicioVigencia == rhs.dataInicioVigencia)||((this.dataInicioVigencia!= null)&&this.dataInicioVigencia.equals(rhs.dataInicioVigencia))))&&((this.novaDataFimVigencia == rhs.novaDataFimVigencia)||((this.novaDataFimVigencia!= null)&&this.novaDataFimVigencia.equals(rhs.novaDataFimVigencia))));
    }

}
