
public class Solution {
    public String convertToTitle(int A) {
        		StringBuilder sb = new StringBuilder();

        int i=0;
        while(A>0){
         if (A%26 == 0) {
                sb.append("Z");
                A = A/26 - 1;
            }
else{
            int k=A%26+'A'-1;
            char c = (char)k;
           
            sb.append(c);
            A=A/26;
}
        }
        sb=sb.reverse();
            return sb.toString();
 
    }
}
