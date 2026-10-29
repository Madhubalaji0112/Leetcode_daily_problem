class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Boolean[] arr = new Boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = false;
        }
        for(int i=0;i<nums.length;i++){
            arr[nums[i]-1] = true;
        }
        for(int i=0;i<nums.length;i++){
            if(arr[i] == false){
                list.add(i+1);
            }
        }
        return list;
    }
}