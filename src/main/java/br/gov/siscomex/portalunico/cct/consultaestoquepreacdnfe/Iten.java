
package br.gov.siscomex.portalunico.cct.consultaestoquepreacdnfe;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Iten {

    @SerializedName("item")
    @Expose
    private Double item;
    @SerializedName("saldo")
    @Expose
    private Double saldo;

    public Double getItem() {
        return item;
    }

    public void setItem(Double item) {
        this.item = item;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Iten.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("item");
        sb.append('=');
        sb.append(((this.item == null)?"<null>":this.item));
        sb.append(',');
        sb.append("saldo");
        sb.append('=');
        sb.append(((this.saldo == null)?"<null>":this.saldo));
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
        result = ((result* 31)+((this.item == null)? 0 :this.item.hashCode()));
        result = ((result* 31)+((this.saldo == null)? 0 :this.saldo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Iten) == false) {
            return false;
        }
        Iten rhs = ((Iten) other);
        return (((this.item == rhs.item)||((this.item!= null)&&this.item.equals(rhs.item)))&&((this.saldo == rhs.saldo)||((this.saldo!= null)&&this.saldo.equals(rhs.saldo))));
    }

}
