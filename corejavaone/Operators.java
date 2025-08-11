package corejavaone;

public class Operators {

	public static void main(String[] args) {
		//rational operator
		int a = 10;
		int b = 20;
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		
		//unary
		
		int c = 10;
		
		System.out.println(c++);
		System.out.println(c--);
		
		//arithmetic
		int x = 10;
		int y = 40;
		
		
		System.out.println(x+y);
		System.out.println(x/y);
		System.out.println(x*y);
		
		//shift
		
		System.out.println(10<<2);
		System.out.println(10>>2);
		
		//bit wise
		//AND
		int p = 8;
		int q = 2;
		int r = p & q;
		System.out.println(r);
		//OR
		
		int p1 = 8;
		int q1 = 2;
		int r1 = p1 | q1;
		System.out.println(r1);
		//XOR
		
		int p2 = 3;
		int q2 = 2;
		int r2 = p2^q2;
		System.out.println(r2);
		
		//logical
		//AND
		int u=10,v=20;
		if (u<v && v>15) {
			System.out.println("condition is true");
		}
		
		//||
		int age = 15;
		if ( age<25 || age <10) {
			System.out.println("ok true");
		}
		//NOT
		
		boolean isRaining = false;
		if(!isRaining);{
			
			System.out.println("you can go out");
		
		}
		//assignment
		
		int k = 5;
		int l = 10;
		k+= 4;
		l-= 4;
		System.out.println(k);
		System.out.println(l);
		
		//ternary short hand if else
		
		int w1 = 10, w2 =20;
		int max = (w1<w2)?w1:w2;
		System.out.println(max);
		
		//
		 int s = -1;
		 int s1= s++;
		 System.out.println(s1 );
		 //
		 int a1 ,b1 ;
		  a1 =10;
		  b1 = a1++;
		  System.out.println(a1);
		  System.out.println(b1);
				 
		  //
		  int x1=25,x2=5,x3=0;
		  x3=x3%x2;
		  System.out.println(x3);
		 //5
		  int m=8;m*=8;
		  
		  //
		 
		  double c1; 
		  int x5,y5,z5;
		  x5=5; y5=10; z5=11;
		  
		  c1= x5*y5 +z5 / 2;
		  System.out.println(c1);
		  //
		
		  
		   
		  
		 
		
		
		
		
		
		
		
				
		
		
		
		// TODO Auto-generated method stub

	}

}
