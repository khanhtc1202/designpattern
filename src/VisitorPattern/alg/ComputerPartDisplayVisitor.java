package VisitorPattern.alg;

import VisitorPattern.model.Computer;
import VisitorPattern.model.Keyboard;
import VisitorPattern.model.Monitor;
import VisitorPattern.model.Mouse;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying mouse");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying monitor");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying keyboard");
    }

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying computer");
    }
}
