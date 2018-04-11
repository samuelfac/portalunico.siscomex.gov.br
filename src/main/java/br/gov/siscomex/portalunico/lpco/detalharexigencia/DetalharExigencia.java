
package br.gov.siscomex.portalunico.lpco.detalharexigencia;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DetalharExigencia {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("exigencia")
    @Expose
    private String exigencia;
    @SerializedName("dataExigencia")
    @Expose
    private String dataExigencia;
    @SerializedName("resposta")
    @Expose
    private String resposta;
    @SerializedName("dataResposta")
    @Expose
    private String dataResposta;
    @SerializedName("situacao")
    @Expose
    private Situacao situacao;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExigencia() {
        return exigencia;
    }

    public void setExigencia(String exigencia) {
        this.exigencia = exigencia;
    }

    public String getDataExigencia() {
        return dataExigencia;
    }

    public void setDataExigencia(String dataExigencia) {
        this.dataExigencia = dataExigencia;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public String getDataResposta() {
        return dataResposta;
    }

    public void setDataResposta(String dataResposta) {
        this.dataResposta = dataResposta;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DetalharExigencia.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("exigencia");
        sb.append('=');
        sb.append(((this.exigencia == null)?"<null>":this.exigencia));
        sb.append(',');
        sb.append("dataExigencia");
        sb.append('=');
        sb.append(((this.dataExigencia == null)?"<null>":this.dataExigencia));
        sb.append(',');
        sb.append("resposta");
        sb.append('=');
        sb.append(((this.resposta == null)?"<null>":this.resposta));
        sb.append(',');
        sb.append("dataResposta");
        sb.append('=');
        sb.append(((this.dataResposta == null)?"<null>":this.dataResposta));
        sb.append(',');
        sb.append("situacao");
        sb.append('=');
        sb.append(((this.situacao == null)?"<null>":this.situacao));
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
        result = ((result* 31)+((this.exigencia == null)? 0 :this.exigencia.hashCode()));
        result = ((result* 31)+((this.dataExigencia == null)? 0 :this.dataExigencia.hashCode()));
        result = ((result* 31)+((this.situacao == null)? 0 :this.situacao.hashCode()));
        result = ((result* 31)+((this.resposta == null)? 0 :this.resposta.hashCode()));
        result = ((result* 31)+((this.dataResposta == null)? 0 :this.dataResposta.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DetalharExigencia) == false) {
            return false;
        }
        DetalharExigencia rhs = ((DetalharExigencia) other);
        return (((((((this.exigencia == rhs.exigencia)||((this.exigencia!= null)&&this.exigencia.equals(rhs.exigencia)))&&((this.dataExigencia == rhs.dataExigencia)||((this.dataExigencia!= null)&&this.dataExigencia.equals(rhs.dataExigencia))))&&((this.situacao == rhs.situacao)||((this.situacao!= null)&&this.situacao.equals(rhs.situacao))))&&((this.resposta == rhs.resposta)||((this.resposta!= null)&&this.resposta.equals(rhs.resposta))))&&((this.dataResposta == rhs.dataResposta)||((this.dataResposta!= null)&&this.dataResposta.equals(rhs.dataResposta))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
