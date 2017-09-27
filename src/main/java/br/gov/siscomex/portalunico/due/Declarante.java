
package br.gov.siscomex.portalunico.due;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class Declarante implements Serializable
{

    private final static long serialVersionUID = -7791894530203981610L;

    @SerializedName("numero")
    @Expose
    private String numero;
    @SerializedName("tipo")
    @Expose
    private String tipo;

}
