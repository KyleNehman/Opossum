package com.knehman.View

import com.vaadin.navigator.View
import com.vaadin.navigator.ViewChangeListener
import com.vaadin.server.VaadinSession
import com.vaadin.ui.VerticalLayout

class AuthenticatedView extends VerticalLayout implements View {

    @Override
    void enter(ViewChangeListener.ViewChangeEvent event) {
        println "In auth enter"

        if (!VaadinSession.getCurrent().getAttribute("auth")) {
            def x = 1//getUI().getNavigator().navigateTo(LoginView.VIEW_NAME)
        }
    }
}
