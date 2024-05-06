//import java.io.PrintStream;


import java.util.Arrays;

public class AlgoritmosApplication {

	public static void main(String[] args) {


		switch (1){

			case 1 : System.out.println(twoSum(2));
			case 2 : //
			case 3 : //

		}




	}

	static String twoSum(int example){

		switch (example){

			case 1 : return Arrays.toString(TwoSum.twoSum(new int[]{2,7,11,15},9));
			case 2 : return Arrays.toString(TwoSum.twoSum(new int[]{3,2,4},6));
			case 3 : return Arrays.toString(TwoSum.twoSum(new int[]{3,3},6));

		}

        return null;
    }

}