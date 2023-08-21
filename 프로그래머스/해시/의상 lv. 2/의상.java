import java.util.HashMap;
import java.util.Iterator;
class Solution {
    //종류별로 한 종류만 입을 수 있다.
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map= new HashMap<>();
        //해쉬로 옷의 종류를 구분해준다.
        for(String [] clothe: clothes){
            String type = clothe[1];//type이 인덱스 1에 있다.
            map.put(type,map.getOrDefault(type,0)+1);//key,value
            
        }
        
        Iterator<Integer>it=map.values().iterator();
        int answer=1; //곱이기 때문에
        while(it.hasNext())
            answer*=it.next().intValue()+1;//2.입지 않는 경우(none)를 추가해서 모든 조합을 계산한다.
        
        //3. 최소 하나의 옷은 입어야하기 때문에 아무종류의 옷도 입지 않는 경우는 제외한다.
        return answer-1;
        
    }
}
