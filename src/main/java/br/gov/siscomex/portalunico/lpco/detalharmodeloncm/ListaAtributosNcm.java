
package br.gov.siscomex.portalunico.lpco.detalharmodeloncm;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListaAtributosNcm {

    @SerializedName("codigo")
    @Expose
    private String codigo;
    @SerializedName("nome")
    @Expose
    private String nome;
    @SerializedName("tipo")
    @Expose
    private ListaAtributosNcm.Tipo tipo;
    @SerializedName("validacao")
    @Expose
    private Validacao__1 validacao;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ListaAtributosNcm.Tipo getTipo() {
        return tipo;
    }

    public void setTipo(ListaAtributosNcm.Tipo tipo) {
        this.tipo = tipo;
    }

    public Validacao__1 getValidacao() {
        return validacao;
    }

    public void setValidacao(Validacao__1 validacao) {
        this.validacao = validacao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ListaAtributosNcm.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("codigo");
        sb.append('=');
        sb.append(((this.codigo == null)?"<null>":this.codigo));
        sb.append(',');
        sb.append("nome");
        sb.append('=');
        sb.append(((this.nome == null)?"<null>":this.nome));
        sb.append(',');
        sb.append("tipo");
        sb.append('=');
        sb.append(((this.tipo == null)?"<null>":this.tipo));
        sb.append(',');
        sb.append("validacao");
        sb.append('=');
        sb.append(((this.validacao == null)?"<null>":this.validacao));
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
        result = ((result* 31)+((this.codigo == null)? 0 :this.codigo.hashCode()));
        result = ((result* 31)+((this.nome == null)? 0 :this.nome.hashCode()));
        result = ((result* 31)+((this.tipo == null)? 0 :this.tipo.hashCode()));
        result = ((result* 31)+((this.validacao == null)? 0 :this.validacao.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListaAtributosNcm) == false) {
            return false;
        }
        ListaAtributosNcm rhs = ((ListaAtributosNcm) other);
        return (((((this.codigo == rhs.codigo)||((this.codigo!= null)&&this.codigo.equals(rhs.codigo)))&&((this.nome == rhs.nome)||((this.nome!= null)&&this.nome.equals(rhs.nome))))&&((this.tipo == rhs.tipo)||((this.tipo!= null)&&this.tipo.equals(rhs.tipo))))&&((this.validacao == rhs.validacao)||((this.validacao!= null)&&this.validacao.equals(rhs.validacao))));
    }

    public enum Tipo {

        @SerializedName("BOOLEANO")
        BOOLEANO("BOOLEANO"),
        @SerializedName("DATA")
        DATA("DATA"),
        @SerializedName("DATA_HORA")
        DATA_HORA("DATA_HORA"),
        @SerializedName("NUMERO_INTEIRO")
        NUMERO_INTEIRO("NUMERO_INTEIRO"),
        @SerializedName("NUMERO_REAL")
        NUMERO_REAL("NUMERO_REAL"),
        @SerializedName("TEXTO")
        TEXTO("TEXTO");
        private final String value;
        private final static Map<String, ListaAtributosNcm.Tipo> CONSTANTS = new HashMap<String, ListaAtributosNcm.Tipo>();

        static {
            for (ListaAtributosNcm.Tipo c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Tipo(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static ListaAtributosNcm.Tipo fromValue(String value) {
            ListaAtributosNcm.Tipo constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
