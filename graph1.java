void dfs(int at){
  ids[at] = low[at] = id++;
  stack.push(at); onStack[at]=true;
  for (Edge e: adj.get(at)){
    int to = e.to; dfsEdges++;
    if (ids[to]==-1){ dfs(to); low[at]=Math.min(low[at], low[to]); }
    else if (onStack[to]) low[at]=Math.min(low[at], ids[to]);
  }
  if (low[at]==ids[at]){
    List<Integer> comp = new ArrayList<>();
    while(true){
      int node=stack.pop(); onStack[node]=false; comp.add(node);
      if (node==at) break;
    }
    sccs.add(comp);
  }
}
