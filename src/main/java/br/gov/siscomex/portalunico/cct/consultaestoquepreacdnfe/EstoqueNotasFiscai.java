
package br.gov.siscomex.portalunico.cct.consultaestoquepreacdnfe;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EstoqueNotasFiscai {

    @SerializedName("numero")
    @Expose
    private String numero;
    @SerializedName("urf")
    @Expose
    private String urf;
    @SerializedName("recinto")
    @Expose
    private String recinto;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("registro")
    @Expose
    private String registro;
    @SerializedName("responsavel")
    @Expose
    private String responsavel;
    @SerializedName("itens")
    @Expose
    private List<Iten> itens = new ArrayList<Iten>();

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getUrf() {
        return urf;
    }

    public void setUrf(String urf) {
        this.urf = urf;
    }

    public String getRecinto() {
        return recinto;
    }

    public void setRecinto(String recinto) {
        this.recinto = recinto;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public List<Iten> getItens() {
        return itens;
    }

    public void setItens(List<Iten> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EstoqueNotasFiscai.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("numero");
        sb.append('=');
        sb.append(((this.numero == null)?"<null>":this.numero));
        sb.append(',');
        sb.append("urf");
        sb.append('=');
        sb.append(((this.urf == null)?"<null>":this.urf));
        sb.append(',');
        sb.append("recinto");
        sb.append('=');
        sb.append(((this.recinto == null)?"<null>":this.recinto));
        sb.append(',');
        sb.append("latitude");
        sb.append('=');
        sb.append(((this.latitude == null)?"<null>":this.latitude));
        sb.append(',');
        sb.append("longitude");
        sb.append('=');
        sb.append(((this.longitude == null)?"<null>":this.longitude));
        sb.append(',');
        sb.append("registro");
        sb.append('=');
        sb.append(((this.registro == null)?"<null>":this.registro));
        sb.append(',');
        sb.append("responsavel");
        sb.append('=');
        sb.append(((this.responsavel == null)?"<null>":this.responsavel));
        sb.append(',');
        sb.append("itens");
        sb.append('=');
        sb.append(((this.itens == null)?"<null>":this.itens));
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
        result = ((result* 31)+((this.itens == null)? 0 :this.itens.hashCode()));
        result = ((result* 31)+((this.numero == null)? 0 :this.numero.hashCode()));
        result = ((result* 31)+((this.recinto == null)? 0 :this.recinto.hashCode()));
        result = ((result* 31)+((this.latitude == null)? 0 :this.latitude.hashCode()));
        result = ((result* 31)+((this.urf == null)? 0 :this.urf.hashCode()));
        result = ((result* 31)+((this.responsavel == null)? 0 :this.responsavel.hashCode()));
        result = ((result* 31)+((this.longitude == null)? 0 :this.longitude.hashCode()));
        result = ((result* 31)+((this.registro == null)? 0 :this.registro.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EstoqueNotasFiscai) == false) {
            return false;
        }
        EstoqueNotasFiscai rhs = ((EstoqueNotasFiscai) other);
        return (((((((((this.itens == rhs.itens)||((this.itens!= null)&&this.itens.equals(rhs.itens)))&&((this.numero == rhs.numero)||((this.numero!= null)&&this.numero.equals(rhs.numero))))&&((this.recinto == rhs.recinto)||((this.recinto!= null)&&this.recinto.equals(rhs.recinto))))&&((this.latitude == rhs.latitude)||((this.latitude!= null)&&this.latitude.equals(rhs.latitude))))&&((this.urf == rhs.urf)||((this.urf!= null)&&this.urf.equals(rhs.urf))))&&((this.responsavel == rhs.responsavel)||((this.responsavel!= null)&&this.responsavel.equals(rhs.responsavel))))&&((this.longitude == rhs.longitude)||((this.longitude!= null)&&this.longitude.equals(rhs.longitude))))&&((this.registro == rhs.registro)||((this.registro!= null)&&this.registro.equals(rhs.registro))));
    }

}
