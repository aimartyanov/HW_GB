int ArcFunc(int m, int n)
{
    if (m == 0)
        return n + 1;
    else
    if ((m != 0) && (n == 0))
        return ArcFunc(m - 1, 1);
    else
        return ArcFunc(m - 1, ArcFunc(m, n - 1));
}
Console.Write("Введите число ");
int m = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите число ");
int n = Convert.ToInt32(Console.ReadLine());
Console.WriteLine(ArcFunc(m, n));