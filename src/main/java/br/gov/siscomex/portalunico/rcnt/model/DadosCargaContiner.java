package br.gov.siscomex.portalunico.rcnt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosCargaContiner", propOrder =
        {"listaCnpjCliente", "listaManifestos", "listaLacres", "numeroConteiner", "cnpjTransportador", "idElemento", "codigoRecintoDestino"
        })

@XmlRootElement(name = "DadosCargaContiner")
public class DadosCargaContiner {

    @XmlElement(name = "listaCnpjCliente")
    @ApiModelProperty(value = "Lista CNPJ Cliente")
    @Valid
    /**
     * Lista CNPJ Cliente
     **/
    private List<DadosDoCnpjDoCliente> listaCnpjCliente = null;

    @XmlElement(name = "listaManifestos")
    @ApiModelProperty(value = "Lista de manifestos.")
    @Valid
    /**
     * Lista de manifestos.
     **/
    private List<DadosDoManifestoDaCargaSimplificado> listaManifestos = null;

    @XmlElement(name = "listaLacres")
    @ApiModelProperty(value = "Lista de lacres")
    @Valid
    /**
     * Lista de lacres
     **/
    private List<DadosDoLacre> listaLacres = null;

    @XmlElement(name = "numeroConteiner")
    @ApiModelProperty(value = "Número do contêiner a ser removido<br/>Tamanho: 200")
    /**
     * Número do contêiner a ser removido<br/>Tamanho: 200
     **/
    private String numeroConteiner = null;

    @XmlElement(name = "cnpjTransportador")
    @ApiModelProperty(example = "44444444444444", value = "CNPJ do transportador<br/>Tamanho: 14<br/>Formato: 'NNNNNNNNNNNNNN'")
    /**
     * CNPJ do transportador<br/>Tamanho: 14<br/>Formato: 'NNNNNNNNNNNNNN'
     **/
    private String cnpjTransportador = null;

    @XmlElement(name = "idElemento", required = true)
    @ApiModelProperty(required = true, value = "Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40")
    /**
     * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40
     **/
    private String idElemento = null;

    @XmlElement(name = "codigoRecintoDestino")
    @ApiModelProperty(example = "1111111", value = "Código Siscomex do recinto de destino.<br/>Tamanho: 15")
    /**
     * Código Siscomex do recinto de destino.<br/>Tamanho: 15
     **/
    private String codigoRecintoDestino = null;

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private static String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    /**
     * Lista CNPJ Cliente
     *
     * @return listaCnpjCliente
     **/
    @JsonProperty("listaCnpjCliente")
    public List<DadosDoCnpjDoCliente> getListaCnpjCliente() {
        return listaCnpjCliente;
    }

    public void setListaCnpjCliente(List<DadosDoCnpjDoCliente> listaCnpjCliente) {
        this.listaCnpjCliente = listaCnpjCliente;
    }

    public DadosCargaContiner listaCnpjCliente(List<DadosDoCnpjDoCliente> listaCnpjCliente) {
        this.listaCnpjCliente = listaCnpjCliente;
        return this;
    }

    public DadosCargaContiner addListaCnpjClienteItem(DadosDoCnpjDoCliente listaCnpjClienteItem) {
        this.listaCnpjCliente.add(listaCnpjClienteItem);
        return this;
    }

    /**
     * Lista de manifestos.
     *
     * @return listaManifestos
     **/
    @JsonProperty("listaManifestos")
    public List<DadosDoManifestoDaCargaSimplificado> getListaManifestos() {
        return listaManifestos;
    }

    public void setListaManifestos(List<DadosDoManifestoDaCargaSimplificado> listaManifestos) {
        this.listaManifestos = listaManifestos;
    }

    public DadosCargaContiner listaManifestos(List<DadosDoManifestoDaCargaSimplificado> listaManifestos) {
        this.listaManifestos = listaManifestos;
        return this;
    }

    public DadosCargaContiner addListaManifestosItem(DadosDoManifestoDaCargaSimplificado listaManifestosItem) {
        this.listaManifestos.add(listaManifestosItem);
        return this;
    }

    /**
     * Lista de lacres
     *
     * @return listaLacres
     **/
    @JsonProperty("listaLacres")
    public List<DadosDoLacre> getListaLacres() {
        return listaLacres;
    }

    public void setListaLacres(List<DadosDoLacre> listaLacres) {
        this.listaLacres = listaLacres;
    }

    public DadosCargaContiner listaLacres(List<DadosDoLacre> listaLacres) {
        this.listaLacres = listaLacres;
        return this;
    }

    public DadosCargaContiner addListaLacresItem(DadosDoLacre listaLacresItem) {
        this.listaLacres.add(listaLacresItem);
        return this;
    }

    /**
     * Número do contêiner a ser removido&lt;br/&gt;Tamanho: 200
     *
     * @return numeroConteiner
     **/
    @JsonProperty("numeroConteiner")
    public String getNumeroConteiner() {
        return numeroConteiner;
    }

    public void setNumeroConteiner(String numeroConteiner) {
        this.numeroConteiner = numeroConteiner;
    }

    public DadosCargaContiner numeroConteiner(String numeroConteiner) {
        this.numeroConteiner = numeroConteiner;
        return this;
    }

    /**
     * CNPJ do transportador&lt;br/&gt;Tamanho: 14&lt;br/&gt;Formato: &#39;NNNNNNNNNNNNNN&#39;
     *
     * @return cnpjTransportador
     **/
    @JsonProperty("cnpjTransportador")
    public String getCnpjTransportador() {
        return cnpjTransportador;
    }

    public void setCnpjTransportador(String cnpjTransportador) {
        this.cnpjTransportador = cnpjTransportador;
    }

    public DadosCargaContiner cnpjTransportador(String cnpjTransportador) {
        this.cnpjTransportador = cnpjTransportador;
        return this;
    }

    /**
     * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.&lt;br/&gt;Tamanho: 40
     *
     * @return idElemento
     **/
    @JsonProperty("idElemento")
    @NotNull
    public String getIdElemento() {
        return idElemento;
    }

    public void setIdElemento(String idElemento) {
        this.idElemento = idElemento;
    }

    public DadosCargaContiner idElemento(String idElemento) {
        this.idElemento = idElemento;
        return this;
    }

    /**
     * Código Siscomex do recinto de destino.&lt;br/&gt;Tamanho: 15
     *
     * @return codigoRecintoDestino
     **/
    @JsonProperty("codigoRecintoDestino")
    public String getCodigoRecintoDestino() {
        return codigoRecintoDestino;
    }

    public void setCodigoRecintoDestino(String codigoRecintoDestino) {
        this.codigoRecintoDestino = codigoRecintoDestino;
    }

    public DadosCargaContiner codigoRecintoDestino(String codigoRecintoDestino) {
        this.codigoRecintoDestino = codigoRecintoDestino;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DadosCargaContiner {\n" +
                "    listaCnpjCliente: " + toIndentedString(listaCnpjCliente) + "\n" +
                "    listaManifestos: " + toIndentedString(listaManifestos) + "\n" +
                "    listaLacres: " + toIndentedString(listaLacres) + "\n" +
                "    numeroConteiner: " + toIndentedString(numeroConteiner) + "\n" +
                "    cnpjTransportador: " + toIndentedString(cnpjTransportador) + "\n" +
                "    idElemento: " + toIndentedString(idElemento) + "\n" +
                "    codigoRecintoDestino: " + toIndentedString(codigoRecintoDestino) + "\n" +
                "}";
        return sb;
    }
}
