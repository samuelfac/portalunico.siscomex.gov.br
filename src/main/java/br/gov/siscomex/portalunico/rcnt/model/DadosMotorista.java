package br.gov.siscomex.portalunico.rcnt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosMotorista", propOrder =
        {"protocoloCredenciamento", "cpf", "nome", "identidadeEstrangeiro"
        })

@XmlRootElement(name = "DadosMotorista")
public class DadosMotorista {

    @XmlElement(name = "protocoloCredenciamento")
    @ApiModelProperty(example = "66d24eb1-6ac9-4798-bc93-f4c66eb6fa9b", value = "Protocolo do credenciamento de pessoas (evento 5.1)<br/>Tamanho: 36")
    /**
     * Protocolo do credenciamento de pessoas (evento 5.1)<br/>Tamanho: 36
     **/
    private String protocoloCredenciamento = null;

    @XmlElement(name = "cpf")
    @ApiModelProperty(example = "55555555555", value = "CPF do motorista.<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que pelo menos um dos seguintes atributos seja informado: 'motorista.cpf', 'motorista.identidadeEstrangeiro', quando o atributo 'operacao' for informado com valor 'C'.<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'")
    /**
     * CPF do motorista.<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que pelo menos um dos seguintes atributos seja informado: 'motorista.cpf', 'motorista.identidadeEstrangeiro', quando o atributo 'operacao' for informado com valor 'C'.<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'
     **/
    private String cpf = null;

    @XmlElement(name = "nome", required = true)
    @ApiModelProperty(required = true, value = "Nome do motorista.<font color=\"red\"><strong><br/>(!)</strong></font>Obrigatório em eventos \"operacao=C (Acesso)\". Pode ser nulo quando o evento for de exclusão.<br/>Tamanho: 100")
    /**
     * Nome do motorista.<font color=\"red\"><strong><br/>(!)</strong></font>Obrigatório em eventos \"operacao=C (Acesso)\". Pode ser nulo quando o evento for de exclusão.<br/>Tamanho: 100
     **/
    private String nome = null;

    @XmlElement(name = "identidadeEstrangeiro")
    @ApiModelProperty(value = "Número do documento de estrangeiro. Informar apenas no caso de estrangeiro sem CPF. Usar o passaporte sempre que possível.<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que pelo menos um dos seguintes atributos seja informado: 'motorista.cpf', 'motorista.identidadeEstrangeiro', quando o atributo 'operacao' for informado com valor 'C'.<br/>Tamanho: 50")
    /**
     * Número do documento de estrangeiro. Informar apenas no caso de estrangeiro sem CPF. Usar o passaporte sempre que possível.<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que pelo menos um dos seguintes atributos seja informado: 'motorista.cpf', 'motorista.identidadeEstrangeiro', quando o atributo 'operacao' for informado com valor 'C'.<br/>Tamanho: 50
     **/
    private String identidadeEstrangeiro = null;

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
     * Protocolo do credenciamento de pessoas (evento 5.1)&lt;br/&gt;Tamanho: 36
     *
     * @return protocoloCredenciamento
     **/
    @JsonProperty("protocoloCredenciamento")
    public String getProtocoloCredenciamento() {
        return protocoloCredenciamento;
    }

    public void setProtocoloCredenciamento(String protocoloCredenciamento) {
        this.protocoloCredenciamento = protocoloCredenciamento;
    }

    public DadosMotorista protocoloCredenciamento(String protocoloCredenciamento) {
        this.protocoloCredenciamento = protocoloCredenciamento;
        return this;
    }

    /**
     * CPF do motorista.&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório que pelo menos um dos seguintes atributos seja informado: &#39;motorista.cpf&#39;, &#39;motorista.identidadeEstrangeiro&#39;, quando o atributo &#39;operacao&#39; for informado com valor &#39;C&#39;.&lt;br/&gt;Tamanho: 11&lt;br/&gt;Formato: &#39;NNNNNNNNNNN&#39;
     *
     * @return cpf
     **/
    @JsonProperty("cpf")
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public DadosMotorista cpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    /**
     * Nome do motorista.&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;Obrigatório em eventos \&quot;operacao&#x3D;C (Acesso)\&quot;. Pode ser nulo quando o evento for de exclusão.&lt;br/&gt;Tamanho: 100
     *
     * @return nome
     **/
    @JsonProperty("nome")
    @NotNull
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public DadosMotorista nome(String nome) {
        this.nome = nome;
        return this;
    }

    /**
     * Número do documento de estrangeiro. Informar apenas no caso de estrangeiro sem CPF. Usar o passaporte sempre que possível.&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório que pelo menos um dos seguintes atributos seja informado: &#39;motorista.cpf&#39;, &#39;motorista.identidadeEstrangeiro&#39;, quando o atributo &#39;operacao&#39; for informado com valor &#39;C&#39;.&lt;br/&gt;Tamanho: 50
     *
     * @return identidadeEstrangeiro
     **/
    @JsonProperty("identidadeEstrangeiro")
    public String getIdentidadeEstrangeiro() {
        return identidadeEstrangeiro;
    }

    public void setIdentidadeEstrangeiro(String identidadeEstrangeiro) {
        this.identidadeEstrangeiro = identidadeEstrangeiro;
    }

    public DadosMotorista identidadeEstrangeiro(String identidadeEstrangeiro) {
        this.identidadeEstrangeiro = identidadeEstrangeiro;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DadosMotorista {\n" +
                "    protocoloCredenciamento: " + toIndentedString(protocoloCredenciamento) + "\n" +
                "    cpf: " + toIndentedString(cpf) + "\n" +
                "    nome: " + toIndentedString(nome) + "\n" +
                "    identidadeEstrangeiro: " + toIndentedString(identidadeEstrangeiro) + "\n" +
                "}";
        return sb;
    }
}
