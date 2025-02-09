int min(int a, int b, int c) {
    if (a <= b && a <= c) return a;
    if (b <= a && b <= c) return b;
    return c;
}
int minDistance(char *word1, char *word2) {
    int n1 = strlen(word1);
    int n2 = strlen(word2);
    
    int dp[n1 + 1][n2 + 1];
    
    for (int i = 0; i <= n1; i++) {
        for (int j = 0; j <= n2; j++) {
            if (i == 0) {
                dp[i][j] = j; // Insert all characters of word2
            } else if (j == 0) {
                dp[i][j] = i; // Delete all characters of word1
            } else if (word1[i - 1] == word2[j - 1]) {
                dp[i][j] = dp[i - 1][j - 1]; // Characters match, no operation needed
            } else {
                dp[i][j] = 1 + min(dp[i][j - 1],      // Insert
                                   dp[i - 1][j],      // Delete
                                   dp[i - 1][j - 1]); // Replace
            }
        }
    }
    
    return dp[n1][n2];
}