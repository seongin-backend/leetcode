package problem1221;

public class Solution1221 {
    public int balancedStringSplit(String s) {
        int count = 0;
        int balance = 0; // 'L'과 'R'의 균형을 유지하기 위한 변수

        for (char c : s.toCharArray()) {
            if (c == 'L') {
                balance++;
            } else {
                balance--;
            }

            if (balance == 0) {
                count++;
            }
        }

        return count;

    }
    public static void main(String[] args) {
        Solution1221 solution = new Solution1221();

        String s1 = "RLRRLLRLRL";
        System.out.println("Output for " + s1 + ": " + solution.balancedStringSplit(s1));

        String s2 = "RLRRRLLRLL";
        System.out.println("Output for " + s2 + ": " + solution.balancedStringSplit(s2));

        String s3 = "LLLLRRRR";
        System.out.println("Output for " + s3 + ": " + solution.balancedStringSplit(s3));
    }

}