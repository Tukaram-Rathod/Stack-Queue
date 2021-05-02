public class MyQueue {
    private final MyLinkedList myLinkedList;

    public MyQueue() {
        this.myLinkedList = new MyLinkedList();
    }
    public void enqueue(INode myNode) {
        myLinkedList.append(myNode);
    }

    public void printQueue() {
        myLinkedList.printmyNodes();
    }
    public INode dequeue(){
        INode tempNode = myLinkedList.pop();
        return tempNode;
    }
}
