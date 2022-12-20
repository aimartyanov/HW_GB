Console.Write("Введите число ");
int m = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите число ");
int n = Convert.ToInt32(Console.ReadLine());
int Numbers(int a, int b)
{
    while (a < b)
    {
        a += Numbers(a + 1, b);
    }
    return a;
}
Console.WriteLine(Numbers(m, n));