class LengthOfTheLastWord {
    public static int lengthOfTheLastWord(String text) {

        char[] arrayText = text.toCharArray();

        int length = 0;

        for(int c = arrayText.length-1; c >= 0 ; c--) {

            System.out.println("+++++++++++++: "+c);

            if (arrayText[c] == ' ') {

                if(length==0){
                    continue;
                }else {
                    break;
                }

            }else{
                length++;
            }

        }

        return length;

    }
}
