public class Main
{
    public static void main(String[] args)
    {
            String [] arrayData = {"фамилия:Иванов,оценка:5,предмет:математика",
                                    "фамилия:Петрова,оценка:4,предмет:Информатика",
                                    "фамилия:Краснов,оценка:5,предмет:Физика"};
        for (String arrayDat : arrayData)
        {
            System.out.println(Print(arrayDat));
        }
    }
        public static StringBuilder Print(String line)
        {
            StringBuilder result = new StringBuilder();
            String [] listName = {"Студент ", " получил ", " по предмету "};
            String line1 = line.replaceAll("\"", "");
            String [] arrayData = line1.split(",");
            for (int i =0; i < arrayData.length; i++)
            {
                String[] arrData = arrayData[i].split(":");
                result.append(listName[i]);
                result.append(arrData[1]);
            }
            return result;
        }
}