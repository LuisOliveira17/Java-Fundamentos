package model;

import java.time.Duration;
import java.time.LocalDateTime;

public class Registro {
    private Veiculo veiculo;
    LocalDateTime entrada;
    LocalDateTime saida;
    private double valorPago;

    public Registro(Veiculo veiculo){
        this.veiculo=veiculo;
        this.entrada=LocalDateTime.now();
    }
    public Duration calcularTempo(){
        return Duration.between(entrada,saida);
    }

    public void setSaida(LocalDateTime saida) {
        this.saida = saida;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public LocalDateTime getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDateTime entrada) {
        this.entrada = entrada;
    }

    public LocalDateTime getSaida() {
        return saida;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }
}
