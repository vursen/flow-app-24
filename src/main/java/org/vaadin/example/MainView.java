package org.vaadin.example;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout {

	public MainView() {
		add(new PersonGrid());
		add(new Button("PersonView", e -> UI.getCurrent().navigate("Person")));
	}
}
