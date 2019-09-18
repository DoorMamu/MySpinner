package com.example.myspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Create array of items to select from spinner

    private static final String[] ANDROID_VERSIONS = {
            "Select Item",
            "Cupcake",
            "Donut",
            "Eclair",
            "Froyo",
            "Gingerbread",
            "Honeycomb",
            "Ice Cream Sandwich",
            "Jelly Bean",
            "KitKat",
            "Lollipop",
            "Marshmallow",
            "Nougat",
            "Oreo"
    };

    ArrayAdapter adapter;
    Spinner spinner;
    public void init()
    {
        spinner=findViewById(R.id.spinner);
        //Send the array in the adapter
        adapter= new ArrayAdapter(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, ANDROID_VERSIONS);
        //Send the adapter to the spinner
        spinner.setAdapter(adapter);

        //What to do when Item is selected
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int selectedItemNo, long l) {
             //   Toast.makeText(MainActivity.this, "Selected item "+selectedItemNo+" l "+l, Toast.LENGTH_SHORT).show();
                switch (selectedItemNo)
                {
                    case 0:
                        break;
                    case 1:
                        setContentView(R.layout.cupcake);
                        break;
                    case 2:
                        setContentView(R.layout.donut);
                        break;
                    case 3:
                        setContentView(R.layout.eclair);
                        break;
                    case 4:
                        setContentView(R.layout.fryo);
                        break;
                    case 5:
                        setContentView(R.layout.gingerbread);
                        break;
                    case 6:
                        setContentView(R.layout.honeycomb);
                        break;
                    case 7:
                        setContentView(R.layout.ice_cream_sandwhich);
                        break;
                    case 8:
                        setContentView(R.layout.jellybean);
                        break;
                    case 9:
                        setContentView(R.layout.kitkat);
                        break;
                    case 10:
                        setContentView(R.layout.lollipop);
                        break;
                    case 11:
                        setContentView(R.layout.marshmellow);
                        break;
                    case 12:
                        setContentView(R.layout.nougat);
                        break;
                    case 13:
                        setContentView(R.layout.oreo);
                        break;
                    case 14:
                        setContentView(R.layout.pie);
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       init();

    }
    @Override
    public void onBackPressed() {
        setContentView(R.layout.activity_main);
        init();
    }
}
