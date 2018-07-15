package com.knehman.View

import com.vaadin.spring.annotation.SpringView
import com.vaadin.navigator.ViewChangeListener
import com.vaadin.ui.Label
import com.vaadin.ui.VerticalLayout
import com.vaadin.navigator.View

import javax.annotation.PostConstruct

@SpringView(name = MainView.VIEW_NAME)
class MainView extends VerticalLayout implements View {
    public static final String VIEW_NAME = "mainView"

    @PostConstruct
    void init(){
        println "Main view init"
        addComponent(new Label("Main View"))
    }
	
	@Override
    void enter(ViewChangeListener.ViewChangeEvent event) {
        println "In main enter"
    }
}
