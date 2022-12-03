int[] ArrNum()
{
int[] array = new int[8];
for (int i = 0;i<array.Length;i++)
{
    array[i] = new Random().Next(1,1000);
}
return array;
}

void print(int[] a)
{
    for(int i = 0; i< a.Length;i++)
    {
        Console.Write($"{a[i]} ");
    }
}
print(ArrNum());