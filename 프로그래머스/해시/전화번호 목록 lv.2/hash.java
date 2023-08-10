import java.util.HashMap;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        //1.해시맵을 만든다.
        HashMap<String, Integer>map=new HashMap<>();
        
        for(int i=0; i<phone_book.length; i++){
            map.put(phone_book[i],1);
            }
        
        //2. 모든 전화번호의 접두어가 해시맵에 있는지 확읺한다.
       for(int i=0; i<phone_book.length; i++)
           for(int j=1; j<phone_book[i].length(); j++)//접두어의 길이를 정함
               //phone_book[i]의 길이 미만까지만 loop를 돌기때문에 자기 자신을 자연스럽게 걸러진다.
               if(map.containsKey(phone_book[i].substring(0,j)))//0부터 j까지니까 j=1로 시작
                   return false;
                   
           //3.여기까지 끝까지 없으면 접두어가 없는 것이다. 
         return answer;
    }
}
