package com.example.myandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
EditText uname,pswd;
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

    public void Login(View view) {
        uname=(EditText) findViewById(R.id.uname);
        pswd=(EditText) findViewById(R.id.pswd);
        if(uname.getText().toString().equals("admin") && pswd.getText().toString().equals("admin")) {
            Toast.makeText(this, "Login Successfull", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(MainActivity.this,MainActivity2.class);
            startActivity(intent);
        }else{
            Toast.makeText(this,"Login Not Successfull", Toast.LENGTH_SHORT).show();
        }
    }
}