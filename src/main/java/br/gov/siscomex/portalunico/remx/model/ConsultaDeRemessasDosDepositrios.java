package br.gov.siscomex.portalunico.remx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaDeRemessasDosDepositrios", propOrder =
        {"cnpjDeclarante", "listaNumeroRemessa", "listaOrgaoFiscalizacao", "listaSituacaoRemessa", "numeroLote", "numeroManifesto", "numeroMaster"
        })

@XmlRootElement(name = "ConsultaDeRemessasDosDepositrios")
public class ConsultaDeRemessasDosDepositrios {

    @XmlElement(name = "cnpjDeclarante", required = true)
    @ApiModelProperty(example = "33683111000107", required = true, value = "CNPJ da empresa responsável composto por 14 caracteres numéricos. Não deve conter caracteres como '.', '-' e '/'.")
    /**
     * CNPJ da empresa responsável composto por 14 caracteres numéricos. Não deve conter caracteres como '.', '-' e '/'.
     **/
    private String cnpjDeclarante = null;

    @XmlElement(name = "listaNumeroRemessa")
    @ApiModelProperty(value = "Lista de remessas.")
    /**
     * Lista de remessas.
     **/
    private List<String> listaNumeroRemessa = null;

    @XmlElement(name = "listaOrgaoFiscalizacao")
    @ApiModelProperty(value = "Lista de ID do órgão fiscalizador. Cada item da lista contém:<br/>Código do órgão (mneumônico) fiscalizador.  Máximo de 50 caracteres alfanuméricos.<br/>RFB;<br/>ANVISA;<br/>IBAMA;<br/>MAPA.")
    /**
     * Lista de ID do órgão fiscalizador. Cada item da lista contém:<br/>Código do órgão (mneumônico) fiscalizador.  Máximo de 50 caracteres alfanuméricos.<br/>RFB;<br/>ANVISA;<br/>IBAMA;<br/>MAPA.
     **/
    private List<String> listaOrgaoFiscalizacao = null;

    @XmlElement(name = "listaSituacaoRemessa")
    @ApiModelProperty(value = "Lista de situação de remessa. Cada item da lista contém:<br/>Código da situação da remessa. O código da situação é composto por 2 dígitos.<br/>18 - Manifestada;<br/>19 - Liberada;<br/>20 - Descaracterizada / Declaração Cancelada;<br/>21 - Em Perdimento;<br/>22 - Abandonada;<br/>23 - Destruída;<br/>24 - Devolvida / Declaração Cancelada;<br/>25 - Desembaraçada;<br/>26 - Em Seleção;<br/>27 - Em Fiscalização;<br/>28 - Cancelada;<br/>29 - Não Liberada;<br/>30 - Baixada - Presença de Carga em Outro Manifesto;<br/>31 - Baixada - Sem Presença de Carga;<br/>32 - Em Divergência por Abandono - Falta de Declaração;<br/>33 - Em Divergência por Abandono - Sem Pagamento;<br/>34 - Em Divergência por Abandono - Ocorrência Sem Resolução;<br/>35 - Devolvida;<br/>36 - Em Devolução / Declaração Cancelada;<br/>37 - Em Divergência de Manifesto;<br/>38 - Em Fiscalização por Revisão.")
    /**
     * Lista de situação de remessa. Cada item da lista contém:<br/>Código da situação da remessa. O código da situação é composto por 2 dígitos.<br/>18 - Manifestada;<br/>19 - Liberada;<br/>20 - Descaracterizada / Declaração Cancelada;<br/>21 - Em Perdimento;<br/>22 - Abandonada;<br/>23 - Destruída;<br/>24 - Devolvida / Declaração Cancelada;<br/>25 - Desembaraçada;<br/>26 - Em Seleção;<br/>27 - Em Fiscalização;<br/>28 - Cancelada;<br/>29 - Não Liberada;<br/>30 - Baixada - Presença de Carga em Outro Manifesto;<br/>31 - Baixada - Sem Presença de Carga;<br/>32 - Em Divergência por Abandono - Falta de Declaração;<br/>33 - Em Divergência por Abandono - Sem Pagamento;<br/>34 - Em Divergência por Abandono - Ocorrência Sem Resolução;<br/>35 - Devolvida;<br/>36 - Em Devolução / Declaração Cancelada;<br/>37 - Em Divergência de Manifesto;<br/>38 - Em Fiscalização por Revisão.
     **/
    private List<Integer> listaSituacaoRemessa = null;

