package pl.javastart.newsletter;

import java.util.TreeSet;

public class SetExtended<E> extends TreeSet<E> {

    static int count = 0;

    @Override
    public boolean add(E e) {
        synchronized (this) {
            count++;
        }
        return super.add(e);
    }
}
