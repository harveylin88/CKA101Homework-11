package hw7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Hw7_2 {
    public static void main(String[] args) {
        String file = "Data.txt";
        Set set = new HashSet();
		while(set.size() < 10 ) {
			set.add((int)(Math.random()*1000) + 1);
		}
        try {
        	FileWriter fw= new FileWriter(file,true);
        	BufferedWriter bw = new BufferedWriter(fw);
            bw.write("產生結果");
            bw.newLine();

            for (int i = 0; i < 10; i++) {
               int num = (int) (Math.random() * 1000) + 1;
                bw.write(num + " ");
            }
            
            bw.newLine();
            System.out.println("成功！");

        } catch (IOException e) {
            System.out.println("發生錯誤: " + e.getMessage());
        }
        System.out.println(set);
    }
    
}