package main;

public class OddOrNot_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("2 " + (OddOrNot.check(2)==true));
		System.out.println("8 " + (OddOrNot.check(8)==true));
		System.out.println("100 " + (OddOrNot.check(100)==true));
		System.out.println("2000 " + (OddOrNot.check(2000)==true));
		System.out.println("10 " + (OddOrNot.check(10)==true));
		
		System.out.println("0 " + (OddOrNot.check(0)==false));
		System.out.println("1 " + (OddOrNot.check(1)==false));
		System.out.println("3 " + (OddOrNot.check(3)==false));
		System.out.println("129.3 " + (OddOrNot.check(129.3)==false));
		
		
	}

}
