package com.example.a59010212.mainadmin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initInstance();
    }
    private void initInstance() {
        myCustomViewGroup1 = (MyCustomViewGroup) findViewById(R.id.my_row_1);
        myCustomViewGroup2 = (MyCustomViewGroup) findViewById(R.id.my_row_2);
    }
}
