package org.vaadin.example;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@SuppressWarnings("serial")
@Route("Person")
public class PersonView extends VerticalLayout {

    public PersonView() {
    	add(new Button("MainView", e -> UI.getCurrent().navigate("")));
    }

}
