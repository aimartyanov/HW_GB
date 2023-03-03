import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        var a = reader.readLine();
        var b = reader.readLine();
        var c = reader.readLine();
        double monthString = switch (c)
        {
            case "+" -> a + b;
            case "-" -> "February";
            case "/" -> "March";
            case "*" -> "April";
            case "%" -> "May";
            case "//" -> "June";
            case "sqr" -> "July";
            case "sqrt" -> "August";
            default -> "Invalid operator";
        };
        System.out.println(monthString);
    }
}
