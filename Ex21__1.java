import java.util.*;
public class Ex21_1 {
    public static void main(String[] args) {
        LinkedHashSet<String> x1 = new LinkedHashSet<>();
        LinkedHashSet<String> x2 = new LinkedHashSet<>();
        x1.add("BIBI");
        x1.add("GULIM");
        x1.add("Gulnaz");
        x2.add("Assel");
        x2.add("BAYAN");
        x2.add("Samal");
        x2.add("ASSEL");
        LinkedHashSet<String> lhs1 = new LinkedHashSet<>();
        lhs1.addAll(x1);
        LinkedHashSet<String> lhs2 = new LinkedHashSet<>();
        lhs2.addAll(x2);

        n1.addAll(x2);
        System.out.println("Union: " + x1);

        LinkedHashSet<String> copyNames1 = new LinkedHashSet<String>(lhs1);
        copyNames1.retainAll(n2);
        System.out.println("Intersection: " + copyNames1);

        n1.removeAll(copyNames1);
        System.out.println("Difference: " + x1);
    }

}
