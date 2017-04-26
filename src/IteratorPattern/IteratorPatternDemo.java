package IteratorPattern;

import IteratorPattern.concretes.NameRepository;
import IteratorPattern.iterfaces.Iterator;

/**
 * Created by khanhtc on 4/24/17.
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for (Iterator iter = nameRepository.getIterator(); iter.hasNext();) {
            String name = (String)iter.next();
            System.out.println("Name: " + name);
        }
    }
}
