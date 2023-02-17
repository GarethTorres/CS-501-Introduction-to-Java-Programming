import java.util.InputMismatchException;
import java.util.Scanner;

public class TestLinearEquation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean repeat = true;
		System.out.println("This program solve 2x2 linear equations.");
		System.out.println("You can choose to enter two equations or enter four end point for both line segment.");
		while(repeat) {
			System.out.println("1. Enter two equations.");
			System.out.println("2. Enter four end point for both line segment");
			int option = checkInputIsInteger();
			switch(option) {
				case 1: equationsMeun();
					break;
				case 2: endPointsMeun();
					break;
				default: 
					System.out.println("Command Unrecognized.");
					break;
			}
			System.out.println("Restart program? type 'y' for continue or 'n' to quit: ");
			if(checkRepeatCommand() == 'y') repeat = true;
			else repeat = false;
		}
		scanner.close();
		System.out.println("Program exit!");
	}
	
	public static double checkInputIsDouble(String s) {
		double res;
		Scanner scanner = new Scanner(System.in);
		while(true) {
			try {
				res = scanner.nextDouble();
			}catch (InputMismatchException e) {
				System.out.println("Invalid input type. Please enter Double only. Reenter " + s);
				scanner.nextLine();
				continue;
			}
			break;
		}
		return res;
	}
	
	public static int checkInputIsInteger() {
		int res;
		Scanner scanner = new Scanner(System.in);
		while(true) {
			try {
				res = scanner.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("Invalid input type. Please enter Integer only.");
				mainMeun();
				scanner.nextLine();
				continue;
			}
			break;
		}
		return res;
	}
	
	public static char setRepeatCommand() throws Exception {
		Scanner scanner = new Scanner(System.in);
		char c = scanner.next().charAt(0);
			if(c != 'y' && c != 'n') {
				Exception e = new Exception("Command Unrecognized, please type 'y' for retype equations or 'n' for quit, please do again!");
	            throw e;
			}
			return c;
	}
	
	public static char checkRepeatCommand() {
		char command;
		while(true) {
			try {
				command = setRepeatCommand();
			}catch (Exception e) {
				System.out.println("input threw" +
						" Exception message: " + e.getMessage());
				continue;
			}
			break;
		}
		return command;
	}
	
	public static void mainMeun() {
		System.out.println("1. Enter two equations.");
		System.out.println("2. Enter four end point for both line segment");
	}
	
	public static void equationsMeun() {
		LinearEquation le;
		System.out.println("For the first equation ax + by = e, please enter a, b, e in order. ");
		System.out.println("Please type your value for a: ");
		double a = checkInputIsDouble("a");
		System.out.println("a is saved! Please type your value for b: ");
		double b = checkInputIsDouble("b");
		System.out.println("b is saved! Please type your value for e: ");
		double e = checkInputIsDouble("e");
		System.out.println("e is saved! Let move on to second equation.\n");
		System.out.println("For the second equation cx + dy = f, please enter c, d, f in order. ");
		System.out.println("Please type your value for c: ");
		double c = checkInputIsDouble("c");
		System.out.println("c is saved! Please type your value for d: ");
		double d = checkInputIsDouble("d");
		System.out.println("d is saved! Please type your value for f: ");
		double f = checkInputIsDouble("f");
		System.out.println("Your equations are: ");
		System.out.println(a + "x + " + b + "y = " + e);
		System.out.println(c + "x + " + d + "y = " + f);
		le = new LinearEquation(a, b, c, d, e, f);
		if(le.isSolvable()) {
			System.out.println("And the answer is : " + "X = " + le.getX() + ", " + "Y = " + le.getY());
		}else {
			System.out.println("And the equations has no solution.");
		}
	}
	
	public static void endPointsMeun() {
		LinearEquation le;
		System.out.println("For the first line segment(x1, y1), (x2, y2) ");
		System.out.println("Please type your value for x1: ");
		double x1 = checkInputIsDouble("x1");
		System.out.println("x1 is saved! Please type your value for y1: ");
		double y1 = checkInputIsDouble("y1");
		System.out.println("y1 is saved! Please type your value for x2:");
		double x2 = checkInputIsDouble("x2");
		System.out.println("x2 is saved! Please type your value for y2:");
		double y2 = checkInputIsDouble("y2");
		System.out.println("y2 is saved! Let move on the second line segment:");
		System.out.println("For the second line segment(x3, y3), (x4, y4) ");
		System.out.println("Please type your value for x3: ");
		double x3 = checkInputIsDouble("x3");
		System.out.println("x3 is saved! Please type your value for y3: ");
		double y3 = checkInputIsDouble("y3");
		System.out.println("y3 is saved! Please type your value for x4:");
		double x4 = checkInputIsDouble("x4");
		System.out.println("x4 is saved! Please type your value for y4:");
		double y4 = checkInputIsDouble("y4");
		System.out.println("Your equations are: ");
		double a = y1 - y2;
		double b = -(x1 - x2);
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double c = y3 - y4;
		double d = -(x3 - x4);
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;
		System.out.println(a + "x + " + b + "y = " + e);
		System.out.println(c + "x + " + d + "y = " + f);
		le = new LinearEquation(a, b, c, d, e, f);
		if(le.isSolvable()) {
			System.out.println("And the answer is : " + "X = " + le.getX() + ", " + "Y = " + le.getY());
		}else {
			System.out.println("And the equations has no solution.");
		}
	}
}