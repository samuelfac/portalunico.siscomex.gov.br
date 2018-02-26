
package br.gov.siscomex.portalunico.cct.consultardueruc;

import java.util.ArrayList;
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
    private List<String> conteineres = new ArrayList<String>();
    @SerializedName("documentosDeTransporte")
    @Expose
    private List<DocumentosDeTransporte> documentosDeTransporte = new ArrayList<DocumentosDeTransporte>();
    @SerializedName("listaCargasSoltasVeiculos")
    @Expose
    private List<ListaCargasSoltasVeiculo> listaCargasSoltasVeiculos = new ArrayList<ListaCargasSoltasVeiculo>();
    @SerializedName("listaGraneis")
    @Expose
    private List<ListaGranei> listaGraneis = new ArrayList<ListaGranei>();

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ListaRetorno.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("numeroRUC");
        sb.append('=');
        sb.append(((this.numeroRUC == null)?"<null>":this.numeroRUC));
        sb.append(',');
        sb.append("numeroDUE");
        sb.append('=');
        sb.append(((this.numeroDUE == null)?"<null>":this.numeroDUE));
        sb.append(',');
        sb.append("ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado");
        sb.append('=');
        sb.append(((this.ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado == null)?"<null>":this.ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado));
        sb.append(',');
        sb.append("existeImpedimentoEmbarque");
        sb.append('=');
        sb.append(((this.existeImpedimentoEmbarque == null)?"<null>":this.existeImpedimentoEmbarque));
        sb.append(',');
        sb.append("indicadorSeCargaRUCMaster");
        sb.append('=');
        sb.append(((this.indicadorSeCargaRUCMaster == null)?"<null>":this.indicadorSeCargaRUCMaster));
        sb.append(',');
        sb.append("numeroRUCMasterDaCarga");
        sb.append('=');
        sb.append(((this.numeroRUCMasterDaCarga == null)?"<null>":this.numeroRUCMasterDaCarga));
        sb.append(',');
        sb.append("conteineres");
        sb.append('=');
        sb.append(((this.conteineres == null)?"<null>":this.conteineres));
        sb.append(',');
        sb.append("documentosDeTransporte");
        sb.append('=');
        sb.append(((this.documentosDeTransporte == null)?"<null>":this.documentosDeTransporte));
        sb.append(',');
        sb.append("listaCargasSoltasVeiculos");
        sb.append('=');
        sb.append(((this.listaCargasSoltasVeiculos == null)?"<null>":this.listaCargasSoltasVeiculos));
        sb.append(',');
        sb.append("listaGraneis");
        sb.append('=');
        sb.append(((this.listaGraneis == null)?"<null>":this.listaGraneis));
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
        result = ((result* 31)+((this.indicadorSeCargaRUCMaster == null)? 0 :this.indicadorSeCargaRUCMaster.hashCode()));
        result = ((result* 31)+((this.numeroRUCMasterDaCarga == null)? 0 :this.numeroRUCMasterDaCarga.hashCode()));
        result = ((result* 31)+((this.documentosDeTransporte == null)? 0 :this.documentosDeTransporte.hashCode()));
        result = ((result* 31)+((this.numeroDUE == null)? 0 :this.numeroDUE.hashCode()));
        result = ((result* 31)+((this.ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado == null)? 0 :this.ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado.hashCode()));
        result = ((result* 31)+((this.listaCargasSoltasVeiculos == null)? 0 :this.listaCargasSoltasVeiculos.hashCode()));
        result = ((result* 31)+((this.numeroRUC == null)? 0 :this.numeroRUC.hashCode()));
        result = ((result* 31)+((this.existeImpedimentoEmbarque == null)? 0 :this.existeImpedimentoEmbarque.hashCode()));
        result = ((result* 31)+((this.conteineres == null)? 0 :this.conteineres.hashCode()));
        result = ((result* 31)+((this.listaGraneis == null)? 0 :this.listaGraneis.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListaRetorno) == false) {
            return false;
        }
        ListaRetorno rhs = ((ListaRetorno) other);
        return (((((((((((this.indicadorSeCargaRUCMaster == rhs.indicadorSeCargaRUCMaster)||((this.indicadorSeCargaRUCMaster!= null)&&this.indicadorSeCargaRUCMaster.equals(rhs.indicadorSeCargaRUCMaster)))&&((this.numeroRUCMasterDaCarga == rhs.numeroRUCMasterDaCarga)||((this.numeroRUCMasterDaCarga!= null)&&this.numeroRUCMasterDaCarga.equals(rhs.numeroRUCMasterDaCarga))))&&((this.documentosDeTransporte == rhs.documentosDeTransporte)||((this.documentosDeTransporte!= null)&&this.documentosDeTransporte.equals(rhs.documentosDeTransporte))))&&((this.numeroDUE == rhs.numeroDUE)||((this.numeroDUE!= null)&&this.numeroDUE.equals(rhs.numeroDUE))))&&((this.ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado == rhs.ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado)||((this.ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado!= null)&&this.ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado.equals(rhs.ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado))))&&((this.listaCargasSoltasVeiculos == rhs.listaCargasSoltasVeiculos)||((this.listaCargasSoltasVeiculos!= null)&&this.listaCargasSoltasVeiculos.equals(rhs.listaCargasSoltasVeiculos))))&&((this.numeroRUC == rhs.numeroRUC)||((this.numeroRUC!= null)&&this.numeroRUC.equals(rhs.numeroRUC))))&&((this.existeImpedimentoEmbarque == rhs.existeImpedimentoEmbarque)||((this.existeImpedimentoEmbarque!= null)&&this.existeImpedimentoEmbarque.equals(rhs.existeImpedimentoEmbarque))))&&((this.conteineres == rhs.conteineres)||((this.conteineres!= null)&&this.conteineres.equals(rhs.conteineres))))&&((this.listaGraneis == rhs.listaGraneis)||((this.listaGraneis!= null)&&this.listaGraneis.equals(rhs.listaGraneis))));
    }

}
