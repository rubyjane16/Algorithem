import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> arr=new ArrayList<>(); //가변길이
        
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){//문자열 하나의 길이는 length()
               int sum=numbers[i]+numbers[j];
                if(arr.indexOf(sum)<0)////배열에 없는 수면
                    arr.add(sum);                   
            }
        } //가변길이 배열은 length가 아니고 size, get 으로 받는다.
        int[] answer = new int [arr.size()];
        for(int i=0; i<arr.size(); i++){
            answer[i]=arr.get(i);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}
