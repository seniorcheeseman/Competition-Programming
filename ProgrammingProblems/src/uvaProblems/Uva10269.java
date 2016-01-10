package uvaProblems;

import java.util.PriorityQueue;
import java.util.Scanner;
class Node implements Comparable<Node>{
    int u;
    int cost;
    int k;
    public Node() {
            this.u=0;
            this.cost = 0;
            this.k = 0;
    }
    public Node(int u,int cost,int k) {
            this.u = u;
            this.cost = cost;
            this.k = k;
    }
    public int compareTo(Node other) {
            return this.cost - other.cost;
    }
}
public class Uva10269 {//todo currently wrong answers
	 public static final int NoPath = 0x3f3f3f3f;
     public static final int MAXN = 105;
   
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 int[][] G,V;
         Scanner s = new Scanner(System.in);
         int times = Integer.parseInt(s.nextLine());
         int gg = 0;
         for(int i=0; i < times; i++) {
                 G= new int[MAXN][MAXN];
                 V= new int[MAXN][MAXN];
                 for(int k=0; k < MAXN; k++)
                         for(int j=0; j < MAXN; j++){
                                 if(k==j)
                                         G[k][k] = 0;
                                 else
                                         G[k][j] = NoPath;
                                 V[k][j] = -1;
                         }
                 String[] input = s.nextLine().split(" ");
                 int A = Integer.parseInt(input[0]);
                 int B = Integer.parseInt(input[1]);
                 int M = Integer.parseInt(input[2]);                      
                 int L = Integer.parseInt(input[3]);
                 int K = Integer.parseInt(input[4]);
                 for(int j=0; j < M; j++) {
                         input = s.nextLine().split(" ");
                         int node1 = Integer.parseInt(input[0]);
                         int node2 = Integer.parseInt(input[1]);
                         int d = Integer.parseInt(input[2]);
                         G[node1][node2] = d;
                         G[node2][node1] = d;
                 }
                 floyd(G,A,B);
                 PriorityQueue<Node> pq = new PriorityQueue<Node>();
                 Node start = new Node(A+B,0,K);
                 for(int j=0; j <= K; j++)
                         V[A+B][j] = 0;
                 pq.add(start);
                 while(!pq.isEmpty()) {
                         Node curr = pq.poll();
                         int u = curr.u;
                         int cost = curr.cost;
                         int k = curr.k;
                         if(u == 1){
                                 System.out.println(cost);
                                 break;
                         }
                         Node tt = new Node(0,0,0);
                         for(int j=1; j <= A+B; j++) {
                                 if(G[u][j] != NoPath && u!= i) {
                                         if(G[u][j] <= L && (k >0  && (V[j][k-1] == -1 || V[j][k-1] > cost)) ){
                                                 V[j][k-1] = cost;
                                                 tt = new Node(j,cost,k-1);
                                                 pq.add(tt);
                                         }
                                         if(V[j][k] == -1 || V[j][k] > cost+G[u][j]){
                                                 V[j][k] = cost+ G[u][j];
                                                 tt = new Node(j,cost+G[u][j],k);
                                                 pq.add(tt);
                                         }
                                 }
                         }
                 }
         }
	}
	public static void floyd(int[][] G,int A,int B) {
         for(int k=1; k <= A ;k++) {
                 for(int i=1; i <= A+B; i++) {
                         for(int j=1; j <= A+B; j++) {
                                 if(G[i][j] > G[i][k] + G[k][j])
                                         G[i][j] = G[i][k] + G[k][j];
                         }
                 }
         }
         /*
         for(int i=1; i <= A+B; i++) {
                 for(int j=1; j <= A+B; j++) {
                         System.out.print(G[i][j] + "            " );
                 }
                 System.out.println();
         }
         */
	}
}
