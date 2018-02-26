
package br.gov.siscomex.portalunico.cct.consultarconteiner;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListaMensagem {

    @SerializedName("codigo")
    @Expose
    private String codigo;
    @SerializedName("mensagem")
    @Expose
    private String mensagem;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ListaMensagem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("codigo");
        sb.append('=');
        sb.append(((this.codigo == null)?"<null>":this.codigo));
        sb.append(',');
        sb.append("mensagem");
        sb.append('=');
        sb.append(((this.mensagem == null)?"<null>":this.mensagem));
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
        result = ((result* 31)+((this.codigo == null)? 0 :this.codigo.hashCode()));
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
        return (((this.codigo == rhs.codigo)||((this.codigo!= null)&&this.codigo.equals(rhs.codigo)))&&((this.mensagem == rhs.mensagem)||((this.mensagem!= null)&&this.mensagem.equals(rhs.mensagem))));
    }

}
