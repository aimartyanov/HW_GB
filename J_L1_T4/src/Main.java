import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] ss;
        ss = s.split(" = | \\+ ");
        String q = ss[0];
        String w = ss[1];
        int e = Integer.parseInt(ss[2]);
        int q1;
        int w1;
        if(!(q.startsWith("?")) && (w.startsWith("?")))
        {
            q = String.valueOf(q.charAt(0));
            w = String.valueOf(w.charAt(1));
            q1 = (Integer.parseInt(q)*10);
            q1 = (Integer.parseInt(q)*10) + ((e - q1) / 10);
            w1 = ((e - q1) / 10)* 10 + Integer.parseInt(w);
        }
        else
        {
            q = String.valueOf(q.charAt(1));
            w = String.valueOf(w.charAt(0));
            w1 = (Integer.parseInt(w)*10);
            w1 = (Integer.parseInt(w)*10) + ((e - w1) / 10);
            q1 = ((e - w1) / 10)* 10 + Integer.parseInt(q);
        }
        if (q1 + w1 == e)
        {
            System.out.println(s);
            System.out.println(q1 + " + " + w1 + " = " + e);
        }
        else
            System.out.println("Нет решения");
    }
}