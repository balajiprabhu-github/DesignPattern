package com.balajiprabhu;

import com.balajiprabhu.momento.Editor;
import com.balajiprabhu.momento.History;

public class Main {

    public static void main(String[] args) {

        Editor editor = new Editor();
        History history = new History();

        editor.setContent("Hi,");
        history.push(editor.createState());

        editor.setContent("This is");
        history.push(editor.createState());

        editor.setContent("Momento Pattern");
        history.push(editor.createState());

        editor.setContent("Enjoying this series");
        editor.restoreState(history.pop());// Undo Function

        System.out.println(editor.getContent());

    }

}
