import java.util.Scanner;

	public class NumberSeries {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number (a): ");
	        int a = sc.nextInt();

	        // Find the nearest odd number less than or equal to 'a'
	        int limit = (a % 2 == 0) ? a - 1 : a;

	        // Print the series of odd numbers
	        for (int i = 1; i <= limit * 2 - 1; i += 2) {
	            System.out.print(i);
	            if (i < limit * 2 - 1) {
	                System.out.print(", ");
	            }
	        }

	        sc.close();
	    }
	}



