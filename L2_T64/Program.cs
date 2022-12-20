Console.Write("Введите число ");
int m = Convert.ToInt32(Console.ReadLine());
string Numbers(int b)
{
    if (1 <= b)
    {
        return $"{b} " + Numbers(b - 1);
    }
    else
    {
        return String.Empty;
    }
}
Console.WriteLine(Numbers(m));