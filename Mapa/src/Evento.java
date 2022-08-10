import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Evento {

    public String Nome;
    public String Data;
    public BigDecimal ValorUnico;
    public int CapacidadeMaxima;
    public static List<Ingresso> IngressosVendidos;

    public Evento(String nome, String data, BigDecimal valorUnico, int capacidadeMaxima) {
        Nome = nome;
        Data = data;
        ValorUnico = valorUnico;
        CapacidadeMaxima = capacidadeMaxima;
        IngressosVendidos = new ArrayList<>();
    }

    public String getNome() {
        return Nome;
    }

    public String getData() {
        return Data;
    }

    public BigDecimal getValorUnico() {
        return ValorUnico;
    }

    public void setValorUnico(BigDecimal valorUnico) {
        ValorUnico = valorUnico;
    }

    public int getCapacidadeMaxima() {
        return CapacidadeMaxima;
    }

    public int getIngressosVendidos() {
        return IngressosVendidos.size();
    }

    public String VenderIngresso(Ingresso ingresso){
        if(getIngressosVendidos() <= getCapacidadeMaxima()){
            IngressosVendidos.add(ingresso);
            return "Compra realizada com sucesso!";
        }

        return "Evento lotado! Sem ingressos disponiveis.";
    }

    public BigDecimal getValorVendas(){
        BigDecimal valorArrecadado = new BigDecimal(0);
        for(Ingresso ingresso : IngressosVendidos){
            valorArrecadado = valorArrecadado.add(ingresso.ImprimirValor().getEvento().getValorUnico());
        }

        return valorArrecadado;
    }
}
