package hw4;

import java.util.Scanner;

public class Hw4_2 {
	public static void main(String[] args) {
        int[] a = {25, 32, 8, 19, 27};
        int[] b = {2500, 800, 500, 1000, 1200};

        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入欲借的金額: ");
        	int c=sc.nextInt();
            int count = 0;
            String str = "";

            for (int i = 0; i < a.length; i++) {
                if (b[i] >= c) {
                    count++;
                    str = str +" "+ a[i];
                    
                }
            }

            if (count > 0) {
                System.out.println("有錢可借的員工編號: " + str + " 共 " + count + " 人！");
            } 
            else {
                System.out.println("沒同事可借。");
            }
        } 
        
  
    }

