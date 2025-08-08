import  java.util.*;

class contains_duplicate {
     public boolean containsDuplicate(int[] nums) {
         Arrays.sort(nums);
         for(int i =0;i<nums.length-1;i++){
             if(nums[i]==nums[i+1]){
                 return true;
             }
         }
         return false;
     }
     public static void main(String[] args) {
         contains_duplicate s = new contains_duplicate();
         int[] nums1 = {1,2,3,1};
         int[] nums2 = {1,2,3,1};
         System.out.println(s.containsDuplicate(nums1));
         System.out.println(s.containsDuplicate(nums2));

     }
 }