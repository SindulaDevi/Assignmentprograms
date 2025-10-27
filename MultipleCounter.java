

	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;
	import java.util.Arrays;

	public class MultipleCounter {

	    public static Map<Integer, Integer> countMultiples(List<Integer> numbers) {
	        Map<Integer, Integer> result = new HashMap<>();
	        int[] divisors = {1, 2, 3, 4, 5, 6, 7, 8, 9};

	        for (int divisor : divisors) {
	            int count = 0;
	            for (int number : numbers) {
	                if (number % divisor == 0) {
	                    count++;
	                }
	            }
	            result.put(divisor, count);
	        }
	        return result;
	    }

	    public static void main(String[] args) {
	        List<Integer> input = Arrays.asList(1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30);
	        Map<Integer, Integer> output = countMultiples(input);
	        System.out.println(output);
	    }
	}


