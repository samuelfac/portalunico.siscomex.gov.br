
package br.gov.siscomex.portalunico.catp.produtoconsultarretorno;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProdutoConsultarRetorno {

    @SerializedName("items")
    @Expose
    private Items items;

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProdutoConsultarRetorno.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("items");
        sb.append('=');
        sb.append(((this.items == null)?"<null>":this.items));
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
        result = ((result* 31)+((this.items == null)? 0 :this.items.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProdutoConsultarRetorno) == false) {
            return false;
        }
        ProdutoConsultarRetorno rhs = ((ProdutoConsultarRetorno) other);
        return ((this.items == rhs.items)||((this.items!= null)&&this.items.equals(rhs.items)));
    }

}
