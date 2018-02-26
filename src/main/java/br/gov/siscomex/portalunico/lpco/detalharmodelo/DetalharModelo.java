
package br.gov.siscomex.portalunico.lpco.detalharmodelo;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DetalharModelo {

    @SerializedName("modelo")
    @Expose
    private Modelo modelo;
    @SerializedName("listaCamposFormulario")
    @Expose
    private List<ListaCamposFormulario> listaCamposFormulario = new ArrayList<ListaCamposFormulario>();
    @SerializedName("listaCamposNcm")
    @Expose
    private List<ListaCamposNcm> listaCamposNcm = new ArrayList<ListaCamposNcm>();
    @SerializedName("permiteMultiplosCpfCnpjExportador")
    @Expose
    private Boolean permiteMultiplosCpfCnpjExportador;

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public List<ListaCamposFormulario> getListaCamposFormulario() {
        return listaCamposFormulario;
    }

    public void setListaCamposFormulario(List<ListaCamposFormulario> listaCamposFormulario) {
        this.listaCamposFormulario = listaCamposFormulario;
    }

    public List<ListaCamposNcm> getListaCamposNcm() {
        return listaCamposNcm;
    }

    public void setListaCamposNcm(List<ListaCamposNcm> listaCamposNcm) {
        this.listaCamposNcm = listaCamposNcm;
    }

    public Boolean getPermiteMultiplosCpfCnpjExportador() {
        return permiteMultiplosCpfCnpjExportador;
    }

    public void setPermiteMultiplosCpfCnpjExportador(Boolean permiteMultiplosCpfCnpjExportador) {
        this.permiteMultiplosCpfCnpjExportador = permiteMultiplosCpfCnpjExportador;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DetalharModelo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("modelo");
        sb.append('=');
        sb.append(((this.modelo == null)?"<null>":this.modelo));
        sb.append(',');
        sb.append("listaCamposFormulario");
        sb.append('=');
        sb.append(((this.listaCamposFormulario == null)?"<null>":this.listaCamposFormulario));
        sb.append(',');
        sb.append("listaCamposNcm");
        sb.append('=');
        sb.append(((this.listaCamposNcm == null)?"<null>":this.listaCamposNcm));
        sb.append(',');
        sb.append("permiteMultiplosCpfCnpjExportador");
        sb.append('=');
        sb.append(((this.permiteMultiplosCpfCnpjExportador == null)?"<null>":this.permiteMultiplosCpfCnpjExportador));
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
        result = ((result* 31)+((this.listaCamposNcm == null)? 0 :this.listaCamposNcm.hashCode()));
        result = ((result* 31)+((this.permiteMultiplosCpfCnpjExportador == null)? 0 :this.permiteMultiplosCpfCnpjExportador.hashCode()));
        result = ((result* 31)+((this.modelo == null)? 0 :this.modelo.hashCode()));
        result = ((result* 31)+((this.listaCamposFormulario == null)? 0 :this.listaCamposFormulario.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DetalharModelo) == false) {
            return false;
        }
        DetalharModelo rhs = ((DetalharModelo) other);
        return (((((this.listaCamposNcm == rhs.listaCamposNcm)||((this.listaCamposNcm!= null)&&this.listaCamposNcm.equals(rhs.listaCamposNcm)))&&((this.permiteMultiplosCpfCnpjExportador == rhs.permiteMultiplosCpfCnpjExportador)||((this.permiteMultiplosCpfCnpjExportador!= null)&&this.permiteMultiplosCpfCnpjExportador.equals(rhs.permiteMultiplosCpfCnpjExportador))))&&((this.modelo == rhs.modelo)||((this.modelo!= null)&&this.modelo.equals(rhs.modelo))))&&((this.listaCamposFormulario == rhs.listaCamposFormulario)||((this.listaCamposFormulario!= null)&&this.listaCamposFormulario.equals(rhs.listaCamposFormulario))));
    }

}
