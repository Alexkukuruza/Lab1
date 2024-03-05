import java.util.Scanner;

public class Calculator {
    String op;
    int num0;
    int num2;
    int result;

    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        myCalc.readTerminalString();
        myCalc.calcResult();
        myCalc.setTerminalResult();
    }

    public void readTerminalString() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String str = in.nextLine();
        in.close();
        String[] parts = str.split(" ");

        try {
            num0 = Integer.parseInt(parts[0]);
            num2 = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            System.out.print("Человек, это не число, я отключаюсь! ");
            return;
        }
        op = parts[1];
    }

    public void setTerminalResult() {
        System.out.println("Вот результат: " + result);
    }

    private void calcResult() {
        switch (op) {
            case "+": {
                result = num0 + num2;
                break;
            }
            case "-":
                result = num0 - num2;

                break;
            case "*":
                result = num0 * num2;

                break;
            case "/":
                if (num2 == 0) {
                    System.out.print("Я не буду делить на ноль, пока, человек! ");
                    break;
                }
                result = num0 / num2;
                break;
            default: {
                System.out.print("А где знак операции, человек?!");
                break;
            }

        }

    }

}
