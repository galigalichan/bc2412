public class Node {
    private Node node; // the next node's address
    // private String name; // address
    private int value;

    public Node() {

    }

    public Node(int value) {
        this.value = value;
    }

    public Node(Node node) {
        this.node = node;
    }

    public Node(Node node, int value) {
        this.node = node;
        this.value = value;
    }

    // You are setting the next node to the current node
    public void setNode(Node node) {
        this.node = node;
    }

    // getter
    // public Node getNode() {}
    public Node next() {
        return this.node;
    }

    public int getValue() {
        return this.value;
    }

    public static void main(String[] args) {
        // 3 objects
        Node head = new Node(40);
        Node node2 = new Node(50);
        head.setNode(node2); // set the next node into "head"
        Node node3 = new Node(60);
        node2.setNode(node3);
        node2.setNode(new Node(70)); // lost "new Node(70)" address, but we just concern the address of "head"

        Node temp = head; // safeguard the address of "head"
        while(temp != null) { // Can I exit? // we don't have "i" here, so we cannot use "for loop"
            System.out.println(temp.getValue()); // 40 50 60
            // alternate method to store a series of int values
            temp = temp.next();
        }

        // array vs linkedlist
        // Storage of address
        // Array has fixed length (decided when declared)
        // Arraylist offers apparently free additions and removals.
        // But behind the scene ArrayList kills the old array and creates a new one upon calling the add() method.
        // This gives rise to fluctuations in memory (though minimal to the system).
        // Array has fixed "boxes" so we can pinpoint the address of an object instantly
        // But only node's address is only known by the one preceding it
        // LinkedList saves the address of the first and last node and the node right before and right after. (e.g. Node2 saves the address of both Node1 and Node3.)
        // When the sequence is well known, we should use arraylist since we can get to the location instantly. (e.g. the eighth customer in a queue)
        // LinkedList has to search from the beginning or from the end. (The one previous to the first node is null. The one succeeding the last node is also null.)
        // LinkedList does not concern its length (although it does store count in secret.)
        // LinkedList does not have to resize.
        // When a new customer comes to the queue, he can go directly to the end of the queue (last node). In case of ArrayList, everyone has to leave the original queue and line up in the new queue with an extra "seat".
        // The new customer can also cut the line to become the first one (since the addresses of both ends are stored)
        // LinkedList is good for things which concern the first and the last (aka queuing) (e.g. first-in, first out, first-in, last-out)
        
        // LinkedList advantages: add/remove head/tail
        // Array/ArrayList advantages: Point the object directly if you know the position
        // Person.class (name)

        // Array, LinkedList and HashMap are of paramount importance

    }
}
