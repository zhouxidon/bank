package com.zking.util;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Demo {

    public static void main(String[] args) {
        String path = "i18n";
        ResourceBundle rb = ResourceBundle.getBundle(path, Locale.US);
        String name = rb.getString("hello.label");
//        System.out.println(name);
        name=MessageFormat.format(name,"zs","ls");
        System.out.println(name);
    }
}
