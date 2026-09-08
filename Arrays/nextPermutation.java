public class nextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i;
        for(i = n-2; i >= 0; i--) {
            if(nums[i] < nums[i+1]) {
                break;
            }
        }

        int j;
        if(i >= 0) {
                for(j = n-1; j >= 0; j--) {
                    if(nums[j] > nums[i]) {
                        break;
                    }
                
                }

                int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;

        }

        

        int left = i+1;
        int right = n-1;

        for(;left < right; left++, right--) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};

        nextPermutation obj = new nextPermutation();
        obj.nextPermutation(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
