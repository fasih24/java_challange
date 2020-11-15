package java_challange1;

public class Swapping {

	public static void main(String[] args) {
	int a=5;
	int b=2;
	int temp;
	System.out.println("a ="+a+" "+"b = "+b);
//	temp=a;
//	a=b;
//	b=temp;
//	System.out.println("a ="+a+" "+"b = "+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("a ="+a+" "+"b = "+b);
	}

}
