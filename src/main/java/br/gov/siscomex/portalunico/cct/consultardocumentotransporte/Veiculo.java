
package br.gov.siscomex.portalunico.cct.consultardocumentotransporte;

import java.util.LinkedHashSet;
import java.util.Set;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Veiculo {

    @SerializedName("nomeCondutor")
    @Expose
    private String nomeCondutor;
    @SerializedName("cpfCondutor")
    @Expose
    private String cpfCondutor;
    @SerializedName("documentoCondutor")
    @Expose
    private String documentoCondutor;
    @SerializedName("placa")
    @Expose
    private String placa;
    @SerializedName("tara")
    @Expose
    private Double tara;
    @SerializedName("lacres")
    @Expose
    private Set<String> lacres = new LinkedHashSet<String>();

    public String getNomeCondutor() {
        return nomeCondutor;
    }

    public void setNomeCondutor(String nomeCondutor) {
        this.nomeCondutor = nomeCondutor;
    }

    public String getCpfCondutor() {
        return cpfCondutor;
    }

    public void setCpfCondutor(String cpfCondutor) {
        this.cpfCondutor = cpfCondutor;
    }

    public String getDocumentoCondutor() {
        return documentoCondutor;
    }

    public void setDocumentoCondutor(String documentoCondutor) {
        this.documentoCondutor = documentoCondutor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Double getTara() {
        return tara;
    }

    public void setTara(Double tara) {
        this.tara = tara;
    }

    public Set<String> getLacres() {
        return lacres;
    }

    public void setLacres(Set<String> lacres) {
        this.lacres = lacres;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Veiculo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("nomeCondutor");
        sb.append('=');
        sb.append(((this.nomeCondutor == null)?"<null>":this.nomeCondutor));
        sb.append(',');
        sb.append("cpfCondutor");
        sb.append('=');
        sb.append(((this.cpfCondutor == null)?"<null>":this.cpfCondutor));
        sb.append(',');
        sb.append("documentoCondutor");
        sb.append('=');
        sb.append(((this.documentoCondutor == null)?"<null>":this.documentoCondutor));
        sb.append(',');
        sb.append("placa");
        sb.append('=');
        sb.append(((this.placa == null)?"<null>":this.placa));
        sb.append(',');
        sb.append("tara");
        sb.append('=');
        sb.append(((this.tara == null)?"<null>":this.tara));
        sb.append(',');
        sb.append("lacres");
        sb.append('=');
        sb.append(((this.lacres == null)?"<null>":this.lacres));
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
        result = ((result* 31)+((this.documentoCondutor == null)? 0 :this.documentoCondutor.hashCode()));
        result = ((result* 31)+((this.lacres == null)? 0 :this.lacres.hashCode()));
        result = ((result* 31)+((this.tara == null)? 0 :this.tara.hashCode()));
        result = ((result* 31)+((this.cpfCondutor == null)? 0 :this.cpfCondutor.hashCode()));
        result = ((result* 31)+((this.nomeCondutor == null)? 0 :this.nomeCondutor.hashCode()));
        result = ((result* 31)+((this.placa == null)? 0 :this.placa.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Veiculo) == false) {
            return false;
        }
        Veiculo rhs = ((Veiculo) other);
        return (((((((this.documentoCondutor == rhs.documentoCondutor)||((this.documentoCondutor!= null)&&this.documentoCondutor.equals(rhs.documentoCondutor)))&&((this.lacres == rhs.lacres)||((this.lacres!= null)&&this.lacres.equals(rhs.lacres))))&&((this.tara == rhs.tara)||((this.tara!= null)&&this.tara.equals(rhs.tara))))&&((this.cpfCondutor == rhs.cpfCondutor)||((this.cpfCondutor!= null)&&this.cpfCondutor.equals(rhs.cpfCondutor))))&&((this.nomeCondutor == rhs.nomeCondutor)||((this.nomeCondutor!= null)&&this.nomeCondutor.equals(rhs.nomeCondutor))))&&((this.placa == rhs.placa)||((this.placa!= null)&&this.placa.equals(rhs.placa))));
    }

}
