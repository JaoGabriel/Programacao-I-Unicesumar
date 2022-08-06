import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- Escolha as opcoes: ---  \n");
        Integer menu = 10;
        Double valor1,valor2;
        Scanner scanner = new Scanner(System.in);

        while (menu != 0) {
            ImprimirMenu();

            menu = scanner.nextInt();

            switch (menu) {
                case 1: {
                    System.out.println("Digite o valor  1");
                    valor1 = scanner.nextDouble();
                    System.out.println("Digite o valor 2");
                    valor2 = scanner.nextDouble();
                    Double resultado = Soma(valor1,valor2);

                    System.out.println("Resultado: " + resultado); 
                    break;
                }
                case 2: {
                    System.out.println("Digite o valor  1");
                    valor1 = scanner.nextDouble();
                    System.out.println("Digite o valor 2");
                    valor2 = scanner.nextDouble();
                    Double resultado = Subtracao(valor1,valor2);

                    System.out.println("Resultado: " + resultado); 
                    break;
                }
                case 3: {
                    System.out.println("Digite o valor  1");
                    valor1 = scanner.nextDouble();
                    System.out.println("Digite o valor 2");
                    valor2 = scanner.nextDouble();
                    Double resultado = Multiplicacao(valor1,valor2);

                    System.out.println("Resultado: " + resultado); 
                    break;
                }
                case 4: {
                    System.out.println("Digite o valor  1");
                    valor1 = scanner.nextDouble();
                    System.out.println("Digite o valor 2");
                    valor2 = scanner.nextDouble();
                    Double resultado = Divisao(valor1,valor2);

                    System.out.println("Resultado: " + resultado); 
                    break;
                }
                case 5: {
                    System.out.println("Digite o valor  1");
                    valor1 = scanner.nextDouble();
                    Double resultado = Quadrado(valor1);

                    System.out.println("Resultado: " + resultado); 
                    break;
                }
                default:
                    System.out.println("Escolha uma opcao valida.");
                    break;
            }

        }
    }

    public static void ImprimirMenu () {
        String[] opcoes = Menu();
        for (String opcao : opcoes) {
            System.out.println(opcao);
        }
    }

    static String[] Menu()
{
    return new String[] 
    {
        "1 - Soma",
        "2 - Subtracao",
        "3 - Multiplicacao",
        "4 - Divisao",
        "5 - Quadrado",
        "0 - Sair"
    };
}

static Double Soma(Double valor1, Double valor2)
{
return valor1 + valor2;
}
static Double Subtracao(Double valor1, Double valor2)
{
return valor1 - valor2;
}

static Double Multiplicacao(Double valor1, Double valor2)
{
return valor1 * valor2;
}

static Double Divisao(Double valor1, Double valor2)
{
return valor1 / valor2;
}

static Double Quadrado(Double valor){
return valor * valor;
}
}