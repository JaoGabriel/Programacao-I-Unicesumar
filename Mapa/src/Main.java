import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        //Cria evento
        Evento evento = new Evento("Air Chakk","2022-08-30",new BigDecimal(100),3);

        do {
            System.out.println(String.format("Nome do evento: %s, Valor Ingresso: %.2f, Capacidade Maxima: %d, Data: %s", evento.getNome(),evento.getValorUnico(),
                    evento.getCapacidadeMaxima(),evento.getData()));
            System.out.println("Inicia a venda dos ingressos");

            IngressoPista ingressoPista = new IngressoPista("Teste Teste", "123.123.123.11", evento);
            System.out.println(ingressoPista.Resumo());
            evento.VenderIngresso(ingressoPista);
            System.out.println(String.format("Ingressos Vendidos: %d", evento.getIngressosVendidos()));
            System.out.println(String.format("Ingressos Disponiveis: %d", (evento.getCapacidadeMaxima() - evento.getIngressosVendidos())));

            IngressoVIP ingressoVip = new IngressoVIP("Teste Teste2", "123.123.123.12", evento);
            System.out.println(ingressoVip.Resumo());
            evento.VenderIngresso(ingressoVip);
            System.out.println(String.format("Ingressos Vendidos: %d", evento.getIngressosVendidos()));
            System.out.println(String.format("Ingressos Disponiveis: %d", (evento.getCapacidadeMaxima() - evento.getIngressosVendidos())));

            IngressoCamarote ingressoCamarote = new IngressoCamarote("Teste Teste3", "123.123.123.13", evento);
            System.out.println(ingressoCamarote.Resumo());
            evento.VenderIngresso(ingressoCamarote);
            System.out.println(String.format("Ingressos Vendidos: %d", evento.getIngressosVendidos()));
            System.out.println(String.format("Ingressos Disponiveis: %d", (evento.getCapacidadeMaxima() - evento.getIngressosVendidos())));

            System.out.println("Tenta a venda com ingressos esgotados");
            IngressoCamarote ingressoEsgotado = new IngressoCamarote("Teste Teste4", "123.123.123.14", evento);
            System.out.println(ingressoEsgotado.Resumo());
            evento.VenderIngresso(ingressoCamarote);

            System.out.println("Finaliza evento!");
            System.out.println(String.format("Valor Arrecadado: %.2f" , evento.getValorVendas()));
        }while (evento.getIngressosVendidos() < evento.getCapacidadeMaxima());
    }
}