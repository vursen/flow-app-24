package org.vaadin.example;

import java.util.ArrayList;
import java.util.List;

public class PersonDTO {

	private String name1;
	private String name2;
	private List<PersonDTO> children = new ArrayList<>();

	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public List<PersonDTO> getChildren() {
		return children;
	}

}
