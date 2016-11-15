package com.itchihuahuaii.som_toolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_toolbar_hola:
                Toast.makeText(this, "Presionaste Hola", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_toolbar_adios:
                Toast.makeText(this, "Presionaste Andy", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_toolbar_inicio:
                Toast.makeText(this, "Presionaste Inicio", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