    @XmlElement(name = "numeroLote")
    @ApiModelProperty(value = "Número do lote composto por 16 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do lote de declaração.")
    /**
     * Número do lote composto por 16 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do lote de declaração.
     **/
    private String numeroLote = null;

    @XmlElement(name = "numeroManifesto")
    @ApiModelProperty(value = "Número do manifesto composto por 15 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do manifesto de carga para modalidade expressa ou registro do lote de declaração para modalidade postal.")
    /**
     * Número do manifesto composto por 15 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do manifesto de carga para modalidade expressa ou registro do lote de declaração para modalidade postal.
     **/
    private String numeroManifesto = null;

    @XmlElement(name = "numeroMaster")
    @ApiModelProperty(value = "Número do Master (11 caracteres numéricos) ou o número da Mala Postal (29 caracteres alfanuméricos).")
    /**
     * Número do Master (11 caracteres numéricos) ou o número da Mala Postal (29 caracteres alfanuméricos).
     **/
    private String numeroMaster = null;

    /**
     * CNPJ da empresa responsável composto por 14 caracteres numéricos. Não deve conter caracteres como &#39;.&#39;, &#39;-&#39; e &#39;/&#39;.
     *
     * @return cnpjDeclarante
     **/
    @JsonProperty("cnpjDeclarante")
    @NotNull
    public String getCnpjDeclarante() {
        return cnpjDeclarante;
    }

    public void setCnpjDeclarante(String cnpjDeclarante) {
        this.cnpjDeclarante = cnpjDeclarante;
    }

    public ConsultaDeRemessasDosDepositrios cnpjDeclarante(String cnpjDeclarante) {
        this.cnpjDeclarante = cnpjDeclarante;
        return this;
    }

    /**
     * Lista de remessas.
     *
     * @return listaNumeroRemessa
     **/
    @JsonProperty("listaNumeroRemessa")
    public List<String> getListaNumeroRemessa() {
        return listaNumeroRemessa;
    }

    public void setListaNumeroRemessa(List<String> listaNumeroRemessa) {
        this.listaNumeroRemessa = listaNumeroRemessa;
    }

    public ConsultaDeRemessasDosDepositrios listaNumeroRemessa(List<String> listaNumeroRemessa) {
        this.listaNumeroRemessa = listaNumeroRemessa;
        return this;
    }

