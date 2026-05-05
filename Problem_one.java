public class Problem_One {
    public static void main(String[] args) {
        String s = "abca";
        int n = s.length();
        int maxSum = 0;

        String doubled = s + s; 

        for (int i = 0; i < n; i++) {
            boolean[] seen = new boolean[26];
            int sum = 0;

            for (int j = i; j < i + n; j++) {
                char ch = doubled.charAt(j);

                if (seen[ch - 'a']) {
                    break;
                }
                seen[ch - 'a'] = true;
                sum += (ch - 'a' + 1);
                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println(maxSum);
    }
}
