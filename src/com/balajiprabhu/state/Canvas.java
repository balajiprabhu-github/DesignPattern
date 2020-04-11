package com.balajiprabhu.state;

public class Canvas {

    private BaseTool currentTool;

    public void mouseUp() {
        currentTool.mouseUp();
    }

    public void mouseDown() {
        currentTool.mouseDown();
    }

    public BaseTool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(BaseTool currentTool) {
        this.currentTool = currentTool;
    }
}
