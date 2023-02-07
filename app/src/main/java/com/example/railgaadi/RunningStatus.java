package com.example.railgaadi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class RunningStatus extends AppCompatActivity {
    ImageButton btnAboutRun,btnHomeRun,btnAskRun,btnAccountRun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_running_status);

        btnHomeRun=(ImageButton) findViewById(R.id.btnHomeRun);
        btnHomeRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Home=new Intent(RunningStatus.this,MainActivity.class);
                startActivity(Home);
            }
        });
        btnAboutRun=(ImageButton) findViewById(R.id.btnAboutRun);

        btnAboutRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent About=new Intent(RunningStatus.this,About.class);
                startActivity(About);
            }
        });
        btnAccountRun=(ImageButton) findViewById(R.id.btnAccountRun);
        btnAccountRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Account =new Intent(RunningStatus.this, Account.class);
                startActivity(Account);
            }
        });
        btnAskRun=(ImageButton) findViewById(R.id.btnAskRun);
        btnAskRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Ask=new Intent(RunningStatus.this,Ask.class);
                startActivity(Ask);
            }
        });

    }
}