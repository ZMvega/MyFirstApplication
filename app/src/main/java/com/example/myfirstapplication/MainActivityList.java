package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.example.myfirstapplication.adaptadores.productoAdaptador;
import com.example.myfirstapplication.entidades.Producto;

import java.util.ArrayList;

public class MainActivityList extends AppCompatActivity {

    private ListView listViewProducts;
    private ArrayList<Producto> listaProductos;
    private productoAdaptador adaptador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);

        listViewProducts = (ListView) findViewById(R.id.listViewProducts);


        listaProductos = new ArrayList<>();

        Producto producto1 = new Producto(1, 0, "Producto1", "Descripción1", 1000);
        Producto producto2 = new Producto(2, 0, "Producto2", "Descripción2", 2000);
        Producto producto3 = new Producto(3, 0, "Producto3", "Descripción3", 3000);
        Producto producto4 = new Producto(4, 0, "Producto4", "Descripción4", 4000);
        Producto producto5 = new Producto(5, 0, "Producto5", "Descripción5", 5000);

        listaProductos.add(producto1);
        listaProductos.add(producto2);
        listaProductos.add(producto3);
        listaProductos.add(producto4);
        listaProductos.add(producto5);


        //Log.d("testProducts", "paso1");
        adaptador = new productoAdaptador(getApplicationContext(), listaProductos);
        listViewProducts.setAdapter(adaptador);


    }
}














