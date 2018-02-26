
package br.gov.siscomex.portalunico.lpco.detalharmodeloncm;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DetalharModeloNcm {

    @SerializedName("ncm")
    @Expose
    private String ncm;
    @SerializedName("listaCamposNcm")
    @Expose
    private List<ListaCamposNcm> listaCamposNcm = new ArrayList<ListaCamposNcm>();
    @SerializedName("listaAtributosNcm")
    @Expose
    private List<ListaAtributosNcm> listaAtributosNcm = new ArrayList<ListaAtributosNcm>();
    @SerializedName("unidadeMedidaEstatistica")
    @Expose
    private String unidadeMedidaEstatistica;

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public List<ListaCamposNcm> getListaCamposNcm() {
        return listaCamposNcm;
    }

    public void setListaCamposNcm(List<ListaCamposNcm> listaCamposNcm) {
        this.listaCamposNcm = listaCamposNcm;
    }

    public List<ListaAtributosNcm> getListaAtributosNcm() {
        return listaAtributosNcm;
    }

    public void setListaAtributosNcm(List<ListaAtributosNcm> listaAtributosNcm) {
        this.listaAtributosNcm = listaAtributosNcm;
    }

    public String getUnidadeMedidaEstatistica() {
        return unidadeMedidaEstatistica;
    }

    public void setUnidadeMedidaEstatistica(String unidadeMedidaEstatistica) {
        this.unidadeMedidaEstatistica = unidadeMedidaEstatistica;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DetalharModeloNcm.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ncm");
        sb.append('=');
        sb.append(((this.ncm == null)?"<null>":this.ncm));
        sb.append(',');
        sb.append("listaCamposNcm");
        sb.append('=');
        sb.append(((this.listaCamposNcm == null)?"<null>":this.listaCamposNcm));
        sb.append(',');
        sb.append("listaAtributosNcm");
        sb.append('=');
        sb.append(((this.listaAtributosNcm == null)?"<null>":this.listaAtributosNcm));
        sb.append(',');
        sb.append("unidadeMedidaEstatistica");
        sb.append('=');
        sb.append(((this.unidadeMedidaEstatistica == null)?"<null>":this.unidadeMedidaEstatistica));
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
        result = ((result* 31)+((this.unidadeMedidaEstatistica == null)? 0 :this.unidadeMedidaEstatistica.hashCode()));
        result = ((result* 31)+((this.ncm == null)? 0 :this.ncm.hashCode()));
        result = ((result* 31)+((this.listaCamposNcm == null)? 0 :this.listaCamposNcm.hashCode()));
        result = ((result* 31)+((this.listaAtributosNcm == null)? 0 :this.listaAtributosNcm.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DetalharModeloNcm) == false) {
            return false;
        }
        DetalharModeloNcm rhs = ((DetalharModeloNcm) other);
        return (((((this.unidadeMedidaEstatistica == rhs.unidadeMedidaEstatistica)||((this.unidadeMedidaEstatistica!= null)&&this.unidadeMedidaEstatistica.equals(rhs.unidadeMedidaEstatistica)))&&((this.ncm == rhs.ncm)||((this.ncm!= null)&&this.ncm.equals(rhs.ncm))))&&((this.listaCamposNcm == rhs.listaCamposNcm)||((this.listaCamposNcm!= null)&&this.listaCamposNcm.equals(rhs.listaCamposNcm))))&&((this.listaAtributosNcm == rhs.listaAtributosNcm)||((this.listaAtributosNcm!= null)&&this.listaAtributosNcm.equals(rhs.listaAtributosNcm))));
    }

}
