import org.junit.Test;

public class MyQueueTest {
    @Test
    public void given3NumberWhenAddedtoQueueShouldHaveLastAddedNode(){
        MyQueue myQueue = new MyQueue();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        myQueue.printQueue();

    }
    @Test
    public void given3NumberWhenPoppedOuttoQueueShouldHaveFirstNode() {
        MyQueue myQueue = new MyQueue();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        myQueue.printQueue();
        INode tempNode = myQueue.dequeue();
        myQueue.printQueue();
        System.out.println("Deleted Node: " + tempNode.getKey());
    }
}
