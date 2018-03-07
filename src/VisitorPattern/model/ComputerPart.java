package VisitorPattern.model;

import VisitorPattern.alg.ComputerPartVisitor;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
