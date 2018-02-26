
package br.gov.siscomex.portalunico.catp.operadorestrangeiroretorno;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Items {

    @SerializedName("seq")
    @Expose
    private Integer seq;
    @SerializedName("codigo")
    @Expose
    private String codigo;
    @SerializedName("erros")
    @Expose
    private List<String> erros = new ArrayList<String>();
    @SerializedName("sucesso")
    @Expose
    private Boolean sucesso;

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<String> getErros() {
        return erros;
    }

    public void setErros(List<String> erros) {
        this.erros = erros;
    }

    public Boolean getSucesso() {
        return sucesso;
    }

    public void setSucesso(Boolean sucesso) {
        this.sucesso = sucesso;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Items.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("seq");
        sb.append('=');
        sb.append(((this.seq == null)?"<null>":this.seq));
        sb.append(',');
        sb.append("codigo");
        sb.append('=');
        sb.append(((this.codigo == null)?"<null>":this.codigo));
        sb.append(',');
        sb.append("erros");
        sb.append('=');
        sb.append(((this.erros == null)?"<null>":this.erros));
        sb.append(',');
        sb.append("sucesso");
        sb.append('=');
        sb.append(((this.sucesso == null)?"<null>":this.sucesso));
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
        result = ((result* 31)+((this.erros == null)? 0 :this.erros.hashCode()));
        result = ((result* 31)+((this.sucesso == null)? 0 :this.sucesso.hashCode()));
        result = ((result* 31)+((this.seq == null)? 0 :this.seq.hashCode()));
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
        return (((((this.codigo == rhs.codigo)||((this.codigo!= null)&&this.codigo.equals(rhs.codigo)))&&((this.erros == rhs.erros)||((this.erros!= null)&&this.erros.equals(rhs.erros))))&&((this.sucesso == rhs.sucesso)||((this.sucesso!= null)&&this.sucesso.equals(rhs.sucesso))))&&((this.seq == rhs.seq)||((this.seq!= null)&&this.seq.equals(rhs.seq))));
    }

}
