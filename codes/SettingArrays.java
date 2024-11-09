package codes;

public class SettingArrays {
    public static void main(String[] args) {
        String[][] warshalls = {
            {
                "What is the purpose of Warshall's algorithm in graph theory?",
                "Which of the following statements about Warshall's algorithm is true?",
                "What is the primary goal of Warshall's algorithm?",
                "In a graph with n vertices, what is the typical time complexity of Warshall's algorithm?",
                "Which data structure concept is most closely associated with Warshall's algorithm?",
                "Which of the following is a common use case for Warshall's algorithm?"
            },
            {
                "To find the maximum element in the graph.",
                "Warshall's algorithm always results in a Hamiltonian path.",
                "To find the maximum spanning tree (MST) of the graph.",
                "O(n)",
                "LIFO (Last In, First Out)",
                "Finding a cycle in the graph."
            },
            {
                "To visit nodes in breadth-first search order.",
                "Warshall's algorithm can only start from the first vertex.",
                "To find the transitive closure of a graph.",
                "O(n^2)",
                "FIFO (First In, First Out)",
                "Finding the shortest path between two nodes."
            },
            {
                "To check if a node is in the graph.",
                "Warshall's algorithm guarantees finding the transitive closure of a graph.",
                "To find the minimum spanning tree (MST) of the graph.",
                "O(n log n)",
                "Binary search tree traversal order.",
                "Calculating Fibonacci numbers."
            },
            {
                "To find the transitive closure of a graph.",
                "Warshall's algorithm depends on the values assigned to nodes in the graph.",
                "To remove an element from the MST.",
                "O(n^3)",
                "Linked list node insertion order.",
                "Sorting elements in the graph."
            },
            {
                "To find the transitive closure of a graph.",
                "Warshall's algorithm guarantees finding the transitive closure of a graph.",
                "To find the transitive closure of a graph.",
                "O(n^3)",
                "FIFO (First In, First Out)",
                "Finding a cycle in the graph."
            },
            {
                "The purpose of Warshall's algorithm in graph theory is to compute the transitive closure of a directed graph, determining which vertices are reachable from others.",
                "Warshall's algorithm guarantees finding the transitive closure of a graph by iteratively updating a matrix to reflect the direct and transitive reachability between vertices.",
                "The primary goal of Warshall's algorithm is to compute the transitive closure of a graph, which is essential in various graph-related operations and algorithms.",
                "In a graph with n vertices, the typical time complexity of Warshall's algorithm is O(n^3), as it involves a triple nested loop to update the reachability matrix.",
                "Warshall's algorithm is closely associated with the concept of FIFO (First In, First Out) order when updating the reachability matrix in a systematic manner.",
                "A common use case for Warshall's algorithm is determining the transitive closure of a graph to understand reachability relationships between vertices, crucial in algorithms involving connectivity and paths."
            }
        };
        for(int i = 0; i < 6; i++)
        {
            for (int j = 0; j < 7; j++)
            {
                System.out.println((j+1) + "    " + warshalls[j][i]);
            }
        }
    }
}
