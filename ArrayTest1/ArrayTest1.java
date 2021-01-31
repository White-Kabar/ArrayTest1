import java.util.Scanner;
public class ArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner input = new Scanner (System.in);
		System.out.println("Enter s");
		s = input.next();
		int [] amt = new int [10];
		for (int i=0; i<s.length(); i++) {
		char c = s.charAt(i);
		if (c >= '0' && c<= '9') {
			amt[c-'0']++;
		}
	}
		for (int i=0;i<amt.length; i++) {
			System.out.println("Number of "+i+"="+amt[i]);
		}

	}
}
