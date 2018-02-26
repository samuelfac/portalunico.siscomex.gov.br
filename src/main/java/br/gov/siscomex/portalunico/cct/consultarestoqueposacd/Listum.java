
package br.gov.siscomex.portalunico.cct.consultarestoqueposacd;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Listum {

    @SerializedName("anoCarga")
    @Expose
    private Integer anoCarga;
    @SerializedName("sequenciaCarga")
    @Expose
    private Integer sequenciaCarga;
    @SerializedName("codigoURF")
    @Expose
    private String codigoURF;
    @SerializedName("codigoRA")
    @Expose
    private String codigoRA;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("idResponsavel")
    @Expose
    private String idResponsavel;
    @SerializedName("nomeResponsavel")
    @Expose
    private String nomeResponsavel;
    @SerializedName("numeroDUE")
    @Expose
    private String numeroDUE;
    @SerializedName("numeroRUC")
    @Expose
    private String numeroRUC;
    @SerializedName("codigoPaisImportador")
    @Expose
    private Integer codigoPaisImportador;
    @SerializedName("nomePaisImportador")
    @Expose
    private String nomePaisImportador;
    @SerializedName("codigoSituacaoEspecial")
    @Expose
    private Integer codigoSituacaoEspecial;
    @SerializedName("nomeSituacaoEspecial")
    @Expose
    private String nomeSituacaoEspecial;
    @SerializedName("existeConteiner")
    @Expose
    private String existeConteiner;
    @SerializedName("situacaoEspecial")
    @Expose
    private String situacaoEspecial;

    public Integer getAnoCarga() {
        return anoCarga;
    }

    public void setAnoCarga(Integer anoCarga) {
        this.anoCarga = anoCarga;
    }

    public Integer getSequenciaCarga() {
        return sequenciaCarga;
    }

    public void setSequenciaCarga(Integer sequenciaCarga) {
        this.sequenciaCarga = sequenciaCarga;
    }

    public String getCodigoURF() {
        return codigoURF;
    }

    public void setCodigoURF(String codigoURF) {
        this.codigoURF = codigoURF;
    }

    public String getCodigoRA() {
        return codigoRA;
    }

    public void setCodigoRA(String codigoRA) {
        this.codigoRA = codigoRA;
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

    public String getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(String idResponsavel) {
        this.idResponsavel = idResponsavel;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getNumeroDUE() {
        return numeroDUE;
    }

    public void setNumeroDUE(String numeroDUE) {
        this.numeroDUE = numeroDUE;
    }

    public String getNumeroRUC() {
        return numeroRUC;
    }

    public void setNumeroRUC(String numeroRUC) {
        this.numeroRUC = numeroRUC;
    }

    public Integer getCodigoPaisImportador() {
        return codigoPaisImportador;
    }

    public void setCodigoPaisImportador(Integer codigoPaisImportador) {
        this.codigoPaisImportador = codigoPaisImportador;
    }

    public String getNomePaisImportador() {
        return nomePaisImportador;
    }

    public void setNomePaisImportador(String nomePaisImportador) {
        this.nomePaisImportador = nomePaisImportador;
    }

    public Integer getCodigoSituacaoEspecial() {
        return codigoSituacaoEspecial;
    }

    public void setCodigoSituacaoEspecial(Integer codigoSituacaoEspecial) {
        this.codigoSituacaoEspecial = codigoSituacaoEspecial;
    }

    public String getNomeSituacaoEspecial() {
        return nomeSituacaoEspecial;
    }

    public void setNomeSituacaoEspecial(String nomeSituacaoEspecial) {
        this.nomeSituacaoEspecial = nomeSituacaoEspecial;
    }

    public String getExisteConteiner() {
        return existeConteiner;
    }

    public void setExisteConteiner(String existeConteiner) {
        this.existeConteiner = existeConteiner;
    }

    public String getSituacaoEspecial() {
        return situacaoEspecial;
    }

    public void setSituacaoEspecial(String situacaoEspecial) {
        this.situacaoEspecial = situacaoEspecial;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Listum.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("anoCarga");
        sb.append('=');
        sb.append(((this.anoCarga == null)?"<null>":this.anoCarga));
        sb.append(',');
        sb.append("sequenciaCarga");
        sb.append('=');
        sb.append(((this.sequenciaCarga == null)?"<null>":this.sequenciaCarga));
        sb.append(',');
        sb.append("codigoURF");
        sb.append('=');
        sb.append(((this.codigoURF == null)?"<null>":this.codigoURF));
        sb.append(',');
        sb.append("codigoRA");
        sb.append('=');
        sb.append(((this.codigoRA == null)?"<null>":this.codigoRA));
        sb.append(',');
        sb.append("latitude");
        sb.append('=');
        sb.append(((this.latitude == null)?"<null>":this.latitude));
        sb.append(',');
        sb.append("longitude");
        sb.append('=');
        sb.append(((this.longitude == null)?"<null>":this.longitude));
        sb.append(',');
        sb.append("idResponsavel");
        sb.append('=');
        sb.append(((this.idResponsavel == null)?"<null>":this.idResponsavel));
        sb.append(',');
        sb.append("nomeResponsavel");
        sb.append('=');
        sb.append(((this.nomeResponsavel == null)?"<null>":this.nomeResponsavel));
        sb.append(',');
        sb.append("numeroDUE");
        sb.append('=');
        sb.append(((this.numeroDUE == null)?"<null>":this.numeroDUE));
        sb.append(',');
        sb.append("numeroRUC");
        sb.append('=');
        sb.append(((this.numeroRUC == null)?"<null>":this.numeroRUC));
        sb.append(',');
        sb.append("codigoPaisImportador");
        sb.append('=');
        sb.append(((this.codigoPaisImportador == null)?"<null>":this.codigoPaisImportador));
        sb.append(',');
        sb.append("nomePaisImportador");
        sb.append('=');
        sb.append(((this.nomePaisImportador == null)?"<null>":this.nomePaisImportador));
        sb.append(',');
        sb.append("codigoSituacaoEspecial");
        sb.append('=');
        sb.append(((this.codigoSituacaoEspecial == null)?"<null>":this.codigoSituacaoEspecial));
        sb.append(',');
        sb.append("nomeSituacaoEspecial");
        sb.append('=');
        sb.append(((this.nomeSituacaoEspecial == null)?"<null>":this.nomeSituacaoEspecial));
        sb.append(',');
        sb.append("existeConteiner");
        sb.append('=');
        sb.append(((this.existeConteiner == null)?"<null>":this.existeConteiner));
        sb.append(',');
        sb.append("situacaoEspecial");
        sb.append('=');
        sb.append(((this.situacaoEspecial == null)?"<null>":this.situacaoEspecial));
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
        result = ((result* 31)+((this.codigoURF == null)? 0 :this.codigoURF.hashCode()));
        result = ((result* 31)+((this.nomeSituacaoEspecial == null)? 0 :this.nomeSituacaoEspecial.hashCode()));
        result = ((result* 31)+((this.latitude == null)? 0 :this.latitude.hashCode()));
        result = ((result* 31)+((this.numeroRUC == null)? 0 :this.numeroRUC.hashCode()));
        result = ((result* 31)+((this.anoCarga == null)? 0 :this.anoCarga.hashCode()));
        result = ((result* 31)+((this.nomePaisImportador == null)? 0 :this.nomePaisImportador.hashCode()));
        result = ((result* 31)+((this.codigoRA == null)? 0 :this.codigoRA.hashCode()));
        result = ((result* 31)+((this.idResponsavel == null)? 0 :this.idResponsavel.hashCode()));
        result = ((result* 31)+((this.existeConteiner == null)? 0 :this.existeConteiner.hashCode()));
        result = ((result* 31)+((this.numeroDUE == null)? 0 :this.numeroDUE.hashCode()));
        result = ((result* 31)+((this.codigoSituacaoEspecial == null)? 0 :this.codigoSituacaoEspecial.hashCode()));
        result = ((result* 31)+((this.sequenciaCarga == null)? 0 :this.sequenciaCarga.hashCode()));
        result = ((result* 31)+((this.situacaoEspecial == null)? 0 :this.situacaoEspecial.hashCode()));
        result = ((result* 31)+((this.codigoPaisImportador == null)? 0 :this.codigoPaisImportador.hashCode()));
        result = ((result* 31)+((this.nomeResponsavel == null)? 0 :this.nomeResponsavel.hashCode()));
        result = ((result* 31)+((this.longitude == null)? 0 :this.longitude.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Listum) == false) {
            return false;
        }
        Listum rhs = ((Listum) other);
        return (((((((((((((((((this.codigoURF == rhs.codigoURF)||((this.codigoURF!= null)&&this.codigoURF.equals(rhs.codigoURF)))&&((this.nomeSituacaoEspecial == rhs.nomeSituacaoEspecial)||((this.nomeSituacaoEspecial!= null)&&this.nomeSituacaoEspecial.equals(rhs.nomeSituacaoEspecial))))&&((this.latitude == rhs.latitude)||((this.latitude!= null)&&this.latitude.equals(rhs.latitude))))&&((this.numeroRUC == rhs.numeroRUC)||((this.numeroRUC!= null)&&this.numeroRUC.equals(rhs.numeroRUC))))&&((this.anoCarga == rhs.anoCarga)||((this.anoCarga!= null)&&this.anoCarga.equals(rhs.anoCarga))))&&((this.nomePaisImportador == rhs.nomePaisImportador)||((this.nomePaisImportador!= null)&&this.nomePaisImportador.equals(rhs.nomePaisImportador))))&&((this.codigoRA == rhs.codigoRA)||((this.codigoRA!= null)&&this.codigoRA.equals(rhs.codigoRA))))&&((this.idResponsavel == rhs.idResponsavel)||((this.idResponsavel!= null)&&this.idResponsavel.equals(rhs.idResponsavel))))&&((this.existeConteiner == rhs.existeConteiner)||((this.existeConteiner!= null)&&this.existeConteiner.equals(rhs.existeConteiner))))&&((this.numeroDUE == rhs.numeroDUE)||((this.numeroDUE!= null)&&this.numeroDUE.equals(rhs.numeroDUE))))&&((this.codigoSituacaoEspecial == rhs.codigoSituacaoEspecial)||((this.codigoSituacaoEspecial!= null)&&this.codigoSituacaoEspecial.equals(rhs.codigoSituacaoEspecial))))&&((this.sequenciaCarga == rhs.sequenciaCarga)||((this.sequenciaCarga!= null)&&this.sequenciaCarga.equals(rhs.sequenciaCarga))))&&((this.situacaoEspecial == rhs.situacaoEspecial)||((this.situacaoEspecial!= null)&&this.situacaoEspecial.equals(rhs.situacaoEspecial))))&&((this.codigoPaisImportador == rhs.codigoPaisImportador)||((this.codigoPaisImportador!= null)&&this.codigoPaisImportador.equals(rhs.codigoPaisImportador))))&&((this.nomeResponsavel == rhs.nomeResponsavel)||((this.nomeResponsavel!= null)&&this.nomeResponsavel.equals(rhs.nomeResponsavel))))&&((this.longitude == rhs.longitude)||((this.longitude!= null)&&this.longitude.equals(rhs.longitude))));
    }

}
