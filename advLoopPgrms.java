import java.util.Scanner;
public class advLoopPgrms {
	public static void main (String[] args) {
		Scanner myScanObj = new Scanner(System.in);
		//4
		int fourRand = (int) ((Math.random()*100)+1);
		int fourGuess = 0;
		while (fourGuess != fourRand) {
			if (fourGuess == 0) {
			} else if (fourGuess > fourRand) {
				System.out.println("That guess is too high.");
			} else if (fourGuess < fourRand) {
				System.out.println("That guess is too low.");
			}
			System.out.print("Take a guess. ");
			fourGuess = myScanObj.nextInt();
		}
		System.out.println("You guessed it.");
		System.out.println();

		//3
		for(int three = 100; three >= 0; three--) {
			System.out.println(three + " bottles of soda on the wall");
			System.out.println(three + " bottles of soda on the wall");
			System.out.println(three + " bottles of soda");
			System.out.println("If one of those bottles should happen to fall");
			System.out.println();
		}
		System.out.println();

		//2
		int twoIn = 2;
		int twoEvens = 0;
		int twoOdds = 0;
		int twoZeros = 0;
		while (twoIn >= 0) {
			System.out.print("Enter an integer. ");
			twoIn = myScanObj.nextInt();
			if (twoIn == 0) {
				twoZeros++;
			}else if (twoIn%2 == 0) {
				twoEvens++;
			} else {
				twoOdds++;
			}
		}
		System.out.println("There were " + twoEvens + " even numbers, " + twoOdds + " odd numbers, and " + twoZeros + " zeros (even though zeros are even, they were not counted as such???).");
		System.out.println();

		//1
		System.out.print("Enter a positive integer. ");
		int oneIn = myScanObj.nextInt();
		System.out.print("The even numbers between 2 and " + oneIn + " are ");
		int oneA = 4;
		while(oneA < oneIn) {
			System.out.print(oneA + ", ");
			oneA = oneA+2;
		}
		System.out.println();
		System.out.println();
	}
}