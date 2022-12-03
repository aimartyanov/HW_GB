int power(int A, int B)
{
  int result = 1;
  for(int i=1; i <= B; i++){
    result *= A;
  }
    return result;
}
Console.Write("Введите число A: ");
int A = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите число B: ");
int B = Convert.ToInt32(Console.ReadLine());
Console.WriteLine(power(A,B));