import java.util.Scanner;

public class companyDecription {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num, num1, num2, num3, num4, tempNum;
		System.out.print("Input 4 digit enctrypted number: "); //0189 should become 1234
		String numStr; 
		numStr = scnr.next();
		
			
			num1 = Integer.parseInt(String.valueOf(numStr.charAt(0)));
			num2 = Integer.parseInt(String.valueOf(numStr.charAt(1)));
			num3 = Integer.parseInt(String.valueOf(numStr.charAt(2)));
			num4 = Integer.parseInt(String.valueOf(numStr.charAt(3)));
			
			if(num1-7 < 0) {
				num1 = (num1 - 7) + 10;
			}else {
				num1 = num1 - 7;
			}
			if(num2-7 < 0) {
				num2 = (num2 - 7) + 10;
			}else {
				num2 = num2 - 7;
			}
			if(num3-7 < 0) {
				num3 = (num3 - 7) + 10;
			}else {
				num3 = num3 - 7;
			}
			if(num4-7 < 0) {
				num4 = (num4 - 7) + 10;
			}else {
				num4 = num4 - 7;
			}
			
			
			tempNum = num3;
			num3 = num1;
			num1 = tempNum;
			tempNum = num4;
			num4 = num2;
			num2 = tempNum;
			
			System.out.println(num1 + "" + num2 + "" + num3 + "" +num4);
	}

}
