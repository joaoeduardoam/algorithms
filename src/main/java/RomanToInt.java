class RomanToInt {
    public static int romanToInt(String roman) {

        char[] arrayRoman = roman.toCharArray();

        int actual = 0;

        for(int c = 0; c < arrayRoman.length ; c++){

            switch (arrayRoman[c]){

                case 'I' -> {

                    System.out.println("I");

                    if(c < arrayRoman.length-1){

                        if(arrayRoman[c+1] == 'V'){
                            //System.out.println("+++++4");
                            actual += 4;
                            c++;
                            break;
                        }else if (arrayRoman[c+1] == 'X'){
                            //System.out.println("+++++9");
                            actual += 9;
                            c++;
                            break;
                        }

                    }

                    actual++;

                }
                case 'V' -> {
//                    System.out.println("V");
                    actual += 5;
                }
                case 'X' -> {

//                    System.out.println("X");

                    if(c < arrayRoman.length-1){

                        if(arrayRoman[c+1] == 'L'){
//                            System.out.println("+++++40");
                            actual += 40;
                            c++;
                            break;
                        }else if (arrayRoman[c+1] == 'C'){
//                            System.out.println("+++++90");
                            actual += 90;
                            c++;
                            break;
                        }

                    }

                    actual += 10;
                }
                case 'L' -> {
//                    System.out.println("L");
                    actual += 50;
                }
                case 'C' -> {
//                    System.out.println("C");


                    if(c < arrayRoman.length-1){

                        if(arrayRoman[c+1] == 'D'){
//                            System.out.println("+++++400");
                            actual += 400;
                            c++;
                            break;
                        }else if (arrayRoman[c+1] == 'M'){
//                            System.out.println("+++++900");
                            actual += 900;
                            c++;
                            break;
                        }

                    }

                    actual += 100;
                }
                case 'D' -> {
//                    System.out.println("D");
                    actual += 500;
                }
                case 'M' -> {
//                    System.out.println("M");
                    actual += 1000;
                }


            }

        }

        return actual;

    }

}
