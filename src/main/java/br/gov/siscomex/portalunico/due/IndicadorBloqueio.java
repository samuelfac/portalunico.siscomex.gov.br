package br.gov.siscomex.portalunico.due;

import com.google.gson.annotations.SerializedName;

public enum IndicadorBloqueio {
    @SerializedName("1")
    Bloqueado(1),

    @SerializedName("2")
    Desbloqueado(2);

    private final int value;
    public int getValue() {
        return value;
    }
    
    public String getDescricao() {
        return this.name();
    }

    private IndicadorBloqueio(int value) {
        this.value = value;
    }
}
