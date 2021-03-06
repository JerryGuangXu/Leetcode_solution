// Sieve of Eratosthenes
// https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes


public class Solution {
    
    public int countPrimes(int n) {
    
    if (n==0 || n==1 || n==2) return 0;
    
    int[] arr = new int[n-2];
    for (int u=0; u<n-2; u++ ) arr[u]=u+2;
    int res =0;
    
    ////  2,3,4,5,6,7,8,9
    /// For 2, start from 4, remove 4,6,8...
    
    ////i is actual number, while i-2 is index!
    for (int i=2; i*i<n; i++) {
        if (arr[i-2]==0) continue; ///// 点睛之笔！如何skip 0！
        for (int x=i*i; x<n; x+=i) arr[x-2]=0;  ////Mark all into 0.
        // System.out.println(Arrays.toString(arr));  
    }
    
    // System.out.println(Arrays.toString(arr));
    for (int j : arr) {
        if(j!=0) res+=1;
    }
    return res;
