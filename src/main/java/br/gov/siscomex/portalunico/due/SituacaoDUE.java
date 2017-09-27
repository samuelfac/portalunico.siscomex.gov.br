package br.gov.siscomex.portalunico.due;

import com.google.gson.annotations.SerializedName;

public enum SituacaoDUE {

    @SerializedName("1")
    Em_elaboração(1),

    @SerializedName("10")
    Registrada(10),

    @SerializedName("11")
    Declaração_Apresentada_para_Despacho(11),

    @SerializedName("20")
    Liberada_sem_conferência_Aduaneira_canal_verde(20),

    @SerializedName("21")
    Selecionada_para_conferência_canal_laranja_ou_vermelho(21),

    @SerializedName("25")
    Embarque_antecipado_autorizado(25),

    @SerializedName("26")
    Embarque_antecipado_pendente_de_autorização(26),

    @SerializedName("30")
    Em_análise_fiscal(30),

    @SerializedName("35")
    Concluída_análise_fiscal(35),

    @SerializedName("40")
    Desembaraçada(40),

    @SerializedName("70")
    Averbada(70),

    @SerializedName("80")
    Cancelada_pelo_Exportador(80),

    @SerializedName("81")
    Cancelada_por_Expiração_de_Prazo(81),

    @SerializedName("82")
    Cancelada_pela_Aduana(82),

    @SerializedName("83")
    Cancelada_pela_Aduana_a_pedido_do_exportador(83),

    @SerializedName("86")
    Interrompida(86);

    private final int value;

    public int getValue() {
        return value;
    }

    public String getDescricao() {
        return this.name().replaceAll("_", " ");
    }

    private SituacaoDUE(int value) {
        this.value = value;
    }
}
