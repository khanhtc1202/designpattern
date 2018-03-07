package VisitorPattern;

import VisitorPattern.alg.ComputerPartDisplayVisitor;
import VisitorPattern.model.Computer;
import VisitorPattern.model.ComputerPart;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
