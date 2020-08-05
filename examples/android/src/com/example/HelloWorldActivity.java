/*
 * Sample application to illustrate processing with ProGuard.
 *
 * Copyright (c) 2012-2020 Guardsquare NV
 */
package com.example;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

import java.util.Arrays;

/**
 * Sample activity that displays "Hello world!".
 */
public class HelloWorldActivity extends Activity {
    private FooBar fooBar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Display the message.
        TextView view = new TextView(this);
        view.setText("Hello World");
        view.setGravity(Gravity.CENTER);
        setContentView(view);
        fooBar = new FooBar(view);

        Arrays.asList(1).stream().forEach(fooBar::foo);
    }
}
