
package br.gov.siscomex.portalunico.cct.consultadocumentotransportemictifdtaidat;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DocumentosTransporte {

    @SerializedName("numeroDocumentoTransporte")
    @Expose
    private String numeroDocumentoTransporte;
    @SerializedName("tipoDocumentoTransporte")
    @Expose
    private String tipoDocumentoTransporte;
    @SerializedName("viaTransporte")
    @Expose
    private String viaTransporte;
    @SerializedName("situacaoAtual")
    @Expose
    private String situacaoAtual;
    @SerializedName("dataEmissao")
    @Expose
    private String dataEmissao;
    @SerializedName("cpfCnpjTransportador")
    @Expose
    private String cpfCnpjTransportador;
    @SerializedName("nomeTransportador")
    @Expose
    private String nomeTransportador;
    @SerializedName("tipoDAT")
    @Expose
    private String tipoDAT;
    @SerializedName("localOrigem")
    @Expose
    private LocalOrigem localOrigem;
    @SerializedName("localDestinoPrevisto")
    @Expose
    private LocalDestinoPrevisto localDestinoPrevisto;
    @SerializedName("localEstoque")
    @Expose
    private LocalEstoque localEstoque;
    @SerializedName("veiculoFerroviario")
    @Expose
    private VeiculoFerroviario veiculoFerroviario;
    @SerializedName("veiculoRodoviario")
    @Expose
    private VeiculoRodoviario veiculoRodoviario;
    @SerializedName("cargas")
    @Expose
    private List<Carga> cargas = new ArrayList<Carga>();
    @SerializedName("conteineres")
    @Expose
    private List<Conteinere> conteineres = new ArrayList<Conteinere>();

    public String getNumeroDocumentoTransporte() {
        return numeroDocumentoTransporte;
    }

    public void setNumeroDocumentoTransporte(String numeroDocumentoTransporte) {
        this.numeroDocumentoTransporte = numeroDocumentoTransporte;
    }

    public String getTipoDocumentoTransporte() {
        return tipoDocumentoTransporte;
    }

    public void setTipoDocumentoTransporte(String tipoDocumentoTransporte) {
        this.tipoDocumentoTransporte = tipoDocumentoTransporte;
    }

    public String getViaTransporte() {
        return viaTransporte;
    }

    public void setViaTransporte(String viaTransporte) {
        this.viaTransporte = viaTransporte;
    }

    public String getSituacaoAtual() {
        return situacaoAtual;
    }

    public void setSituacaoAtual(String situacaoAtual) {
        this.situacaoAtual = situacaoAtual;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getCpfCnpjTransportador() {
        return cpfCnpjTransportador;
    }

    public void setCpfCnpjTransportador(String cpfCnpjTransportador) {
        this.cpfCnpjTransportador = cpfCnpjTransportador;
    }

    public String getNomeTransportador() {
        return nomeTransportador;
    }

    public void setNomeTransportador(String nomeTransportador) {
        this.nomeTransportador = nomeTransportador;
    }

    public String getTipoDAT() {
        return tipoDAT;
    }

    public void setTipoDAT(String tipoDAT) {
        this.tipoDAT = tipoDAT;
    }

    public LocalOrigem getLocalOrigem() {
        return localOrigem;
    }

    public void setLocalOrigem(LocalOrigem localOrigem) {
        this.localOrigem = localOrigem;
    }

    public LocalDestinoPrevisto getLocalDestinoPrevisto() {
        return localDestinoPrevisto;
    }

    public void setLocalDestinoPrevisto(LocalDestinoPrevisto localDestinoPrevisto) {
        this.localDestinoPrevisto = localDestinoPrevisto;
    }

    public LocalEstoque getLocalEstoque() {
        return localEstoque;
    }

    public void setLocalEstoque(LocalEstoque localEstoque) {
        this.localEstoque = localEstoque;
    }

    public VeiculoFerroviario getVeiculoFerroviario() {
        return veiculoFerroviario;
    }

    public void setVeiculoFerroviario(VeiculoFerroviario veiculoFerroviario) {
        this.veiculoFerroviario = veiculoFerroviario;
    }

    public VeiculoRodoviario getVeiculoRodoviario() {
        return veiculoRodoviario;
    }

    public void setVeiculoRodoviario(VeiculoRodoviario veiculoRodoviario) {
        this.veiculoRodoviario = veiculoRodoviario;
    }

    public List<Carga> getCargas() {
        return cargas;
    }

    public void setCargas(List<Carga> cargas) {
        this.cargas = cargas;
    }

    public List<Conteinere> getConteineres() {
        return conteineres;
    }

    public void setConteineres(List<Conteinere> conteineres) {
        this.conteineres = conteineres;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DocumentosTransporte.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("numeroDocumentoTransporte");
        sb.append('=');
        sb.append(((this.numeroDocumentoTransporte == null)?"<null>":this.numeroDocumentoTransporte));
        sb.append(',');
        sb.append("tipoDocumentoTransporte");
        sb.append('=');
        sb.append(((this.tipoDocumentoTransporte == null)?"<null>":this.tipoDocumentoTransporte));
        sb.append(',');
        sb.append("viaTransporte");
        sb.append('=');
        sb.append(((this.viaTransporte == null)?"<null>":this.viaTransporte));
        sb.append(',');
        sb.append("situacaoAtual");
        sb.append('=');
        sb.append(((this.situacaoAtual == null)?"<null>":this.situacaoAtual));
        sb.append(',');
        sb.append("dataEmissao");
        sb.append('=');
        sb.append(((this.dataEmissao == null)?"<null>":this.dataEmissao));
        sb.append(',');
        sb.append("cpfCnpjTransportador");
        sb.append('=');
        sb.append(((this.cpfCnpjTransportador == null)?"<null>":this.cpfCnpjTransportador));
        sb.append(',');
        sb.append("nomeTransportador");
        sb.append('=');
        sb.append(((this.nomeTransportador == null)?"<null>":this.nomeTransportador));
        sb.append(',');
        sb.append("tipoDAT");
        sb.append('=');
        sb.append(((this.tipoDAT == null)?"<null>":this.tipoDAT));
        sb.append(',');
        sb.append("localOrigem");
        sb.append('=');
        sb.append(((this.localOrigem == null)?"<null>":this.localOrigem));
        sb.append(',');
        sb.append("localDestinoPrevisto");
        sb.append('=');
        sb.append(((this.localDestinoPrevisto == null)?"<null>":this.localDestinoPrevisto));
        sb.append(',');
        sb.append("localEstoque");
        sb.append('=');
        sb.append(((this.localEstoque == null)?"<null>":this.localEstoque));
        sb.append(',');
        sb.append("veiculoFerroviario");
        sb.append('=');
        sb.append(((this.veiculoFerroviario == null)?"<null>":this.veiculoFerroviario));
        sb.append(',');
        sb.append("veiculoRodoviario");
        sb.append('=');
        sb.append(((this.veiculoRodoviario == null)?"<null>":this.veiculoRodoviario));
        sb.append(',');
        sb.append("cargas");
        sb.append('=');
        sb.append(((this.cargas == null)?"<null>":this.cargas));
        sb.append(',');
        sb.append("conteineres");
        sb.append('=');
        sb.append(((this.conteineres == null)?"<null>":this.conteineres));
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
        result = ((result* 31)+((this.tipoDocumentoTransporte == null)? 0 :this.tipoDocumentoTransporte.hashCode()));
        result = ((result* 31)+((this.cpfCnpjTransportador == null)? 0 :this.cpfCnpjTransportador.hashCode()));
        result = ((result* 31)+((this.localDestinoPrevisto == null)? 0 :this.localDestinoPrevisto.hashCode()));
        result = ((result* 31)+((this.veiculoRodoviario == null)? 0 :this.veiculoRodoviario.hashCode()));
        result = ((result* 31)+((this.veiculoFerroviario == null)? 0 :this.veiculoFerroviario.hashCode()));
        result = ((result* 31)+((this.conteineres == null)? 0 :this.conteineres.hashCode()));
        result = ((result* 31)+((this.dataEmissao == null)? 0 :this.dataEmissao.hashCode()));
        result = ((result* 31)+((this.nomeTransportador == null)? 0 :this.nomeTransportador.hashCode()));
        result = ((result* 31)+((this.localOrigem == null)? 0 :this.localOrigem.hashCode()));
        result = ((result* 31)+((this.cargas == null)? 0 :this.cargas.hashCode()));
        result = ((result* 31)+((this.numeroDocumentoTransporte == null)? 0 :this.numeroDocumentoTransporte.hashCode()));
        result = ((result* 31)+((this.situacaoAtual == null)? 0 :this.situacaoAtual.hashCode()));
        result = ((result* 31)+((this.localEstoque == null)? 0 :this.localEstoque.hashCode()));
        result = ((result* 31)+((this.viaTransporte == null)? 0 :this.viaTransporte.hashCode()));
        result = ((result* 31)+((this.tipoDAT == null)? 0 :this.tipoDAT.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DocumentosTransporte) == false) {
            return false;
        }
        DocumentosTransporte rhs = ((DocumentosTransporte) other);
        return ((((((((((((((((this.tipoDocumentoTransporte == rhs.tipoDocumentoTransporte)||((this.tipoDocumentoTransporte!= null)&&this.tipoDocumentoTransporte.equals(rhs.tipoDocumentoTransporte)))&&((this.cpfCnpjTransportador == rhs.cpfCnpjTransportador)||((this.cpfCnpjTransportador!= null)&&this.cpfCnpjTransportador.equals(rhs.cpfCnpjTransportador))))&&((this.localDestinoPrevisto == rhs.localDestinoPrevisto)||((this.localDestinoPrevisto!= null)&&this.localDestinoPrevisto.equals(rhs.localDestinoPrevisto))))&&((this.veiculoRodoviario == rhs.veiculoRodoviario)||((this.veiculoRodoviario!= null)&&this.veiculoRodoviario.equals(rhs.veiculoRodoviario))))&&((this.veiculoFerroviario == rhs.veiculoFerroviario)||((this.veiculoFerroviario!= null)&&this.veiculoFerroviario.equals(rhs.veiculoFerroviario))))&&((this.conteineres == rhs.conteineres)||((this.conteineres!= null)&&this.conteineres.equals(rhs.conteineres))))&&((this.dataEmissao == rhs.dataEmissao)||((this.dataEmissao!= null)&&this.dataEmissao.equals(rhs.dataEmissao))))&&((this.nomeTransportador == rhs.nomeTransportador)||((this.nomeTransportador!= null)&&this.nomeTransportador.equals(rhs.nomeTransportador))))&&((this.localOrigem == rhs.localOrigem)||((this.localOrigem!= null)&&this.localOrigem.equals(rhs.localOrigem))))&&((this.cargas == rhs.cargas)||((this.cargas!= null)&&this.cargas.equals(rhs.cargas))))&&((this.numeroDocumentoTransporte == rhs.numeroDocumentoTransporte)||((this.numeroDocumentoTransporte!= null)&&this.numeroDocumentoTransporte.equals(rhs.numeroDocumentoTransporte))))&&((this.situacaoAtual == rhs.situacaoAtual)||((this.situacaoAtual!= null)&&this.situacaoAtual.equals(rhs.situacaoAtual))))&&((this.localEstoque == rhs.localEstoque)||((this.localEstoque!= null)&&this.localEstoque.equals(rhs.localEstoque))))&&((this.viaTransporte == rhs.viaTransporte)||((this.viaTransporte!= null)&&this.viaTransporte.equals(rhs.viaTransporte))))&&((this.tipoDAT == rhs.tipoDAT)||((this.tipoDAT!= null)&&this.tipoDAT.equals(rhs.tipoDAT))));
    }

}
