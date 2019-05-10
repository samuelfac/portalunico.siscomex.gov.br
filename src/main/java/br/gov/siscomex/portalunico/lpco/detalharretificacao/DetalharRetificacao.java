
package br.gov.siscomex.portalunico.lpco.detalharretificacao;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DetalharRetificacao {

    @SerializedName("situacao")
    @Expose
    private Situacao situacao;
    @SerializedName("dataRegistro")
    @Expose
    private String dataRegistro;
    @SerializedName("listaAlteracoes")
    @Expose
    private List<Object> listaAlteracoes = new ArrayList<Object>();

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public String getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public List<Object> getListaAlteracoes() {
        return listaAlteracoes;
    }

    public void setListaAlteracoes(List<Object> listaAlteracoes) {
        this.listaAlteracoes = listaAlteracoes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DetalharRetificacao.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("situacao");
        sb.append('=');
        sb.append(((this.situacao == null)?"<null>":this.situacao));
        sb.append(',');
        sb.append("dataRegistro");
        sb.append('=');
        sb.append(((this.dataRegistro == null)?"<null>":this.dataRegistro));
        sb.append(',');
        sb.append("listaAlteracoes");
        sb.append('=');
        sb.append(((this.listaAlteracoes == null)?"<null>":this.listaAlteracoes));
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
        result = ((result* 31)+((this.listaAlteracoes == null)? 0 :this.listaAlteracoes.hashCode()));
        result = ((result* 31)+((this.dataRegistro == null)? 0 :this.dataRegistro.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DetalharRetificacao) == false) {
            return false;
        }
        DetalharRetificacao rhs = ((DetalharRetificacao) other);
        return ((((this.situacao == rhs.situacao)||((this.situacao!= null)&&this.situacao.equals(rhs.situacao)))&&((this.listaAlteracoes == rhs.listaAlteracoes)||((this.listaAlteracoes!= null)&&this.listaAlteracoes.equals(rhs.listaAlteracoes))))&&((this.dataRegistro == rhs.dataRegistro)||((this.dataRegistro!= null)&&this.dataRegistro.equals(rhs.dataRegistro))));
    }

}
