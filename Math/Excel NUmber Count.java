/*Easiest Solution */
public class Solution {
    public int titleToNumber(String A) {
    int sum=0;
    for(int i=0;i<A.length();i++){
        sum = sum*26;
        sum = sum + A.charAt(i)-'A'+1;
    }
        return sum;
    }
}
