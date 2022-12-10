/*Задача 43: Напишите программу, которая найдёт точку пересечения двух прямых, 
заданных уравнениями y = k1 * x + b1, y = k2 * x + b2; 
значения b1, k1, b2 и k2 задаются пользователем.*/
bool Check(float b1, float k1, float b2, float k2)
{
    return (k1 == k2 && b1 == b2);
}
float CrossDotX(float b1, float k1, float b2, float k2)
{
    float x = 0;
    if (!(Check(b1, k1, b2, k2)))
    {
        x = (b2 - b1) / (k1 - k2);
    }
    return x;
}
float CrossDotY(float b1, float k1, float b2, float k2)
{
    float y = 0;
    if (!(Check(b1, k1, b2, k2)))
    {
        y = (k1 * (b2 - b1)) / (k1 - k2) + b1;
    }
    return y;
}
void CheckPrint(float b1, float k1, float b2, float k2)
{
    if (Check(b1, k1, b2, k2))
    Console.WriteLine("Прямые совпадают");
    else if (k1 == k2)
    Console.WriteLine("Прямые параллельны");
    else
    Console.WriteLine($"X: {CrossDotX(b1, k1, b2, k2)}, Y: {CrossDotY(b1, k1, b2, k2)}");
}
Console.Write("Введите b1 ");
float b1 = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите k1 ");
float k1 = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите b2 ");
float b2 = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите k2 ");
float k2 = Convert.ToInt32(Console.ReadLine());
CheckPrint(b1, k1, b2, k2);