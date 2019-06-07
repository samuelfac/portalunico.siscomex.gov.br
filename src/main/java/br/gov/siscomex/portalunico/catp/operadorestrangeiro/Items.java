
package br.gov.siscomex.portalunico.catp.operadorestrangeiro;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Items {

    @SerializedName("seq")
    @Expose
    private Integer seq;
    @SerializedName("cpfCnpjRaiz")
    @Expose
    private String cpfCnpjRaiz;
    @SerializedName("codigo")
    @Expose
    private String codigo;
    @SerializedName("nome")
    @Expose
    private String nome;
    @SerializedName("logradouro")
    @Expose
    private String logradouro;
    @SerializedName("nomeCidade")
    @Expose
    private String nomeCidade;
    @SerializedName("codigoSubdivisaoPais")
    @Expose
    private String codigoSubdivisaoPais;
    @SerializedName("codigoPais")
    @Expose
    private String codigoPais;
    @SerializedName("cep")
    @Expose
    private String cep;

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getCpfCnpjRaiz() {
        return cpfCnpjRaiz;
    }

    public void setCpfCnpjRaiz(String cpfCnpjRaiz) {
        this.cpfCnpjRaiz = cpfCnpjRaiz;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public String getCodigoSubdivisaoPais() {
        return codigoSubdivisaoPais;
    }

    public void setCodigoSubdivisaoPais(String codigoSubdivisaoPais) {
        this.codigoSubdivisaoPais = codigoSubdivisaoPais;
    }

    public String getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Items.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("seq");
        sb.append('=');
        sb.append(((this.seq == null)?"<null>":this.seq));
        sb.append(',');
        sb.append("cpfCnpjRaiz");
        sb.append('=');
        sb.append(((this.cpfCnpjRaiz == null)?"<null>":this.cpfCnpjRaiz));
        sb.append(',');
        sb.append("codigo");
        sb.append('=');
        sb.append(((this.codigo == null)?"<null>":this.codigo));
        sb.append(',');
        sb.append("nome");
        sb.append('=');
        sb.append(((this.nome == null)?"<null>":this.nome));
        sb.append(',');
        sb.append("logradouro");
        sb.append('=');
        sb.append(((this.logradouro == null)?"<null>":this.logradouro));
        sb.append(',');
        sb.append("nomeCidade");
        sb.append('=');
        sb.append(((this.nomeCidade == null)?"<null>":this.nomeCidade));
        sb.append(',');
        sb.append("codigoSubdivisaoPais");
        sb.append('=');
        sb.append(((this.codigoSubdivisaoPais == null)?"<null>":this.codigoSubdivisaoPais));
        sb.append(',');
        sb.append("codigoPais");
        sb.append('=');
        sb.append(((this.codigoPais == null)?"<null>":this.codigoPais));
        sb.append(',');
        sb.append("cep");
        sb.append('=');
        sb.append(((this.cep == null)?"<null>":this.cep));
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
        result = ((result* 31)+((this.cpfCnpjRaiz == null)? 0 :this.cpfCnpjRaiz.hashCode()));
        result = ((result* 31)+((this.codigo == null)? 0 :this.codigo.hashCode()));
        result = ((result* 31)+((this.codigoSubdivisaoPais == null)? 0 :this.codigoSubdivisaoPais.hashCode()));
        result = ((result* 31)+((this.logradouro == null)? 0 :this.logradouro.hashCode()));
        result = ((result* 31)+((this.nomeCidade == null)? 0 :this.nomeCidade.hashCode()));
        result = ((result* 31)+((this.nome == null)? 0 :this.nome.hashCode()));
        result = ((result* 31)+((this.seq == null)? 0 :this.seq.hashCode()));
        result = ((result* 31)+((this.codigoPais == null)? 0 :this.codigoPais.hashCode()));
        result = ((result* 31)+((this.cep == null)? 0 :this.cep.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Items) == false) {
            return false;
        }
        Items rhs = ((Items) other);
        return ((((((((((this.cpfCnpjRaiz == rhs.cpfCnpjRaiz)||((this.cpfCnpjRaiz!= null)&&this.cpfCnpjRaiz.equals(rhs.cpfCnpjRaiz)))&&((this.codigo == rhs.codigo)||((this.codigo!= null)&&this.codigo.equals(rhs.codigo))))&&((this.codigoSubdivisaoPais == rhs.codigoSubdivisaoPais)||((this.codigoSubdivisaoPais!= null)&&this.codigoSubdivisaoPais.equals(rhs.codigoSubdivisaoPais))))&&((this.logradouro == rhs.logradouro)||((this.logradouro!= null)&&this.logradouro.equals(rhs.logradouro))))&&((this.nomeCidade == rhs.nomeCidade)||((this.nomeCidade!= null)&&this.nomeCidade.equals(rhs.nomeCidade))))&&((this.nome == rhs.nome)||((this.nome!= null)&&this.nome.equals(rhs.nome))))&&((this.seq == rhs.seq)||((this.seq!= null)&&this.seq.equals(rhs.seq))))&&((this.codigoPais == rhs.codigoPais)||((this.codigoPais!= null)&&this.codigoPais.equals(rhs.codigoPais))))&&((this.cep == rhs.cep)||((this.cep!= null)&&this.cep.equals(rhs.cep))));
    }

}
