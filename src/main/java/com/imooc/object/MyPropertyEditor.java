package com.imooc.object;

import java.beans.PropertyEditorSupport;

public class MyPropertyEditor extends PropertyEditorSupport {

    public void setAsTest(String text) throws IllegalArgumentException {
        User user = new User();
        String[] textArray = text.split(",");
        user.setName(textArray[0]);
        user.setAge(textArray[1]);
        this.setValue(user);
    }

    public static void main(String[] args) {
        MyPropertyEditor propertyEditor = new MyPropertyEditor();
        propertyEditor.setAsTest("tom,22");
        System.out.println(propertyEditor.getValue());
    }
}
