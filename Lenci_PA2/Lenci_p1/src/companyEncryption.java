import java.util.Scanner;

public class companyEncryption {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num1, num2, num3, num4, tempNum;
		String numStr;
		System.out.print("Input 4 digit number: ");
		numStr = scnr.next();

			
			num1 = Integer.parseInt(String.valueOf(numStr.charAt(0)));
			num2 = Integer.parseInt(String.valueOf(numStr.charAt(1)));
			num3 = Integer.parseInt(String.valueOf(numStr.charAt(2)));
			num4 = Integer.parseInt(String.valueOf(numStr.charAt(3)));
			
			num1 = (7 + num1)%10;
			num2 = (7 + num2)%10;
			num3 = (7 + num3)%10;
			num4 = (7 + num4)%10;
			
			tempNum = num3;
			num3 = num1;
			num1 = tempNum;
			tempNum = num4;
			num4 = num2;
			num2 = tempNum;
			
			System.out.println(num1 + "" + num2 + "" + num3 + "" +num4);

	}

}
