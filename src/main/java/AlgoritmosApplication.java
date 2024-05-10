//import java.io.PrintStream;


import java.util.Arrays;

public class AlgoritmosApplication {

	public static void main(String[] args) {


		switch (3){

			case 1 : System.out.println(twoSum(1));
			case 2 : System.out.println(removeElement(2));
			case 3 : System.out.println(romanToInt(4));

		}
	}

	static int romanToInt(int example){

		switch (example){

			case 1 : return RomanToInt.romanToInt("III");
			case 2 : return RomanToInt.romanToInt("LVIII");
			case 3 : return RomanToInt.romanToInt("MCMXCIV");
			case 4 : return RomanToInt.romanToInt("MMXVII");
			case 5 : return RomanToInt.romanToInt("IVC");
		}

		return 0;
	}


	static String removeElement(int example){

		switch (example){

			case 1 : return RemoveElement.removeElement(new int[]{3,2,2,3},3);
			case 2 : return RemoveElement.removeElement(new int[]{0,1,2,2,3,0,4,2},2);
			case 3 : return RemoveElement.removeElement(new int[]{0,1,2,3,4,5,6},6);
			case 4 : return RemoveElement.removeElement(new int[]{3,3},3);
			case 5 : return RemoveElement.removeElement(new int[]{2,2,2},2);
		}

		return null;
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