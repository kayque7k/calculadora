import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
        try {
            menu();
        } catch (Exception ex){
            main(args);
        }
    }

    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("Valor A");
        float valorA = scanner.nextFloat();
        System.out.println("Valor B");
        float valorB = scanner.nextFloat();
        System.out.println("+ = Soma\n/ = Divisao\n* = Multiplicacao\n- = Subtracao");
        char caracter = scanner.next().charAt(0);
        selecao(caracter,valorA, valorB);
    }

    public static void selecao(char caracter, float valorA, float valorB){
        float calculo = 0f;

        switch (caracter) {
            case '+': calculo = soma(valorA, valorB);
                break;
            case '-': calculo = subtracao(valorA, valorB);
                break;
            case '/': calculo = divisao(valorA, valorB);
                break;
            case '*': calculo = multiplicacao(valorA, valorB);
                break;
            default: calculo = 0f;
                break;
        }
        System.out.println("Resultado: " + calculo);
    }

    public static float soma(float valorA, float valorB){
        return valorA + valorB;
    }

    public static float subtracao(float valorA, float valorB){
        return valorA - valorB;
    }

    public static float multiplicacao(float valorA, float valorB){
        return valorA * valorB;
    }

    public static float divisao(float valorA, float valorB){
        return valorA / valorB;
    }
}
