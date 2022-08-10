import java.math.BigDecimal;

public class IngressoPista extends Ingresso{

    public IngressoPista(String nome, String cpf, Evento evento) {
        super(nome, cpf, evento);
    }

    @Override
    public BigDecimal CalcularValorIngresso() {
        return getEvento().ValorUnico;
    }

    @Override
    public IngressoPista ImprimirValor() {
        Evento evento = getEvento();
        evento.setValorUnico(CalcularValorIngresso());

        return new IngressoPista(getNome(), getCpf(), evento);
    }

    @Override
    public String Resumo() {
        return super.Resumo();
    }
}
