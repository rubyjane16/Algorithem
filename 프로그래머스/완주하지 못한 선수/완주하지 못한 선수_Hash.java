import java.util.HashMap;
class Solution {
    public String solution(String[] participant, String[] completion) {
          String answer = "";
       // 1.해쉬맵을 만든다.
        HashMap<String, Integer> map=new HashMap<>();
        for(String player : participant)
            map.put(player,map.getOrDefault(player,0)+1);//동명이인 존재 가능성 때문에
        //2.해쉬맵을  뺀다. 
        for(String player : completion)
            map.put(player, map.get(player)-1); //value값 변경
        //3. value가 0이 아닌 마지막 주자를 찾는다.
        for(String key : map.keySet()){
            if(map.get(key)!=0){
             answer=key;
              break;
            }     
         }
         return answer;
    }
}
