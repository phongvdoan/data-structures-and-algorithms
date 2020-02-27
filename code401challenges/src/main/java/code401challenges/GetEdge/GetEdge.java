package code401challenges.GetEdge;

import code401challenges.graph.Edge;
import code401challenges.graph.Graph;
import code401challenges.graph.Node;

public class GetEdge {

    public static class DirectFlight{
        boolean neighboringNode;
        int cost;

        public DirectFlight(boolean neighboringNode, int cost) {
            this.neighboringNode = neighboringNode;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "DirectFlight{" +
                    "neighboringNode=" + neighboringNode +
                    ", cost=" + cost +
                    '}';
        }
    }

    public static DirectFlight getEdge(Graph<String> graph, String[] array){
        int cost = 0;
        boolean connection = false;
        for(int i = 0; i < array.length - 1; i++){
            for(Node<String> node : graph.getNodes()){
                if(node.value.equals(array[i])){
                   for(Edge<String> edge : node.edges){
                       if (edge.nextNode.value.equals(array[i + 1])) {
                           cost += edge.weight;
                           connection = true;
                           break;
                       } else{
                           connection = false;
                       }
                   }
                }
            }
        }
        return new DirectFlight(connection,cost);
    }
}
