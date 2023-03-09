import java.util.Arrays;
import java.io.*;
import java.util.logging.*;

public class Main
{
    public static void main(String[] args)throws IOException
    {
        Logger logger = Logger.getLogger(Main.class.getName());
        FileHandler fh = new FileHandler("log.xml", true);
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Инициализация массива");
        int[] data = {6, 8, 3, 123, 5, 4, 1, 2, 0, 9, 7};
        logger.info("Вывод массива");
        System.out.println(Arrays.toString(data));
        logger.info("сортировка массива");
        Main.bubbleSort(data);
        logger.info("вывод отсортированного массива");
        System.out.println(Arrays.toString(data));
    }

    public static void bubbleSort(int[] array) throws IOException
    {
        Logger logger = Logger.getLogger(Main.class.getName());
        FileHandler fh = new FileHandler("log.xml", true);
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        boolean sorted = false;
        int temp;
        logger.info("начало сортировки");
        while (!sorted)
        {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++)
            {
                if (array[i] > array[i + 1])
                {
                    logger.info("Сохранение "+i+ " элемента в temp");
                    temp = array[i];
                    logger.info("Замещение "+i+ " элемента на "+i+1);
                    array[i] = array[i + 1];
                    logger.info("Сохранение temp элемента в "+i+1);
                    array[i + 1] = temp;
                    logger.info("завершение");
                    sorted = false;
                }
            }
        }
    }
}