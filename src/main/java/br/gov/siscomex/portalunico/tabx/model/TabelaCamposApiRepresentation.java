package br.gov.siscomex.portalunico.tabx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TabelaCamposApiRepresentation", propOrder =
        {"nome", "rotulo", "descricao", "campos"
        })

@XmlRootElement(name = "TabelaCamposApiRepresentation")
public class TabelaCamposApiRepresentation {

    @XmlElement(name = "nome", required = true)
    @ApiModelProperty(example = "GRUPO_EXIGENCIA", required = true, value = "Nome da tabela.<br>Tamanho mínimo: 1<br>Tamanho máximo: 50")
    /**
     * Nome da tabela.<br>Tamanho mínimo: 1<br>Tamanho máximo: 50
     **/
    private String nome = null;

    @XmlElement(name = "rotulo")
    @ApiModelProperty(example = "Grupo de Exigência", value = "Rótulo da tabela.<br>Tamanho mínimo: 1<br>Tamanho máximo: 50")
    /**
     * Rótulo da tabela.<br>Tamanho mínimo: 1<br>Tamanho máximo: 50
     **/
    private String rotulo = null;

    @XmlElement(name = "descricao")
    @ApiModelProperty(example = "Tabela de Grupo de Exigência", value = "Descrição da tabela.<br>Tamanho mínimo: 1<br>Tamanho máximo: 1000")
    /**
     * Descrição da tabela.<br>Tamanho mínimo: 1<br>Tamanho máximo: 1000
     **/
    private String descricao = null;

    @XmlElement(name = "campos")
    @ApiModelProperty(value = "Campos da tabela.")
    @Valid
    /**
     * Campos da tabela.
     **/
    private List<CampoApiRepresentation> campos = null;

    /**
     * Nome da tabela.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 50
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

    public TabelaCamposApiRepresentation nome(String nome) {
        this.nome = nome;
        return this;
    }

    /**
     * Rótulo da tabela.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 50
     *
     * @return rotulo
     **/
    @JsonProperty("rotulo")
    public String getRotulo() {
        return rotulo;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }

    public TabelaCamposApiRepresentation rotulo(String rotulo) {
        this.rotulo = rotulo;
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
     * Descrição da tabela.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 1000
     *
     * @return descricao
     **/
    @JsonProperty("descricao")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Campos da tabela.
     *
     * @return campos
     **/
    @JsonProperty("campos")
    public List<CampoApiRepresentation> getCampos() {
        return campos;
    }

    public void setCampos(List<CampoApiRepresentation> campos) {
        this.campos = campos;
    }

    public TabelaCamposApiRepresentation campos(List<CampoApiRepresentation> campos) {
        this.campos = campos;
        return this;
    }

    public TabelaCamposApiRepresentation addCamposItem(CampoApiRepresentation camposItem) {
        this.campos.add(camposItem);
        return this;
    }

    public TabelaCamposApiRepresentation descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class TabelaCamposApiRepresentation {\n" +
                "    nome: " + toIndentedString(nome) + "\n" +
                "    rotulo: " + toIndentedString(rotulo) + "\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "    campos: " + toIndentedString(campos) + "\n" +
                "}";
        return sb;
    }
}
