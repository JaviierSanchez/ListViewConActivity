package com.example.listviewconactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivityList extends AppCompatActivity {

    TextView txt_title;
    ListView lst_Shopping;
    List<String> shoppingList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);
        txt_title = findViewById(R.id.txt_Title);
        lst_Shopping = findViewById(R.id.lst_Shopping);


       Bundle messageExtra = getIntent().getExtras();
       String title = messageExtra.getString("message");
       txt_title.setText(title);

       shoppingList = new ArrayList<String>();
       shoppingList.add("Apple");
       shoppingList.add("Orange");
       shoppingList.add("Tomatoe");
       shoppingList.add("Patata");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,shoppingList);


        lst_Shopping.setAdapter(adapter);
        lst_Shopping.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // TODO Auto-generated method stub
                String value= (String) adapter.getItem(position);
                Toast.makeText(getApplicationContext(),value, Toast.LENGTH_SHORT).show();

            }
        });


    }
}