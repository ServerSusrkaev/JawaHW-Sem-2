import  java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        //Создание логгинга:
        Logger logger = Logger.getLogger(Main.class.getName());

        FileHandler fh = new FileHandler("logFile.xml");
        logger.addHandler(fh);

        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);

        logger.info("Sort Array");

        //Создание массива:
        Scanner input = new Scanner(System.in);

        System.out.print("Укажите размер массива: ");
        int size = input.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
        }

        Library lib = new Library();
        lib.printArray(array);
        lib.sortArray(array);
        lib.printArray(array);
    }
}
