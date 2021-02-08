public class Solution {
    public int solve(int A, int[] B) {
        int ssum=0;
        if(ssum%3!=0) return 0;
        int sum=0,found=0,ans=0;
        for(int i=0;i<B.length-1;i++){
            sum+=B[i];//sum,ssum-sum
            if(sum==2*ssum/3){
                ans+=found;
            }
            if(sum==ssum/3){
                found++;
            }
        }
        return ans;
    }
}
