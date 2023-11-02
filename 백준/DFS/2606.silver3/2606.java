import java.util.*;

class Main{
    static int node,realated;
    static boolean[][] map;
    static boolean[] visited;
   static int answer;

    public static void dfs(int start){
        answer++;
        visited[start]=true;
        for(int i=1; i<=node; i++){
            if(!visited[i]&&map[start][i]) //연결돼있으면
            dfs(i);
        }
    }

       
    public static void main(String args[]){
        //bfs 1부터 연결노드의 갯수
        //그래프를 만들어서 연결된 걸 1로 표기
        //이중배열?
        Scanner sc=new Scanner(System.in);
        node=sc.nextInt();
        realated=sc.nextInt();

        map=new boolean[node+1][node+1];
        visited=new boolean[node+1];//1번부터 시작하니까

        for(int i=0; i<realated; i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            map[x][y]=map[y][x]=true;
        }
        dfs(1);
        
        System.out.println(answer-1); //자기 자신 빼고
        sc.close();
    
    }

}
