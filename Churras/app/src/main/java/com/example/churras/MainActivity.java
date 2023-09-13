package com.example.churras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ItemChurrasco> listaItensChurrasco = new ArrayList<ItemChurrasco>();
    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview=findViewById(R.id.listView);



        listaItensChurrasco.add(new ItemChurrasco(1, "Carne", R.drawable.carne));
        listaItensChurrasco.add(new ItemChurrasco(2, "Linguiça", R.drawable.Linguiça));
        listaItensChurrasco.add(new ItemChurrasco(3, "Pão de Alho", R.drawable.pao_de_alho));
        listaItensChurrasco.add(new ItemChurrasco(4, "Cerveja", R.drawable.cerveja));
        listaItensChurrasco.add(new ItemChurrasco(5, "Refrigerante", R.drawable.refrigerante));

        ItemChurrascoAdapter adapter = new ItemChurrascoAdapter(this,R.layout.item_churrasco,listaItensChurrasco);
        listview.setAdapter();
    }
}