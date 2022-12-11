void FillArray(int[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for(int j=0; j < array.GetLength(1); j++)
        {
            array[i,j] = new Random().Next(1,20);
        }
    }
}
void PrintArray(int[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for(int j=0; j < array.GetLength(1);j++)
        {
            Console.Write($"{array[i,j]} ");
        }
        Console.WriteLine();
    }
}
void Check(int a, int b, int[,] array)
{
    
    if (a > array.GetLength(0)-1 && b > array.GetLength(1)-1)
    {
        Console.WriteLine($"{a} {b} такого числа нет");
    }
    else
    {
        Console.WriteLine(array[a,b]);
    }
}
int[,] array = new int[new Random().Next(2,7), new Random().Next(2,7)];
Console.Write("Введите позицию ");
int m = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите позицию ");
int n = Convert.ToInt32(Console.ReadLine());
FillArray(array);
PrintArray(array);
Console.WriteLine();
Check(m,n,array);
Console.WriteLine();