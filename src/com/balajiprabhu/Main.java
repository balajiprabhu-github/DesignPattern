package com.balajiprabhu;

import com.balajiprabhu.state.Canvas;
import com.balajiprabhu.state.EraserTool;

public class Main {

    public static void main(String[] args) {

        Canvas canvas = new Canvas();

        canvas.setCurrentTool(new EraserTool());
        canvas.mouseUp();
        canvas.mouseDown();

    }

}
