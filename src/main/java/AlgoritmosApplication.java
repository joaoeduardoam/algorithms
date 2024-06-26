//import java.io.PrintStream;


import java.util.Arrays;

public class AlgoritmosApplication {

	public static void main(String[] args) {

//		Algorithm algorithm = new PalindromeNumber();
//
//		int example = switch (4) {
//            case 1 -> 121;
//            case 2 -> -121;
//            case 3 -> 10;
//            case 4 -> 12121;
//            default -> 0;
//        };
//
//        System.out.println(algorithm.run(example));


		switch (6){

			case 1 : System.out.println(twoSum(1));
			case 2 : System.out.println(removeElement(2));
			case 3 : System.out.println(romanToInt(4));
			case 4 : System.out.println(lengthOfTheLastWord(2));
			case 5 : System.out.println(longestCommonPrefix(6));
			case 6 : System.out.println(palindromeNumber(1));

		}
	}

	static boolean palindromeNumber(int example){

		switch (example){

			case 1 : return PalindromeNumber.isPalindromeNumber(121);
			case 2 : return PalindromeNumber.isPalindromeNumber(-121);
			case 3 : return PalindromeNumber.isPalindromeNumber(1201021);
		}

		return false;
	}


	static String longestCommonPrefix(int example){

		switch (example){

			case 1 : return LongestCommonPrefix.longestCommonPrefix(new String[] {"Hello World","Helasd"});
			case 2 : return LongestCommonPrefix.longestCommonPrefix(new String[] {"flower","flight","flow"});
			case 3 : return LongestCommonPrefix.longestCommonPrefix(new String[] {"dog","racecar","car"});
			case 4 : return LongestCommonPrefix.longestCommonPrefix(new String[] {"a"});
			case 5 : return LongestCommonPrefix.longestCommonPrefix(new String[] {""});
			case 6 : return LongestCommonPrefix.longestCommonPrefix(new String[] {"",""});
			case 7 : return LongestCommonPrefix.longestCommonPrefix(new String[] {"ab","a"});
			case 8 : return LongestCommonPrefix.longestCommonPrefix(new String[] {"Helloasd","Hellasd","Heqweqqqqqqqqqqq", "Hello"});
		}

		return "";
	}

	static int lengthOfTheLastWord(int example){

		switch (example){

			case 1 : return LengthOfTheLastWord.lengthOfTheLastWord("Hello World");
			case 2 : return LengthOfTheLastWord.lengthOfTheLastWord("   fly me   to   the moon  ");
			case 3 : return LengthOfTheLastWord.lengthOfTheLastWord("luffy is still joyboy");
			case 4 : return LengthOfTheLastWord.lengthOfTheLastWord("Java is the greatest");
			case 5 : return LengthOfTheLastWord.lengthOfTheLastWord("a ");
		}

		return 0;
	}

	static int romanToInt(int example){

		switch (example){

			case 1 : return RomanToInt.romanToInt("III");
			case 2 : return RomanToInt.romanToInt("LVIII");
			case 3 : return RomanToInt.romanToInt("MCMXCIV");
			case 4 : return RomanToInt.romanToInt("MMXVII");
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