package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Inmueble> myList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarDatos();
        generarListView();
    }

    public void cargarDatos(){
        myList.add(new Inmueble(R.drawable.casa1,"Cemetery Ridge",8000.50));

        myList.add(new Inmueble(R.drawable.casa2,"Derry Township",124.75));

        myList.add(new Inmueble(R.drawable.casa3,"Mayville",40000.33));

    }

    public void generarListView(){
        ArrayAdapter<Inmueble> adapter=new ListaAdapter(this,R.layout.item,myList,getLayoutInflater());
        ListView lv=findViewById(R.id.miLista);
        lv.setAdapter(adapter);

    }
}
