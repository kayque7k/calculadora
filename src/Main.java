import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("valor A");
            float valorA = scanner.nextFloat();

            System.out.println("valor B");
            float valorB = scanner.nextFloat();

            System.out.println("1 - soma\n2 - subtracao\n3 - multiplicao\n4 - divisao");
            int valorCalculo = scanner.nextInt();

            float calculo = calculo(valorA, valorB, valorCalculo);

            System.out.print("Resultado: " + calculo);
        } catch (Exception ex){
            main(args);
        }
    }

    static float calculo(float a, float b, int calculo) {
        switch (calculo) {
            case 1: return soma(a, b);
            case 2: return subtracao(a,b);
            case 3: return multiplar(a,b);
            case 4: return divisao(a, b);
            default: return soma(a, b);
        }
    }

    static float subtracao(float a, float b) {
        return a - b;
    }

    static float soma(float a, float b) {
        return a + b;
    }

    static float multiplar(float a, float b){
        return a * b;
    }

    static float divisao(float a, float b){
        return a / b;
    }
}