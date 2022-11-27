Console.Write("Введите пятизначное число ");
int a = Convert.ToInt32(Console.ReadLine());
if (a /1000 == (a %10) *10 + (a %100)/10)
{
    Console.WriteLine("Да");
}
else
{
    Console.WriteLine("Нет");
}