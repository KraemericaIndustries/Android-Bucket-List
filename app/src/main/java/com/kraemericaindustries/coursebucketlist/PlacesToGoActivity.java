package com.kraemericaindustries.coursebucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
public class PlacesToGoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_go);
        setupList();
    }

    private void setupList() {
        BucketListEntry[] placesToGo = {
                new BucketListEntry("Long Lake", "My favorite getaway - in the middle of nowhere", R.drawable.lake, 3),
                new BucketListEntry("The Rocky Mountains", "Canada - at it's best", R.drawable.rockies, 3),
                new BucketListEntry("The Northwest Territories", "RUGGED!", R.drawable.northwest, 3),
                new BucketListEntry("Fly in fishing for big pike", "Get your game face on!", R.drawable._0200628_160859, 5),
                new BucketListEntry("The West Coast", "Left side of Canada", R.drawable.pacific, 4.5f)
        };

        RecyclerView recyclerView = findViewById(R.id.recycler_view_places_to_go);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(placesToGo);
        recyclerView.setAdapter(adapter);
    }
}