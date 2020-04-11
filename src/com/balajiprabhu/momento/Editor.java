package com.balajiprabhu.momento;

public class Editor {

    private String content;

    public EditorState createState() {
        return new EditorState(this.content);
    }

    public void restoreState(EditorState editorState) {
        content = editorState.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
