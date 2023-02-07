package com.example.railgaadi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PNRstatus extends AppCompatActivity {
    ImageButton btnHomePnr,btnAboutPnr,btnAccountPnr,btnAskPnr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pnrstatus);

        btnHomePnr=(ImageButton) findViewById(R.id.btnHomePnr);
        btnHomePnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Home=new Intent(PNRstatus.this,MainActivity.class);
                startActivity(Home);
            }
        });
        btnAboutPnr=(ImageButton) findViewById(R.id.btnAboutPnr);
        btnAboutPnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent About=new Intent(PNRstatus.this,About.class);
                startActivity(About);
            }
        });
        btnAccountPnr=(ImageButton) findViewById(R.id.btnAccountPnr);
        btnAccountPnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Account =new Intent(PNRstatus.this, Account.class);
                startActivity(Account);
            }
        });
        btnAskPnr=(ImageButton) findViewById(R.id.btnAskPnr);
        btnAskPnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Ask=new Intent(PNRstatus.this,Ask.class);
                startActivity(Ask);
            }
        });
    }
}