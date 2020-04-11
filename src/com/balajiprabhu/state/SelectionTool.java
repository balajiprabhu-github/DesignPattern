package com.balajiprabhu.state;

public class SelectionTool implements BaseTool {

    @Override
    public void mouseUp() {
        System.out.println("Selection Icon selected");
    }

    @Override
    public void mouseDown() {
        System.out.println("Draw dash-rectangle line");
    }
}
