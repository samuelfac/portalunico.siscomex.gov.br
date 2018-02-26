
package br.gov.siscomex.portalunico.lpco.alterarsituacao;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AlterarSituacao {

    @SerializedName("situacao")
    @Expose
    private String situacao;
    @SerializedName("justificativa")
    @Expose
    private String justificativa;
    @SerializedName("dataInicioVigencia")
    @Expose
    private String dataInicioVigencia;
    @SerializedName("dataFinalVigencia")
    @Expose
    private String dataFinalVigencia;
    @SerializedName("numeroOrgaoOrigem")
    @Expose
    private String numeroOrgaoOrigem;
    @SerializedName("requerInspecao")
    @Expose
    private Boolean requerInspecao;

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public String getDataInicioVigencia() {
        return dataInicioVigencia;
    }

    public void setDataInicioVigencia(String dataInicioVigencia) {
        this.dataInicioVigencia = dataInicioVigencia;
    }

    public String getDataFinalVigencia() {
        return dataFinalVigencia;
    }

    public void setDataFinalVigencia(String dataFinalVigencia) {
        this.dataFinalVigencia = dataFinalVigencia;
    }

    public String getNumeroOrgaoOrigem() {
        return numeroOrgaoOrigem;
    }

    public void setNumeroOrgaoOrigem(String numeroOrgaoOrigem) {
        this.numeroOrgaoOrigem = numeroOrgaoOrigem;
    }

    public Boolean getRequerInspecao() {
        return requerInspecao;
    }

    public void setRequerInspecao(Boolean requerInspecao) {
        this.requerInspecao = requerInspecao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AlterarSituacao.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("situacao");
        sb.append('=');
        sb.append(((this.situacao == null)?"<null>":this.situacao));
        sb.append(',');
        sb.append("justificativa");
        sb.append('=');
        sb.append(((this.justificativa == null)?"<null>":this.justificativa));
        sb.append(',');
        sb.append("dataInicioVigencia");
        sb.append('=');
        sb.append(((this.dataInicioVigencia == null)?"<null>":this.dataInicioVigencia));
        sb.append(',');
        sb.append("dataFinalVigencia");
        sb.append('=');
        sb.append(((this.dataFinalVigencia == null)?"<null>":this.dataFinalVigencia));
        sb.append(',');
        sb.append("numeroOrgaoOrigem");
        sb.append('=');
        sb.append(((this.numeroOrgaoOrigem == null)?"<null>":this.numeroOrgaoOrigem));
        sb.append(',');
        sb.append("requerInspecao");
        sb.append('=');
        sb.append(((this.requerInspecao == null)?"<null>":this.requerInspecao));
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
        result = ((result* 31)+((this.requerInspecao == null)? 0 :this.requerInspecao.hashCode()));
        result = ((result* 31)+((this.situacao == null)? 0 :this.situacao.hashCode()));
        result = ((result* 31)+((this.justificativa == null)? 0 :this.justificativa.hashCode()));
        result = ((result* 31)+((this.dataFinalVigencia == null)? 0 :this.dataFinalVigencia.hashCode()));
        result = ((result* 31)+((this.dataInicioVigencia == null)? 0 :this.dataInicioVigencia.hashCode()));
        result = ((result* 31)+((this.numeroOrgaoOrigem == null)? 0 :this.numeroOrgaoOrigem.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AlterarSituacao) == false) {
            return false;
        }
        AlterarSituacao rhs = ((AlterarSituacao) other);
        return (((((((this.requerInspecao == rhs.requerInspecao)||((this.requerInspecao!= null)&&this.requerInspecao.equals(rhs.requerInspecao)))&&((this.situacao == rhs.situacao)||((this.situacao!= null)&&this.situacao.equals(rhs.situacao))))&&((this.justificativa == rhs.justificativa)||((this.justificativa!= null)&&this.justificativa.equals(rhs.justificativa))))&&((this.dataFinalVigencia == rhs.dataFinalVigencia)||((this.dataFinalVigencia!= null)&&this.dataFinalVigencia.equals(rhs.dataFinalVigencia))))&&((this.dataInicioVigencia == rhs.dataInicioVigencia)||((this.dataInicioVigencia!= null)&&this.dataInicioVigencia.equals(rhs.dataInicioVigencia))))&&((this.numeroOrgaoOrigem == rhs.numeroOrgaoOrigem)||((this.numeroOrgaoOrigem!= null)&&this.numeroOrgaoOrigem.equals(rhs.numeroOrgaoOrigem))));
    }

}
