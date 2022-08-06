// See https://aka.ms/new-console-template for more information

int menu,valor1,valor2 = -1;
Console.WriteLine("--- Calculadora --- \n");
Console.WriteLine("--- Escolha as opcoes: --- \n");

do
{
    var opcoes = Menu();
    foreach (var opcao in opcoes)
        Console.WriteLine(opcao);

    Console.WriteLine();
    
    var userInput = Console.ReadLine();
    menu = Convert.ToInt32(userInput);
    
    switch (menu)
    {
        case 1:
        {
            Console.WriteLine("Digite o valor 1");
            var valor1Input = Console.ReadLine();
            valor1 = Convert.ToInt32(valor1Input);
            
            Console.WriteLine("Digite o valor 2");
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
    
} while (menu != 0);

static List<string> Menu()
{
    return new List<string>
    {
        "1 - Soma",
        "2 - Subtracao",
        "3 - Multiplicacao",
        "4 - Divisao",
        "5 - Quadrado",
        "0 - Sair"
    };
}

static decimal Soma(decimal valor1, decimal valor2)
{
    return valor1 + valor2;
}

static decimal Subtracao(decimal valor1, decimal valor2)
{
    return valor1 - valor2;
}

static decimal Multiplicacao(decimal valor1, decimal valor2)
{
    return valor1 * valor2;
}

static decimal Divisao(decimal valor1, decimal valor2)
{
    return valor1 / valor2;
}

static decimal Quadrado(decimal valor)
{
    return valor * valor;
}