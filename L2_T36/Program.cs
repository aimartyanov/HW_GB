void ArrNum(int[] array)
{
    for(int i = 0; i < array.Length; i++)
        {
            array[i] = new Random().Next(1,10);
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
int Summ(int[] array)
{
int summ = 0;
for (int i = 0; i < array.Length; i++)
{
if (i% 2 != 0)
{
    summ+=array[i];
}
}
return summ;
}
Print(array);
Console.WriteLine($"Сумма цисел на нечетных позициях {Summ(array)}");
