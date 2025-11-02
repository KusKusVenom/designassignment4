Queue<Integer> q = new ArrayDeque<>();
for (int i=0;i<k;i++) if (indegree[i]==0){ q.add(i); kahnPushes++; }
while(!q.isEmpty()){
  int u = q.poll(); kahnPops++; order.add(u);
  for (int v: cond.neighbors(u)) if (--indegree[v]==0){ q.add(v); kahnPushes++; }
}
