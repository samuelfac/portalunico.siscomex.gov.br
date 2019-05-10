
package br.gov.siscomex.portalunico.cct.consultaestoquepreacdnfe;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConsultaEstoquePreAcdNfe {

    @SerializedName("estoqueNotasFiscais")
    @Expose
    private List<EstoqueNotasFiscai> estoqueNotasFiscais = new ArrayList<EstoqueNotasFiscai>();

    public List<EstoqueNotasFiscai> getEstoqueNotasFiscais() {
        return estoqueNotasFiscais;
    }

    public void setEstoqueNotasFiscais(List<EstoqueNotasFiscai> estoqueNotasFiscais) {
        this.estoqueNotasFiscais = estoqueNotasFiscais;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConsultaEstoquePreAcdNfe.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("estoqueNotasFiscais");
        sb.append('=');
        sb.append(((this.estoqueNotasFiscais == null)?"<null>":this.estoqueNotasFiscais));
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
        result = ((result* 31)+((this.estoqueNotasFiscais == null)? 0 :this.estoqueNotasFiscais.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConsultaEstoquePreAcdNfe) == false) {
            return false;
        }
        ConsultaEstoquePreAcdNfe rhs = ((ConsultaEstoquePreAcdNfe) other);
        return ((this.estoqueNotasFiscais == rhs.estoqueNotasFiscais)||((this.estoqueNotasFiscais!= null)&&this.estoqueNotasFiscais.equals(rhs.estoqueNotasFiscais)));
    }

}
