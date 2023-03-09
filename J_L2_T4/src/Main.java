import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.FileHandler;
import java.util.logging.*;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Logger logger = Logger.getLogger(Main.class.getName());
        FileHandler fh = new FileHandler("log.xml", true);
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Ввод");
        System.out.println("Введите первое число:");
        double a = Double.parseDouble(reader.readLine());
        logger.info("Ввод");
        System.out.println("Введите второе число:");
        double b = Double.parseDouble(reader.readLine());
        logger.info("Ввод");
        System.out.println("Введите оператор: +,-,/,*");
        String op = reader.readLine();
        double ans = 1;
        logger.info("Отработка switch");
        switch (op)
        {

            case "+" ->
            {
                logger.info("Сложение");
                ans = a + b;
                System.out.println(ans);
            }
            case "-" ->
            {
                logger.info("Вычитание");
                ans = a - b;
                System.out.println(ans);
            }
            case "/" ->
            {
                logger.info("Деление");
                ans = a / b;
                if (ans % 2 != 1 && ans % 2 != 0)
                    System.out.format("%.2f", ans);
                else
                    System.out.println((int) ans);
            }
            case "*" ->
            {
                logger.info("Умножение");
                ans = a * b;
                System.out.println((int) ans);
            }
            default ->
            {
                logger.setLevel(Level.WARNING);
                logger.warning("Ошибка оператора");
                System.out.println("Invalid operator");
            }
        }
        logger.setLevel(Level.INFO);
        logger.info("Заверщение");
    }
}