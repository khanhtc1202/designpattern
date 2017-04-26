package IteratorPattern.concretes;

import IteratorPattern.iterfaces.Container;
import IteratorPattern.iterfaces.Iterator;

/**
 * Created by khanhtc on 4/24/17.
 */
public class NameRepository implements Container {
    public String names[] = {"Khanh", "Tran", "Cong"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
