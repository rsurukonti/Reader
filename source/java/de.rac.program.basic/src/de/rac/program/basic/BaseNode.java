package de.rac.program.basic;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseNode implements INode {

	private List<INode> children = new ArrayList<INode>();
	

	public void setChildren(List<INode> children) {
		this.children = new ArrayList<INode>(children);
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visitBefore(this);
		for (INode children : getChildren()) {
			children.accept(visitor);
		}
		visitor.visitAfter(this);
	}

	public List<INode> getChildren() {
		return new ArrayList<INode>(children);
	}
}
