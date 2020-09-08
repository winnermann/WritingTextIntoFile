package org.lesson44.writetextintofile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteTextIntoFile {
    public static void main(String[] args) throws FileNotFoundException {
        //создан объект класса File
        File file = new File("testFile.txt");

        //класс PrintWriter записывает данные в файл
        //в конструктор класса PrintWriter помещаем наш файл "testFile.txt"
        PrintWriter pw = new PrintWriter(file);

        //Записать строку один "Test row 1" в файл "testFile.txt"
        pw.println("Test row 1");
        //Записать строку два "Test row 2" в файл "testFile.txt"
        pw.println("Test row 2");

        //Закрыть PrintWriter
        pw.close();
    }
}
