package br.gov.siscomex.portalunico.remx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformaesDaRemessa", propOrder =
        {"indicadorOver", "infoFiscalizacao", "numeroMaster", "numeroRemessa", "pesoRemessa", "tratamentoAdm", "volumesRecebidos", "volumesRemessa"
        })

@XmlRootElement(name = "InformaesDaRemessa")
public class InformaesDaRemessa {

    @XmlElement(name = "indicadorOver", required = true)
    @ApiModelProperty(required = true, value = "Indicador para sinalizar uma remessa over. <br/>Domínio:<br/>0 - Remessa manifestada <br/>1 - Remessa Over (apenas para remessa expressa).")
    /**
     * Indicador para sinalizar uma remessa over. <br/>Domínio:<br/>0 - Remessa manifestada <br/>1 - Remessa Over (apenas para remessa expressa).
     **/
    private Integer indicadorOver = null;

    @XmlElement(name = "infoFiscalizacao")
    @ApiModelProperty(value = "Informações de fiscalização. Máximo de 500 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.")
    /**
     * Informações de fiscalização. Máximo de 500 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
     **/
    private String infoFiscalizacao = null;

    @XmlElement(name = "numeroMaster", required = true)
    @ApiModelProperty(required = true, value = "Número do Master (11 caracteres numéricos) ou o número da Mala Postal (29 caracteres alfanuméricos).")
    /**
     * Número do Master (11 caracteres numéricos) ou o número da Mala Postal (29 caracteres alfanuméricos).
     **/
    private String numeroMaster = null;

    @XmlElement(name = "numeroRemessa", required = true)
    @ApiModelProperty(required = true, value = "Número da remessa composto por no máximo 18 caracteres alfanuméricos.")
    /**
     * Número da remessa composto por no máximo 18 caracteres alfanuméricos.
     **/
    private String numeroRemessa = null;

    @XmlElement(name = "pesoRemessa")
    @ApiModelProperty(value = "Peso em quilogramas da remessa. Número fracionário, maior que zero, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto. O peso da remessa deve ser maior ou igual ao somatório dos pesos das suas mercadorias.")
    @Valid
    /**
     * Peso em quilogramas da remessa. Número fracionário, maior que zero, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto. O peso da remessa deve ser maior ou igual ao somatório dos pesos das suas mercadorias.
     **/
    private BigDecimal pesoRemessa = null;

    @XmlElement(name = "tratamentoAdm")
    @ApiModelProperty(value = "Especifica se a mercadoria necessita de tratamento administrativo, encaminhando a mesma para seleção do órgão desejado.<br/>1- Fiscalização ANVISA<br/>2 - Fiscalização VIGIAGRO/MAPA<br/>3 - Fiscalização RFB<br/>4 - Fiscalização VIGIAGRO/MAPA e Anvisa<br/>5 - Fiscalização VIGIAGRO/MAPA e RFB<br/>6 - Fiscalização Anvisa e RFB<br/>7 - Fiscalização VIGIAGRO/MAPA, Anvisa e RFB<br/>8 - Fiscalização IBAMA<br/>9 - Fiscalização IBAMA e ANVISA<br/>10 - Fiscalização IBAMA e VIGIAGRO/MAPA<br/>11 - Fiscalização IBAMA e RFB<br/>12 - Fiscalização IBAMA, VIGIAGRO/MAPA e ANVISA<br/>13 - Fiscalização IBAMA, VIGIAGRO/MAPA e RFB<br/>14 - Fiscalização IBAMA, ANVISA e RFB<br/>15 - Fiscalização IBAMA, ANVISA, VIGIAGRO/MAPA e RFB")
    /**
     * Especifica se a mercadoria necessita de tratamento administrativo, encaminhando a mesma para seleção do órgão desejado.<br/>1- Fiscalização ANVISA<br/>2 - Fiscalização VIGIAGRO/MAPA<br/>3 - Fiscalização RFB<br/>4 - Fiscalização VIGIAGRO/MAPA e Anvisa<br/>5 - Fiscalização VIGIAGRO/MAPA e RFB<br/>6 - Fiscalização Anvisa e RFB<br/>7 - Fiscalização VIGIAGRO/MAPA, Anvisa e RFB<br/>8 - Fiscalização IBAMA<br/>9 - Fiscalização IBAMA e ANVISA<br/>10 - Fiscalização IBAMA e VIGIAGRO/MAPA<br/>11 - Fiscalização IBAMA e RFB<br/>12 - Fiscalização IBAMA, VIGIAGRO/MAPA e ANVISA<br/>13 - Fiscalização IBAMA, VIGIAGRO/MAPA e RFB<br/>14 - Fiscalização IBAMA, ANVISA e RFB<br/>15 - Fiscalização IBAMA, ANVISA, VIGIAGRO/MAPA e RFB
     **/
    private Integer tratamentoAdm = null;

