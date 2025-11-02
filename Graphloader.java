String content = Files.readString(Paths.get(path));
JSONObject obj = new JSONObject(content);
int n = obj.getInt("n");
Graph g = new Graph(n);
JSONArray edges = obj.getJSONArray("edges");
for (int i=0;i<edges.length();i++){
  JSONObject e = edges.getJSONObject(i);
  g.addEdge(e.getInt("u"), e.getInt("v"), e.getInt("w"));
}
int source = obj.optInt("source", 0);
String weightModel = obj.optString("weight_model", "edge");
