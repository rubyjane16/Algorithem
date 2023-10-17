import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
       
        HashSet<Integer>resSet=new HashSet<>(); //순서가 없음
        HashSet<Integer>lostSet=new HashSet<>();
        
     
        for(int i : reserve){
            resSet.add(i);
        }
        for(int i:lost){
            if(resSet.contains(i)) //중복제거
                resSet.remove(i);
            else
                lostSet.add(i);
        }
        
        //2. 여분을 기준으로 앞뒤로 비교 
        for(int i : resSet){
            if(lostSet.contains(i-1))//resSet의 i값의 -1
                lostSet.remove(i-1);
           else if(lostSet.contains(i+1))
                lostSet.remove(i+1);
        }
        
        return n-lostSet.size();
    }
}
