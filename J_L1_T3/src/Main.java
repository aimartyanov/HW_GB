import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число:");
        double a = Double.parseDouble(reader.readLine());
        System.out.println("Введите второе число:");
        double b = Double.parseDouble(reader.readLine());
        System.out.println("Введите оператор: +,-,/,*");
        String op = reader.readLine();
        double ans = 1;
        switch (op)
        {
            case "+" ->
            {
                ans = a + b;
                if (ans % 2 != 1 && ans % 2 != 0)
                    System.out.format("%.2f", ans);
                else
                    System.out.println((int) ans);
            }
            case "-" ->
            {
                ans = a - b;
                if (ans % 2 != 1 && ans % 2 != 0)
                    System.out.format("%.2f", ans);
                else
                    System.out.println((int) ans);
            }
            case "/" ->
            {
                ans = a / b;
                if (ans % 2 != 1 && ans % 2 != 0)
                    System.out.format("%.2f", ans);
                else
                    System.out.println((int) ans);
            }
            case "*" ->
            {
                ans = a * b;
                if (ans % 2 != 1 && ans % 2 != 0)
                    System.out.format("%.2f", ans);
                else
                    System.out.println((int) ans);
            }
            default -> System.out.println("Invalid operator");
        }

    }
}