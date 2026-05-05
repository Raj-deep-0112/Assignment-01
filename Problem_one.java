import java.util.*;

public class Problem_one {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next(); 
        int n = s.length();
        String newString = s + s;

        int[] freq = new int[26];

        int left = 0;
        int currentSum = 0;
        int maxSum = 0;

        for (int right = 0; right < newString.length(); right++) {

            char ch = newString.charAt(right);
            int index = ch - 'a';

            while (freq[index] > 0 || (right - left + 1) > n) {

                char removeChar = newString.charAt(left);
                int removeIndex = removeChar - 'a';
                freq[removeIndex]--;
                currentSum -= (removeChar - 'a' + 1);
                left++;
            }

            freq[index]++;
            currentSum += (ch - 'a' + 1);

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        System.out.println(maxSum);
    }
}
