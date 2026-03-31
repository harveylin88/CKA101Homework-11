

public class Hw1 {

	public static void main(String[] args) {
		int a=12,b=6,c=a+b,d=a*b;
		System.out.println("12+6的和為"+c+"\n12*6的積為"+d);
		
		int e=200/12,f=200%12;
		System.out.println("200顆蛋共有"+e+"打"+f+"顆");
		
		int g=256559,day=g/86400,h=(g-86400*day)/3600,m=(g-86400*day-3600*h)/60,s=(g-86400*day-3600*h-60*m)%60;
		System.out.println("256559秒共有"+day+"天"+h+"小時"+m+"分"+s+"秒");
		
		final double pi=3.1415;
		double i=pi*5*5,j=2*pi*5;
		System.out.println("圓面積為:"+i+"圓周長為"+j);
		
		int k;
		double l = 1500000;
		for(k=1;k<=10;k++) {
			l=l*1.02;
		}
		System.out.println("10年後本金加利息為:"+l);
		
		System.out.println(5 + 5);  //5+5=10
		System.out.println(5 + '5');//在ASCII裡5對應到的值為53,5+53=58
		System.out.println(5 + "5");//5+字串"5"=55
	}
}
