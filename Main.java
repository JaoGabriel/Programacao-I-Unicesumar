import java.util.Scanner;

public class Main {
    int menu, valor1, valor2 = -1;

    System.out.println("--- Escolha as opcoes: ---  \n");
 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
    
        while (menu != 0){
        var userInput = Console.ReadLine();
    menu = Convert.ToInt32(userInput);
       
    switch (menu)
    {
        case 1:
        { Console.WriteLine("Digite o valor  1");
            var valor1Input = Console.ReadLine();
            valor1 = Convert.ToInt32(valor1Input);
             Console.WriteLine("D igite o valor 2");
            var valor2Input = Console.ReadLine();
            valor2= Convert.ToInt32(valor2Input);

            Console.WriteLine($"Resultado: {Soma(valor1, valor2)}");
            break;
        }
        case 2:
        {
            Console.WriteLine("Digite o valor 1");
            var valor1Input = Console.ReadLine();
            valor1 = Convert.ToInt32(valor1Input);
            
            Console.WriteLine("Digite o valor 2");
            var valor2Input = Console.ReadLine();
            valor2= Convert.ToInt32(valor2Input);

            Console.WriteLine($"Resultado: {Subtracao(valor1, valor2)}");
            break;
        }
        case 3:
        {
            Console.WriteLine("Digite o valor 1");
            var valor1Input = Console.ReadLine();
            valor1 = Convert.ToInt32(valor1Input);
            
            Console.WriteLine("Digite o valor 2");
            var valor2Input = Console.ReadLine();
            valor2= Convert.ToInt32(valor2Input);

            Console.WriteLine($"Resultado: {Multiplicacao(valor1, valor2)}");
            break;
        }
        case 4:
        {
            Console.WriteLine("Digite o valor 1");
            var valor1Input = Console.ReadLine();
            valor1 = Convert.ToInt32(valor1Input);
            
            Console.WriteLine("Digite o valor 2");
            var valor2Input = Console.ReadLine();
            valor2= Convert.ToInt32(valor2Input);

            Console.WriteLine($"Resultado: {Divisao(valor1, valor2)}");
            break;
        }
        case 5:
        {
            Console.WriteLine("Digite o valor");
            var valor1Input = Console.ReadLine();
            valor1 = Convert.ToInt32(valor1Input);
            
            Console.WriteLine($"Resultado: {Quadrado(valor1)}");
            break;
        }
        default:
            Console.WriteLine("Escolha uma opcao valida.");
            break;
    }
    
}

        public static void ImprimirMenu(){
            List<String> opcoes = Menu();
            for (String opcao : opcoes){
                System.out.println(opcao);
            }
        }
    
        static List<String> Menu()
        {
            return new List<String>
            {
                "1 - Soma",
                "2 - Subtracao",
                "3 - Multiplicacao",
                "4 - Divisao",
                "5 - Quadrado",
                "0 - Sair"
            };
        }
}