# allpago

Program can be started with mvn spring-boot:run

Core algorithm is Dijkstra shortest path algorith,
each path can be represented as a node containing a 
source,destination and difficulty. These nodes
are added to a graph and the algorithm works
out the shortest pathway to that particular node.

Once a pathway is specified using source
and destination the weight is computed
using the greater of the actual weight or
volumetric weight. Once that is computed
it is then calculated with the shortest pathway
found.

A REST API was created for testing below

POST
localhost:8080/post/pathdata

source: String -source node
destination : String -destination node
box: String - dimentions of box
edges : {
  source: String - source
  destination: String - destination
  weight: Int - containing units of hard from source to destination
}


Example:
{"source":"Alice",
"destination":"Bill",
"box":"1x1x1x1000",
"edges":[{"source":"Alice","destination":"Bob","weight":10},
{"source":"Bob","destination":"Bill","weight":5},
{"source":"Alice","destination":"Mark","weight":11}]}
