package com.example.railgaadi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
ImageButton btnHome,btnAbout,btnAccount,btnAsk;
Button btnSearch,btnPnr,btnRunStatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPnr=findViewById(R.id.btnPnr);
        btnPnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pnr=new Intent(MainActivity.this,PNRstatus.class);
startActivity(pnr);
            }
        });
     /*   btnSearch=findViewById(R.id.btnSearch);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Search=new Intent(MainActivity.this,result.class);
                startActivity(Search);
            }
        });
        */
        btnRunStatus=findViewById(R.id.btnRunStatus);
        btnRunStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent RunStatus=new Intent(MainActivity.this,RunningStatus.class);
                startActivity(RunStatus);
            }
        });
        btnHome=(ImageButton) findViewById(R.id.btnHome);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Home=new Intent(MainActivity.this,MainActivity.class);
                startActivity(Home);
            }
        });
        btnAbout=(ImageButton) findViewById(R.id.btnAbout);
        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent About=new Intent(MainActivity.this,About.class);
                startActivity(About);
            }
        });
        btnAccount=(ImageButton) findViewById(R.id.btnAccount);
        btnAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 Intent Account =new Intent(MainActivity.this, Account.class);
                 startActivity(Account);
            }
        });
        btnAsk=(ImageButton) findViewById(R.id.btnAsk);
        btnAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Ask=new Intent(MainActivity.this,Ask.class);
                startActivity(Ask);
            }
        });
      /*  btnsearchicon=(ImageButton) findViewById(R.id.btnsearchicon);
        btnsearchicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent SearchIcon=new Intent(MainActivity.this,Result.class);
                startActivity(SearchIcon);
            }
        }); */

    }
}