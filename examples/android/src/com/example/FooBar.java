package com.example;

import android.widget.TextView;

public class FooBar {
    private TextView textView;

    public FooBar(TextView textView) {
        this.textView = textView;
    }

    void foo(int i) {
        textView.setText("Foo");
    }

    void bar(int i) {
        textView.setText("Bar");
    }
}
