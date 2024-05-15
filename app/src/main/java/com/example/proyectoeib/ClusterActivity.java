package com.example.proyectoeib;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Intent;
import android.view.View;

public class ClusterActivity {


    public void crearCluster(View view) {
        Intent intent = new Intent(this, ClusterActivity.class);
        startActivity(intent);
    }

    private void startActivity(Intent intent) {

        startActivity(intent);

    }




}
