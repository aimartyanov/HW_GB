/*Задача 58: Задайте две матрицы. Напишите программу, которая будет находить произведение двух матриц.
Например, даны 2 матрицы:
2 4 | 3 4
3 2 | 3 3
Результирующая матрица будет:
18 20
15 18*/
Console.Write("Введите размер ");
int m = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите размер ");
int n = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите размер ");
int o = Convert.ToInt32(Console.ReadLine());
void FillArray(int[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            array[i, j] = new Random().Next(1, 20);
        }
    }

}
void PrintArray(int[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            Console.Write($"{array[i, j]} ");
        }
        Console.WriteLine();
    }
    Console.WriteLine();
}
int[,] Multiply(int[,] array, int[,] array2, int[,] result)
{
    for (int i = 0; i < result.GetLength(0); i++)
    {
        for (int j = 0; j < result.GetLength(1); j++)
        {
            int sum = 0;
            for (int k = 0; k < array.GetLength(1); k++)
            {
                sum += array[i, k] * array2[k, j];
            }
            result[i, j] = sum;
        }
    }
    return result;
}
int[,] array = new int[m, n];
int[,] array2 = new int[n, o];
int[,] result = new int[m, o];
FillArray(array);
FillArray(array2);
PrintArray(array);
PrintArray(array2);
result = Multiply(array, array2, result);
PrintArray(result);