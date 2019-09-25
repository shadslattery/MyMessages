package com.example.mymessages;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvPeople;
    private PeopleAdapter peopleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvPeople = findViewById(R.id.rvpeople);

        // Finish setting up recyclerview
        rvPeople.setLayoutManager(new LinearLayoutManager(this));
        rvPeople.setHasFixedSize(true);

        // Init people adapter
        peopleAdapter = new PeopleAdapter(Utils.getList());
        rvPeople.setAdapter(peopleAdapter);

    }
}
