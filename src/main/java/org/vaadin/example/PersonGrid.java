package org.vaadin.example;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.treegrid.TreeGrid;

@SuppressWarnings("serial")
public class PersonGrid extends TreeGrid<PersonDTO> {

    public PersonGrid() {
        super();
        setWidth("400px");
        addComponentHierarchyColumn(item -> {
            HorizontalLayout layout = new HorizontalLayout();
            Button button = new Button();
            button.addThemeVariants(ButtonVariant.LUMO_TERTIARY_INLINE);
            button.setIcon(VaadinIcon.ARROW_RIGHT.create());
            layout.add(button);
            return layout;
        })
                .setKey("Icon").setAutoWidth(true).setFlexGrow(0);

        addColumn(item -> {
            String name1 = item.getName1();
            return name1;
        })
                .setKey("Name1").setHeader("Name1").setAutoWidth(true).setFlexGrow(1);

        addColumn(item -> {
            String name2 = item.getName2();
            return name2;
        })
                .setKey("Name2").setHeader("Name2").setAutoWidth(true).setFlexGrow(1);

        List<PersonDTO> items = new ArrayList<>();

        PersonDTO person1 = createPersonDTO("Henry1", "Michael1");
        items.add(person1);

        PersonDTO person2 = createPersonDTO("Henry2", "Michael2");
        items.add(person2);

        PersonDTO person21 = createPersonDTO("Henry21", "Michael21");
        person2.getChildren().add(person21);

        PersonDTO person22 = createPersonDTO("Henry22", "Michael22");
        person21.getChildren().add(person22);

        PersonDTO person23 = createPersonDTO("Henry23", "Michael23");
        person22.getChildren().add(person23);

        PersonDTO person24 = createPersonDTO("Henry24", "Michael24");
        person23.getChildren().add(person24);

        PersonDTO person25 = createPersonDTO("Henry25", "Michael25");
        person24.getChildren().add(person25);

        PersonDTO person26 = createPersonDTO("Henry26", "Michael26");
        person25.getChildren().add(person26);

        setAllRowsVisible(true);
        setItems(items, item -> item.getChildren());
        addExpandListener(e -> recalculateColumnWidths());
        addCollapseListener(e -> recalculateColumnWidths());
        expandRecursively(items, 10);

    }

    private PersonDTO createPersonDTO(String aName1, String aName2) {
        PersonDTO person = new PersonDTO();
        person.setName1(aName1);
        person.setName2(aName2);
        return person;
    }

}
