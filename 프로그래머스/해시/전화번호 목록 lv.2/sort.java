import java.util.*; 
class Solution {
    public boolean solution(String[] phone_book) {
      
        boolean answer = true;
        // 1. string 숫자를 sort하면 맨앞자리 기준으로 정렬된다. ex) 10 2 30  
          Arrays.sort(phone_book);
        //2. 하나의 for문으로 바로 다음 수에 포함되어있는지 확인한다.  
        for(int i=0; i<phone_book.length-1; i++){
            if(phone_book[i+1].startsWith(phone_book[i])){
               return false;
            }
        }
        //3. 여기까지 오지 못했다면 접두어가 없다는 것이다. 
      
        return answer;
    }
}
