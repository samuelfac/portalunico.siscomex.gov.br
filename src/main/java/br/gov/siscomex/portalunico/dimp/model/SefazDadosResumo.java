package br.gov.siscomex.portalunico.dimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SefazDadosResumo", propOrder =
        {"valorTotalMercadoriaLocalEmbarque", "dadosTributos", "pagamentosDebitoConta"
        })

@XmlRootElement(name = "SefazDadosResumo")
public class SefazDadosResumo {

    @XmlElement(name = "valorTotalMercadoriaLocalEmbarque")
    @ApiModelProperty(value = "")
    @Valid
    private ValoresDaMercadoriaNosLocais valorTotalMercadoriaLocalEmbarque = null;

    @XmlElement(name = "dadosTributos")
    @ApiModelProperty(value = "")
    @Valid
    private InformaesSobreOsTributos dadosTributos = null;

    @XmlElement(name = "pagamentosDebitoConta")
    @ApiModelProperty(value = "Lista de pagamentos realizados")
    @Valid
    /**
     * Lista de pagamentos realizados
     **/
    private List<SefazPagamentoCover> pagamentosDebitoConta = null;

    /**
     * Get valorTotalMercadoriaLocalEmbarque
     *
     * @return valorTotalMercadoriaLocalEmbarque
     **/
    @JsonProperty("valorTotalMercadoriaLocalEmbarque")
    public ValoresDaMercadoriaNosLocais getValorTotalMercadoriaLocalEmbarque() {
        return valorTotalMercadoriaLocalEmbarque;
    }

    public void setValorTotalMercadoriaLocalEmbarque(ValoresDaMercadoriaNosLocais valorTotalMercadoriaLocalEmbarque) {
        this.valorTotalMercadoriaLocalEmbarque = valorTotalMercadoriaLocalEmbarque;
    }

    public SefazDadosResumo valorTotalMercadoriaLocalEmbarque(ValoresDaMercadoriaNosLocais valorTotalMercadoriaLocalEmbarque) {
        this.valorTotalMercadoriaLocalEmbarque = valorTotalMercadoriaLocalEmbarque;
        return this;
    }

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
     * Get dadosTributos
     *
     * @return dadosTributos
     **/
    @JsonProperty("dadosTributos")
    public InformaesSobreOsTributos getDadosTributos() {
        return dadosTributos;
    }

    public void setDadosTributos(InformaesSobreOsTributos dadosTributos) {
        this.dadosTributos = dadosTributos;
    }

    /**
     * Lista de pagamentos realizados
     *
     * @return pagamentosDebitoConta
     **/
    @JsonProperty("pagamentosDebitoConta")
    public List<SefazPagamentoCover> getPagamentosDebitoConta() {
        return pagamentosDebitoConta;
    }

    public void setPagamentosDebitoConta(List<SefazPagamentoCover> pagamentosDebitoConta) {
        this.pagamentosDebitoConta = pagamentosDebitoConta;
    }

    public SefazDadosResumo pagamentosDebitoConta(List<SefazPagamentoCover> pagamentosDebitoConta) {
        this.pagamentosDebitoConta = pagamentosDebitoConta;
        return this;
    }

    public SefazDadosResumo addPagamentosDebitoContaItem(SefazPagamentoCover pagamentosDebitoContaItem) {
        this.pagamentosDebitoConta.add(pagamentosDebitoContaItem);
        return this;
    }

    public SefazDadosResumo dadosTributos(InformaesSobreOsTributos dadosTributos) {
        this.dadosTributos = dadosTributos;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class SefazDadosResumo {\n" +
                "    valorTotalMercadoriaLocalEmbarque: " + toIndentedString(valorTotalMercadoriaLocalEmbarque) + "\n" +
                "    dadosTributos: " + toIndentedString(dadosTributos) + "\n" +
                "    pagamentosDebitoConta: " + toIndentedString(pagamentosDebitoConta) + "\n" +
                "}";
        return sb;
    }
}
