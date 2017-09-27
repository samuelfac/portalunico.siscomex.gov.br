
package br.gov.siscomex.portalunico.due;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class DadosResumidosDUE implements Serializable
{

    private final static long serialVersionUID = -1410028088068863182L;

    @SerializedName("numeroDUE")
    @Expose
    private String numeroDUE;
    @SerializedName("numeroRUC")
    @Expose
    private String numeroRUC;
    @SerializedName("situacaoDUE")
    @Expose
    private Integer situacaoDUE;
    @SerializedName("dataSituacaoDUE")
    @Expose
    private String dataSituacaoDUE;
    @SerializedName("situacaoCarga")
    @Expose
    private List<Integer> situacaoCarga = null;
    @SerializedName("controleAdministrativo")
    @Expose
    private Integer controleAdministrativo;
    @SerializedName("indicadorBloqueio")
    @Expose
    private Integer indicadorBloqueio;
    @SerializedName("declarante")
    @Expose
    private Declarante declarante;
    @SerializedName("exportadores")
    @Expose
    private List<Exportadore> exportadores = null;
    @SerializedName("codigoRecintoAduaneiroDespacho")
    @Expose
    private String codigoRecintoAduaneiroDespacho;
    @SerializedName("coordenadasDespacho")
    @Expose
    private String coordenadasDespacho;
    @SerializedName("responsaveluaDespacho")
    @Expose
    private Object responsaveluaDespacho;
    @SerializedName("uaDespacho")
    @Expose
    private String uaDespacho;
    @SerializedName("codigoRecintoAduaneiroEmbarque")
    @Expose
    private String codigoRecintoAduaneiroEmbarque;
    @SerializedName("uaEmbarque")
    @Expose
    private String uaEmbarque;
}
