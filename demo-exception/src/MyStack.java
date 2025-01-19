import java.util.LinkedList;

public class MyStack<T> {
    // Last in First out
    // in -> push
    // out -> pop
    // restrict LinkedList to serve your purpose
    private LinkedList<T> linkedList;

    public MyStack() {
        this.linkedList = new LinkedList<>();
    }

    public T pop() {
        return this.linkedList.pollLast();
    }

    public void push(T data) {
        this.linkedList.addLast(data);
    }

    public static void main(String[] args) {
        MyStack<String> strings = new MyStack<>();
        strings.push("ABC");
        strings.push("DEF");
        System.out.println(strings.pop()); // DEF
    }

}
