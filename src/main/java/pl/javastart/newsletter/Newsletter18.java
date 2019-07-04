package pl.javastart.newsletter;

import java.util.Set;
import java.util.TreeSet;

class Newsletter18 {
    public static void main(String[] args) {
        Set<Integer> set1 = new SetExtended<>();
        set1.add(10);
        set1.add(15);
        set1.add(5);
        set1.add(20);
        set1.add(5);
        Set<Integer> set2 = new SetExtended<>();
        set2.add(6);
        set2.add(9);
        set2.add(3);
        set2.add(9);
        set2.add(12);

        System.out.println(set1); //[5, 10, 15, 20]
        System.out.println(set2); //[3, 6, 9, 12]
        //tutaj dodatkowo powinna wyświetlić się liczba wywołań metody add
        System.out.println(SetExtended.count);
        //w przypadku dodania dodatkowych wywołań metody add na zbiorach set1 lub set2
        set2.add(11);
        //wartość ta powinna się automatycznie zaktualizować
        System.out.println(SetExtended.count);
    }
}
