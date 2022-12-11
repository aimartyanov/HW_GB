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
            array[i,j] = new Random().Next(1,20);
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
Console.WriteLine();
void PrintCommon(double[,] array)
{
double sr = 0;
for (int i = 0; i < array.GetLength(1); i++)
    {
        for(int j=0; j < array.GetLength(0);j++)
        {
            sr+=array[j,i]/array.GetLength(0);
        }
        Console.Write($"{Math.Round(sr,1)} ");
        sr = 0;
    }
    Console.WriteLine();
}
PrintCommon(array);