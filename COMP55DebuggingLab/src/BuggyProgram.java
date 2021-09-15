import acm.console.ConsoleWindow;

public class BuggyProgram extends ConsoleWindow {
	private SimplifiedFraction mainFraction;

	private String[] options = { "set numerator", "set denominator", "decimal equivalent", "print" };

	public void run() {
		infiniteMenu();
	}

	private void infiniteMenu() {
		printMenu();
		while (true) {
			int option = getOption();
			takeAction(option);
			println("---------");
			printOptions();
		}
	}

	/*
	 * Side note: It's rare for me to think of many situations where a switch
	 * statement or multiple if statements is a great idea, and this takeAction
	 * method is no exception, but it's being used here to help you focus on
	 * understanding the program quickly.
	 */
	private void takeAction(int option) {
		switch (option) {
			case 1:
				int numer = nextInt("give me a new numerator: ");
				mainFraction.setNumerator(numer);
				break;
			case 2:
				int denom = nextInt("give me a new denominator: ");
				mainFraction.setDenominator(denom);
				break;
			case 3:
				println("\nDecimal equivalent is " + mainFraction.toDecimal());
			default:
				println("\nSimplified fraction is " + mainFraction);
		}
		println();
	}

	private int getOption() {
		int option = 0;
		while (option < 1 || option > options.length) {
			option = nextInt("Enter an option ");
		}
		return option;
	}

	private void printMenu() {
		println("Welcome to our fraction helper!");
		println("Our cool little program will always give you");
		println("a simplified fraction, no matter numerator and denominator");
		println("no 6/3 or 12/4 allowed!");
		printOptions();
	}

	private void printOptions() {
		println("Your options are: ");
		for (int i = 1; i <= options.length; i++) {
			println(i + ") " + options[i]);
		}
	}

	public void init() {
		setSize(800, 600);
		setFont("Courier new-bold-24");
	}
	
	public BuggyProgram() {
		super();
		init();
		run();
	}
	
	public static void main(String[] args) {
		new BuggyProgram();
	}
}
