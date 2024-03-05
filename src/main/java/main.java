import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String str  = in.nextLine();
        in.close();
        String[] parts = str.split(" ");
        String numstr0, numstr1, numstr2;
        numstr0 = parts[0];
        numstr1 = parts[1];
        numstr2 = parts[2];
        int debugNum;
        try {
            debugNum = Integer.parseInt(numstr0);
        } catch (NumberFormatException e) {
            System.out.print("Человек, это не число, я отключаюсь! ");
            return;
        }


        try {
            debugNum = Integer.parseInt(numstr2);
        } catch (NumberFormatException e) {
            System.out.print("Человек, это не число, я отключаюсь! ");
            return;
        }
        int num0 = Integer.parseInt(numstr0);
        int num2 = Integer.parseInt(numstr2);
        
        switch (numstr1) {
            case "+":{
                int res0 = num0 + num2;
                System.out.print("Вот результат: " + res0);
                break;}
            case "-":
                int res1 = num0 - num2;
                System.out.print("Вот результат: " + res1);
                break;
            case "*":
                int res2 = num0 * num2;
                System.out.print("Вот результат: " + res2);
                break;
            case "/":
            if (num2 == 0){
                System.out.print("Я не буду делить на ноль, пока, человек! ");
                break;
            }
                int res3 = num0 / num2;
                System.out.print("Вот результат: " + res3);
                break;
            default:{
                System.out.print("А где знак операции, человек?!");
                break;
                }

        }


    }
}
