package br.gov.siscomex.portalunico.due;

import com.google.gson.annotations.SerializedName;

public enum ControleAdministrativo {
    @SerializedName("1")
    Dispensado(1);
    
    private final int value;
    
    public int getValue() {
        return value;
    }
    
    public String getDescricao() {
        return this.name();
    }

    private ControleAdministrativo(int value) {
        this.value = value;
    }
}
