package package2;

public class Swapping {
	public static void swapfn(int n1,int n2 ) {
		int n3=n1;
		n1=n2;
		n2=n3;
		System.out.println("After Swapping a = "+n1+" b = "+n2);
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a:");
		int a=sc.nextint();
		System.out.println("Enter b:");
		int b=sc.nextint();
		System.out.println("Before Swapping a = "+a+" b = "+b);
		swapfn(a,b);
	

	}

}
