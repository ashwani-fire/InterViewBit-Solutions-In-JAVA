public class Solution {
    public int perfectPeak(ArrayList<Integer> A) {
        int i = 1;
        int max = A.get(0);
        while(i<A.size()){
            if(max<A.get(i)){
                int ele = A.get(i);
                int j = A.size()-2;
                int min = A.get(A.size()-1);
                while(j>i){
                     //   min = Math.min(min,A.get(j);
                    
                    min = Math.min(min,A.get(j));
                    j--;
                }
                if(ele<min){
                    return 1;
                }
            }
            max = Math.max(A.get(i),max);
            i++;
        }
        return 0;
    }
