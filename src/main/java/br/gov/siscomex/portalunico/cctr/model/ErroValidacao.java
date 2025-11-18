package br.gov.siscomex.portalunico.cctr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErroValidacao", propOrder =
        {"codigo", "mensagem", "referencia", "erros"
        })

@XmlRootElement(name = "ErroValidacao")
/**
 * Erros de validação durante o registro da recepção
 **/
@ApiModel(description = "Erros de validação durante o registro da recepção")
public class ErroValidacao {

    @XmlElement(name = "codigo")
    @ApiModelProperty(example = "PUCX-ER0010", value = "Código do erro de validação")
    /**
     * Código do erro de validação
     **/
    private String codigo = null;

    @XmlElement(name = "mensagem")
    @ApiModelProperty(example = "JSON não atende as especificações definidas na API (Regras Verificadas: obrigatoriedade, tamanho, formato e domínio dos atributos).", value = "Descrição do erro de validação")
    /**
     * Descrição do erro de validação
     **/
    private String mensagem = null;

    @XmlElement(name = "referencia")
    @ApiModelProperty(example = "https://api-docs.portalunico.siscomex.gov.br/", value = "Referência na Documentação da API")
    /**
     * Referência na Documentação da API
     **/
    private String referencia = null;

    @XmlElement(name = "erros")
    @ApiModelProperty(value = "Lista de campos (atributos) que apresentam erros de validação")
    @Valid
    /**
     * Lista de campos (atributos) que apresentam erros de validação
     **/
    private List<ErroAtributo> erros = null;

    /**
     * Código do erro de validação
     *
     * @return codigo
     **/
    @JsonProperty("codigo")
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ErroValidacao codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * Descrição do erro de validação
     *
     * @return mensagem
     **/
    @JsonProperty("mensagem")
    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public ErroValidacao mensagem(String mensagem) {
        this.mensagem = mensagem;
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
     * Referência na Documentação da API
     *
     * @return referencia
     **/
    @JsonProperty("referencia")
    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    /**
     * Lista de campos (atributos) que apresentam erros de validação
     *
     * @return erros
     **/
    @JsonProperty("erros")
    public List<ErroAtributo> getErros() {
        return erros;
    }

    public void setErros(List<ErroAtributo> erros) {
        this.erros = erros;
    }

    public ErroValidacao erros(List<ErroAtributo> erros) {
        this.erros = erros;
        return this;
    }

    public ErroValidacao addErrosItem(ErroAtributo errosItem) {
        this.erros.add(errosItem);
        return this;
    }

    public ErroValidacao referencia(String referencia) {
        this.referencia = referencia;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ErroValidacao {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "    mensagem: " + toIndentedString(mensagem) + "\n" +
                "    referencia: " + toIndentedString(referencia) + "\n" +
                "    erros: " + toIndentedString(erros) + "\n" +
                "}";
        return sb;
    }
}
