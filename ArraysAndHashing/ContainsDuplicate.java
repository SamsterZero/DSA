package ArraysAndHashing;

import java.util.Arrays;

class ContainsDuplicate{

    public boolean hasDuplicate(int[] nums) {
            
        return Arrays.stream(nums)
                .distinct()
                .count() != nums.length;
    }
}