package br.gov.siscomex.portalunico.duex.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Declaration", propOrder =
        {"declarationDrawbackIsencao", "declarationNFe", "declarationNoNF", "declarationNoNFSimplified"
        })

@XmlRootElement(name = "Declaration")
public class Declaration {

    @XmlElement(name = "declarationDrawbackIsencao")
    @ApiModelProperty(value = "")
    @Valid
    private DeclarationDrawbackIsencao declarationDrawbackIsencao = null;

    @XmlElement(name = "declarationNFe")
    @ApiModelProperty(value = "")
    @Valid
    private DeclarationNFe declarationNFe = null;

    @XmlElement(name = "declarationNoNF")
    @ApiModelProperty(value = "")
    @Valid
    private DeclarationNoNF declarationNoNF = null;

    @XmlElement(name = "declarationNoNFSimplified")
    @ApiModelProperty(value = "")
    @Valid
    private DeclarationNoNFSimplified declarationNoNFSimplified = null;

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
     * Get declarationDrawbackIsencao
     *
     * @return declarationDrawbackIsencao
     **/
    @JsonProperty("declarationDrawbackIsencao")
    public DeclarationDrawbackIsencao getDeclarationDrawbackIsencao() {
        return declarationDrawbackIsencao;
    }

    public void setDeclarationDrawbackIsencao(DeclarationDrawbackIsencao declarationDrawbackIsencao) {
        this.declarationDrawbackIsencao = declarationDrawbackIsencao;
    }

    /**
     * Get declarationNFe
     *
     * @return declarationNFe
     **/
    @JsonProperty("declarationNFe")
    public DeclarationNFe getDeclarationNFe() {
        return declarationNFe;
    }

    public void setDeclarationNFe(DeclarationNFe declarationNFe) {
        this.declarationNFe = declarationNFe;
    }

    public Declaration declarationNFe(DeclarationNFe declarationNFe) {
        this.declarationNFe = declarationNFe;
        return this;
    }

    /**
     * Get declarationNoNF
     *
     * @return declarationNoNF
     **/
    @JsonProperty("declarationNoNF")
    public DeclarationNoNF getDeclarationNoNF() {
        return declarationNoNF;
    }

    public void setDeclarationNoNF(DeclarationNoNF declarationNoNF) {
        this.declarationNoNF = declarationNoNF;
    }

    public Declaration declarationNoNF(DeclarationNoNF declarationNoNF) {
        this.declarationNoNF = declarationNoNF;
        return this;
    }

    /**
     * Get declarationNoNFSimplified
     *
     * @return declarationNoNFSimplified
     **/
    @JsonProperty("declarationNoNFSimplified")
    public DeclarationNoNFSimplified getDeclarationNoNFSimplified() {
        return declarationNoNFSimplified;
    }

    public void setDeclarationNoNFSimplified(DeclarationNoNFSimplified declarationNoNFSimplified) {
        this.declarationNoNFSimplified = declarationNoNFSimplified;
    }

    public Declaration declarationNoNFSimplified(DeclarationNoNFSimplified declarationNoNFSimplified) {
        this.declarationNoNFSimplified = declarationNoNFSimplified;
        return this;
    }

    public Declaration declarationDrawbackIsencao(DeclarationDrawbackIsencao declarationDrawbackIsencao) {
        this.declarationDrawbackIsencao = declarationDrawbackIsencao;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class Declaration {\n" +
                "    declarationDrawbackIsencao: " + toIndentedString(declarationDrawbackIsencao) + "\n" +
                "    declarationNFe: " + toIndentedString(declarationNFe) + "\n" +
                "    declarationNoNF: " + toIndentedString(declarationNoNF) + "\n" +
                "    declarationNoNFSimplified: " + toIndentedString(declarationNoNFSimplified) + "\n" +
                "}";
        return sb;
    }
}
