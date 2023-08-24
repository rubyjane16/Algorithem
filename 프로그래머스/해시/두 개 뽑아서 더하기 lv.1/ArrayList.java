import java.util.Arrays;
import java.util.ArrayList;
class Solution {
   public int[] solution(int[] numbers){
       ArrayList<Integer>arr=new ArrayList<>();
    
        for(int i=0; i<numbers.length-1;i++){
            for(int j=i+1; j<numbers.length; j++){
                int answer=numbers[i]+numbers[j];
                if(arr.indexOf(answer)<0){//배열에 없는 수면
                    arr.add(answer);
                  
                }
            }
        }
       
      int[] answer=new int[arr.size()];
       for(int i=0; i<arr.size(); i++){
           answer[i]=arr.get(i);
       }
        Arrays.sort(answer);
        return answer;
    }
}