    public ConsultaDeRemessasDosDepositrios addListaNumeroRemessaItem(String listaNumeroRemessaItem) {
        this.listaNumeroRemessa.add(listaNumeroRemessaItem);
        return this;
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private static String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    /**
     * Lista de ID do órgão fiscalizador. Cada item da lista contém:&lt;br/&gt;Código do órgão (mneumônico) fiscalizador.  Máximo de 50 caracteres alfanuméricos.&lt;br/&gt;RFB;&lt;br/&gt;ANVISA;&lt;br/&gt;IBAMA;&lt;br/&gt;MAPA.
     *
     * @return listaOrgaoFiscalizacao
     **/
    @JsonProperty("listaOrgaoFiscalizacao")
    public List<String> getListaOrgaoFiscalizacao() {
        return listaOrgaoFiscalizacao;
    }

    public void setListaOrgaoFiscalizacao(List<String> listaOrgaoFiscalizacao) {
        this.listaOrgaoFiscalizacao = listaOrgaoFiscalizacao;
    }

    public ConsultaDeRemessasDosDepositrios listaOrgaoFiscalizacao(List<String> listaOrgaoFiscalizacao) {
        this.listaOrgaoFiscalizacao = listaOrgaoFiscalizacao;
        return this;
    }

    /**
     * Lista de situação de remessa. Cada item da lista contém:&lt;br/&gt;Código da situação da remessa. O código da situação é composto por 2 dígitos.&lt;br/&gt;18 - Manifestada;&lt;br/&gt;19 - Liberada;&lt;br/&gt;20 - Descaracterizada / Declaração Cancelada;&lt;br/&gt;21 - Em Perdimento;&lt;br/&gt;22 - Abandonada;&lt;br/&gt;23 - Destruída;&lt;br/&gt;24 - Devolvida / Declaração Cancelada;&lt;br/&gt;25 - Desembaraçada;&lt;br/&gt;26 - Em Seleção;&lt;br/&gt;27 - Em Fiscalização;&lt;br/&gt;28 - Cancelada;&lt;br/&gt;29 - Não Liberada;&lt;br/&gt;30 - Baixada - Presença de Carga em Outro Manifesto;&lt;br/&gt;31 - Baixada - Sem Presença de Carga;&lt;br/&gt;32 - Em Divergência por Abandono - Falta de Declaração;&lt;br/&gt;33 - Em Divergência por Abandono - Sem Pagamento;&lt;br/&gt;34 - Em Divergência por Abandono - Ocorrência Sem Resolução;&lt;br/&gt;35 - Devolvida;&lt;br/&gt;36 - Em Devolução / Declaração Cancelada;&lt;br/&gt;37 - Em Divergência de Manifesto;&lt;br/&gt;38 - Em Fiscalização por Revisão.
     *
     * @return listaSituacaoRemessa
     **/
    @JsonProperty("listaSituacaoRemessa")
    public List<Integer> getListaSituacaoRemessa() {
        return listaSituacaoRemessa;
    }

    public void setListaSituacaoRemessa(List<Integer> listaSituacaoRemessa) {
        this.listaSituacaoRemessa = listaSituacaoRemessa;
    }

    public ConsultaDeRemessasDosDepositrios listaSituacaoRemessa(List<Integer> listaSituacaoRemessa) {
        this.listaSituacaoRemessa = listaSituacaoRemessa;
        return this;
    }

    public ConsultaDeRemessasDosDepositrios addListaSituacaoRemessaItem(Integer listaSituacaoRemessaItem) {
        this.listaSituacaoRemessa.add(listaSituacaoRemessaItem);
        return this;
    }

    public ConsultaDeRemessasDosDepositrios addListaOrgaoFiscalizacaoItem(String listaOrgaoFiscalizacaoItem) {
        this.listaOrgaoFiscalizacao.add(listaOrgaoFiscalizacaoItem);
        return this;
    }

    /**
     * Número do lote composto por 16 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do lote de declaração.
     *
     * @return numeroLote
     **/
    @JsonProperty("numeroLote")
    public String getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }

    public ConsultaDeRemessasDosDepositrios numeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
        return this;
    }

    /**
     * Número do manifesto composto por 15 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do manifesto de carga para modalidade expressa ou registro do lote de declaração para modalidade postal.
     *
     * @return numeroManifesto
     **/
    @JsonProperty("numeroManifesto")
    public String getNumeroManifesto() {
        return numeroManifesto;
    }

    public void setNumeroManifesto(String numeroManifesto) {
        this.numeroManifesto = numeroManifesto;
    }

    public ConsultaDeRemessasDosDepositrios numeroManifesto(String numeroManifesto) {
        this.numeroManifesto = numeroManifesto;
        return this;
    }

    /**
     * Número do Master (11 caracteres numéricos) ou o número da Mala Postal (29 caracteres alfanuméricos).
     *
     * @return numeroMaster
     **/
    @JsonProperty("numeroMaster")
    public String getNumeroMaster() {
        return numeroMaster;
    }

    public void setNumeroMaster(String numeroMaster) {
        this.numeroMaster = numeroMaster;
    }

    public ConsultaDeRemessasDosDepositrios numeroMaster(String numeroMaster) {
        this.numeroMaster = numeroMaster;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ConsultaDeRemessasDosDepositrios {\n" +
                "    cnpjDeclarante: " + toIndentedString(cnpjDeclarante) + "\n" +
                "    listaNumeroRemessa: " + toIndentedString(listaNumeroRemessa) + "\n" +
                "    listaOrgaoFiscalizacao: " + toIndentedString(listaOrgaoFiscalizacao) + "\n" +
                "    listaSituacaoRemessa: " + toIndentedString(listaSituacaoRemessa) + "\n" +
                "    numeroLote: " + toIndentedString(numeroLote) + "\n" +
                "    numeroManifesto: " + toIndentedString(numeroManifesto) + "\n" +
                "    numeroMaster: " + toIndentedString(numeroMaster) + "\n" +
                "}";
        return sb;
    }
}
