package com.example.tarajano.block02app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import javax.xml.datatype.Duration;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listViewAnimals = (ListView) findViewById(R.id.animalsListView);
        final ArrayAdapter<CharSequence> adapterAnimals = ArrayAdapter.createFromResource(
                this, R.array.animalsArray, android.R.layout.simple_expandable_list_item_1);
        listViewAnimals.setAdapter(adapterAnimals);

        // Assign actions to list items.
        listViewAnimals.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String message = getString(R.string.listItemPopUpMessage) + adapterAnimals.getItem(position);
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
