package com.balajiprabhu.state;

public class BrushTool implements BaseTool {

    @Override
    public void mouseUp() {
        System.out.println("Brush icon selected");
    }

    @Override
    public void mouseDown() {
        System.out.println("Draw a line");
    }
}
