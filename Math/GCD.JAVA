public class Solution {
    public int gcd(int A, int B) {
        if(A>B){
            while(B>0){
                int k = A%B;
                A = B;
                B= k;
            }
            return A;
        }
        else{
            while(A>0){
                int k = B%A;
                B =A;
                A = k;
            }
            return B;
        }
    }
}
