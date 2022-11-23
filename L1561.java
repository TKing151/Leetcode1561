class Solution {
    public int maxCoins(int[] piles) {
       Arrays.sort(piles);
        int res = 0, n = piles.length;
        for (int i = n / 3; i < n; i += 2)
            res += piles[i];
        return res;
    }
}
/*
Time complexity of O(nlog(n)); space complexity of O(nlog(n)). 
This is the case due to the sorting of the Array. 
*/
