/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.viettuts.detaiso10.controller;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Bui Anh Tuan
 */
public class Menu {
    private String kind;
    private JPanel jpn;
    private JButton jbt;

    public Menu() {
    }

    public Menu(String kind, JPanel jpn, JButton jbt) {
        this.kind = kind;
        this.jpn = jpn;
        this.jbt = jbt;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public JPanel getJpn() {
        return jpn;
    }

    public void setJpn(JPanel jpn) {
        this.jpn = jpn;
    }

    public JButton getJbt() {
        return jbt;
    }

    public void setJbt(JButton jbt) {
        this.jbt = jbt;
    }

    
}
