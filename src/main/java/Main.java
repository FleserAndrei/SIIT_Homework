import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner line = new Scanner(System.in);

        System.out.println("Enter expression");

        String expression = line.nextLine();

        String[] splits = expression.split(" ");

        Calculator calculator = new Calculator();

        calculator.add(Integer.parseInt(splits[0]), splits[1]);
        for (int i = 2; i < splits.length; i += 3) {
            if (splits[i].equals("+")) {
                calculator.add(Integer.parseInt(splits[i + 1]), splits[i + 2]);
            }
            if (splits[i].equals("-")) {
                calculator.substract(Integer.parseInt(splits[i + 1]), splits[i + 2]);
            }

        }

        System.out.println("Result is: " + calculator.getResult());

    }

}
