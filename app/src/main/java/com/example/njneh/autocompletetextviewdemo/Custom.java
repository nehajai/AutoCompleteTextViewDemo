package com.example.njneh.autocompletetextviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class Custom extends BaseAdapter {


    Context context;
    ArrayList<String> pname = new ArrayList<String>();
    ArrayList<String> price = new ArrayList<String>();
    LayoutInflater layoutInflater;

    public Custom(Context applicationContext, ArrayList<String> pname, ArrayList<String> price)

    {

        this.pname = pname;
        this.price = price;
        context = applicationContext;
        //for current context
        layoutInflater = LayoutInflater.from(context);


    }

    @Override
    public int getCount() {
        return pname.size();
    }

    @Override
    public Object getItem(int i) {
        return pname.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view=layoutInflater.inflate(R.layout.activity_custom,null);
        TextView pname1=(TextView)view.findViewById(R.id.pname);
        TextView price1=(TextView)view.findViewById(R.id.price);

        pname1.setText(pname.get(i));
        price1.setText(price.get(i));

        pname1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Event on List",Toast.LENGTH_SHORT).show();

            }
        });
       return view;

    }
}

