package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ArrayadapterActivity extends ListActivity {
    static final String [] ANIMALS = new String[] {"Ant","Bear","Bird","Cat","Dog","Donkey","Elephant","Giraffe","Goat","Monkey","Pig","Rat","Snake","Spider"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_arrayadapter,ANIMALS));
        ListView listView = getListView();
        listView.setTextFilterEnabled(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),((TextView) view).getText(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}