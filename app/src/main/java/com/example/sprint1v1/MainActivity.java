package com.example.sprint1v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnOk;
    private Button btnLogin;
    private TextView textTitle, textName, textLastName;
    private EditText editName, editLastName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOk = (Button) findViewById(R.id.btnOk);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        textName = (TextView) findViewById(R.id.textName);
        textLastName = (TextView) findViewById(R.id.textLastName);

        textTitle = (TextView) findViewById(R.id.textTitle);

        editName = (EditText) findViewById(R.id.editName);
        editLastName = (EditText) findViewById(R.id.editLastName);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editName.getText().toString().trim();
                String lastName = editLastName.getText().toString().trim();

                String fullName = name+" "+lastName;
                //Toast toast = Toast.makeText(getApplicationContext(),fullName, Toast.LENGTH_LONG);
                //textAge.setText(fullName);
                textTitle.setText(fullName);
            }

        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
            }

        });


    }
}