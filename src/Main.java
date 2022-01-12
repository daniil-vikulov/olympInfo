import javax.swing.plaf.basic.BasicScrollPaneUI;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack a = new Stack();
        for (int i = 0; i < 15; i++) {
            a.add(i + 1);
            System.out.println(a);
        }
        a.removeLast();
        System.out.println(a);
    }
}

class Stack{
    Object[] a;
    int lastIndex = -1;

    public Stack(){
        a = new Object[10];
    }

    public Stack(int capacity){
        if (capacity < 1){
            capacity = 1;
        }
        a = new Object[capacity];
    }

    public void add(int e){
        lastIndex++;
        if (lastIndex == a.length){
            Object[] arr = new Object[a.length*2];
            for (int i = 0; i < a.length; i++) {
                arr[i] = a[i];
            }
            a = arr;
        }
        a[lastIndex] = e;
    }

    public void removeLast(){
        a[a.length - 1] = null;
        lastIndex--;
    }

    public Object getLast(){
        return a[a.length-1];
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i <= lastIndex; i++) {
            str += (a[i] + " ");
        }
        return str;
    }
}

