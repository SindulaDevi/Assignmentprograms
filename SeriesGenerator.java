import java.util.Scanner;

	public class SeriesGenerator {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter an integer (a): ");
	        int a = scanner.nextInt();
	        scanner.close();

	        generateSeries(a);
	    }

	    public static void generateSeries(int a) {
	        if (a <= 0) {
	            System.out.println("Input must be a positive integer.");
	            return;
	        }

	        int limit;
	        if (a % 2 == 0) { // If 'a' is even
	            limit = a - 1;
	        } else { // If 'a' is odd
	            limit = a;
	        }

	        // Handle the case where a is 1 or 2, resulting in a limit of 1
	        if (limit < 1) {
	            limit = 1;
	        }

	        StringBuilder output = new StringBuilder();
	        for (int i = 1; i <= limit; i += 2) {
	            output.append(i);
	            if (i < limit) {
	                output.append(", ");
	            }
	        }
	        System.out.println(output.toString());
	    }
	}


