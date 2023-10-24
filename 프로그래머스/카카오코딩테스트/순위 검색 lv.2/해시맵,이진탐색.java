import java.util.*; 
class Solution {
    public int[] solution(String[] info, String[] query) {
        //1.INFO를 기반으로 hashmap을 만든다.
        Map<String, ArrayList<Integer>>hashMap=new HashMap<>();
        
        for(String i:info){
            String[] data=i.split(" ");
            String[] languges={data[0],"-"}; //둘 중에 하나
             String[] jobs={data[1],"-"};
             String[] exps={data[2],"-"};
             String[] foods={data[3],"-"};
            Integer value = Integer.parseInt(data[4]); //점수
            for(String lang : languges)
                for(String job:jobs)
                    for(String exp:exps)
                        for(String food:foods){
                            String[] keyData={lang,job,exp, food}; //조합이 들어감
                            String key=String.join(" ",keyData);//한칸씩 띄어서 붙인 하나의 스트링
                            ArrayList<Integer>arr=hashMap.getOrDefault(key,new ArrayList<Integer>());//키가 있을땐 키에 상응하는 리스트를 반환, 없을 땐 빈 리스트를 반환할 것
                            arr.add(value);
                            hashMap.put(key,arr);
                        }    
            }
        
        
        //2. 각 hashMap의 value를 오름차순으로 정렬한다.
        for(ArrayList<Integer> arr : hashMap.values()){
            arr.sort(null); //정렬
        }
        
        //3. query 조건에 맞는 지원자를 가져온다.
        int[]answer=new int[query.length];
        int i=0;
        for(String q:query){
            String[] data=q.split(" and "); //and 기준으로 잘라서 data배열에 넣음
            int target= Integer.parseInt(data[3].split(" ")[1]); //3번째 스트링 잘라서 그 1번째가 점수이다.
            data[3]=data[3].split(" ")[0];//점수 빼고 푸드만 담음
            String key=String.join(" ",data);
            
            if(hashMap.containsKey(key)){//쿼리에 맞는 키가 있으면
                ArrayList<Integer>list=hashMap.get(key);//그 점수 리스트를 가져옴
                
                //4.binary serch를 통해서 lower-bound를 찾는다.
                int left=0;
                int right=list.size();//0부터 끝까지
                while(left<right){
                    int mid=(left+right)/2;
                    if(list.get(mid)>=target)
                        right=mid;
                    else
                        left=mid+1;
                }
                answer[i]=list.size()-left;
                
            }i++;
        }
        return answer;
    }
}
