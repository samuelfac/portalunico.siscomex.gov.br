
package br.gov.siscomex.portalunico.lpco.consultarpedido;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConsultarPedido {

    @SerializedName("numero")
    @Expose
    private String numero;
    @SerializedName("dataRegistro")
    @Expose
    private String dataRegistro;
    @SerializedName("situacao")
    @Expose
    private String situacao;
    @SerializedName("codigoModelo")
    @Expose
    private String codigoModelo;
    @SerializedName("nome")
    @Expose
    private String nome;
    @SerializedName("ncm")
    @Expose
    private String ncm;
    @SerializedName("importadorExportador")
    @Expose
    private String importadorExportador;
    @SerializedName("dataFimVigencia")
    @Expose
    private String dataFimVigencia;
    @SerializedName("dueEmDespacho")
    @Expose
    private String dueEmDespacho;
    @SerializedName("dueVinculada")
    @Expose
    private String dueVinculada;
    @SerializedName("prorrogacaoPendente")
    @Expose
    private Boolean prorrogacaoPendente;
    @SerializedName("retificacaoPendente")
    @Expose
    private Boolean retificacaoPendente;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getCodigoModelo() {
        return codigoModelo;
    }

    public void setCodigoModelo(String codigoModelo) {
        this.codigoModelo = codigoModelo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public String getImportadorExportador() {
        return importadorExportador;
    }

    public void setImportadorExportador(String importadorExportador) {
        this.importadorExportador = importadorExportador;
    }

    public String getDataFimVigencia() {
        return dataFimVigencia;
    }

    public void setDataFimVigencia(String dataFimVigencia) {
        this.dataFimVigencia = dataFimVigencia;
    }

    public String getDueEmDespacho() {
        return dueEmDespacho;
    }

    public void setDueEmDespacho(String dueEmDespacho) {
        this.dueEmDespacho = dueEmDespacho;
    }

    public String getDueVinculada() {
        return dueVinculada;
    }

    public void setDueVinculada(String dueVinculada) {
        this.dueVinculada = dueVinculada;
    }

    public Boolean getProrrogacaoPendente() {
        return prorrogacaoPendente;
    }

    public void setProrrogacaoPendente(Boolean prorrogacaoPendente) {
        this.prorrogacaoPendente = prorrogacaoPendente;
    }

    public Boolean getRetificacaoPendente() {
        return retificacaoPendente;
    }

    public void setRetificacaoPendente(Boolean retificacaoPendente) {
        this.retificacaoPendente = retificacaoPendente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConsultarPedido.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("numero");
        sb.append('=');
        sb.append(((this.numero == null)?"<null>":this.numero));
        sb.append(',');
        sb.append("dataRegistro");
        sb.append('=');
        sb.append(((this.dataRegistro == null)?"<null>":this.dataRegistro));
        sb.append(',');
        sb.append("situacao");
        sb.append('=');
        sb.append(((this.situacao == null)?"<null>":this.situacao));
        sb.append(',');
        sb.append("codigoModelo");
        sb.append('=');
        sb.append(((this.codigoModelo == null)?"<null>":this.codigoModelo));
        sb.append(',');
        sb.append("nome");
        sb.append('=');
        sb.append(((this.nome == null)?"<null>":this.nome));
        sb.append(',');
        sb.append("ncm");
        sb.append('=');
        sb.append(((this.ncm == null)?"<null>":this.ncm));
        sb.append(',');
        sb.append("importadorExportador");
        sb.append('=');
        sb.append(((this.importadorExportador == null)?"<null>":this.importadorExportador));
        sb.append(',');
        sb.append("dataFimVigencia");
        sb.append('=');
        sb.append(((this.dataFimVigencia == null)?"<null>":this.dataFimVigencia));
        sb.append(',');
        sb.append("dueEmDespacho");
        sb.append('=');
        sb.append(((this.dueEmDespacho == null)?"<null>":this.dueEmDespacho));
        sb.append(',');
        sb.append("dueVinculada");
        sb.append('=');
        sb.append(((this.dueVinculada == null)?"<null>":this.dueVinculada));
        sb.append(',');
        sb.append("prorrogacaoPendente");
        sb.append('=');
        sb.append(((this.prorrogacaoPendente == null)?"<null>":this.prorrogacaoPendente));
        sb.append(',');
        sb.append("retificacaoPendente");
        sb.append('=');
        sb.append(((this.retificacaoPendente == null)?"<null>":this.retificacaoPendente));
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
        result = ((result* 31)+((this.dueEmDespacho == null)? 0 :this.dueEmDespacho.hashCode()));
        result = ((result* 31)+((this.situacao == null)? 0 :this.situacao.hashCode()));
        result = ((result* 31)+((this.numero == null)? 0 :this.numero.hashCode()));
        result = ((result* 31)+((this.codigoModelo == null)? 0 :this.codigoModelo.hashCode()));
        result = ((result* 31)+((this.dataRegistro == null)? 0 :this.dataRegistro.hashCode()));
        result = ((result* 31)+((this.importadorExportador == null)? 0 :this.importadorExportador.hashCode()));
        result = ((result* 31)+((this.nome == null)? 0 :this.nome.hashCode()));
        result = ((result* 31)+((this.dataFimVigencia == null)? 0 :this.dataFimVigencia.hashCode()));
        result = ((result* 31)+((this.retificacaoPendente == null)? 0 :this.retificacaoPendente.hashCode()));
        result = ((result* 31)+((this.prorrogacaoPendente == null)? 0 :this.prorrogacaoPendente.hashCode()));
        result = ((result* 31)+((this.dueVinculada == null)? 0 :this.dueVinculada.hashCode()));
        result = ((result* 31)+((this.ncm == null)? 0 :this.ncm.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConsultarPedido) == false) {
            return false;
        }
        ConsultarPedido rhs = ((ConsultarPedido) other);
        return (((((((((((((this.dueEmDespacho == rhs.dueEmDespacho)||((this.dueEmDespacho!= null)&&this.dueEmDespacho.equals(rhs.dueEmDespacho)))&&((this.situacao == rhs.situacao)||((this.situacao!= null)&&this.situacao.equals(rhs.situacao))))&&((this.numero == rhs.numero)||((this.numero!= null)&&this.numero.equals(rhs.numero))))&&((this.codigoModelo == rhs.codigoModelo)||((this.codigoModelo!= null)&&this.codigoModelo.equals(rhs.codigoModelo))))&&((this.dataRegistro == rhs.dataRegistro)||((this.dataRegistro!= null)&&this.dataRegistro.equals(rhs.dataRegistro))))&&((this.importadorExportador == rhs.importadorExportador)||((this.importadorExportador!= null)&&this.importadorExportador.equals(rhs.importadorExportador))))&&((this.nome == rhs.nome)||((this.nome!= null)&&this.nome.equals(rhs.nome))))&&((this.dataFimVigencia == rhs.dataFimVigencia)||((this.dataFimVigencia!= null)&&this.dataFimVigencia.equals(rhs.dataFimVigencia))))&&((this.retificacaoPendente == rhs.retificacaoPendente)||((this.retificacaoPendente!= null)&&this.retificacaoPendente.equals(rhs.retificacaoPendente))))&&((this.prorrogacaoPendente == rhs.prorrogacaoPendente)||((this.prorrogacaoPendente!= null)&&this.prorrogacaoPendente.equals(rhs.prorrogacaoPendente))))&&((this.dueVinculada == rhs.dueVinculada)||((this.dueVinculada!= null)&&this.dueVinculada.equals(rhs.dueVinculada))))&&((this.ncm == rhs.ncm)||((this.ncm!= null)&&this.ncm.equals(rhs.ncm))));
    }

}
