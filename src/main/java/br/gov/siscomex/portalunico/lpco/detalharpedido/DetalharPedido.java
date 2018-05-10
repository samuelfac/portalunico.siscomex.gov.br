
package br.gov.siscomex.portalunico.lpco.detalharpedido;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DetalharPedido {

    @SerializedName("numero")
    @Expose
    private String numero;
    @SerializedName("codigoModelo")
    @Expose
    private String codigoModelo;
    @SerializedName("orgao")
    @Expose
    private String orgao;
    @SerializedName("situacao")
    @Expose
    private Situacao situacao;
    @SerializedName("importadorExportador")
    @Expose
    private String importadorExportador;
    @SerializedName("declarante")
    @Expose
    private String declarante;
    @SerializedName("unidadeMedidaEstatistica")
    @Expose
    private String unidadeMedidaEstatistica;
    @SerializedName("unidadeMedidaComercializada")
    @Expose
    private String unidadeMedidaComercializada;
    @SerializedName("informacaoAdicional")
    @Expose
    private String informacaoAdicional;
    @SerializedName("listaNcm")
    @Expose
    private List<ListaNcm> listaNcm = new ArrayList<ListaNcm>();
    @SerializedName("listaCamposFormulario")
    @Expose
    private List<ListaCamposFormulario> listaCamposFormulario = new ArrayList<ListaCamposFormulario>();
    @SerializedName("listaVinculos")
    @Expose
    private List<ListaVinculo> listaVinculos = new ArrayList<ListaVinculo>();
    @SerializedName("saldo")
    @Expose
    private Saldo saldo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCodigoModelo() {
        return codigoModelo;
    }

    public void setCodigoModelo(String codigoModelo) {
        this.codigoModelo = codigoModelo;
    }

    public String getOrgao() {
        return orgao;
    }

    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
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

    public String getUnidadeMedidaEstatistica() {
        return unidadeMedidaEstatistica;
    }

    public void setUnidadeMedidaEstatistica(String unidadeMedidaEstatistica) {
        this.unidadeMedidaEstatistica = unidadeMedidaEstatistica;
    }

    public String getUnidadeMedidaComercializada() {
        return unidadeMedidaComercializada;
    }

    public void setUnidadeMedidaComercializada(String unidadeMedidaComercializada) {
        this.unidadeMedidaComercializada = unidadeMedidaComercializada;
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

    public List<ListaVinculo> getListaVinculos() {
        return listaVinculos;
    }

    public void setListaVinculos(List<ListaVinculo> listaVinculos) {
        this.listaVinculos = listaVinculos;
    }

    public Saldo getSaldo() {
        return saldo;
    }

    public void setSaldo(Saldo saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DetalharPedido.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("numero");
        sb.append('=');
        sb.append(((this.numero == null)?"<null>":this.numero));
        sb.append(',');
        sb.append("codigoModelo");
        sb.append('=');
        sb.append(((this.codigoModelo == null)?"<null>":this.codigoModelo));
        sb.append(',');
        sb.append("orgao");
        sb.append('=');
        sb.append(((this.orgao == null)?"<null>":this.orgao));
        sb.append(',');
        sb.append("situacao");
        sb.append('=');
        sb.append(((this.situacao == null)?"<null>":this.situacao));
        sb.append(',');
        sb.append("importadorExportador");
        sb.append('=');
        sb.append(((this.importadorExportador == null)?"<null>":this.importadorExportador));
        sb.append(',');
        sb.append("declarante");
        sb.append('=');
        sb.append(((this.declarante == null)?"<null>":this.declarante));
        sb.append(',');
        sb.append("unidadeMedidaEstatistica");
        sb.append('=');
        sb.append(((this.unidadeMedidaEstatistica == null)?"<null>":this.unidadeMedidaEstatistica));
        sb.append(',');
        sb.append("unidadeMedidaComercializada");
        sb.append('=');
        sb.append(((this.unidadeMedidaComercializada == null)?"<null>":this.unidadeMedidaComercializada));
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
        sb.append("listaVinculos");
        sb.append('=');
        sb.append(((this.listaVinculos == null)?"<null>":this.listaVinculos));
        sb.append(',');
        sb.append("saldo");
        sb.append('=');
        sb.append(((this.saldo == null)?"<null>":this.saldo));
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
        result = ((result* 31)+((this.listaVinculos == null)? 0 :this.listaVinculos.hashCode()));
        result = ((result* 31)+((this.situacao == null)? 0 :this.situacao.hashCode()));
        result = ((result* 31)+((this.orgao == null)? 0 :this.orgao.hashCode()));
        result = ((result* 31)+((this.numero == null)? 0 :this.numero.hashCode()));
        result = ((result* 31)+((this.codigoModelo == null)? 0 :this.codigoModelo.hashCode()));
        result = ((result* 31)+((this.declarante == null)? 0 :this.declarante.hashCode()));
        result = ((result* 31)+((this.importadorExportador == null)? 0 :this.importadorExportador.hashCode()));
        result = ((result* 31)+((this.saldo == null)? 0 :this.saldo.hashCode()));
        result = ((result* 31)+((this.listaCamposFormulario == null)? 0 :this.listaCamposFormulario.hashCode()));
        result = ((result* 31)+((this.listaNcm == null)? 0 :this.listaNcm.hashCode()));
        result = ((result* 31)+((this.unidadeMedidaEstatistica == null)? 0 :this.unidadeMedidaEstatistica.hashCode()));
        result = ((result* 31)+((this.informacaoAdicional == null)? 0 :this.informacaoAdicional.hashCode()));
        result = ((result* 31)+((this.unidadeMedidaComercializada == null)? 0 :this.unidadeMedidaComercializada.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DetalharPedido) == false) {
            return false;
        }
        DetalharPedido rhs = ((DetalharPedido) other);
        return ((((((((((((((this.listaVinculos == rhs.listaVinculos)||((this.listaVinculos!= null)&&this.listaVinculos.equals(rhs.listaVinculos)))&&((this.situacao == rhs.situacao)||((this.situacao!= null)&&this.situacao.equals(rhs.situacao))))&&((this.orgao == rhs.orgao)||((this.orgao!= null)&&this.orgao.equals(rhs.orgao))))&&((this.numero == rhs.numero)||((this.numero!= null)&&this.numero.equals(rhs.numero))))&&((this.codigoModelo == rhs.codigoModelo)||((this.codigoModelo!= null)&&this.codigoModelo.equals(rhs.codigoModelo))))&&((this.declarante == rhs.declarante)||((this.declarante!= null)&&this.declarante.equals(rhs.declarante))))&&((this.importadorExportador == rhs.importadorExportador)||((this.importadorExportador!= null)&&this.importadorExportador.equals(rhs.importadorExportador))))&&((this.saldo == rhs.saldo)||((this.saldo!= null)&&this.saldo.equals(rhs.saldo))))&&((this.listaCamposFormulario == rhs.listaCamposFormulario)||((this.listaCamposFormulario!= null)&&this.listaCamposFormulario.equals(rhs.listaCamposFormulario))))&&((this.listaNcm == rhs.listaNcm)||((this.listaNcm!= null)&&this.listaNcm.equals(rhs.listaNcm))))&&((this.unidadeMedidaEstatistica == rhs.unidadeMedidaEstatistica)||((this.unidadeMedidaEstatistica!= null)&&this.unidadeMedidaEstatistica.equals(rhs.unidadeMedidaEstatistica))))&&((this.informacaoAdicional == rhs.informacaoAdicional)||((this.informacaoAdicional!= null)&&this.informacaoAdicional.equals(rhs.informacaoAdicional))))&&((this.unidadeMedidaComercializada == rhs.unidadeMedidaComercializada)||((this.unidadeMedidaComercializada!= null)&&this.unidadeMedidaComercializada.equals(rhs.unidadeMedidaComercializada))));
    }

}
