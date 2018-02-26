
package br.gov.siscomex.portalunico.cct.consultarmruc;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListaMensagem {

    @SerializedName("mensagem")
    @Expose
    private String mensagem;
    @SerializedName("codigoErro")
    @Expose
    private String codigoErro;

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getCodigoErro() {
        return codigoErro;
    }

    public void setCodigoErro(String codigoErro) {
        this.codigoErro = codigoErro;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ListaMensagem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("mensagem");
        sb.append('=');
        sb.append(((this.mensagem == null)?"<null>":this.mensagem));
        sb.append(',');
        sb.append("codigoErro");
        sb.append('=');
        sb.append(((this.codigoErro == null)?"<null>":this.codigoErro));
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
        result = ((result* 31)+((this.codigoErro == null)? 0 :this.codigoErro.hashCode()));
        result = ((result* 31)+((this.mensagem == null)? 0 :this.mensagem.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListaMensagem) == false) {
            return false;
        }
        ListaMensagem rhs = ((ListaMensagem) other);
        return (((this.codigoErro == rhs.codigoErro)||((this.codigoErro!= null)&&this.codigoErro.equals(rhs.codigoErro)))&&((this.mensagem == rhs.mensagem)||((this.mensagem!= null)&&this.mensagem.equals(rhs.mensagem))));
    }

}