    @XmlElement(name = "volumesRecebidos", required = true)
    @ApiModelProperty(required = true, value = "Total de volumes recebidos da remessa. Máximo de 4 caracteres numéricos (0 até 9999).")
    /**
     * Total de volumes recebidos da remessa. Máximo de 4 caracteres numéricos (0 até 9999).
     **/
    private Integer volumesRecebidos = null;

    @XmlElement(name = "volumesRemessa")
    @ApiModelProperty(value = "Quantidade de volumes da remessa. Para remessas over é a quantidade de volumes informados na primeira presença de carga.  Máximo de 4 caracteres numéricos (1 até 9999).")
    /**
     * Quantidade de volumes da remessa. Para remessas over é a quantidade de volumes informados na primeira presença de carga.  Máximo de 4 caracteres numéricos (1 até 9999).
     **/
    private Integer volumesRemessa = null;

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

    public InformaesDaRemessa indicadorOver(Integer indicadorOver) {
        this.indicadorOver = indicadorOver;
        return this;
    }

    /**
     * Indicador para sinalizar uma remessa over. &lt;br/&gt;Domínio:&lt;br/&gt;0 - Remessa manifestada &lt;br/&gt;1 - Remessa Over (apenas para remessa expressa).
     * minimum: 0
     * maximum: 1
     *
     * @return indicadorOver
     **/
    @JsonProperty("indicadorOver")
    @NotNull
    @Min(0)
    @Max(1)
    public Integer getIndicadorOver() {
        return indicadorOver;
    }

    public void setIndicadorOver(Integer indicadorOver) {
        this.indicadorOver = indicadorOver;
    }

    /**
     * Informações de fiscalização. Máximo de 500 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
     *
     * @return infoFiscalizacao
     **/
    @JsonProperty("infoFiscalizacao")
    @Size(min = 1, max = 500)
    public String getInfoFiscalizacao() {
        return infoFiscalizacao;
    }

    public void setInfoFiscalizacao(String infoFiscalizacao) {
        this.infoFiscalizacao = infoFiscalizacao;
    }

    /**
     * Número do Master (11 caracteres numéricos) ou o número da Mala Postal (29 caracteres alfanuméricos).
     *
     * @return numeroMaster
     **/
    @JsonProperty("numeroMaster")
    @NotNull
    public String getNumeroMaster() {
        return numeroMaster;
    }

    public void setNumeroMaster(String numeroMaster) {
        this.numeroMaster = numeroMaster;
    }

    public InformaesDaRemessa numeroMaster(String numeroMaster) {
        this.numeroMaster = numeroMaster;
        return this;
    }

    public InformaesDaRemessa infoFiscalizacao(String infoFiscalizacao) {
        this.infoFiscalizacao = infoFiscalizacao;
        return this;
    }

    /**
     * Número da remessa composto por no máximo 18 caracteres alfanuméricos.
     *
     * @return numeroRemessa
     **/
    @JsonProperty("numeroRemessa")
    @NotNull
    @Size(min = 1, max = 18)
    public String getNumeroRemessa() {
        return numeroRemessa;
    }

    public void setNumeroRemessa(String numeroRemessa) {
        this.numeroRemessa = numeroRemessa;
    }

    /**
     * Peso em quilogramas da remessa. Número fracionário, maior que zero, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto. O peso da remessa deve ser maior ou igual ao somatório dos pesos das suas mercadorias.
     *
     * @return pesoRemessa
     **/
    @JsonProperty("pesoRemessa")
    public BigDecimal getPesoRemessa() {
        return pesoRemessa;
    }

    public void setPesoRemessa(BigDecimal pesoRemessa) {
        this.pesoRemessa = pesoRemessa;
    }

    public InformaesDaRemessa pesoRemessa(BigDecimal pesoRemessa) {
        this.pesoRemessa = pesoRemessa;
        return this;
    }

