
package br.gov.siscomex.portalunico.carga.resposta.consultadueruc;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListaRetorno {

    @SerializedName("numeroRUC")
    @Expose
    private String numeroRUC;
    @SerializedName("numeroDUE")
    @Expose
    private String numeroDUE;
    @SerializedName("ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado")
    @Expose
    private Boolean ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado;
    @SerializedName("existeImpedimentoEmbarque")
    @Expose
    private Boolean existeImpedimentoEmbarque;
    @SerializedName("indicadorSeCargaRUCMaster")
    @Expose
    private Boolean indicadorSeCargaRUCMaster;
    @SerializedName("numeroRUCMasterDaCarga")
    @Expose
    private String numeroRUCMasterDaCarga;
    @SerializedName("conteineres")
    @Expose
    private List<String> conteineres = null;
    @SerializedName("documentosDeTransporte")
    @Expose
    private List<DocumentosDeTransporte> documentosDeTransporte = null;
    @SerializedName("listaCargasSoltasVeiculos")
    @Expose
    private List<ListaCargasSoltasVeiculo> listaCargasSoltasVeiculos = null;
    @SerializedName("listaGraneis")
    @Expose
    private List<ListaGranei> listaGraneis = null;

    public String getNumeroRUC() {
        return numeroRUC;
    }

    public void setNumeroRUC(String numeroRUC) {
        this.numeroRUC = numeroRUC;
    }

    public String getNumeroDUE() {
        return numeroDUE;
    }

    public void setNumeroDUE(String numeroDUE) {
        this.numeroDUE = numeroDUE;
    }

    public Boolean getOcorreuDesembaracoOuAutorizacaoEmbarqueAntecipado() {
        return ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado;
    }

    public void setOcorreuDesembaracoOuAutorizacaoEmbarqueAntecipado(Boolean ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado) {
        this.ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado = ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado;
    }

    public Boolean getExisteImpedimentoEmbarque() {
        return existeImpedimentoEmbarque;
    }

    public void setExisteImpedimentoEmbarque(Boolean existeImpedimentoEmbarque) {
        this.existeImpedimentoEmbarque = existeImpedimentoEmbarque;
    }

    public Boolean getIndicadorSeCargaRUCMaster() {
        return indicadorSeCargaRUCMaster;
    }

    public void setIndicadorSeCargaRUCMaster(Boolean indicadorSeCargaRUCMaster) {
        this.indicadorSeCargaRUCMaster = indicadorSeCargaRUCMaster;
    }

    public String getNumeroRUCMasterDaCarga() {
        return numeroRUCMasterDaCarga;
    }

    public void setNumeroRUCMasterDaCarga(String numeroRUCMasterDaCarga) {
        this.numeroRUCMasterDaCarga = numeroRUCMasterDaCarga;
    }

    public List<String> getConteineres() {
        return conteineres;
    }

    public void setConteineres(List<String> conteineres) {
        this.conteineres = conteineres;
    }

    public List<DocumentosDeTransporte> getDocumentosDeTransporte() {
        return documentosDeTransporte;
    }

    public void setDocumentosDeTransporte(List<DocumentosDeTransporte> documentosDeTransporte) {
        this.documentosDeTransporte = documentosDeTransporte;
    }

    public List<ListaCargasSoltasVeiculo> getListaCargasSoltasVeiculos() {
        return listaCargasSoltasVeiculos;
    }

    public void setListaCargasSoltasVeiculos(List<ListaCargasSoltasVeiculo> listaCargasSoltasVeiculos) {
        this.listaCargasSoltasVeiculos = listaCargasSoltasVeiculos;
    }

    public List<ListaGranei> getListaGraneis() {
        return listaGraneis;
    }

    public void setListaGraneis(List<ListaGranei> listaGraneis) {
        this.listaGraneis = listaGraneis;
    }

}
