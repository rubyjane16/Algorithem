import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        List<Integer>answer=new ArrayList<>();
        
        for(int i=0; i<progresses.length; i++){
            double days=(100-progresses[i])/(double)speeds[i];
            int result=(int)Math.ceil(days);
           
            int j=i+1;
            for(; j<progresses.length; j++){
                if(result*speeds[j]+progresses[j]<100)
                    break;
                
            }answer.add(j-i); //리스트는 add map은 put
            i=j-1; //j부터 다시 확인해야 하기 때문에
        }
       
        
        return answer.stream().mapToInt(i->i.intValue()).toArray();
    }
}
