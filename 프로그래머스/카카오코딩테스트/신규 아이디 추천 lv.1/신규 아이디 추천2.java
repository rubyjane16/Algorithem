class Solution {
    public String solution(String new_id) {
        String answer = "";
        //1. 소문자 치환
        new_id=new_id.toLowerCase();
        //2.indexOf() 인덱스 번호 반환 없으면 -1
        for(int i=0; i<new_id.length(); i++){
            char ch=new_id.charAt(i);
            if(Character.isDigit(ch)||Character.isAlphabetic(ch)||ch=='-'||ch=='_'||ch=='.')
            answer+=ch;
        }
       
        
        //3연속된 점 .으로 변경
        while(answer.indexOf("..")!=-1)
       answer=answer.replace("..",".");
        
        //4.마침표가 처음이나 끝에 있으면 제거
        // answer=answer.replace(".",""); 인덱스 번호와 상관없이 전부 제거가 됨
        if(!answer.isEmpty()&&answer.charAt(0)=='.')
            answer=answer.substring(1);
        if(!answer.isEmpty()&&answer.charAt(answer.length()-1)=='.')
            answer=answer.substring(0,answer.length()-1);
    
           
        
     //5.빈문자열이면 a
        if(answer.isEmpty())
            answer="a";
        //6.1 16자 이상이면 15개로 자름
        if(answer.length()>15){
            answer=answer.substring(0,15);
            if(answer.charAt(answer.length()-1)=='.')
                answer=answer.substring(0,answer.length()-1);
        }
        //7
        while(answer.length()<3)
            answer+=answer.charAt(answer.length()-1); //마지막 문자
        return answer;
    }
}
