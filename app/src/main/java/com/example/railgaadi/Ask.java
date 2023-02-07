package com.example.railgaadi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Ask extends AppCompatActivity {
    ImageButton btnHomeAsk,btnAboutAsk,btnAccountAsk,btnAskAsk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask);


        btnHomeAsk=(ImageButton) findViewById(R.id.btnHomeAsk);
        btnHomeAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Home=new Intent(Ask.this,MainActivity.class);
                startActivity(Home);
            }
        });
        btnAboutAsk=(ImageButton) findViewById(R.id.btnAboutAsk);
        btnAboutAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent About=new Intent(Ask.this,About.class);
                startActivity(About);
            }
        });
        btnAccountAsk=(ImageButton) findViewById(R.id.btnAccountAsk);
        btnAccountAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Account =new Intent(Ask.this, Account.class);
                startActivity(Account);
            }
        });
        btnAskAsk=(ImageButton) findViewById(R.id.btnAsk);
        btnAskAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Ask=new Intent(Ask.this,Ask.class);
                startActivity(Ask);
            }
        });


    }
}