import java.util.*;
class Solution {
      List<String>answerList=new ArrayList<>();//전역변수로 선언
        Map<String,Integer>hashMap=new HashMap<>();
    public String[] solution(String[] orders, int[] course) {
      
        //1.각 order 정렬
       for(int i=0; i<orders.length; i++){
           char[] arr=orders[i].toCharArray(); //string 자체를 정렬할 수 없어서 char로 형변환 해준다
           Arrays.sort(arr);
           orders[i]=String.valueOf(arr);
       } 
       
        //2. 각 order를 기준으로 courselength만큼의 조합 만들기
        for(int courseLength: course){
            for(String order: orders)
                combination("",order,courseLength);
            //3. 가장 많은 조합은 answer에 저장한다.
            if(!hashMap.isEmpty()){
                List<Integer>countList=new ArrayList<>(hashMap.values());//바로 들어감?
                int max=Collections.max(countList);
                
                if(max>1){
                    for(String key: hashMap.keySet())//각각의 key를 꺼내와서
                        if(hashMap.get(key)==max)//그 key의 value가 max랑 같다면 //hashmap.get(key) : key에 해당하는 value를 가져오는 함수
                            answerList.add(key);
                }hashMap.clear();
            }
        }
    
       Collections.sort(answerList);
        String[] answer = new String[answerList.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=answerList.get(i);
        }
        return answer;
    }
    public void combination(String order,String others, int count){
        //탈출조건
        if(count==0){
            hashMap.put(order,hashMap.getOrDefault(order,0)+1);
            //key값이 같으면 기존보다 value에 1 더해줌
            return;
        }
        //수행동작: 0부터 length까지 조합
        for(int i=0; i<others.length(); i++){
            combination(order+others.charAt(i),others.substring(i+1),count-1);
        }
    }
}
