import java.util.Arrays;
class Solution {
   /* 1. 두 배열을 정렬한다 
        2. 다를 때 까지 찾는다. 
        3. 여기까지 왔으면 마지막 주자가 완주하지 못한 선수다. */
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i=0;
        for(; i<completion.length; i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
}
       // if(i.equals(completion.length))
            return participant[i];
        
    }
}
