
package br.gov.siscomex.portalunico.catp.produtoconsultarretorno;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Items {

    @SerializedName("seq")
    @Expose
    private Integer seq;
    @SerializedName("codigo")
    @Expose
    private String codigo;
    @SerializedName("descricao")
    @Expose
    private String descricao;
    @SerializedName("cnpjRaiz")
    @Expose
    private String cnpjRaiz;
    @SerializedName("situacao")
    @Expose
    private String situacao;
    @SerializedName("modalidade")
    @Expose
    private String modalidade;
    @SerializedName("ncm")
    @Expose
    private String ncm;
    @SerializedName("codigoNaladi")
    @Expose
    private Integer codigoNaladi;
    @SerializedName("codigoGPC")
    @Expose
    private Integer codigoGPC;
    @SerializedName("codigoGPCBrick")
    @Expose
    private Integer codigoGPCBrick;
    @SerializedName("codigoUNSPSC")
    @Expose
    private Integer codigoUNSPSC;
    @SerializedName("paisOrigem")
    @Expose
    private String paisOrigem;
    @SerializedName("cpfCnpjFabricante")
    @Expose
    private String cpfCnpjFabricante;
    @SerializedName("fabricanteConhecido")
    @Expose
    private Boolean fabricanteConhecido;
    @SerializedName("codigoOperadorEstrangeiro")
    @Expose
    private Integer codigoOperadorEstrangeiro;
    @SerializedName("atributos")
    @Expose
    private List<Atributo> atributos = new ArrayList<Atributo>();
    @SerializedName("codigosInterno")
    @Expose
    private List<String> codigosInterno = new ArrayList<String>();

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCnpjRaiz() {
        return cnpjRaiz;
    }

    public void setCnpjRaiz(String cnpjRaiz) {
        this.cnpjRaiz = cnpjRaiz;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public Integer getCodigoNaladi() {
        return codigoNaladi;
    }

    public void setCodigoNaladi(Integer codigoNaladi) {
        this.codigoNaladi = codigoNaladi;
    }

    public Integer getCodigoGPC() {
        return codigoGPC;
    }

    public void setCodigoGPC(Integer codigoGPC) {
        this.codigoGPC = codigoGPC;
    }

    public Integer getCodigoGPCBrick() {
        return codigoGPCBrick;
    }

    public void setCodigoGPCBrick(Integer codigoGPCBrick) {
        this.codigoGPCBrick = codigoGPCBrick;
    }

    public Integer getCodigoUNSPSC() {
        return codigoUNSPSC;
    }

    public void setCodigoUNSPSC(Integer codigoUNSPSC) {
        this.codigoUNSPSC = codigoUNSPSC;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public String getCpfCnpjFabricante() {
        return cpfCnpjFabricante;
    }

    public void setCpfCnpjFabricante(String cpfCnpjFabricante) {
        this.cpfCnpjFabricante = cpfCnpjFabricante;
    }

    public Boolean getFabricanteConhecido() {
        return fabricanteConhecido;
    }

    public void setFabricanteConhecido(Boolean fabricanteConhecido) {
        this.fabricanteConhecido = fabricanteConhecido;
    }

    public Integer getCodigoOperadorEstrangeiro() {
        return codigoOperadorEstrangeiro;
    }

    public void setCodigoOperadorEstrangeiro(Integer codigoOperadorEstrangeiro) {
        this.codigoOperadorEstrangeiro = codigoOperadorEstrangeiro;
    }

    public List<Atributo> getAtributos() {
        return atributos;
    }

    public void setAtributos(List<Atributo> atributos) {
        this.atributos = atributos;
    }

    public List<String> getCodigosInterno() {
        return codigosInterno;
    }

    public void setCodigosInterno(List<String> codigosInterno) {
        this.codigosInterno = codigosInterno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Items.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("seq");
        sb.append('=');
        sb.append(((this.seq == null)?"<null>":this.seq));
        sb.append(',');
        sb.append("codigo");
        sb.append('=');
        sb.append(((this.codigo == null)?"<null>":this.codigo));
        sb.append(',');
        sb.append("descricao");
        sb.append('=');
        sb.append(((this.descricao == null)?"<null>":this.descricao));
        sb.append(',');
        sb.append("cnpjRaiz");
        sb.append('=');
        sb.append(((this.cnpjRaiz == null)?"<null>":this.cnpjRaiz));
        sb.append(',');
        sb.append("situacao");
        sb.append('=');
        sb.append(((this.situacao == null)?"<null>":this.situacao));
        sb.append(',');
        sb.append("modalidade");
        sb.append('=');
        sb.append(((this.modalidade == null)?"<null>":this.modalidade));
        sb.append(',');
        sb.append("ncm");
        sb.append('=');
        sb.append(((this.ncm == null)?"<null>":this.ncm));
        sb.append(',');
        sb.append("codigoNaladi");
        sb.append('=');
        sb.append(((this.codigoNaladi == null)?"<null>":this.codigoNaladi));
        sb.append(',');
        sb.append("codigoGPC");
        sb.append('=');
        sb.append(((this.codigoGPC == null)?"<null>":this.codigoGPC));
        sb.append(',');
        sb.append("codigoGPCBrick");
        sb.append('=');
        sb.append(((this.codigoGPCBrick == null)?"<null>":this.codigoGPCBrick));
        sb.append(',');
        sb.append("codigoUNSPSC");
        sb.append('=');
        sb.append(((this.codigoUNSPSC == null)?"<null>":this.codigoUNSPSC));
        sb.append(',');
        sb.append("paisOrigem");
        sb.append('=');
        sb.append(((this.paisOrigem == null)?"<null>":this.paisOrigem));
        sb.append(',');
        sb.append("cpfCnpjFabricante");
        sb.append('=');
        sb.append(((this.cpfCnpjFabricante == null)?"<null>":this.cpfCnpjFabricante));
        sb.append(',');
        sb.append("fabricanteConhecido");
        sb.append('=');
        sb.append(((this.fabricanteConhecido == null)?"<null>":this.fabricanteConhecido));
        sb.append(',');
        sb.append("codigoOperadorEstrangeiro");
        sb.append('=');
        sb.append(((this.codigoOperadorEstrangeiro == null)?"<null>":this.codigoOperadorEstrangeiro));
        sb.append(',');
        sb.append("atributos");
        sb.append('=');
        sb.append(((this.atributos == null)?"<null>":this.atributos));
        sb.append(',');
        sb.append("codigosInterno");
        sb.append('=');
        sb.append(((this.codigosInterno == null)?"<null>":this.codigosInterno));
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
        result = ((result* 31)+((this.fabricanteConhecido == null)? 0 :this.fabricanteConhecido.hashCode()));
        result = ((result* 31)+((this.codigo == null)? 0 :this.codigo.hashCode()));
        result = ((result* 31)+((this.situacao == null)? 0 :this.situacao.hashCode()));
        result = ((result* 31)+((this.codigoNaladi == null)? 0 :this.codigoNaladi.hashCode()));
        result = ((result* 31)+((this.descricao == null)? 0 :this.descricao.hashCode()));
        result = ((result* 31)+((this.codigoGPCBrick == null)? 0 :this.codigoGPCBrick.hashCode()));
        result = ((result* 31)+((this.codigoOperadorEstrangeiro == null)? 0 :this.codigoOperadorEstrangeiro.hashCode()));
        result = ((result* 31)+((this.codigoGPC == null)? 0 :this.codigoGPC.hashCode()));
        result = ((result* 31)+((this.codigoUNSPSC == null)? 0 :this.codigoUNSPSC.hashCode()));
        result = ((result* 31)+((this.codigosInterno == null)? 0 :this.codigosInterno.hashCode()));
        result = ((result* 31)+((this.cnpjRaiz == null)? 0 :this.cnpjRaiz.hashCode()));
        result = ((result* 31)+((this.ncm == null)? 0 :this.ncm.hashCode()));
        result = ((result* 31)+((this.paisOrigem == null)? 0 :this.paisOrigem.hashCode()));
        result = ((result* 31)+((this.cpfCnpjFabricante == null)? 0 :this.cpfCnpjFabricante.hashCode()));
        result = ((result* 31)+((this.seq == null)? 0 :this.seq.hashCode()));
        result = ((result* 31)+((this.atributos == null)? 0 :this.atributos.hashCode()));
        result = ((result* 31)+((this.modalidade == null)? 0 :this.modalidade.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Items) == false) {
            return false;
        }
        Items rhs = ((Items) other);
        return ((((((((((((((((((this.fabricanteConhecido == rhs.fabricanteConhecido)||((this.fabricanteConhecido!= null)&&this.fabricanteConhecido.equals(rhs.fabricanteConhecido)))&&((this.codigo == rhs.codigo)||((this.codigo!= null)&&this.codigo.equals(rhs.codigo))))&&((this.situacao == rhs.situacao)||((this.situacao!= null)&&this.situacao.equals(rhs.situacao))))&&((this.codigoNaladi == rhs.codigoNaladi)||((this.codigoNaladi!= null)&&this.codigoNaladi.equals(rhs.codigoNaladi))))&&((this.descricao == rhs.descricao)||((this.descricao!= null)&&this.descricao.equals(rhs.descricao))))&&((this.codigoGPCBrick == rhs.codigoGPCBrick)||((this.codigoGPCBrick!= null)&&this.codigoGPCBrick.equals(rhs.codigoGPCBrick))))&&((this.codigoOperadorEstrangeiro == rhs.codigoOperadorEstrangeiro)||((this.codigoOperadorEstrangeiro!= null)&&this.codigoOperadorEstrangeiro.equals(rhs.codigoOperadorEstrangeiro))))&&((this.codigoGPC == rhs.codigoGPC)||((this.codigoGPC!= null)&&this.codigoGPC.equals(rhs.codigoGPC))))&&((this.codigoUNSPSC == rhs.codigoUNSPSC)||((this.codigoUNSPSC!= null)&&this.codigoUNSPSC.equals(rhs.codigoUNSPSC))))&&((this.codigosInterno == rhs.codigosInterno)||((this.codigosInterno!= null)&&this.codigosInterno.equals(rhs.codigosInterno))))&&((this.cnpjRaiz == rhs.cnpjRaiz)||((this.cnpjRaiz!= null)&&this.cnpjRaiz.equals(rhs.cnpjRaiz))))&&((this.ncm == rhs.ncm)||((this.ncm!= null)&&this.ncm.equals(rhs.ncm))))&&((this.paisOrigem == rhs.paisOrigem)||((this.paisOrigem!= null)&&this.paisOrigem.equals(rhs.paisOrigem))))&&((this.cpfCnpjFabricante == rhs.cpfCnpjFabricante)||((this.cpfCnpjFabricante!= null)&&this.cpfCnpjFabricante.equals(rhs.cpfCnpjFabricante))))&&((this.seq == rhs.seq)||((this.seq!= null)&&this.seq.equals(rhs.seq))))&&((this.atributos == rhs.atributos)||((this.atributos!= null)&&this.atributos.equals(rhs.atributos))))&&((this.modalidade == rhs.modalidade)||((this.modalidade!= null)&&this.modalidade.equals(rhs.modalidade))));
    }

}
