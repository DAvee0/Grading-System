/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newgradingsystem2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;

public class Enabledisable extends JFrame {

    boolean enable = true;

    public Enabledisable() {
        // Set default close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Set layout
       getContentPane().setLayout(new FlowLayout());
        // ArrayList to hold data
        ArrayList<String> items = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            items.add("Items" + i);
        }

        // Create JList obj, add array to list
        final JList list = new JList(items.toArray());

        // Add list to content pane
        getContentPane().add(list);

        // Create toggle button, add it to content pane
        JButton btn = new JButton("Toggle");
        getContentPane().add(btn);

        // Set ActionListener
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                // Toggle enable flag
                enable = !enable;
                // Enable or disable list
                list.setEnabled(enable);
            }
        });
    }

    public static void main(String[] args) {
    // Set form visible
    new Enabledisable().setVisible(true);
    }
}