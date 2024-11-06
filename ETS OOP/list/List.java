package list;

public class List {
    protected boolean empty;
    protected int head;
    protected List tail;
    
    List(int x, List t) {
        empty = false;
        head = x;
        tail = t;
    }
    List() {
        empty = true;
    }
    
    static List cons(int x, List t) {
        return new List(x, t);
    }
    static List nil() {
        return new List();
    }
    boolean empty() {
        return empty;
    }
    int head() {
        return head;
    }
    List tail() {
        return tail;
    }
}
