package com.example.njneh.autocompletetextviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends Activity {
    ListView lv;
    ArrayList<String>pname,price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView)findViewById(R.id.lv);

        pname=new ArrayList<String>();
        price=new ArrayList<String>();

        pname.add("Phone");
        price.add("12000");
        pname.add("tv");
        price.add("10000");
        pname.add("fridge");
        price.add("20000");
        pname.add("ac");
        price.add("50000");

        Custom c=new Custom(getApplicationContext(),pname,price);
        lv.setAdapter(c);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
