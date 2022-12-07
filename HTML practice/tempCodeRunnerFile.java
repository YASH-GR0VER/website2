import java.util.*;

class SplitArrayGCD {

    public int gcd(int a,int b) {
        if(a==0) return b;
        if(b==0) return b;

        return gcd(b,a%b);
    }

    public static int splitarray(int arr[]) {
        int dp[] = new int[arr,length()+1]

        for (int i = 0;i<arr.length(); i++){
            dp[i+1]=dp[i] + 1;
            for(int j=i-1;j>=0;j--){
                if (gcd(arr[i],arr[j])>1){
                    dp[i+1] = Math.min(dp[i+1],dp[j]+1);
                }
            }
        }
        return dp[arr.length()]
    }
    
    public static void main(String[] args) {
        int arr[] = new int[]{19,28,14,20,1,3,9,5,3};
        int ans = SplitArrayGCD.splitarray(arr);
        System.out.println(ans);
    }
}