//Задача 41: Пользователь вводит с клавиатуры M чисел. Посчитайте, сколько чисел больше 0 ввёл пользователь.
Console.Write("Введите размер ");
int m = Convert.ToInt32(Console.ReadLine());
int[] array = new int[m];
void FillArray(int[] array)
{
    for (int i = 0;i < array.Length; i++)
    {
        Console.Write("Введите число ");
        array[i] = Convert.ToInt32(Console.ReadLine());
    }
}
void PrintArray(int[] array)
{
    for (int i = 0; i < array.Length;i++)
    {
        Console.Write($"{array[i]} ");
    }
    Console.WriteLine();
} 
int PositiveCount(int[] array)
{
    int count = 0;
    for (int i = 0; i < array.Length; i++)
    {
        if (array[i] > 0)
        count++;
    }
    return count;
}
FillArray(array);
PrintArray(array);
Console.WriteLine($"Количество положительных чисел {PositiveCount(array)}");