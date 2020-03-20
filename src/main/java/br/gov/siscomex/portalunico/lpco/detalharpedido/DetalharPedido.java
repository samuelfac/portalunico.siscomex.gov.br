
package br.gov.siscomex.portalunico.lpco.detalharpedido;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DetalharPedido {

    @SerializedName("numero")
    @Expose
    private String numero;
    @SerializedName("chaveAcesso")
    @Expose
    private String chaveAcesso;
    @SerializedName("codigoModelo")
    @Expose
    private String codigoModelo;
    @SerializedName("dataInicioVigenciaModelo")
    @Expose
    private String dataInicioVigenciaModelo;
    @SerializedName("orgao")
    @Expose
    private String orgao;
    @SerializedName("situacao")
    @Expose
    private Situacao situacao;
    @SerializedName("dataSituacaoAtual")
    @Expose
    private String dataSituacaoAtual;
    @SerializedName("importadorExportador")
    @Expose
    private String importadorExportador;
    @SerializedName("declarante")
    @Expose
    private String declarante;
    @SerializedName("prorrogacaoPendente")
    @Expose
    private Boolean prorrogacaoPendente;
    @SerializedName("retificacaoPendente")
    @Expose
    private Boolean retificacaoPendente;
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
    @SerializedName("saldos")
    @Expose
    private Saldos saldos;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getChaveAcesso() {
        return chaveAcesso;
    }

    public void setChaveAcesso(String chaveAcesso) {
        this.chaveAcesso = chaveAcesso;
    }

    public String getCodigoModelo() {
        return codigoModelo;
    }

    public void setCodigoModelo(String codigoModelo) {
        this.codigoModelo = codigoModelo;
    }

    public String getDataInicioVigenciaModelo() {
        return dataInicioVigenciaModelo;
    }

    public void setDataInicioVigenciaModelo(String dataInicioVigenciaModelo) {
        this.dataInicioVigenciaModelo = dataInicioVigenciaModelo;
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

    public String getDataSituacaoAtual() {
        return dataSituacaoAtual;
    }

    public void setDataSituacaoAtual(String dataSituacaoAtual) {
        this.dataSituacaoAtual = dataSituacaoAtual;
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

    public Boolean getProrrogacaoPendente() {
        return prorrogacaoPendente;
    }

    public void setProrrogacaoPendente(Boolean prorrogacaoPendente) {
        this.prorrogacaoPendente = prorrogacaoPendente;
    }

    public Boolean getRetificacaoPendente() {
        return retificacaoPendente;
    }

    public void setRetificacaoPendente(Boolean retificacaoPendente) {
        this.retificacaoPendente = retificacaoPendente;
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

    public Saldos getSaldos() {
        return saldos;
    }

    public void setSaldos(Saldos saldos) {
        this.saldos = saldos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DetalharPedido.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("numero");
        sb.append('=');
        sb.append(((this.numero == null)?"<null>":this.numero));
        sb.append(',');
        sb.append("chaveAcesso");
        sb.append('=');
        sb.append(((this.chaveAcesso == null)?"<null>":this.chaveAcesso));
        sb.append(',');
        sb.append("codigoModelo");
        sb.append('=');
        sb.append(((this.codigoModelo == null)?"<null>":this.codigoModelo));
        sb.append(',');
        sb.append("dataInicioVigenciaModelo");
        sb.append('=');
        sb.append(((this.dataInicioVigenciaModelo == null)?"<null>":this.dataInicioVigenciaModelo));
        sb.append(',');
        sb.append("orgao");
        sb.append('=');
        sb.append(((this.orgao == null)?"<null>":this.orgao));
        sb.append(',');
        sb.append("situacao");
        sb.append('=');
        sb.append(((this.situacao == null)?"<null>":this.situacao));
        sb.append(',');
        sb.append("dataSituacaoAtual");
        sb.append('=');
        sb.append(((this.dataSituacaoAtual == null)?"<null>":this.dataSituacaoAtual));
        sb.append(',');
        sb.append("importadorExportador");
        sb.append('=');
        sb.append(((this.importadorExportador == null)?"<null>":this.importadorExportador));
        sb.append(',');
        sb.append("declarante");
        sb.append('=');
        sb.append(((this.declarante == null)?"<null>":this.declarante));
        sb.append(',');
        sb.append("prorrogacaoPendente");
        sb.append('=');
        sb.append(((this.prorrogacaoPendente == null)?"<null>":this.prorrogacaoPendente));
        sb.append(',');
        sb.append("retificacaoPendente");
        sb.append('=');
        sb.append(((this.retificacaoPendente == null)?"<null>":this.retificacaoPendente));
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
        sb.append("saldos");
        sb.append('=');
        sb.append(((this.saldos == null)?"<null>":this.saldos));
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
        result = ((result* 31)+((this.saldos == null)? 0 :this.saldos.hashCode()));
        result = ((result* 31)+((this.dataSituacaoAtual == null)? 0 :this.dataSituacaoAtual.hashCode()));
        result = ((result* 31)+((this.retificacaoPendente == null)? 0 :this.retificacaoPendente.hashCode()));
        result = ((result* 31)+((this.listaCamposFormulario == null)? 0 :this.listaCamposFormulario.hashCode()));
        result = ((result* 31)+((this.listaNcm == null)? 0 :this.listaNcm.hashCode()));
        result = ((result* 31)+((this.unidadeMedidaEstatistica == null)? 0 :this.unidadeMedidaEstatistica.hashCode()));
        result = ((result* 31)+((this.prorrogacaoPendente == null)? 0 :this.prorrogacaoPendente.hashCode()));
        result = ((result* 31)+((this.chaveAcesso == null)? 0 :this.chaveAcesso.hashCode()));
        result = ((result* 31)+((this.informacaoAdicional == null)? 0 :this.informacaoAdicional.hashCode()));
        result = ((result* 31)+((this.unidadeMedidaComercializada == null)? 0 :this.unidadeMedidaComercializada.hashCode()));
        result = ((result* 31)+((this.dataInicioVigenciaModelo == null)? 0 :this.dataInicioVigenciaModelo.hashCode()));
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
        return (((((((((((((((((((this.listaVinculos == rhs.listaVinculos)||((this.listaVinculos!= null)&&this.listaVinculos.equals(rhs.listaVinculos)))&&((this.situacao == rhs.situacao)||((this.situacao!= null)&&this.situacao.equals(rhs.situacao))))&&((this.orgao == rhs.orgao)||((this.orgao!= null)&&this.orgao.equals(rhs.orgao))))&&((this.numero == rhs.numero)||((this.numero!= null)&&this.numero.equals(rhs.numero))))&&((this.codigoModelo == rhs.codigoModelo)||((this.codigoModelo!= null)&&this.codigoModelo.equals(rhs.codigoModelo))))&&((this.declarante == rhs.declarante)||((this.declarante!= null)&&this.declarante.equals(rhs.declarante))))&&((this.importadorExportador == rhs.importadorExportador)||((this.importadorExportador!= null)&&this.importadorExportador.equals(rhs.importadorExportador))))&&((this.saldos == rhs.saldos)||((this.saldos!= null)&&this.saldos.equals(rhs.saldos))))&&((this.dataSituacaoAtual == rhs.dataSituacaoAtual)||((this.dataSituacaoAtual!= null)&&this.dataSituacaoAtual.equals(rhs.dataSituacaoAtual))))&&((this.retificacaoPendente == rhs.retificacaoPendente)||((this.retificacaoPendente!= null)&&this.retificacaoPendente.equals(rhs.retificacaoPendente))))&&((this.listaCamposFormulario == rhs.listaCamposFormulario)||((this.listaCamposFormulario!= null)&&this.listaCamposFormulario.equals(rhs.listaCamposFormulario))))&&((this.listaNcm == rhs.listaNcm)||((this.listaNcm!= null)&&this.listaNcm.equals(rhs.listaNcm))))&&((this.unidadeMedidaEstatistica == rhs.unidadeMedidaEstatistica)||((this.unidadeMedidaEstatistica!= null)&&this.unidadeMedidaEstatistica.equals(rhs.unidadeMedidaEstatistica))))&&((this.prorrogacaoPendente == rhs.prorrogacaoPendente)||((this.prorrogacaoPendente!= null)&&this.prorrogacaoPendente.equals(rhs.prorrogacaoPendente))))&&((this.chaveAcesso == rhs.chaveAcesso)||((this.chaveAcesso!= null)&&this.chaveAcesso.equals(rhs.chaveAcesso))))&&((this.informacaoAdicional == rhs.informacaoAdicional)||((this.informacaoAdicional!= null)&&this.informacaoAdicional.equals(rhs.informacaoAdicional))))&&((this.unidadeMedidaComercializada == rhs.unidadeMedidaComercializada)||((this.unidadeMedidaComercializada!= null)&&this.unidadeMedidaComercializada.equals(rhs.unidadeMedidaComercializada))))&&((this.dataInicioVigenciaModelo == rhs.dataInicioVigenciaModelo)||((this.dataInicioVigenciaModelo!= null)&&this.dataInicioVigenciaModelo.equals(rhs.dataInicioVigenciaModelo))));
    }

}
