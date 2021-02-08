public class Solution {
    public int maxSubArray(final List<Integer> A) {
        //int i=0;
        int sum = 0;
        int msum = Integer.MIN_VALUE;
        for(int i=0;i<A.size();i++ ){
            sum = sum+A.get(i);
            if(msum<sum){
                msum = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return msum;
    }
}
