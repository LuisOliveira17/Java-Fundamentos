package model;

import java.time.Duration;
import java.time.LocalDateTime;

public class Registro {
    private Veiculo veiculo = new Veiculo();
    LocalDateTime entrada;
    LocalDateTime saida;
    private double valorPago;

    public Duration calcularTempo(){
        return Duration.between(entrada,saida);
    }

    public void setSaida(LocalDateTime saida) {
        this.saida = saida;
    }
}
