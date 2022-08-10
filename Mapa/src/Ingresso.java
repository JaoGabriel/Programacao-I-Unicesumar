import java.math.BigDecimal;

public abstract class Ingresso {
    private static String Nome;
    private static String Cpf;
    private static Evento Evento;
    public Ingresso(String nome, String cpf, Evento evento) {
        Nome = nome;
        Cpf = cpf;
        Evento = evento;
    }

    public String getNome() {
        return Nome;
    }

    public String getCpf() {
        return Cpf;
    }
    public Evento getEvento() {
        return Evento;
    }

    public BigDecimal CalcularValorIngresso(){
        return getEvento().getValorUnico();
    }

    public String Resumo(){
        return String.format("Nome: %s, CPF: %s, Nome do evento: %s, Data do evento: %s",getNome(),getCpf(),getEvento().Nome,getEvento().Data);
    }

    public Ingresso ImprimirValor(){
        return null;
    }
}
