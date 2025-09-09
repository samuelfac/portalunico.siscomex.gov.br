package br.gov.siscomex.portalunico.rcnt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosAgendaOperaoNaviosAeronavesChegada", propOrder =
        {"dataHoraSaida", "dataHoraChegada"
        })

@XmlRootElement(name = "DadosAgendaOperaoNaviosAeronavesChegada")
public class DadosAgendaOperaoNaviosAeronavesChegada {

    @XmlElement(name = "dataHoraSaida")
    @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", value = "Data e hora da desatracação do navio ou decolagem da aeronave. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
    /**
     * Data e hora da desatracação do navio ou decolagem da aeronave. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
     **/
    private String dataHoraSaida = null;

    @XmlElement(name = "dataHoraChegada")
    @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", value = "Data e hora da atracação do navio ou pouso da aeronave. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
    /**
     * Data e hora da atracação do navio ou pouso da aeronave. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
     **/
    private String dataHoraChegada = null;

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
     * Data e hora da desatracação do navio ou decolagem da aeronave. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.&lt;br/&gt;Formato: &#39;yyyy-MM-ddTHH:mm:ss.SSSZ&#39;
     *
     * @return dataHoraSaida
     **/
    @JsonProperty("dataHoraSaida")
    public String getDataHoraSaida() {
        return dataHoraSaida;
    }

    public void setDataHoraSaida(String dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }

    public DadosAgendaOperaoNaviosAeronavesChegada dataHoraSaida(String dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
        return this;
    }

    /**
     * Data e hora da atracação do navio ou pouso da aeronave. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.&lt;br/&gt;Formato: &#39;yyyy-MM-ddTHH:mm:ss.SSSZ&#39;
     *
     * @return dataHoraChegada
     **/
    @JsonProperty("dataHoraChegada")
    public String getDataHoraChegada() {
        return dataHoraChegada;
    }

    public void setDataHoraChegada(String dataHoraChegada) {
        this.dataHoraChegada = dataHoraChegada;
    }

    public DadosAgendaOperaoNaviosAeronavesChegada dataHoraChegada(String dataHoraChegada) {
        this.dataHoraChegada = dataHoraChegada;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DadosAgendaOperaoNaviosAeronavesChegada {\n" +
                "    dataHoraSaida: " + toIndentedString(dataHoraSaida) + "\n" +
                "    dataHoraChegada: " + toIndentedString(dataHoraChegada) + "\n" +
                "}";
        return sb;
    }
}
