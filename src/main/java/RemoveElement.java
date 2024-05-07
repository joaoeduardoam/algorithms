import java.util.Arrays;

class RemoveElement {
    public static String removeElement(int[] nums, int val) {

//        int x=0;
//
//        System.out.println(Arrays.toString(nums));
//
//        for(int y = 0; y < nums.length; y++){
//
//            System.out.println("x="+x+"   y="+y);
//            if( nums[y] != val){
//                System.out.println("TROCA");
//                int temp = nums[x];
//                nums[x] = nums[y];
//                nums[y] = temp;
//                x++;
//            }
//            System.out.println(Arrays.toString(nums)+"\n");
//        }
//
//        return x+", nums = " + Arrays.toString(nums);

        int timeEquals = 0;

        System.out.println(Arrays.toString(nums));

        for (int x = 0; x < nums.length; x++) {
            System.out.println("x="+x+"   timeEquals="+timeEquals);

            nums[x - timeEquals] = nums[x];

            if (nums[x] == val) {
                timeEquals++;
            }

            System.out.println(Arrays.toString(nums));
            System.out.println("timeEquals="+timeEquals+"\n");

        }

        return nums.length-timeEquals+", nums = " + Arrays.toString(nums);















    }
}
