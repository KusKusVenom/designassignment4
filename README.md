 Report — Assignment 4

 Datasets
- `data/tasks.json` — n=8, m=7, cyclic (one SCC of size 3), weight_model=edge

 Results (example run)
- SCCs: [ [1,2,3], [0], [4], [5], [6], [7] ]
- Condensation topo order: e.g. [2,3,4,5,1,0]
- Shortest distances from source (component of node 4): computed on condensation graph
- Critical path (longest): 4->5->6->7 length 8

 Notes
- Weight model used: edge weights.
- To extend: dataset generator, metrics CSV output, JUnit tests.
