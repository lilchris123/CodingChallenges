class Graph {
  constructor() {
    //Adjacency List Map of our graph 
    this.adjList = {};
    // Or this.adjList = new Map();
  }

  //add vertex to our map and it's adjacency list
  addVertex(v) {
    this.adjList[v] = [];
  }

  //add new edge by adding its adjacent vertex its adjacency list
  //Undirected version of add Edge
  addEdge(u, v) {
    this.adjList[u].push(v);
    this.adjList[v].push(u);
  }

  printAdjacencyList() {
      // get the an array containg all the vertices of the adjacency list
    const vertices = Object.keys(this.adjList);

    for (let v of vertices) {
      console.log("Adjacency list of vertex\n" + v + "\n head");
      for (let x = 0; x < this.adjList[v].length; x++)
        console.log(`->${this.adjList[v][x]}`);
    }
  }
}

let g = new Graph();
var vertices = ["A", "B", "C"];

for (let i = 0; i < vertices.length; i++) g.addVertex(vertices[i]);

g.addEdge("A", "C");
g.addEdge("B", "C");

console.log(g.printAdjacencyList());
