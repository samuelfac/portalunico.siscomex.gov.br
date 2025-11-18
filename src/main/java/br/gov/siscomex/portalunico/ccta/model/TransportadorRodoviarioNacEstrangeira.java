package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportadorRodoviarioNacEstrangeira", propOrder =
        {"endereco", "identificacaoFiscal", "nome", "numeroLicencaComplementar", "representante", "tipoTransporte"
        })

@XmlRootElement(name = "TransportadorRodoviarioNacEstrangeira")
public class TransportadorRodoviarioNacEstrangeira {

    @XmlElement(name = "endereco")
    @ApiModelProperty(value = "")
    @Valid
    private Endereco endereco = null;

    @XmlElement(name = "identificacaoFiscal")
    @ApiModelProperty(example = "00000000000191", value = "Número de identificação do transportador estrangeiro</br>Obrigatorio se transportador for estrangeiro (\"transportadorNacBrasileira\" = false)<br/> Tamanho: 14")
    /**
     * Número de identificação do transportador estrangeiro</br>Obrigatorio se transportador for estrangeiro (\"transportadorNacBrasileira\" = false)<br/> Tamanho: 14
     **/
    private String identificacaoFiscal = null;

    @XmlElement(name = "nome")
    @ApiModelProperty(example = "Nome e Sobrenome", value = "Nome do transportador estrangeiro</br>Obrigatorio se transportador for estrangeiro (\"transportadorNacBrasileira\" = false)<br/> Tamanho Máximo: 150")
    /**
     * Nome do transportador estrangeiro</br>Obrigatorio se transportador for estrangeiro (\"transportadorNacBrasileira\" = false)<br/> Tamanho Máximo: 150
     **/
    private String nome = null;

    @XmlElement(name = "numeroLicencaComplementar")
    @ApiModelProperty(example = "123424", value = "Licença complementar<br/>campo obrigatório se tipoTransporte é REG ou OCA e transportadorNacBrasileira é false.<br/> Tamanho Máximo: 6")
    /**
     * Licença complementar<br/>campo obrigatório se tipoTransporte é REG ou OCA e transportadorNacBrasileira é false.<br/> Tamanho Máximo: 6
     **/
    private Integer numeroLicencaComplementar = null;

    @XmlElement(name = "representante")
    @ApiModelProperty(value = "")
    @Valid
    private CnpjCPf representante = null;

    @XmlElement(name = "tipoTransporte")
    @ApiModelProperty(value = "")
    @Valid
    private TipoTransporte tipoTransporte = null;

    /**
     * Get endereco
     *
     * @return endereco
     **/
    @JsonProperty("endereco")
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public TransportadorRodoviarioNacEstrangeira endereco(Endereco endereco) {
        this.endereco = endereco;
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
     * Número de identificação do transportador estrangeiro&lt;/br&gt;Obrigatorio se transportador for estrangeiro (\&quot;transportadorNacBrasileira\&quot; &#x3D; false)&lt;br/&gt; Tamanho: 14
     *
     * @return identificacaoFiscal
     **/
    @JsonProperty("identificacaoFiscal")
    public String getIdentificacaoFiscal() {
        return identificacaoFiscal;
    }

    public void setIdentificacaoFiscal(String identificacaoFiscal) {
        this.identificacaoFiscal = identificacaoFiscal;
    }

    public TransportadorRodoviarioNacEstrangeira identificacaoFiscal(String identificacaoFiscal) {
        this.identificacaoFiscal = identificacaoFiscal;
        return this;
    }

    /**
     * Nome do transportador estrangeiro&lt;/br&gt;Obrigatorio se transportador for estrangeiro (\&quot;transportadorNacBrasileira\&quot; &#x3D; false)&lt;br/&gt; Tamanho Máximo: 150
     *
     * @return nome
     **/
    @JsonProperty("nome")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Licença complementar&lt;br/&gt;campo obrigatório se tipoTransporte é REG ou OCA e transportadorNacBrasileira é false.&lt;br/&gt; Tamanho Máximo: 6
     *
     * @return numeroLicencaComplementar
     **/
    @JsonProperty("numeroLicencaComplementar")
    public Integer getNumeroLicencaComplementar() {
        return numeroLicencaComplementar;
    }

    public void setNumeroLicencaComplementar(Integer numeroLicencaComplementar) {
        this.numeroLicencaComplementar = numeroLicencaComplementar;
    }

    public TransportadorRodoviarioNacEstrangeira numeroLicencaComplementar(Integer numeroLicencaComplementar) {
        this.numeroLicencaComplementar = numeroLicencaComplementar;
        return this;
    }

    public TransportadorRodoviarioNacEstrangeira nome(String nome) {
        this.nome = nome;
        return this;
    }

    /**
     * Get representante
     *
     * @return representante
     **/
    @JsonProperty("representante")
    public CnpjCPf getRepresentante() {
        return representante;
    }

    public void setRepresentante(CnpjCPf representante) {
        this.representante = representante;
    }

    /**
     * Get tipoTransporte
     *
     * @return tipoTransporte
     **/
    @JsonProperty("tipoTransporte")
    public TipoTransporte getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(TipoTransporte tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public TransportadorRodoviarioNacEstrangeira tipoTransporte(TipoTransporte tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
        return this;
    }

    public TransportadorRodoviarioNacEstrangeira representante(CnpjCPf representante) {
        this.representante = representante;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class TransportadorRodoviarioNacEstrangeira {\n" +
                "    endereco: " + toIndentedString(endereco) + "\n" +
                "    identificacaoFiscal: " + toIndentedString(identificacaoFiscal) + "\n" +
                "    nome: " + toIndentedString(nome) + "\n" +
                "    numeroLicencaComplementar: " + toIndentedString(numeroLicencaComplementar) + "\n" +
                "    representante: " + toIndentedString(representante) + "\n" +
                "    tipoTransporte: " + toIndentedString(tipoTransporte) + "\n" +
                "}";
        return sb;
    }
}
