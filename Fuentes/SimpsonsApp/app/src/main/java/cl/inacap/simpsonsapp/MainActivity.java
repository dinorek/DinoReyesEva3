package cl.inacap.simpsonsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import com.google.android.material.tabs.TabLayout;

import cl.inacap.simpsonsapp.adapters.TabsNavPageAdapter;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private Button button;
    private ListView lv_main;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.button= findViewById(R.id.button);
        this.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        spinner= (Spinner) findViewById(R.id.spinner);
        Integer [] opciones = {1,2,3,4,5,6,7,8,9,10};
        ArrayAdapter<Integer> adapter2 = new ArrayAdapter<Integer>(this,android.R.layout.simple_spinner_dropdown_item,opciones);
        spinner.setAdapter(adapter2);


            }
        };


