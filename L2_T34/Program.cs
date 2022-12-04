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
int ArrCount(int[] array)
{
int count = 0;
for (int i = 0; i < array.Length; i++)
{
if (array[i] % 2 == 0)
{
count++;
}
}
return count;
}
Print(array);
Console.WriteLine($"Количество четных чисел {ArrCount(array)}");
