package com.example.myfirstapplication.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myfirstapplication.R;
import com.example.myfirstapplication.entidades.Producto;

import java.util.ArrayList;

public class productoAdaptador extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;
    private ArrayList<Producto> listaProductos;

    public productoAdaptador(Context context, ArrayList<Producto> listaProductos) {
        this.context = context;
        this.inflater = inflater;
        this.listaProductos = listaProductos;
    }

    @Override
    public int getCount() {
        return listaProductos.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        if(inflater ==null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if (convertView == null){
            convertView = inflater.inflate(R.layout.product_item, null);
        }

        Producto currentProduct = listaProductos.get(position);

        ImageView imgProduct = (ImageView) convertView.findViewById(R.id.imgProduct);
        TextView textNameProduct = (TextView) convertView.findViewById(R.id.textNameProduct);
        TextView textDescriptionProduct = (TextView) convertView.findViewById(R.id.textDescriptionProduct);
        TextView textPriceProduct = (TextView) convertView.findViewById(R.id.textPriceProduct);
        CheckBox checkBoxProduct = convertView.findViewById(R.id.checkBoxProduct);


        imgProduct.setImageResource(R.drawable.ic_launcher_background);
        textNameProduct.setText(currentProduct.getName());
        textDescriptionProduct.setText(currentProduct.getDescription());
        textPriceProduct.setText(String.valueOf(currentProduct.getPrice()));

        return convertView;
    }
}














