
package br.gov.siscomex.portalunico.carga.resposta.consultadueruc;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListaGranei {

    @SerializedName("tipoGranel")
    @Expose
    private Integer tipoGranel;
    @SerializedName("sgUnidadeMedida")
    @Expose
    private ListaGranei.SgUnidadeMedida sgUnidadeMedida;
    @SerializedName("quantidade")
    @Expose
    private Float quantidade;

    public Integer getTipoGranel() {
        return tipoGranel;
    }

    public void setTipoGranel(Integer tipoGranel) {
        this.tipoGranel = tipoGranel;
    }

    public ListaGranei.SgUnidadeMedida getSgUnidadeMedida() {
        return sgUnidadeMedida;
    }

    public void setSgUnidadeMedida(ListaGranei.SgUnidadeMedida sgUnidadeMedida) {
        this.sgUnidadeMedida = sgUnidadeMedida;
    }

    public Float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Float quantidade) {
        this.quantidade = quantidade;
    }

    public enum SgUnidadeMedida {

        @SerializedName("kg")
        KG("kg"),
        @SerializedName("m3")
        M_3("m3");
        private final String value;
        private final static Map<String, ListaGranei.SgUnidadeMedida> CONSTANTS = new HashMap<String, ListaGranei.SgUnidadeMedida>();

        static {
            for (ListaGranei.SgUnidadeMedida c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private SgUnidadeMedida(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static ListaGranei.SgUnidadeMedida fromValue(String value) {
            ListaGranei.SgUnidadeMedida constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            }
            return constant;
        }

    }

}
