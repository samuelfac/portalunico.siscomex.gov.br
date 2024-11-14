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
@XmlType(name = "OperadorQueParticipouDoManuseioDaCarga", propOrder =
        {"idElemento", "cpf", "nome"
        })

@XmlRootElement(name = "OperadorQueParticipouDoManuseioDaCarga")
public class OperadorQueParticipouDoManuseioDaCarga {

    @XmlElement(name = "idElemento", required = true)
    @ApiModelProperty(required = true, value = "Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40")
    /**
     * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40
     **/
    private String idElemento = null;

    @XmlElement(name = "cpf")
    @ApiModelProperty(example = "55555555555", value = "Informar o CPF do operador que manuseou a carga<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar os atributos 'dataHoraInicioPosicionamento', 'dataHoraFimPosicionamento', 'dataHoraInicioConferenciaFisica', 'dataHoraFimConferenciaFisica', 'listaOperadoresPosicionamento (cpf, nome'), 'retiradaAmostras', 'divergenciaQualificacao', 'divergenciaQuantidade', 'areaConferenciaFisica', quando o atributo 'tipo' for informado com valor 'CCF'.<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'")
    /**
     * Informar o CPF do operador que manuseou a carga<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar os atributos 'dataHoraInicioPosicionamento', 'dataHoraFimPosicionamento', 'dataHoraInicioConferenciaFisica', 'dataHoraFimConferenciaFisica', 'listaOperadoresPosicionamento (cpf, nome'), 'retiradaAmostras', 'divergenciaQualificacao', 'divergenciaQuantidade', 'areaConferenciaFisica', quando o atributo 'tipo' for informado com valor 'CCF'.<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'
     **/
    private String cpf = null;

    @XmlElement(name = "nome")
    @ApiModelProperty(value = "Informar o nome do operador que manuseou a carga<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar os atributos 'dataHoraInicioPosicionamento', 'dataHoraFimPosicionamento', 'dataHoraInicioConferenciaFisica', 'dataHoraFimConferenciaFisica', 'listaOperadoresPosicionamento (cpf, nome'), 'retiradaAmostras', 'divergenciaQualificacao', 'divergenciaQuantidade', 'areaConferenciaFisica', quando o atributo 'tipo' for informado com valor 'CCF'.<br/>Tamanho: 100")
    /**
     * Informar o nome do operador que manuseou a carga<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar os atributos 'dataHoraInicioPosicionamento', 'dataHoraFimPosicionamento', 'dataHoraInicioConferenciaFisica', 'dataHoraFimConferenciaFisica', 'listaOperadoresPosicionamento (cpf, nome'), 'retiradaAmostras', 'divergenciaQualificacao', 'divergenciaQuantidade', 'areaConferenciaFisica', quando o atributo 'tipo' for informado com valor 'CCF'.<br/>Tamanho: 100
     **/
    private String nome = null;

    /**
     * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.&lt;br/&gt;Tamanho: 40
     *
     * @return idElemento
     **/
    @JsonProperty("idElemento")
    @NotNull
    public String getIdElemento() {
        return idElemento;
    }

    public void setIdElemento(String idElemento) {
        this.idElemento = idElemento;
    }

    public OperadorQueParticipouDoManuseioDaCarga idElemento(String idElemento) {
        this.idElemento = idElemento;
        return this;
    }

    /**
     * Informar o CPF do operador que manuseou a carga&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório informar os atributos &#39;dataHoraInicioPosicionamento&#39;, &#39;dataHoraFimPosicionamento&#39;, &#39;dataHoraInicioConferenciaFisica&#39;, &#39;dataHoraFimConferenciaFisica&#39;, &#39;listaOperadoresPosicionamento (cpf, nome&#39;), &#39;retiradaAmostras&#39;, &#39;divergenciaQualificacao&#39;, &#39;divergenciaQuantidade&#39;, &#39;areaConferenciaFisica&#39;, quando o atributo &#39;tipo&#39; for informado com valor &#39;CCF&#39;.&lt;br/&gt;Tamanho: 11&lt;br/&gt;Formato: &#39;NNNNNNNNNNN&#39;
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

    public OperadorQueParticipouDoManuseioDaCarga cpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    /**
     * Informar o nome do operador que manuseou a carga&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório informar os atributos &#39;dataHoraInicioPosicionamento&#39;, &#39;dataHoraFimPosicionamento&#39;, &#39;dataHoraInicioConferenciaFisica&#39;, &#39;dataHoraFimConferenciaFisica&#39;, &#39;listaOperadoresPosicionamento (cpf, nome&#39;), &#39;retiradaAmostras&#39;, &#39;divergenciaQualificacao&#39;, &#39;divergenciaQuantidade&#39;, &#39;areaConferenciaFisica&#39;, quando o atributo &#39;tipo&#39; for informado com valor &#39;CCF&#39;.&lt;br/&gt;Tamanho: 100
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

    public OperadorQueParticipouDoManuseioDaCarga nome(String nome) {
        this.nome = nome;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class OperadorQueParticipouDoManuseioDaCarga {\n" +
                "    idElemento: " + toIndentedString(idElemento) + "\n" +
                "    cpf: " + toIndentedString(cpf) + "\n" +
                "    nome: " + toIndentedString(nome) + "\n" +
                "}";
        return sb;
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
}

