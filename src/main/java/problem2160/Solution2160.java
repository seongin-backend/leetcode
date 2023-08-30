package problem2160;

public class Solution2160 {
    public int minSum(int num) {
        String numStr = Integer.toString(num);
        int n = numStr.length();

        int minSum = Integer.MAX_VALUE;

        // 반복문을 통해 가능한 모든 나누는 위치를 탐색합니다.
        for (int i = 1; i < n; i++) {
            String num1Str = numStr.substring(0, i);
            String num2Str = numStr.substring(i);

            int num1 = Integer.parseInt(num1Str);
            int num2 = Integer.parseInt(num2Str);

            int sum = num1 + num2;
            minSum = Math.min(minSum, sum);
        }

        return minSum;
    }


    public static void main(String[] args) {
        Solution2160 solution = new Solution2160();

        int num1 = 2932;
        System.out.println("Output for " + num1 + ": " + solution.minSum(num1));

        int num2 = 4009;
        System.out.println("Output for " + num2 + ": " + solution.minSum(num2));
    }

}
