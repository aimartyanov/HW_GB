void FillArr(string[] array)
{
    Console.WriteLine("Ввод массива");
    for (int i = 0; i < array.Length; i++)
    {
        array[i] = Console.ReadLine();
    }
}
void PrintArr(string[] array)
{
    for (int i = 0; i < array.Length; i++)
    {
        Console.Write($"{array[i]} ");
    }
    Console.WriteLine();
}
int NewArrLen(string[] array)
{
    int count = 0;
    for (int i = 0; i < array.Length; i++)
    {
        if (array[i].Length <= 3)
        {
            count++;
        }
    }
    return count;
}
string[] FillNewArray(string[] array, string[] NewArray)
{
    int j = 0;
    for (int i = 0; i < array.Length; i++)
    {
        if (array[i].Length <= 3)
        {
            NewArray[j] = array[i];
            j++;
        }
    }
    return NewArray;
}
string[] array = new string[5];
FillArr(array);
Console.WriteLine();
PrintArr(array);
string[] NewArray = new string[NewArrLen(array)];
FillNewArray(array, NewArray);
PrintArr(NewArray);