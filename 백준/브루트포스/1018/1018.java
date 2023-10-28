import java.util.*;
class Main{
  public static int getSolution(int startRow, int startCol, String[] board){
      String[] answerBoard={"WBWBWBWB","BWBWBWBW"};
      int white=0;
      for(int i=0; i<8; i++){
        for(int j=0; j<8; j++){
             int row=i+startRow;
             int col=j+startCol;
             if(board[row].charAt(col)!=answerBoard[row%2].charAt(j))//col은 8을 초과하기 때문에
                 white++;
          }
        }
      return Math.min(white,64-white);//둘 중에 작은거
      
  }
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      
      int row=sc.nextInt();
      int col=sc.nextInt();
      sc.nextLine();//한 칸 띄워줌
      
      String []board=new String[row];
      for(int i=0; i<row; i++){
          board[i]=sc.nextLine();
      }
      
      int answer=Integer.MAX_VALUE;//표기할 수 있는 정수의 최대값 
      for(int i=0; i<=row-8; i++)
          for(int j=0; j<=col-8; j++){
              int min=getSolution(i,j,board);
              if(answer>min)
                  answer=min;           
          }
      
      System.out.print(answer);
      sc.close();
      
  }
}
