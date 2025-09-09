package br.gov.siscomex.portalunico.plat.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthResponseDTO", propOrder =
        {"token"
        })

@XmlRootElement(name = "AuthResponseDTO")
/**
 * DTO de resposta do serviço de autenticação
 **/
@ApiModel(description = "DTO de resposta do serviço de autenticação")
public class AuthResponseDTO {

    @XmlElement(name = "token", required = true)
    @ApiModelProperty(required = true, value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). O conteúdo é o mesmo recebido no response header 'X-CSRF-Token'.")
    /**
     * Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). O conteúdo é o mesmo recebido no response header 'X-CSRF-Token'.
     **/
    private String token = null;

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
     * Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). O conteúdo é o mesmo recebido no response header &#39;X-CSRF-Token&#39;.
     *
     * @return token
     **/
    @JsonProperty("token")
    @NotNull
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public AuthResponseDTO token(String token) {
        this.token = token;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class AuthResponseDTO {\n" +
                "    token: " + toIndentedString(token) + "\n" +
                "}";
        return sb;
    }
}
