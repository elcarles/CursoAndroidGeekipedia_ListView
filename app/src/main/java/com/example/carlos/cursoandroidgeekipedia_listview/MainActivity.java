package com.example.carlos.cursoandroidgeekipedia_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private ListView lv1;

    private String nombres [] = {"Samuel", "Pepe", "Ramiro", "Miguel", "Sofia", "Ines", "Emma"};
    private String edades [] = {"18", "30", "12", "49", "11", "9", "7"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tv1);
        lv1 = findViewById(R.id.lv1);

        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, R.layout.list_item_geekipedia, nombres);
        lv1.setAdapter(aa);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }





}
