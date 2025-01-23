import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BigDecimal num1;
        BigDecimal num2;
        BigDecimal resultado;
        String operador;
        List<String> operadores = Arrays.asList("+", "-", "*", "/");

        while (true) {

            Scanner input = new Scanner(System.in);

            System.out.println("Digite um numero: ");
            num1 = input.nextBigDecimal();

            System.out.println("Digite outro numero: ");
            num2 = input.nextBigDecimal();

            System.out.print("Digite a operação que deseja: ");
            operador = input.next();

            while (!operadores.contains(operador)){
                System.out.println("Valor invalido!\n");
                System.out.print("Digite a operação que deseja: ");
                operador = input.next();
            }

            switch (operador) {
                case "+":
                    resultado = num1.add(num2);
                    System.out.printf("O resultado da soma é: " + resultado);
                    break;

                case "-":
                    resultado = num1.subtract(num2);
                    System.out.printf("O resultado da subtração é: " + resultado);
                    break;

                case "/":
                    resultado = num1.divide(num2, RoundingMode.HALF_DOWN);
                    System.out.printf("O resultado da divisão é: " + resultado);
                    break;

                case "*":
                    resultado = num1.multiply(num2);
                    System.out.printf("O resultado da multiplicação é: " + resultado);
                    break;
            }

            System.out.println("\nVocê deseja continuar? (S/N) ");
            String seguir = input.next();

            if (!seguir.equalsIgnoreCase("s")){
                break;
            }
        }
    }
}