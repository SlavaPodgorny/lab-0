import java.util.LinkedList;

public class Stack {
    private LinkedList<Object> data = new LinkedList<Object>();
    private int top = -1;

    public static final int depth = 5;

    public Stack(){ }

    public void push(Object element){
        if (top + 1 == depth){
            throw new StackOverflowError();
        }
        data.push(element);
        top++;
    }
    public Object pop() throws Exception{
        if (top < 0){
            throw new Exception("Stack is empty");
        }
        top--;
        return data.poll();
    }
}
