import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {//1.큐 만들기
        List<PrintJob>printer=new ArrayList<PrintJob>(); //배열을 만들텐데 각각의 원소는 printjob이 된다.
        for(int i=0; i<priorities.length; i++){
            printer.add(new PrintJob(priorities[i],i));
        }
        
        int answer = 0;
        while(!printer.isEmpty()){
            //2.0번을 꺼내서 max priroity가 아니면 다시 끝에 넣는다.
            PrintJob job = printer.remove(0); //맨 앞에 있는 녀석 꺼냄
            if(printer.stream().anyMatch(otherJob->job.priority<otherJob.priority)){//printer에 있는 걸 전부 하나씩 꺼내왔다치고,충족하는 게 있냐
            printer.add(job);
        }else{
            //3.max priority이면 내가 찾는 job이 맞는지 확인한다.
            answer++;
            if(location==job.location){
                break;
            }
        }       
        }
        return answer;
    }


class PrintJob{
        int priority;
        int location;
        public PrintJob(int priority, int location){
            this.location=location;
            this.priority=priority;
        }
    }
}
