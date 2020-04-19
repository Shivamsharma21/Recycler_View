package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.programing_list);
         recyclerView.setLayoutManager(new LinearLayoutManager(this));
         String [] data={"Shivam","Pixel","Davliner","Aqiz","Voldusez","Kelly","Jhon","Apino","Won","Sizu"};
         recyclerView.setAdapter(new ProgramingAdapter(data));

    }
}
