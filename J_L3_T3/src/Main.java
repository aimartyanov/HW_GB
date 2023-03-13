import java.util.ArrayList;
import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> array = new ArrayList<>(Arrays.stream(new int[]{1,2,3,4,5,6,80}).boxed().toList());
        int min = array.get(0);
        int max = array.get(0);
        double av = 0;
        for (int i = 0; i < array.size();i++)
        {
            if (array.get(i) <= min)
            {
                min = array.get(i);
            }
            if(array.get(i) >= max)
            {
                max = array.get(i);
            }
            av = (av + array.get(i))/array.size();
        }
        System.out.println(min);
        System.out.println(max);
        System.out.format("%.2f", av);
    }
}