package com.balajiprabhu;

import com.balajiprabhu.inheritance.CheckBox;
import com.balajiprabhu.inheritance.TextBox;
import com.balajiprabhu.inheritance.UIControl;

public class Main {

    public static void main(String[] args) {
        drawUIControls(new TextBox());
        drawUIControls(new CheckBox());
    }

    private static void drawUIControls(UIControl control) {
        control.draw();
    }

}
