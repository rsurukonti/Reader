package de.rac.program.basic;

public interface IVisitor {
	public void visitBefore(INode node);
	public void visitAfter(INode node);
}
