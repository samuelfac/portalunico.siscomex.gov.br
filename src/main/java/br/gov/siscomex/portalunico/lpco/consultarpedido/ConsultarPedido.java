
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
        result = ((result* 31)+((this.numero == null)? 0 :this.numero.hashCode()));
        result = ((result* 31)+((this.dataRegistro == null)? 0 :this.dataRegistro.hashCode()));
        result = ((result* 31)+((this.importadorExportador == null)? 0 :this.importadorExportador.hashCode()));
        result = ((result* 31)+((this.ncm == null)? 0 :this.ncm.hashCode()));
        result = ((result* 31)+((this.nome == null)? 0 :this.nome.hashCode()));
        result = ((result* 31)+((this.dataFimVigencia == null)? 0 :this.dataFimVigencia.hashCode()));
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
        return ((((((((this.situacao == rhs.situacao)||((this.situacao!= null)&&this.situacao.equals(rhs.situacao)))&&((this.numero == rhs.numero)||((this.numero!= null)&&this.numero.equals(rhs.numero))))&&((this.dataRegistro == rhs.dataRegistro)||((this.dataRegistro!= null)&&this.dataRegistro.equals(rhs.dataRegistro))))&&((this.importadorExportador == rhs.importadorExportador)||((this.importadorExportador!= null)&&this.importadorExportador.equals(rhs.importadorExportador))))&&((this.ncm == rhs.ncm)||((this.ncm!= null)&&this.ncm.equals(rhs.ncm))))&&((this.nome == rhs.nome)||((this.nome!= null)&&this.nome.equals(rhs.nome))))&&((this.dataFimVigencia == rhs.dataFimVigencia)||((this.dataFimVigencia!= null)&&this.dataFimVigencia.equals(rhs.dataFimVigencia))));
    }

}
