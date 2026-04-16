package hw5;

public class Hw5_3 {
	public static void main(String[] args) {
		int[][]intarray= {{1,6,3},{9,5,2}};
		double[][]doublearray= {{1.2,3.5,2.2},{7.4,2.1,8.2}};
		Hw5_3 h =new Hw5_3();
		System.out.println(h.maxElement(intarray));
		System.out.println(h.maxElement(doublearray));
	}
	public static int maxElement(int x[][]) {
		
		int max=x[0][0];
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				if(x[i][j]>max)
					max=x[i][j];	
		}		
	}
		return max;
	}

	public static double maxElement(double x[][]) {
		double max=x[0][0];
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				if(x[i][j]>max)
					max=x[i][j];	
		}		
	}
		return max;
	}
}
