package com.example.ridhashabrina.utsmobpro;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bLogin, bRegister;
    EditText eUsername, ePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bLogin=(Button) findViewById(R.id.BtnLogin);
        eUsername=(EditText) findViewById(R.id.EdUsername);
        ePassword=(EditText) findViewById(R.id.EdPassword);

        bLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if((eUsername.getText().toString().equals("admin"))&&(ePassword.getText().toString().equals("admin")))
                {
                    Intent intent=new Intent(MainActivity.this,ChooseActivity.class);
                    intent.setData(Uri.parse("1"));
                    startActivity(intent);
                } else
                {
                    Toast.makeText(MainActivity.this, "Username dan Password Salah !!", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }

    public void onClick(View view){
        Toast.makeText(this,"Login menggunakan Username = admin & Password = admin", Toast.LENGTH_SHORT).show();
    }
}
