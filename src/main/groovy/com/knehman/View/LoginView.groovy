package com.knehman.View

import com.vaadin.navigator.ViewChangeListener
import com.vaadin.spring.annotation.SpringView
import com.vaadin.ui.Label
import com.vaadin.navigator.View

import com.vaadin.ui.VerticalLayout
import javax.annotation.PostConstruct

@SpringView(name = LoginView.VIEW_NAME)
class LoginView extends VerticalLayout implements View {
    public static final String VIEW_NAME = "loginView"

    @PostConstruct
    void init(){
        println "Login view init"
        addComponent(new Label("Login View"))
    }
	
	@Override
    void enter(ViewChangeListener.ViewChangeEvent event) {
        println "In main enter"
    }
}