    public InformaesDaRemessa numeroRemessa(String numeroRemessa) {
        this.numeroRemessa = numeroRemessa;
        return this;
    }

    /**
     * Especifica se a mercadoria necessita de tratamento administrativo, encaminhando a mesma para seleção do órgão desejado.&lt;br/&gt;1- Fiscalização ANVISA&lt;br/&gt;2 - Fiscalização VIGIAGRO/MAPA&lt;br/&gt;3 - Fiscalização RFB&lt;br/&gt;4 - Fiscalização VIGIAGRO/MAPA e Anvisa&lt;br/&gt;5 - Fiscalização VIGIAGRO/MAPA e RFB&lt;br/&gt;6 - Fiscalização Anvisa e RFB&lt;br/&gt;7 - Fiscalização VIGIAGRO/MAPA, Anvisa e RFB&lt;br/&gt;8 - Fiscalização IBAMA&lt;br/&gt;9 - Fiscalização IBAMA e ANVISA&lt;br/&gt;10 - Fiscalização IBAMA e VIGIAGRO/MAPA&lt;br/&gt;11 - Fiscalização IBAMA e RFB&lt;br/&gt;12 - Fiscalização IBAMA, VIGIAGRO/MAPA e ANVISA&lt;br/&gt;13 - Fiscalização IBAMA, VIGIAGRO/MAPA e RFB&lt;br/&gt;14 - Fiscalização IBAMA, ANVISA e RFB&lt;br/&gt;15 - Fiscalização IBAMA, ANVISA, VIGIAGRO/MAPA e RFB
     * minimum: 0
     * maximum: 15
     *
     * @return tratamentoAdm
     **/
    @JsonProperty("tratamentoAdm")
    @Min(0)
    @Max(15)
    public Integer getTratamentoAdm() {
        return tratamentoAdm;
    }

    public void setTratamentoAdm(Integer tratamentoAdm) {
        this.tratamentoAdm = tratamentoAdm;
    }

    public InformaesDaRemessa tratamentoAdm(Integer tratamentoAdm) {
        this.tratamentoAdm = tratamentoAdm;
        return this;
    }

    public InformaesDaRemessa volumesRecebidos(Integer volumesRecebidos) {
        this.volumesRecebidos = volumesRecebidos;
        return this;
    }

    /**
     * Total de volumes recebidos da remessa. Máximo de 4 caracteres numéricos (0 até 9999).
     * minimum: 0
     * maximum: 9999
     *
     * @return volumesRecebidos
     **/
    @JsonProperty("volumesRecebidos")
    @NotNull
    @Min(0)
    @Max(9999)
    public Integer getVolumesRecebidos() {
        return volumesRecebidos;
    }

    public void setVolumesRecebidos(Integer volumesRecebidos) {
        this.volumesRecebidos = volumesRecebidos;
    }

    public InformaesDaRemessa volumesRemessa(Integer volumesRemessa) {
        this.volumesRemessa = volumesRemessa;
        return this;
    }

    /**
     * Quantidade de volumes da remessa. Para remessas over é a quantidade de volumes informados na primeira presença de carga.  Máximo de 4 caracteres numéricos (1 até 9999).
     * minimum: 0
     * maximum: 9999
     *
     * @return volumesRemessa
     **/
    @JsonProperty("volumesRemessa")
    @Min(0)
    @Max(9999)
    public Integer getVolumesRemessa() {
        return volumesRemessa;
    }

    public void setVolumesRemessa(Integer volumesRemessa) {
        this.volumesRemessa = volumesRemessa;
    }

    @Override
    public String toString() {

        String sb = "class InformaesDaRemessa {\n" +
                "    indicadorOver: " + toIndentedString(indicadorOver) + "\n" +
                "    infoFiscalizacao: " + toIndentedString(infoFiscalizacao) + "\n" +
                "    numeroMaster: " + toIndentedString(numeroMaster) + "\n" +
                "    numeroRemessa: " + toIndentedString(numeroRemessa) + "\n" +
                "    pesoRemessa: " + toIndentedString(pesoRemessa) + "\n" +
                "    tratamentoAdm: " + toIndentedString(tratamentoAdm) + "\n" +
                "    volumesRecebidos: " + toIndentedString(volumesRecebidos) + "\n" +
                "    volumesRemessa: " + toIndentedString(volumesRemessa) + "\n" +
                "}";
        return sb;
    }
}
