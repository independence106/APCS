import thing.LList;

public class NodeQueue<T> implements Queue<T> {
    
    private LList<T> queue;
    private int size;

    public NodeQueue() {
        queue = new LList<T>();
        size = 0;
    }

    public void enqueue(T element) {
        queue.add(element);
    }
    
    public T dequeue() {
        return queue.remove(0);
    }

    public T peekFront() {
        return queue.get(0);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {
        return queue.toString();
    }

    public static void main(String[] args) {
        NodeQueue<String> elmeo = new NodeQueue<String>();
        elmeo.enqueue("sans");   
        System.out.println(elmeo);
        elmeo.enqueue("elmo");   
        System.out.println(elmeo);
        elmeo.enqueue("bigbird");   
        System.out.println(elmeo);
    }
}
