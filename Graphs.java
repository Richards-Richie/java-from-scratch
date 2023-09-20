import java.util.*;
public class Graphs {
    public static ArrayList<Edge>[] graph=new ArrayList[4];
    static class Edge{
        int source;
        int destination;
        int weight;
        public Edge(int s,int d,int w){
            this.source=s;
            this.destination=d;
            this.weight=w;
        }
    }
    public static void createEdge(int v){
        //initially the graph array is stored with null values
        //now create a empyt array list
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<Edge>();
        } 
        graph[0].add(new Edge(0,1,10));
        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,2,5));
        graph[1].add(new Edge(1,3,7));
        graph[2].add(new Edge(2,1,5));
        graph[3].add(new Edge(3,2,7));

    }
    public static List<Integer> getNeighbor(){
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<graph[1].size();i++){
            Edge e=graph[1].get(i);
            ans.add(e.destination);
        }
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
        return ans;
    }
    public static void BFSTraversal(){

    }
    public static void main(String[] args) {
        createEdge(4);
        getNeighbor();
    }
}
