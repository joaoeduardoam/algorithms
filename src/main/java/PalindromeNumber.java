class PalindromeNumber extends Algorithm<Boolean, Integer>{
    @Override
    public Boolean run(Integer number) {

        System.out.println("NUMEBR: "+number);

        String original = String.valueOf(number);

        String reversed = new StringBuilder(original).reverse().toString();

        return original.equals(reversed);

    }

}
