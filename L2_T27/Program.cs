Console.Write("Введите число: ");
int a = Convert.ToInt32(Console.ReadLine());
int sum(int a)
{
int b = 0;
while(a>0)
{
    b+=a%10;
    a/=10;
}
return b;
}
Console.WriteLine($"Сумма цифр: {sum(a)}");