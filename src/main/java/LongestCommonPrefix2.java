import java.util.Arrays;

public class LongestCommonPrefix2 {

    public static void longestCommonPrefix(String[] strs) {
        String commonPrefix="";

        Arrays.sort(strs);
        // using the sort function allows us to see which two worlds are the closes and thus most likely to have similar prefix

        String closest = strs[0];
        System.out.println(closest);
        String furthest = strs[strs.length-1];
        for(int i =0;i<closest.length();i++) {

            if(closest.charAt(i)!=furthest.charAt(i)) break;
            commonPrefix = commonPrefix+closest.charAt(i);
        }
        System.out.println(commonPrefix);

    }


    public static void main(String[] args){
        longestCommonPrefix(new String[]{"flower", "flow", "flight"});
    }
}
