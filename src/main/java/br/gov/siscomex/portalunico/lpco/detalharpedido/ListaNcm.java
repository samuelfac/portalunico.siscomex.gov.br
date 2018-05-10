
package br.gov.siscomex.portalunico.lpco.detalharpedido;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListaNcm {

    @SerializedName("ncm")
    @Expose
    private String ncm;
    @SerializedName("listaCamposNcm")
    @Expose
    private List<ListaCamposNcm> listaCamposNcm = new ArrayList<ListaCamposNcm>();
    @SerializedName("listaAtributosNcm")
    @Expose
    private List<ListaAtributosNcm> listaAtributosNcm = new ArrayList<ListaAtributosNcm>();
    @SerializedName("unidadeMedidaComercializada")
    @Expose
    private String unidadeMedidaComercializada;

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

    public String getUnidadeMedidaComercializada() {
        return unidadeMedidaComercializada;
    }

    public void setUnidadeMedidaComercializada(String unidadeMedidaComercializada) {
        this.unidadeMedidaComercializada = unidadeMedidaComercializada;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ListaNcm.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("unidadeMedidaComercializada");
        sb.append('=');
        sb.append(((this.unidadeMedidaComercializada == null)?"<null>":this.unidadeMedidaComercializada));
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
        result = ((result* 31)+((this.ncm == null)? 0 :this.ncm.hashCode()));
        result = ((result* 31)+((this.unidadeMedidaComercializada == null)? 0 :this.unidadeMedidaComercializada.hashCode()));
        result = ((result* 31)+((this.listaCamposNcm == null)? 0 :this.listaCamposNcm.hashCode()));
        result = ((result* 31)+((this.listaAtributosNcm == null)? 0 :this.listaAtributosNcm.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListaNcm) == false) {
            return false;
        }
        ListaNcm rhs = ((ListaNcm) other);
        return (((((this.ncm == rhs.ncm)||((this.ncm!= null)&&this.ncm.equals(rhs.ncm)))&&((this.unidadeMedidaComercializada == rhs.unidadeMedidaComercializada)||((this.unidadeMedidaComercializada!= null)&&this.unidadeMedidaComercializada.equals(rhs.unidadeMedidaComercializada))))&&((this.listaCamposNcm == rhs.listaCamposNcm)||((this.listaCamposNcm!= null)&&this.listaCamposNcm.equals(rhs.listaCamposNcm))))&&((this.listaAtributosNcm == rhs.listaAtributosNcm)||((this.listaAtributosNcm!= null)&&this.listaAtributosNcm.equals(rhs.listaAtributosNcm))));
    }

}
