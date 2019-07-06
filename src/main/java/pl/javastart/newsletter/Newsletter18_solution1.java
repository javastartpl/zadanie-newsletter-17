package pl.javastart.newsletter;

import java.util.Set;
import java.util.TreeSet;

class Newsletter18_solution1{
    public static int count;

    public static void main(String[] args) {

        Set<Integer> set1 = new TreeSet(){
            static final long serialVersionUID = 1L;
            @Override
            public boolean add(Object o){
                count++;
                return super.add(o);
            }
        };
        set1.add(10);
        set1.add(15);
        set1.add(5);
        set1.add(20);
        set1.add(5);

        Set<Integer> set2 = new TreeSet(){
            static final long serialVersionUID = 1L;
            @Override
            public boolean add(Object o){
                count++;
                return super.add(o);
            }
        };
        set2.add(6);
        set2.add(9);
        set2.add(3);
        set2.add(9);
        set2.add(12);

        System.out.println(set1); //[5, 10, 15, 20]
        System.out.println(set2); //[3, 6, 9, 12]

        System.out.println(count);
    }
}
