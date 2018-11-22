package com.example.a59010212.mainadmin;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class MyCustomViewGroup extends FrameLayout {
    public MyCustomViewGroup(Context context) {
        super(context);
    }

    public MyCustomViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyCustomViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public MyCustomViewGroup(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initInflate();
    }
    public void initInflate() {
        inflate(getContext(), R.layout.layout_row, this);
    }
    public void initInstance(){
        tvName = (TextView) findViewById(R.id.tv_name);
        tvDescription = (TextView) findViewById(R.id.tv_description);

    }

    public void setName(String name){
        tvName.setText(name);
    }

    public  void setDescription(String des){
        tvDescription.setText(des);
    }
}
