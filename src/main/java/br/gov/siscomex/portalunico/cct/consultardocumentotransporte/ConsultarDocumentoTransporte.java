
package br.gov.siscomex.portalunico.cct.consultardocumentotransporte;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConsultarDocumentoTransporte {

    @SerializedName("numeroDocumento")
    @Expose
    private String numeroDocumento;
    @SerializedName("tipoDocumento")
    @Expose
    private String tipoDocumento;
    @SerializedName("viaTransporte")
    @Expose
    private String viaTransporte;
    @SerializedName("situacaoDocumento")
    @Expose
    private String situacaoDocumento;
    @SerializedName("cargas")
    @Expose
    private List<Carga> cargas = new ArrayList<Carga>();
    @SerializedName("veiculoRodoviario")
    @Expose
    private VeiculoRodoviario veiculoRodoviario;
    @SerializedName("prefixoTrem")
    @Expose
    private String prefixoTrem;
    @SerializedName("quantidadeVagoes")
    @Expose
    private Integer quantidadeVagoes;
    @SerializedName("identificacaoVeiculo")
    @Expose
    private String identificacaoVeiculo;
    @SerializedName("dataEmissaoDocumentoTransporte")
    @Expose
    private String dataEmissaoDocumentoTransporte;
    @SerializedName("listaMensagem")
    @Expose
    private List<ListaMensagem> listaMensagem = new ArrayList<ListaMensagem>();

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getViaTransporte() {
        return viaTransporte;
    }

    public void setViaTransporte(String viaTransporte) {
        this.viaTransporte = viaTransporte;
    }

    public String getSituacaoDocumento() {
        return situacaoDocumento;
    }

    public void setSituacaoDocumento(String situacaoDocumento) {
        this.situacaoDocumento = situacaoDocumento;
    }

    public List<Carga> getCargas() {
        return cargas;
    }

    public void setCargas(List<Carga> cargas) {
        this.cargas = cargas;
    }

    public VeiculoRodoviario getVeiculoRodoviario() {
        return veiculoRodoviario;
    }

    public void setVeiculoRodoviario(VeiculoRodoviario veiculoRodoviario) {
        this.veiculoRodoviario = veiculoRodoviario;
    }

    public String getPrefixoTrem() {
        return prefixoTrem;
    }

    public void setPrefixoTrem(String prefixoTrem) {
        this.prefixoTrem = prefixoTrem;
    }

    public Integer getQuantidadeVagoes() {
        return quantidadeVagoes;
    }

    public void setQuantidadeVagoes(Integer quantidadeVagoes) {
        this.quantidadeVagoes = quantidadeVagoes;
    }

    public String getIdentificacaoVeiculo() {
        return identificacaoVeiculo;
    }

    public void setIdentificacaoVeiculo(String identificacaoVeiculo) {
        this.identificacaoVeiculo = identificacaoVeiculo;
    }

    public String getDataEmissaoDocumentoTransporte() {
        return dataEmissaoDocumentoTransporte;
    }

    public void setDataEmissaoDocumentoTransporte(String dataEmissaoDocumentoTransporte) {
        this.dataEmissaoDocumentoTransporte = dataEmissaoDocumentoTransporte;
    }

    public List<ListaMensagem> getListaMensagem() {
        return listaMensagem;
    }

    public void setListaMensagem(List<ListaMensagem> listaMensagem) {
        this.listaMensagem = listaMensagem;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConsultarDocumentoTransporte.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("numeroDocumento");
        sb.append('=');
        sb.append(((this.numeroDocumento == null)?"<null>":this.numeroDocumento));
        sb.append(',');
        sb.append("tipoDocumento");
        sb.append('=');
        sb.append(((this.tipoDocumento == null)?"<null>":this.tipoDocumento));
        sb.append(',');
        sb.append("viaTransporte");
        sb.append('=');
        sb.append(((this.viaTransporte == null)?"<null>":this.viaTransporte));
        sb.append(',');
        sb.append("situacaoDocumento");
        sb.append('=');
        sb.append(((this.situacaoDocumento == null)?"<null>":this.situacaoDocumento));
        sb.append(',');
        sb.append("cargas");
        sb.append('=');
        sb.append(((this.cargas == null)?"<null>":this.cargas));
        sb.append(',');
        sb.append("veiculoRodoviario");
        sb.append('=');
        sb.append(((this.veiculoRodoviario == null)?"<null>":this.veiculoRodoviario));
        sb.append(',');
        sb.append("prefixoTrem");
        sb.append('=');
        sb.append(((this.prefixoTrem == null)?"<null>":this.prefixoTrem));
        sb.append(',');
        sb.append("quantidadeVagoes");
        sb.append('=');
        sb.append(((this.quantidadeVagoes == null)?"<null>":this.quantidadeVagoes));
        sb.append(',');
        sb.append("identificacaoVeiculo");
        sb.append('=');
        sb.append(((this.identificacaoVeiculo == null)?"<null>":this.identificacaoVeiculo));
        sb.append(',');
        sb.append("dataEmissaoDocumentoTransporte");
        sb.append('=');
        sb.append(((this.dataEmissaoDocumentoTransporte == null)?"<null>":this.dataEmissaoDocumentoTransporte));
        sb.append(',');
        sb.append("listaMensagem");
        sb.append('=');
        sb.append(((this.listaMensagem == null)?"<null>":this.listaMensagem));
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
        result = ((result* 31)+((this.tipoDocumento == null)? 0 :this.tipoDocumento.hashCode()));
        result = ((result* 31)+((this.prefixoTrem == null)? 0 :this.prefixoTrem.hashCode()));
        result = ((result* 31)+((this.listaMensagem == null)? 0 :this.listaMensagem.hashCode()));
        result = ((result* 31)+((this.dataEmissaoDocumentoTransporte == null)? 0 :this.dataEmissaoDocumentoTransporte.hashCode()));
        result = ((result* 31)+((this.veiculoRodoviario == null)? 0 :this.veiculoRodoviario.hashCode()));
        result = ((result* 31)+((this.cargas == null)? 0 :this.cargas.hashCode()));
        result = ((result* 31)+((this.numeroDocumento == null)? 0 :this.numeroDocumento.hashCode()));
        result = ((result* 31)+((this.quantidadeVagoes == null)? 0 :this.quantidadeVagoes.hashCode()));
        result = ((result* 31)+((this.viaTransporte == null)? 0 :this.viaTransporte.hashCode()));
        result = ((result* 31)+((this.situacaoDocumento == null)? 0 :this.situacaoDocumento.hashCode()));
        result = ((result* 31)+((this.identificacaoVeiculo == null)? 0 :this.identificacaoVeiculo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConsultarDocumentoTransporte) == false) {
            return false;
        }
        ConsultarDocumentoTransporte rhs = ((ConsultarDocumentoTransporte) other);
        return ((((((((((((this.tipoDocumento == rhs.tipoDocumento)||((this.tipoDocumento!= null)&&this.tipoDocumento.equals(rhs.tipoDocumento)))&&((this.prefixoTrem == rhs.prefixoTrem)||((this.prefixoTrem!= null)&&this.prefixoTrem.equals(rhs.prefixoTrem))))&&((this.listaMensagem == rhs.listaMensagem)||((this.listaMensagem!= null)&&this.listaMensagem.equals(rhs.listaMensagem))))&&((this.dataEmissaoDocumentoTransporte == rhs.dataEmissaoDocumentoTransporte)||((this.dataEmissaoDocumentoTransporte!= null)&&this.dataEmissaoDocumentoTransporte.equals(rhs.dataEmissaoDocumentoTransporte))))&&((this.veiculoRodoviario == rhs.veiculoRodoviario)||((this.veiculoRodoviario!= null)&&this.veiculoRodoviario.equals(rhs.veiculoRodoviario))))&&((this.cargas == rhs.cargas)||((this.cargas!= null)&&this.cargas.equals(rhs.cargas))))&&((this.numeroDocumento == rhs.numeroDocumento)||((this.numeroDocumento!= null)&&this.numeroDocumento.equals(rhs.numeroDocumento))))&&((this.quantidadeVagoes == rhs.quantidadeVagoes)||((this.quantidadeVagoes!= null)&&this.quantidadeVagoes.equals(rhs.quantidadeVagoes))))&&((this.viaTransporte == rhs.viaTransporte)||((this.viaTransporte!= null)&&this.viaTransporte.equals(rhs.viaTransporte))))&&((this.situacaoDocumento == rhs.situacaoDocumento)||((this.situacaoDocumento!= null)&&this.situacaoDocumento.equals(rhs.situacaoDocumento))))&&((this.identificacaoVeiculo == rhs.identificacaoVeiculo)||((this.identificacaoVeiculo!= null)&&this.identificacaoVeiculo.equals(rhs.identificacaoVeiculo))));
    }

}
