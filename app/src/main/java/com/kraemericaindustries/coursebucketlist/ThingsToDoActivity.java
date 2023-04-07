package com.kraemericaindustries.coursebucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
public class ThingsToDoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);
        setupList();
    }


    private void setupList() {
    BucketListEntry[] thingsToDo = {
            new BucketListEntry("Become a software developer", "Enhance your career and earning potential", R.drawable.ic_launcher_background, 5),
            new BucketListEntry("Give my daughter away", "My fatherly right", R.drawable.kraemer_newborn_shoot_img_032_a_4x6_print, 5),
            new BucketListEntry("Become a Grandfather", "Be the best Grandfather I can be", R.drawable.dsc03652, 4),
            new BucketListEntry("Get a pool", "I want the Cobbs backyard SO BAD!", R.drawable.pool, 3),
            new BucketListEntry("Get a nice boat", "Water is therapy", R.drawable.boat, 5)
    };

        RecyclerView recyclerView = findViewById(R.id.recycler_view_things_to_do);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(thingsToDo);
        recyclerView.setAdapter(adapter);
    }
}