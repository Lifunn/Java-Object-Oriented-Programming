package list;

public class ListOps extends List {
    static List append(List a, List b) {
        if (a.empty())
            return b;
        else
            return cons(a.head(), append(a.tail(), b));
    }
    static List addtoend(List a, int x) {
        return append(a, cons(x, List.nil()));
    }
    static List addtoendr(List a, int x) {
        if (a.empty()) 
            return cons(x, List.nil());
        else {
            return cons(a.head(), addtoendr(a.tail(), x));
        }
    }
    static List reverse(List a) {
        if (a.empty())
            return List.nil();
        else
            return addtoend(reverse(a.tail()), a.head());
    }
    static int max(List a) throws ListException {
        if (a.empty())
            throw new ListException("The list is empty");
        else if (a.tail().empty())
            return a.head();
        else
            return max2(a.head(), max(a.tail()));
    }
    static int max2(int x, int y) {
        if (x <= y)
            return y;
        else
            return x;
    }
    static void printList(List a) {
        if (a.empty()) return;
        else if (a.tail().empty())
            System.out.print(a.head());
        else {
            System.out.print(a.head());
            System.out.print(", ");
            printList(a.tail());
        }
    }
    static List readList(int n, String s) {
        if (n == 0)
            return List.nil();
        else {
            List list = readList(n - 1, s);
            int i = Integer.parseInt(s);
            return addtoend(list, i);
        }
    }
}
