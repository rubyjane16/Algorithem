import java.util.HashSet;
import java.util.Iterator;
class Solution {
     //set 중복되는 조합을 제거한다.
     HashSet<Integer> numberSet = new HashSet<>();
    
    public boolean isPrime(int num){
        //1.0과 1 은 소수가 아니다.
        if(num==0||num==1)
            return false;
        
        //2.에라토스테네스의 체의 limit을 계산한다. 
        int lim=(int)Math.sqrt(num);  //숫자에 루트를 씌운 값까지만 확인하면 소수인지 아닌지 알 수 있다. 
        
        //3.limit까지만 배수 여부를 확인한다. 
        for(int i=2; i<=lim; i++){
            if(num%i==0) //배수라면
                return false;
        }
        return true;
    }
    public void recursive(String comb, String others){
       
       // 1.현재 조합을 set에 추가한다. 
        if(!comb.equals(""))//빈칸이 아니면
         numberSet.add(Integer.valueOf(comb));//정수로 변환
        
        //2. 남은 숫자 중 한개를 더 해 새로운 조합을  만든다.
        for(int i=0; i<others.length(); i++){
            recursive(comb+others.charAt(i),others.substring(0,i)+others.substring(i+1)); //others중 하나만 더해주고 쓰지 않은 숫자들을 매개변수 others에 넣는다. 
                      
        }
    }
    public int solution(String numbers) {
        
        int count=0;
        //1.모든 숫자의 조합을 만든다.
        recursive("",numbers);
        
        //2.그 중에 소수의 갯수를 센다
        Iterator<Integer> it=numberSet.iterator();
        while(it.hasNext()){//다음 요소가 있으면
            int number=it.next();//다음 요소를 꺼낸다.
            if(isPrime(number)) //true이면
                count++;
        }
      
        
        //3.소수의 개수를 반환한다.
        return count;
           
    }
}
