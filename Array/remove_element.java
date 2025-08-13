// https://leetcode.com/problems/remove-element/
class remove_element {
    public int removeElement(int[] nums, int val) {
        int[] arr = new int[(nums.length)];
        int j = 0 ;
        for(int i = 0 ; i<nums.length; i ++){
            if(nums[i]!=val){
                arr[j] = nums[i];
                j++;
            }
        }
        for(int i = 0 ;i<nums.length;i++){
            nums[i]=arr[i];
        }
        return j;
    }
}