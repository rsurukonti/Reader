package de.rac.program.basic.test;

import de.rac.program.basic.BaseNode;

public class Category extends BaseNode{

	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getElementName() {
		return "Category";
	}
}
