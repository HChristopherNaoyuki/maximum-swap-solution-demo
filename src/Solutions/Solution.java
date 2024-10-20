package Solutions;

class Solution 
{
    public int maximumSwap(int num) 
    {
        String s = String.valueOf(num);
        int N = s.length();
        char[] nums = s.toCharArray();

        for (int i = 0; i < N; i++) 
        {
            int curNum = nums[i] - '0';
            int maxNum = 0;
            int maxIndex = 0;

            for (int j = i + 1; j < N; j++) 
            {
                int temp = nums[j] - '0';
                if (temp >= maxNum) 
                {
                    maxNum = temp;
                    maxIndex = j;
                }
            }

            if (maxNum > curNum) 
            {
                char temp = nums[i];
                nums[i] = nums[maxIndex];
                nums[maxIndex] = temp;

                return Integer.parseInt(new String(nums));
            }
        }
        
        return num;
    }

    public static void main(String[] args) 
    {
        Solution solution = new Solution();
        
        // Test cases
        System.out.println(solution.maximumSwap(2736)); // Output: 7236
        System.out.println(solution.maximumSwap(9973)); // Output: 9973
        System.out.println(solution.maximumSwap(1234)); // Output: 4231
    }
}
