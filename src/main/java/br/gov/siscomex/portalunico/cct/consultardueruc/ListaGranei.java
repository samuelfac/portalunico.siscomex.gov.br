
package br.gov.siscomex.portalunico.cct.consultardueruc;

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
    private Double quantidade;

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

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ListaGranei.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tipoGranel");
        sb.append('=');
        sb.append(((this.tipoGranel == null)?"<null>":this.tipoGranel));
        sb.append(',');
        sb.append("sgUnidadeMedida");
        sb.append('=');
        sb.append(((this.sgUnidadeMedida == null)?"<null>":this.sgUnidadeMedida));
        sb.append(',');
        sb.append("quantidade");
        sb.append('=');
        sb.append(((this.quantidade == null)?"<null>":this.quantidade));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.sgUnidadeMedida == null)? 0 :this.sgUnidadeMedida.hashCode()));
        result = ((result* 31)+((this.quantidade == null)? 0 :this.quantidade.hashCode()));
        result = ((result* 31)+((this.tipoGranel == null)? 0 :this.tipoGranel.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListaGranei) == false) {
            return false;
        }
        ListaGranei rhs = ((ListaGranei) other);
        return ((((this.sgUnidadeMedida == rhs.sgUnidadeMedida)||((this.sgUnidadeMedida!= null)&&this.sgUnidadeMedida.equals(rhs.sgUnidadeMedida)))&&((this.quantidade == rhs.quantidade)||((this.quantidade!= null)&&this.quantidade.equals(rhs.quantidade))))&&((this.tipoGranel == rhs.tipoGranel)||((this.tipoGranel!= null)&&this.tipoGranel.equals(rhs.tipoGranel))));
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
            } else {
                return constant;
            }
        }

    }

}
