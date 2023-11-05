package com.example.listviewconactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_go = findViewById(R.id.btn_go);

        btn_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String messageTitle = "Lista de compra";

                Intent goListActivity = new Intent(MainActivity.this,MainActivityList.class);

                goListActivity.putExtra("Mensaje",messageTitle);

                startActivity(goListActivity);
            }
        });
    }
}