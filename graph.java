public class Edge { public int to, w; public Edge(int to, int w){this.to=to;this.w=w;} }
public class Graph {
  private final int n;
  private final List<List<Edge>> adj;
  public Graph(int n){ this.n=n; adj=new ArrayList<>(); for(int i=0;i<n;i++) adj.add(new ArrayList<>()); }
  public void addEdge(int u,int v,int w){ adj.get(u).add(new Edge(v,w)); }
  public List<Edge> neighbors(int u){ return adj.get(u); }
  public int size(){ return n; }
}
