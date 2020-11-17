package com.company;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        try {
            File  file = new File("newFile.txt");

            if(!file.exists())
                file.createNewFile();
            PrintWriter pw = new PrintWriter(file);
            pw.println("Koshka"); //Добавляем первое слово
            pw.println("Sobaka"); //Добавляет слово после первого слова(т.е. в конец)
            //pw = new PrintWriter(file); новая запись в файл (стирает все данные с файла)
            //pw.write("asdf"); запись в чистый файл нового слова
            pw.close();

            br = new BufferedReader(new FileReader("newFile.txt"));
            String line;
            while ((line = br.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch (IOException e){
            System.out.println("EROR: " + e);
        }

        finally {
            try {
                br.close();
            }
            catch (IOException e){
                System.out.println("EROR: " + e);
            }
        }
    }
}
