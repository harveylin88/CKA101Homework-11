package hw5;

public class Hw5_5 {
	public void getAuthCode() {
		char[]a= {'1','2','3','4','5','6','7','8','9','0','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S',
				'T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		for (int i=1;i<=8;i++) {
			int x=(int)(Math.random()*a.length);
			char ram =a[x];
			System.out.print(ram);
		}
	}
	
	public static void main(String[] args) {
		Hw5_5 hw=new Hw5_5();
		hw.getAuthCode();
		
		
		
		
	}
}
