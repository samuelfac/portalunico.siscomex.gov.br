
package br.gov.siscomex.portalunico.lpco.incluirpedido;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IncluirPedido {

    @SerializedName("codigoModelo")
    @Expose
    private String codigoModelo;
    @SerializedName("importadorExportador")
    @Expose
    private String importadorExportador;
    @SerializedName("declarante")
    @Expose
    private String declarante;
    @SerializedName("informacaoAdicional")
    @Expose
    private String informacaoAdicional;
    @SerializedName("listaNcm")
    @Expose
    private List<ListaNcm> listaNcm = new ArrayList<ListaNcm>();
    @SerializedName("listaCamposFormulario")
    @Expose
    private List<ListaCamposFormulario> listaCamposFormulario = new ArrayList<ListaCamposFormulario>();
    @SerializedName("unidadeMedidaComercializada")
    @Expose
    private String unidadeMedidaComercializada;

    public String getCodigoModelo() {
        return codigoModelo;
    }

    public void setCodigoModelo(String codigoModelo) {
        this.codigoModelo = codigoModelo;
    }

    public String getImportadorExportador() {
        return importadorExportador;
    }

    public void setImportadorExportador(String importadorExportador) {
        this.importadorExportador = importadorExportador;
    }

    public String getDeclarante() {
        return declarante;
    }

    public void setDeclarante(String declarante) {
        this.declarante = declarante;
    }

    public String getInformacaoAdicional() {
        return informacaoAdicional;
    }

    public void setInformacaoAdicional(String informacaoAdicional) {
        this.informacaoAdicional = informacaoAdicional;
    }

    public List<ListaNcm> getListaNcm() {
        return listaNcm;
    }

    public void setListaNcm(List<ListaNcm> listaNcm) {
        this.listaNcm = listaNcm;
    }

    public List<ListaCamposFormulario> getListaCamposFormulario() {
        return listaCamposFormulario;
    }

    public void setListaCamposFormulario(List<ListaCamposFormulario> listaCamposFormulario) {
        this.listaCamposFormulario = listaCamposFormulario;
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
        sb.append(IncluirPedido.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("codigoModelo");
        sb.append('=');
        sb.append(((this.codigoModelo == null)?"<null>":this.codigoModelo));
        sb.append(',');
        sb.append("importadorExportador");
        sb.append('=');
        sb.append(((this.importadorExportador == null)?"<null>":this.importadorExportador));
        sb.append(',');
        sb.append("declarante");
        sb.append('=');
        sb.append(((this.declarante == null)?"<null>":this.declarante));
        sb.append(',');
        sb.append("informacaoAdicional");
        sb.append('=');
        sb.append(((this.informacaoAdicional == null)?"<null>":this.informacaoAdicional));
        sb.append(',');
        sb.append("listaNcm");
        sb.append('=');
        sb.append(((this.listaNcm == null)?"<null>":this.listaNcm));
        sb.append(',');
        sb.append("listaCamposFormulario");
        sb.append('=');
        sb.append(((this.listaCamposFormulario == null)?"<null>":this.listaCamposFormulario));
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
        result = ((result* 31)+((this.codigoModelo == null)? 0 :this.codigoModelo.hashCode()));
        result = ((result* 31)+((this.declarante == null)? 0 :this.declarante.hashCode()));
        result = ((result* 31)+((this.informacaoAdicional == null)? 0 :this.informacaoAdicional.hashCode()));
        result = ((result* 31)+((this.importadorExportador == null)? 0 :this.importadorExportador.hashCode()));
        result = ((result* 31)+((this.unidadeMedidaComercializada == null)? 0 :this.unidadeMedidaComercializada.hashCode()));
        result = ((result* 31)+((this.listaCamposFormulario == null)? 0 :this.listaCamposFormulario.hashCode()));
        result = ((result* 31)+((this.listaNcm == null)? 0 :this.listaNcm.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IncluirPedido) == false) {
            return false;
        }
        IncluirPedido rhs = ((IncluirPedido) other);
        return ((((((((this.codigoModelo == rhs.codigoModelo)||((this.codigoModelo!= null)&&this.codigoModelo.equals(rhs.codigoModelo)))&&((this.declarante == rhs.declarante)||((this.declarante!= null)&&this.declarante.equals(rhs.declarante))))&&((this.informacaoAdicional == rhs.informacaoAdicional)||((this.informacaoAdicional!= null)&&this.informacaoAdicional.equals(rhs.informacaoAdicional))))&&((this.importadorExportador == rhs.importadorExportador)||((this.importadorExportador!= null)&&this.importadorExportador.equals(rhs.importadorExportador))))&&((this.unidadeMedidaComercializada == rhs.unidadeMedidaComercializada)||((this.unidadeMedidaComercializada!= null)&&this.unidadeMedidaComercializada.equals(rhs.unidadeMedidaComercializada))))&&((this.listaCamposFormulario == rhs.listaCamposFormulario)||((this.listaCamposFormulario!= null)&&this.listaCamposFormulario.equals(rhs.listaCamposFormulario))))&&((this.listaNcm == rhs.listaNcm)||((this.listaNcm!= null)&&this.listaNcm.equals(rhs.listaNcm))));
    }

}
