void ArrNum(int[] array)
{
    for(int i = 0; i < array.Length; i++)
        {
            array[i] = new Random().Next(100,1000);
        }
}
void Print(int[] array)
{
    for(int i = 0; i < array.Length; i++)
    {
    Console.Write($"{array[i]} ");
    }
    Console.WriteLine();
}
int size = new Random().Next(4,20);
int[] array = new int[size];
ArrNum(array);
int Minarr(int[] array)
{
    int min = array[0];
    for (int i =0; i <array.Length;i++)
    {
        if (min > array[i])
        {
            min = array[i];
        }
    }
    return min;
}
int Maxarr(int[] array)
{
    int max = array[0];
    for (int i =0; i <array.Length;i++)
    {
        if (max < array[i])
        {
            max = array[i];
        }
    }
    return max;
}
Print(array);
Console.WriteLine($"Максимальное значение {Maxarr(array)}, минимальное значение {Minarr(array)}");
Console.WriteLine($"Разница между максимальным и миниальным значением массива:  {Maxarr(array) - Minarr(array)}");
