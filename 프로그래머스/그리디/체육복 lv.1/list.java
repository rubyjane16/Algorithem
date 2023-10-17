import java.util.*;
class Solution {//바로 앞번호나 뒷번호에만 빌려줄 수 있다+-1
    //최대한 많은 학생수 리턴
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        System.out.print(answer);
        //1.여분 기준으로 리스트 만들기
        List<Integer>have=new ArrayList<>();//리스트는 순서가 있고 셋은 순서가 없다
        //hava는 1명 이상이다
        
        for(int i=0; i<reserve.length; i++){
            have.add(reserve[i]);
        }
        
        //2.잃어버린 학생 기준으로 앞뒤 확인하기
        for(int i=0; i<lost.length; i++){
           int haveStudent=have.remove(0);//0번 인덱스값 반환하고 삭제됨.
            //remove 되면서 리스트가 비어서 에러??
            int temp=lost[i];
            if(have.contains(temp)){ //중복인지 확인
                continue;
            }
             if(haveStudent==(temp-1))
                 //reserve에 lost에 있거나 1크거나 1작은 애가 있으면 삭제되고 answer증가
                    answer++; //있으면 총학생 증가 
            else if(haveStudent==(temp+1))
                answer++;

            else
                have.add(haveStudent);//다시 넣음
        }
     
        return answer;
    }
}
