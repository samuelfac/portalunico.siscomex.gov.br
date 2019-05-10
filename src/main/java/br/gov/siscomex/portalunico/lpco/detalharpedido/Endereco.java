
package br.gov.siscomex.portalunico.lpco.detalharpedido;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Endereco {

    @SerializedName("logradouro")
    @Expose
    private String logradouro;
    @SerializedName("bairro")
    @Expose
    private String bairro;
    @SerializedName("municipio")
    @Expose
    private String municipio;
    @SerializedName("cep")
    @Expose
    private String cep;
    @SerializedName("uf")
    @Expose
    private String uf;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Endereco.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("logradouro");
        sb.append('=');
        sb.append(((this.logradouro == null)?"<null>":this.logradouro));
        sb.append(',');
        sb.append("bairro");
        sb.append('=');
        sb.append(((this.bairro == null)?"<null>":this.bairro));
        sb.append(',');
        sb.append("municipio");
        sb.append('=');
        sb.append(((this.municipio == null)?"<null>":this.municipio));
        sb.append(',');
        sb.append("cep");
        sb.append('=');
        sb.append(((this.cep == null)?"<null>":this.cep));
        sb.append(',');
        sb.append("uf");
        sb.append('=');
        sb.append(((this.uf == null)?"<null>":this.uf));
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
        result = ((result* 31)+((this.uf == null)? 0 :this.uf.hashCode()));
        result = ((result* 31)+((this.logradouro == null)? 0 :this.logradouro.hashCode()));
        result = ((result* 31)+((this.bairro == null)? 0 :this.bairro.hashCode()));
        result = ((result* 31)+((this.municipio == null)? 0 :this.municipio.hashCode()));
        result = ((result* 31)+((this.cep == null)? 0 :this.cep.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Endereco) == false) {
            return false;
        }
        Endereco rhs = ((Endereco) other);
        return ((((((this.uf == rhs.uf)||((this.uf!= null)&&this.uf.equals(rhs.uf)))&&((this.logradouro == rhs.logradouro)||((this.logradouro!= null)&&this.logradouro.equals(rhs.logradouro))))&&((this.bairro == rhs.bairro)||((this.bairro!= null)&&this.bairro.equals(rhs.bairro))))&&((this.municipio == rhs.municipio)||((this.municipio!= null)&&this.municipio.equals(rhs.municipio))))&&((this.cep == rhs.cep)||((this.cep!= null)&&this.cep.equals(rhs.cep))));
    }

}
