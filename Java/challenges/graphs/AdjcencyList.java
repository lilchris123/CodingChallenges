package challenges.graphs;
import java.util.List;
import java.util.ArrayList;

public class AdjcencyList {
    // A utility function to add an edge in an undirected graph 
    public static void addEdge(List<ArrayList<Integer> > adj, int v, int u) { 
        adj.get(v).add(u); 
        //adj.get(u).add(v); 
    } 

    public static void convert(int[][] m, List<ArrayList<Integer> > adj){
        int N= m.length;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                //if cell is 1 add j as an edge to vertex, else j its not an edge add 0
                if(m[i][j] == 1){
                    AdjcencyList.addEdge(adj, i, j);
                }
                else
                    AdjcencyList.addEdge(adj, i, 0);
            }
        }
    }
    public static void convert(List<String[]> m, List<ArrayList<Integer> > adj){
        int N= m.size();
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(m.get(i)[j].equals("1")){
                    AdjcencyList.addEdge(adj, i, j);
                }
                else
                    AdjcencyList.addEdge(adj, i, 0);
            }
        }
    }
  
    // A utility function to print the adjacency list 
    // representation of graph 
    public static void printGraph(List<ArrayList<Integer> > adj) 
    { 
        for (int i = 0; i < adj.size(); i++) { 
            System.out.println("\nAdjacency list of vertex " + i); 
            //System.out.print("head"); 
            for (int j = 0; j < adj.get(i).size(); j++) { 
                System.out.print(" -> "+adj.get(i).get(j)); 
            } 
            System.out.println(); 
        } 
    } 

    public static void printAdj(List<ArrayList<Integer>> adj){
        int N= adj.size();

        for(int i=0; i< N; i++){
            System.out.print(i+ " ");
            for(int j=0; j< N; j++){
                if(j == N-1)
                    System.out.print(adj.get(i).get(j));
                else
                    System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
