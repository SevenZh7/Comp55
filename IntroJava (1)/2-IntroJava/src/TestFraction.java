import java.util.*;

public class TestFraction {

	public static void main(String[] args) {
		//I want to be able to create a 3/4 fraction...like this
		Fraction f = new Fraction(3, 4);
		System.out.println("Edit this line in TestFraction.java to have your name instead");
		System.out.println("Testing my Fraction class");
		System.out.println("3/4 should appear below");
		System.out.println(f);
		System.out.println("I now want to change the f to be 1/3 instead");
		//Here is how to change f's numerator value
		f.setNumerator(1);
		//setDenominator should work the same
		//TODO Change the Denominator to 3
		f.setDenominator(3);
		//I should be able to change the numerator
		System.out.println("This numerator should be 1 here, is it? " + f.getNumerator());
		//Same with Denominator
		System.out.println("This denominator should be 3 here, is it? " + f.getDenominator());
		
		//More advanced
		//At this point the fraction should print out "1/3"
		System.out.println("I'm going to try to set the denominator to zero, which it should ignore");
		f.setDenominator(0);
		System.out.println("The fraction should print out 1/3 here, does it?  " + f);
	}

}
