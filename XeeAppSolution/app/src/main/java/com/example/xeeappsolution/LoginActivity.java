package com.example.xeeappsolution;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {



    Button b1,b2;
   static EditText ed1,ed2;

    TextView tx1;
    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        b1 = (Button)findViewById(R.id.button);
        ed1 = (EditText)findViewById(R.id.editText);
        ed2 = (EditText)findViewById(R.id.editText2);

        b2 = (Button)findViewById(R.id.button2);
        tx1 = (TextView)findViewById(R.id.textView3);
        tx1.setVisibility(View.GONE);

        SharedPreferences prefs = this.getSharedPreferences("MyPref", Context.MODE_PRIVATE);
        boolean isLoggedIn = prefs.getBoolean("isLoggedIn", false); // return "false" if user is not logged in

        if (isLoggedIn) {
            Intent intent=new Intent(LoginActivity.this,MainActivity.class);
            startActivity( intent );
            Toast.makeText(getApplicationContext(),
                    "Redirecting...",Toast.LENGTH_SHORT).show();
            finish();
        } else {
        }

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ed1.getText().toString().equals("Xeeshan") &&
                        ed2.getText().toString().equals("Xeeshan")) {
                    Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                   startActivity( intent );
                    Toast.makeText(getApplicationContext(),
                            "Redirecting...",Toast.LENGTH_SHORT).show();
                    finish();
                    SharedPreferences sharedPrefs = getSharedPreferences("MyPref", 0);
                    SharedPreferences.Editor editor = sharedPrefs.edit();
                    editor.putBoolean("isLoggedIn", true);
                    editor.commit();

                }else{
                    Toast.makeText(getApplicationContext(),
                            "Wrong Credentials",Toast.LENGTH_SHORT).show();

                            tx1.setVisibility(View.VISIBLE);
                    counter--;
                    tx1.setText(Integer.toString(counter));

                    if (counter == 0) {
                        b1.setEnabled(false);
//
                    }
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    }


