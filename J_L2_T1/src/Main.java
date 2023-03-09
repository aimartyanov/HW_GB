import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static void main(String[] args)
    {
        Map<String, String> query = new HashMap<>();
        query.put("name", "Ivanov");
        query.put("country", "Russia");
        query.put("city", "Moscow");
        query.put("age", null);
        System.out.println(getQuery(query));
    }
    public static String getQuery (Map < String, String > params)
    {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> pair : params.entrySet())
        {
            if (pair.getValue() != null)
            {
                sb.append(pair.getKey()).append(": ").append(pair.getValue()).append(", ");
            }
        }
        sb.delete(sb.toString().length() -2 , sb.toString().length());
        return sb.toString();
    }
}