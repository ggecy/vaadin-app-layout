package com.github.appreciated.app.layout.behaviour.left;

import com.vaadin.flow.component.dependency.HtmlImport;


/**
 * Created by appreciated on 01.05.2017.
 * Edited By deyaeddin on 07.02.2018
 */

@HtmlImport("/com/github/appreciated/app/layout/behaviour/left/left-responsive-hybrid-no-app-bar.html")
public class LeftResponsiveHybridNoAppBar extends AbstractLeftAppLayoutBase {

    @Override
    public String getStyleName() {
        return "left-responsive-hybrid-no-app-bar";
    }
}