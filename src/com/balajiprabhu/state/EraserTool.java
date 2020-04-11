package com.balajiprabhu.state;

public class EraserTool implements BaseTool {

    @Override
    public void mouseUp() {
        System.out.println("Eraser icon selected");
    }

    @Override
    public void mouseDown() {
        System.out.println("Erase the selected spot");
    }
}
