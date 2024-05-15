import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strings) {


        if(strings.length<=1) return strings[0];

        List<Integer> equaltyList = new ArrayList<>(); //list of indices of up to which char of the current comparison strings are equal


        var j = strings.length-1;

        int equalsUntil = 0;

        for (int x = 0; x < Math.min( strings[0].length() , strings[j].length() ); x++) {

            if (j==0){
                break ;
            }

            if (strings[0].charAt(x) == strings[j].charAt(x)) {

                equalsUntil++;

                if(x == Math.min( strings[0].length()-1 , strings[j].length()-1 )){

                    equaltyList.add(equalsUntil);
                    j--;
                    equalsUntil=0;
                    x = -1;

                }

            }else{
                equaltyList.add(equalsUntil);
                j--;
                equalsUntil=0;
                x = -1;

            }

        }

        if(!equaltyList.isEmpty()){

            int minimumValue = equaltyList.stream()             //Minimum value of the comparisons

                    .min(Comparator.naturalOrder())
                    .orElse(Integer.MAX_VALUE);

            return strings[0].substring(0,minimumValue);        // Common substring in all strings
        }else{
            return "";
        }



    }
}
