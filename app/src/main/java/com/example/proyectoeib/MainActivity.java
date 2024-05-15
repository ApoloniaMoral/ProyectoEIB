package com.example.proyectoeib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    ArrayList<Libro> libros = new ArrayList<>();

    // agregar algunos libros de ejemplo
    libros.add(new Libro("1","El principito","<NAME>",200,"Novela","Minotauro",2015,"978-957-55-284-9","https://images-na.ssl-images-amazon.com/images/I/512j49619aL._SX385_BO1,204,203,200_.jpg"));

    // obtener referencia al ListView
    ListView listView = findViewById(R.id.imageViewPortada);

    // crear un ArrayAdapter
    ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, libros);

    // asignar el adapter al ListView
    listView.setAdapter(adapter);
}


}