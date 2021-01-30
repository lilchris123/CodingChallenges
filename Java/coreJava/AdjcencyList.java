package coreJava;
import java.util.List;
import java.util.ArrayList;

public class AdjcencyList {
    // A utility function to add an edge in an 
    // undirected graph 
    public static void addEdge(List<ArrayList<Integer> > adj, int u, int v) 
    { 
        //adj.get(u).set(v,v); 
        adj.get(v).set(u,u); 
    } 

    public static void convert(char[][] m, List<ArrayList<Integer> > adj){
        int N= m.length;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(m[i][j] == '1'){
                    AdjcencyList.addEdge(adj, i, j);
                }
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
