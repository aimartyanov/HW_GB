Console.Write("Введите размер ");
int m = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите размер ");
int n = Convert.ToInt32(Console.ReadLine());
void FillArray(double[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for(int j=0; j < array.GetLength(1); j++)
        {
            array[i,j] = Math.Round(new Random().NextDouble() * 20-10,2);
        }
    }
}
void PrintArray(double[,] array)
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
double[,] array = new double[m,n];
FillArray(array);
PrintArray(array);