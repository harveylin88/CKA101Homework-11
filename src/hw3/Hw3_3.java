package hw3;

import java.util.Scanner;

public class Hw3_3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("請輸入你討厭的數字？");
        int a = scanner.nextInt();
        String b = String.valueOf(a); 
        
        int count = 0; 
        int colCount = 0; 
        
        System.out.println(); 
        
        for (int i = 1; i <= 49; i++) {
            String c = String.valueOf(i);
            
            if (!c.contains(b)) {
                System.out.print(i + "\t"); 
                count++;
                colCount++; 
                if (colCount % 6 == 0) {
                    System.out.println();
                }
            }
        }
                System.out.println("\n總共有" + count + "數字可選");
            
    }
}
