package com.knehman.UI

import com.knehman.View.LoginView
import com.knehman.View.MainView
import com.vaadin.annotations.Theme
import com.vaadin.annotations.Title
import com.vaadin.navigator.View
import com.vaadin.navigator.ViewDisplay
import com.vaadin.server.Responsive
import com.vaadin.server.VaadinRequest
import com.vaadin.server.VaadinSession
import com.vaadin.spring.annotation.SpringUI
import com.vaadin.spring.annotation.SpringViewDisplay
import com.vaadin.ui.Component
import com.vaadin.ui.Panel
import com.vaadin.ui.VerticalLayout
import com.vaadin.ui.UI

@SpringUI
class RootUI extends UI implements ViewDisplay {

    private Panel rootPanel

    @Override
    protected void init(VaadinRequest request) {
        println "RootUI init"
		def f = new File("D:/FUCK")
		f.createNewFile()
		
        // Session var auth is only set on the main login page
        // Login is the initial authentication NOT the
        // Pin based user selection
        //
        if (VaadinSession.getCurrent().getAttribute("auth")) {
            //getUI().getNavigator().navigateTo(MainView.VIEW_NAME)
            def x = 1
        } else {
            // Why need this else? The navigateTo is weird sometimes so
            // It's safer this way

            def layout = new VerticalLayout()
            layout.setSizeFull()
            Responsive.makeResponsive(layout)
            setContent(layout)
            rootPanel = new Panel()
            rootPanel.setSizeFull()
            layout.addComponent(rootPanel)
            //this.getNavigator().navigateTo(LoginView.VIEW_NAME)
        }
    }

    @Override
    void showView(View view) {
        println "RootUI showView"
        rootPanel.setContent((Component) view)
    }
}
