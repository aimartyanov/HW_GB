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
int min = array[0] ;
int max = array[0];
for (int i = 0; i < array.Length; i++)
{

if (array[i] > max)
{
    max = array[i];
}
if (array[i] < min)
{
    min = array [i];
}
}
Print(array);
Console.WriteLine($"Максимальное значение {max}, минимальное значение {min}");
Console.WriteLine($"Разница между максимальным и миниальным значением массива:  {max - min}");