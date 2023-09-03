
class Solution {
    public String solution(String new_id) {
        String answer = "";
        //1.소문자 치환
        new_id=new_id.toLowerCase();
        //2
        answer=new_id.replaceAll("[^a-z0-9-_.]","");
        //3
        answer=answer.replaceAll("\\.+",".");
        //4
        answer=answer.replaceAll("^[.]|[.]$","");
        //5.
        if(answer.isEmpty())
            answer="a";
        //6
        if(answer.length()>15){
            answer=answer.substring(0,15);
            answer=answer.replaceAll("[.]$","");
            }
        //7
        while(answer.length()<3){
        answer+=answer.charAt(answer.length()-1);
        }
        
        return answer;
    }
}
