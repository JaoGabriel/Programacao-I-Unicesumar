import java.math.BigDecimal;

public class IngressoCamarote extends Ingresso{

    public IngressoCamarote(String nome, String cpf, Evento evento) {
        super(nome, cpf, evento);
    }

    @Override
    public BigDecimal CalcularValorIngresso() {
        return getEvento().ValorUnico.multiply(new BigDecimal(0.6));
    }

    @Override
    public Ingresso ImprimirValor() {
        Evento evento = getEvento();
        evento.setValorUnico(CalcularValorIngresso());

        return new IngressoCamarote(getNome(), getCpf(), evento);
    }

    @Override
    public String Resumo() {
        return super.Resumo();
    }
}
