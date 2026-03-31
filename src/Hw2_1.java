
public class Hw2_1 {
public static void main(String[] args) {
	int i,j=0;	
	for( i=1;i<=1000;i++) {
			if (i%2==0) {
				j=j+i;
			}
			
		}
	System.out.println("偶數和為"+j);
	
	int k,l=1;
	for(k=1;k<=10;k++) {
		l=k*l;
	}
	System.out.println("for1-10連乘積為"+l);
	int m=1,n=1;
	while (m <= 10) {
		n=m*n;
		m++;
	}
	System.out.println("while1-10連乘積為"+n);
	
	for(int o=1;o<=10;o++) {
		for(int p=1;p<=10;p++) {
			if(o==p) {
				System.out.print(o*p+" ");
			}
		}
	}
	
	}
}
