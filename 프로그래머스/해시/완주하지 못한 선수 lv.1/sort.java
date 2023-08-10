import java.util.Arrays;
class Solution {
  
     
      
    public String solution(String[] participant, String[] completion) {
    // 1. 두 배열을 정렬한다 
        Arrays.sort(participant);
        Arrays.sort(completion);

   //   2. 다를 때 까지 찾는다. 
        int i=0;
        for(; i<completion.length; i++){ //array의 길이는 length로 
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
}
      // 3. 여기까지 왔으면 마지막 주자가 완주하지 못한 선수다.
            return participant[i];
        
    }
}
