class P2 {
    public static int[] selectionSort(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
           int mini=i;
           for(int j=i+1;j<nums.length;j++){
                if(nums[mini]>nums[j]){
                    mini=j;
                }
           }
           int temp=nums[mini];
           nums[mini]=nums[i];
           nums[i]=temp;

        }

        return nums;
    }

    public static void main(String [] args){
        int [] arr = {1,3,2,4,1,2,9,4,5};
        int [] arr2 = selectionSort(arr);
        for(int num:(arr2)){
            System.out.println(num);
        }
    }
}