public class Solution {
    public int reverse(int A) {
        int sign=1;
        if(A<0){
            sign = -1;
            A=Math.abs(A);
        }
        int rev = 0;
        int k=0;
        while(A>0){
            int rem=A%10;
if(rev>Integer.MAX_VALUE/10||(rev==Integer.MAX_VALUE / 10 && rem > 7)) return 0;
if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && rem < -8)) return 0;
rev = rev*10+rem;
            A=A/10;
        }
        return sign*rev;
    }
}
