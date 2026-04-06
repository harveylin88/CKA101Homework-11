package hw3;
import java.util.Random;
import java.util.Scanner;
public class Hw3_2 {
	public static void main(String[] args) {
      
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int ans = random.nextInt(10); 
        System.out.println("開始猜數字吧！");

        while (true) {  
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                if (i == ans) {
                    System.out.println("答對了！答案就是" + ans);
                    break; 
                } else {
                    System.out.println("猜錯囉");
                }
            } else {
                System.out.println("請輸入一個 0-9 的數字！");
                scanner.next(); 
            }
        }
        
        
    }
}
