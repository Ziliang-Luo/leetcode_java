/** "loveleetcode" "e"
 *  1. put 0 at all position equals to e, and max at all other position
 *     we will get [max, max, max, 0, max, 0, 0, max, max, max, max, 0]
 *  2. scan from left to right, if =max, skip, else dist[i+1] = Math.min(dp[i] + 1, dp[i+1]),
 *     we can get [max, max, max, 0, 1, 0, 0, 1, 2, 3, 4, 0]
 *  3. scan from right to left, use dp[i-1] = Math.min(dp[i] + 1, dp[i-1])
 *     we will get[3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
 */
public class E821 {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] dist = new int[n];
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) continue;
            dist[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < n-1; i++) {
            if (dist[i] == Integer.MAX_VALUE) continue;
            else dist[i + 1] = Math.min(dist[i+1], dist[i] + 1);
        }
        for (int i = n-1; i > 0; i--) {
            dist[i-1] = Math.min(dist[i-1], dist[i] + 1);
        }
        return dist;
    }

    public static void main(String[] args) {
        String S = "loveleetcode";
        Character C = 'e';
        //shortestToChar(S,C);
    }
}
