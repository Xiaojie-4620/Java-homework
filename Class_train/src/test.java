import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class test {

    public static void main(String[] args) {
        List<Integer> ss = new ArrayList<>();
        LinkedList<Object> sss = new LinkedList<>();
        ss.add(3);
        ss.add(5);
        System.out.println(ss);

        sss.add(4);
        sss.add(6);
        sss.add("woShiNi");
        sss.addLast(77);
        sss.addFirst(33);
        for(var value : sss) {
            System.out.print(value);
            System.out.print(' ');
        }
        //sss.forEach(System.out::println);
    }

}
