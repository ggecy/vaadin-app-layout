package com.github.appreciated.app.layout.test.lefthybrid.view;

import com.github.appreciated.app.layout.test.lefthybrid.LeftHybridBehaviourView;
import com.github.appreciated.app.layout.test.view.ExampleView;
import com.vaadin.flow.router.Route;

@Route(value = "view2", layout = LeftHybridBehaviourView.class) // an empty view name will also be the default view
public class View2 extends ExampleView {
    @Override
    protected String getViewName() {
        return getClass().getName();
    }
}
