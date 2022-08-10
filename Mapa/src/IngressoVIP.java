import java.math.BigDecimal;

public class IngressoVIP extends Ingresso{

    public IngressoVIP(String nome, String cpf, Evento evento) {
        super(nome, cpf, evento);
    }

    @Override
    public BigDecimal CalcularValorIngresso() {
        return getEvento().ValorUnico.multiply(new BigDecimal(0.3));
    }

    @Override
    public Ingresso ImprimirValor() {
        Evento evento = getEvento();
        evento.setValorUnico(CalcularValorIngresso());

        return new IngressoVIP(getNome(), getCpf(), evento);
    }

    @Override
    public String Resumo() {
        return super.Resumo();
    }
}
