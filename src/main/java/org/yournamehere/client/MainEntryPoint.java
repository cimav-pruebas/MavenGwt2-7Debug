/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yournamehere.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.i18n.client.HasDirection;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;

/**
 * Main entry point.
 *
 * @author juan.calderon
 */
public class MainEntryPoint implements EntryPoint {

    /**
     * Creates a new instance of MainEntryPoint
     */
    public MainEntryPoint() {
    }

    /**
     * The entry point method, called automatically by loading a module that declares an implementing class as an entry-point
     */
    
    private boolean isOn = true;
    
    @Override
    public void onModuleLoad() {
        final Label label = new Label("Hello, GWT!!!");
        final Button button = new Button("Click me!");
        final TextBox textBox = new TextBox();
        
        button.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                String str = textBox.getText();
                System.out.println(">>> " + str);
                com.google.gwt.core.shared.GWT.log("]]] " + str);
                if(isOn = !isOn) 
                    label.setText(str,HasDirection.Direction.LTR);
                else
                    label.setText(str,HasDirection.Direction.RTL);
            }
        });
        
        RootPanel.get().add(textBox);
        RootPanel.get().add(button);
        RootPanel.get().add(label);
    }
}
