package VisitorPattern.alg;

import VisitorPattern.model.Computer;
import VisitorPattern.model.Keyboard;
import VisitorPattern.model.Monitor;
import VisitorPattern.model.Mouse;

public interface ComputerPartVisitor {
    public void visit(Mouse mouse);
    public void visit(Monitor monitor);
    public void visit(Keyboard keyboard);
    public void visit(Computer computer);
}
