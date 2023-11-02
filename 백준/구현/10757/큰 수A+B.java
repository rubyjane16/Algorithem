import java.math.BigInteger;
import java.util.Scanner;
class Main{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

      BigInteger A=new BigInteger(sc.next());
      BigInteger B=new BigInteger(sc.next());

      A=A.add(B);//biginteger 타입으로 연산됨
      System.out.println(A.toString());
    }
}
