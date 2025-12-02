import java.util.ArrayList;

public class ArrayLIst {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        int s = 0;
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
//        while (s < nums.length){
//            System.out.print(nums[s] + " ");
//            s = s + 1;
//        }

//        list.forEach((word) -> {
//            System.out.println(word);
//        });
    }
}
