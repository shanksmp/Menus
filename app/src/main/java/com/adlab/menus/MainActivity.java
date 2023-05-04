package com.adlab.menus;

import androidx.appcompat.app.AppCompatActivity;

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
    public boolean onCreateOptionsMenu(Menu menu){
        super.onCreateOptionsMenu(menu);
        MenuItem m1=menu.add(0,0,0,"NEW");
        MenuItem m2=menu.add(0,1,1,"SAVE");
        MenuItem m3=menu.add(0,2,2,"SAVE AS");
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        super.onOptionsItemSelected(item);
        switch (item.getItemId())
        {
                case 0:
                Toast.makeText(getApplicationContext(),"Opens a New File",Toast.LENGTH_SHORT).show();
                return true;
                case 1:
                    Toast.makeText(getApplicationContext(),"Saves the file",Toast.LENGTH_SHORT).show();
                    return true;
                case 2:
                Toast.makeText(getApplicationContext(),"Saves a copy of the file",Toast.LENGTH_SHORT).show();
                return true;
        }
        return false;
    }
}