package com.example.iict_admin;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import com.example.iict_admin.classes.DataViewHolder;
import com.example.iict_admin.classes.OrderDetails;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private RecyclerView recyclerView;
    private ArrayList<OrderDetails> arrayList;
    private FirebaseRecyclerOptions<OrderDetails> options;
    private FirebaseRecyclerAdapter<OrderDetails, DataViewHolder> adapter;
    private DatabaseReference databaseReference;

    /*@Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.main_toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("IICT Cafe-Admin");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        getMenuInflater().inflate(R.menu.main_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

        if(item.getItemId() == R.id.update_menu){
            Intent intent = new Intent(MainActivity.this, MenuUpdateActivity.class);
            startActivity(intent);
        }

        if(item.getItemId() == R.id.recharge){
            Intent intent = new Intent(MainActivity.this, RechargeActivity.class);
            startActivity(intent);
        }

        return true;
    }
}
