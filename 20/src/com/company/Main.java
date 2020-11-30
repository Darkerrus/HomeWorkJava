package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class Practice_20 {
    static void find_max_words(List<String> mass, int rec_counter){
        String max_word = "", word = "";
        int max_count = 0, count = 1;
        for(String str : mass){
            if(str.equals(word))
                count++;
            else{
                if(count > max_count){
                    max_count = count;
                    max_word = word;
                }
                word = str;
                count = 1;
            }
        }
        if(count > max_count){
            max_count = count;
            max_word = word;
        }
        System.out.print(rec_counter +": cамое повторяющееся слово: " + max_word + " (встречается " + max_count + " раз)\n");
        String final_max_word = max_word; // removeIf просит переопределить
        mass.removeIf(j -> (j.equals(final_max_word))); // удаляем то что нашли из массива
        rec_counter++;
        if(rec_counter != 11) // нашли 10 слов - выходим
            find_max_words(mass, rec_counter);
    }
    public static void main(String[] args) throws Exception{
        FileReader r_file = new FileReader("voyna-i-mir-tom-1.txt");
        Scanner sc = new Scanner(r_file);

        FileWriter w_file = new FileWriter("voyna-i-mir-tom-1-fixed.txt");
        while(sc.hasNextLine()) // замена пробелов и переносов строк на # и запись в отдельный файл war_and_peace_fixed.txt
            w_file.write(sc.nextLine().replace(' ', '#').replace("\u00a0", " ") + "#");
        w_file.close();

        r_file = new FileReader("voyna-i-mir-tom-1-fixed.txt");
        List<String> massive = new ArrayList<>(Arrays.asList((new Scanner(r_file)).nextLine().split("[^A-Za-zА-Яа-я]")));
        r_file.close();
        massive.removeIf(j -> (j.equals("")));
        Collections.sort(massive); // сортируем массив, чтобы одинаковые слова шли друг за другом
        find_max_words(massive, 1);
    }
}