import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BinaryHeap<Integer> test = new BinaryHeap<>();
        test.add(1);
        test.add(3);
        test.add(5);
        test.add(6);
        test.add(9);
        test.add(7);
        test.add(8);
        test.add(11);
        test.add(15);
        test.add(20);
        System.out.println(test.getElements());
    }
}
