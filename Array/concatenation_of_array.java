//Good Approach Less Time Complexity

class Solution {
    public int[] getConcatenation(int[] nums) {


        int[] ans = new int[(nums.length*2)];

        for(int i = 0 ; i<ans.length ; i++){
            if(i<(ans.length/2)){
                ans[i]=nums[i];
            }
            else if(i>=(ans.length/2)){
                ans[i]=nums[i%nums.length];
            }
        }
        return ans;

    }
}



// First Approach more Time Complexity

//class Solution {
//    public int[] getConcatenation(int[] nums) {
//        int[] ans = new int[(nums.length*2)];
//        for(int i = 0 ; i<ans.length ; i++){
//            if(i<(ans.length/2)){
//                ans[i]=nums[i];
//            }
//            else if(i>=(ans.length/2)){
//                ans[i]=nums[i%nums.length];
//            }
//        }
//        return ans;
//    }
//}

