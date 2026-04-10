package hw4;

public class Hw4_1 {
	public static void main(String[] args) {
       
        int[] a = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
        double sum =0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        double average = sum / a.length;
        
        System.out.println("陣列平均值為: " + average);
        System.out.println("--- 大於平均值的元素如下 ---");
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] > average) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println("\n==========");
        
        String s = "Hello World";
    
        char[] charArray = s.toCharArray();
        
        System.out.print("反轉：");
        for (int j = charArray.length - 1; j >= 0; j--) {
            System.out.print(charArray[j]);
        }
        System.out.println("\n==========");
        
        
        String[] planets = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};  
        int t = 0;
        for (int k = 0; k < planets.length; k++) {
            String s1 = planets[k].toLowerCase(); 
            for (int j = 0; j < s1.length(); j++) {
                char ch = s1.charAt(j); 
                
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    t++;
                }
            }
        }
        System.out.println("八大行星陣列中共有 " + t + " 個母音。");
    }
}
