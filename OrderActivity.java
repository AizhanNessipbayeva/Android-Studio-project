package com.example.aizha.bitsandpizzas;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class OrderActivity extends Activity {
    ListView listView;
    ListView listView2;
    private Button orderButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        listView=(ListView)findViewById(R.id.list_favorites_pizza);
        listView2=(ListView)findViewById(R.id.list_favorites_pasta);
        Pizza[] pizzas=Pizza.pizzas;
        Pasta[] pastas=Pasta.pastas;
        int u=0;
        int v=0;
        final ArrayList<String> favPizzas=new ArrayList();
        for (int i=0;i<pizzas.length;i++){
            if (pizzas[i].isFavorite()){
                favPizzas.add(u,pizzas[i].getName());
                u++;
            }
        }
        for (int i=0;i<pastas.length;i++){
            if (pastas[i].isFavorite()){
                favPizzas.add(v,pastas[i].getName());
                v++;
            }
        }
        orderButton = (Button) findViewById(R.id.order_button);
        orderButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int text = R.string.order_toast;
                Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
                favPizzas.clear();

            }
        });
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,favPizzas);
        listView.setAdapter(arrayAdapter);



    }
}
