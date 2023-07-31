import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args){
        // масса (кг) / рост2
//        System.out.println("Добро пожаловать в калькулятор BMI!");
//        System.out.println("BMI: " + 60.0 / (164 * 164));
        System.out.println("Градусы по Фаренгейту");
        System.out.println("Введите градусы по Цельсию");
        double c = new Scanner(System.in).nextDouble();
        System.out.println("F: " + (c * 1.8 + 32));
//        System.out.println("В рублях: 200");
//        System.out.println("В долларах: " + 200.0 * (1/92.06));
//        System.out.println("В евро: " + 200.0 * (1/99.95));
    }
}