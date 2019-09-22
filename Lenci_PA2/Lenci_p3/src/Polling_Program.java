import java.util.Scanner;

public class Polling_Program {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String[] topics = {"Video Games", "Cars", "Money", "Happiness", "Taxes"};
		int[][] responses = new int[5][10];
		double[] averages = new double[5];
		String anotherSurvey = "y";
		int x = 0; //Column number 
		int zeroCounter = 0;
		double highAvg = 0, lowAvg = 10;
		int highAvgInt = 0, lowAvgInt = 0;
		
		for(int i = 0; i < 10; i++) {
			responses[0][i] = 0;
			responses[1][i] = 0;
			responses[2][i] = 0;
			responses[3][i] = 0;
			responses[4][i] = 0;
		}
		
		while(anotherSurvey.equals("y") || anotherSurvey.equals("Y")){
			
			System.out.println("Rate " + topics[0] + " on a 1-10 scale:");
			x = scnr.nextInt() - 1;
			responses[0][x] += 1;
			
			System.out.println("Rate " + topics[1] + " on a 1-10 scale:");
			x = scnr.nextInt() - 1;
			responses[1][x] += 1;
			
			System.out.println("Rate " + topics[2] + " on a 1-10 scale:");
			x = scnr.nextInt() - 1;
			responses[2][x] += 1;
			
			System.out.println("Rate " + topics[3] + " on a 1-10 scale:");
			x = scnr.nextInt() - 1;
			responses[3][x] += 1;
			
			System.out.println("Rate " + topics[4] + " on a 1-10 scale:");
			x = scnr.nextInt() - 1;
			responses[4][x] += 1;
			
			
			System.out.println("Another Survey? (Y for yes, N for no)");
			anotherSurvey = scnr.next();
			x++;
		}
		
		for(int j = 0; j < 5; j++) {
			
			averages[j] = (double)((responses[j][0]*1) + (responses[j][1]*2) + (responses[j][2]*3) + (responses[j][3]*4) + (responses[j][4]*5) + (responses[j][5]*6) + (responses[j][6]*7) + (responses[j][7]*8) + (responses[j][8]*9) + (responses[j][9]*10)) / (double)(x+1);
			
			//Calculate high & low
			if(averages[j] > highAvg) {
				highAvg = averages[j];
				highAvgInt = j;
			}
			if(averages[j] < lowAvg) {
				lowAvg = averages[j];
				lowAvgInt = j;
			}
		}
		
		
		System.out.println("_____________|____1____|____2____|____3____|____4____|____5____|____6____|____7____|____8____|____9____|____10___|"
				 	+ "\nVideo Games__|____" + responses[0][0] + "____|____"+ responses[0][1] + "____|____" + responses[0][2] + "____|____" + responses[0][3] + "____|____" + responses[0][4] + "____|____" + responses[0][5] + "____|____" + responses[0][6] + "____|____" + responses[0][7] + "____|____" + responses[0][8] + "____|____" + responses[0][9] + "____|     Avg: " + averages[0]
				 	+ "\nCars_________|____" + responses[1][0] + "____|____"+ responses[1][1] + "____|____" + responses[1][2] + "____|____" + responses[1][3] + "____|____" + responses[1][4] + "____|____" + responses[1][5] + "____|____" + responses[1][6] + "____|____" + responses[1][7] + "____|____" + responses[1][8] + "____|____" + responses[1][9] + "____|     Avg: " + averages[1]
				 	+ "\nMoney________|____" + responses[2][0] + "____|____"+ responses[2][1] + "____|____" + responses[2][2] + "____|____" + responses[2][3] + "____|____" + responses[2][4] + "____|____" + responses[2][5] + "____|____" + responses[2][6] + "____|____" + responses[2][7] + "____|____" + responses[2][8] + "____|____" + responses[2][9] + "____|     Avg: " + averages[2]
				 	+ "\nHappieness___|____" + responses[3][0] + "____|____"+ responses[3][1] + "____|____" + responses[3][2] + "____|____" + responses[3][3] + "____|____" + responses[3][4] + "____|____" + responses[3][5] + "____|____" + responses[3][6] + "____|____" + responses[3][7] + "____|____" + responses[3][8] + "____|____" + responses[3][9] + "____|     Avg: " + averages[3]
				 	+ "\nTaxes________|____" + responses[4][0] + "____|____"+ responses[4][1] + "____|____" + responses[4][2] + "____|____" + responses[4][3] + "____|____" + responses[4][4] + "____|____" + responses[4][5] + "____|____" + responses[4][6] + "____|____" + responses[4][7] + "____|____" + responses[4][8] + "____|____" + responses[4][9] + "____|     Avg: " + averages[4]);
		
		
		
		System.out.println("Highest average was " + topics[highAvgInt] + ": " + highAvg);
		System.out.println("Lowest average was " + topics[lowAvgInt] + ": " + lowAvg);
		
		System.out.println("\n\nGoodbye!");

	}

}
