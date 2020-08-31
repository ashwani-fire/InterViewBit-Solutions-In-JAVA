/*Sort The Array And Swap The Adjacent Elements */
public class Solution {
    public void swap(int A,int B){
        int temp=0;
        temp = B;
        B=A;
        A=temp;
    }
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
        Collections.sort(A);
        for(int i=0;i<A.size()-1;i=i+2){
            int tmp = A.get(i+1);
            A.get(i+1) =A.get(i);
            A.get(i) = tmp;
        }
        return A;
    }
}

