import java.util.ArrayList;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> oddArray = new ArrayList<>(Arrays.stream(new int[]{1,2,3,4,5,6,8,1800,785,365,88}).boxed().toList());
        oddArray.removeIf(i -> (i % 2 == 0));
        for (Integer integer : oddArray)
        {
            System.out.println(integer);
        }
    }
}