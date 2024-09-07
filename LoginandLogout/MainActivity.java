package com.example.loginandlogout;

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
EditText uname,pwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.pswd), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void Login(View view) {
        uname=(EditText) findViewById(R.id.uname);
        pwd=(EditText) findViewById(R.id.pswd);
        if(uname.getText().toString().equals("admin") && pwd.getText().toString().equals("admin"))
        {
            Toast.makeText(this,"Login Successful", Toast.LENGTH_SHORT).show();
           // Intent intent=new Intent(MainActivity.this,MainActivity2.class);
            Intent lg_wc = new Intent(MainActivity.this, MainActivity2.class);

            Bundle bun = new Bundle();
            bun.putString("uname", uname.getText().toString());
            bun.putString("pswd", pwd.getText().toString());

            lg_wc.putExtras(bun);

            startActivity(lg_wc);
            finish();
        }else{
            Toast.makeText(this,"Login Not Successful", Toast.LENGTH_SHORT).show();
        }
    }
}
