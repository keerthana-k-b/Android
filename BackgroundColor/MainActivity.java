package com.example.backgroundcolor;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void button(View view) {
        getWindow().getDecorView().setBackgroundColor(0xff00f0f0);
        //pink: 0xff000ff   black: 0xff000000  red: 0xffff0000  blue: 0xff0000ff   yellow: 0xfffff000
        //lightblue:  0xff00f0f0   lightgreen: 0xff00f000  cream: 0xfffffff0
    }
}
