import java.util.*;
public class Main<E>{
    List<E> list = new ArrayList<>();
    int size = 0;
    int capacity;

    Main(int capacity) {
        this.size = 0;
        this.capacity = capacity;
    }

    public void add(E ele) {
        if(size >= capacity) {
            Collections.shuffle(list);
            List<E> al = new ArrayList<>();
            for(int i=0; i<size / 2; i++) {
                al.add(list.get(i));
            }
            al.add(ele);
            size /= 2;
            list = al;
        } else {
            list.add(ele);
            size++;
        }
    }

    public String toString() {
        return list.toString();
    }

    public static void main(String[] args) {
        Main<Integer> list = new Main(6);
        for(int i=1; i<=20; i++) {
            list.add(i);
            System.out.println(list.toString());
        }
    }
}