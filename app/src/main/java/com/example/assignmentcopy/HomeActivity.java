package com.example.assignmentcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    private void showToast(){
        Toast toast = Toast.makeText(getApplicationContext(),Database.showToast(),Toast.LENGTH_LONG);
        toast.show();
    }

    public void eventPage(View view){
        showToast();
        startActivity(new Intent(getApplicationContext(), EventActivity.class));
    }

    public void stuff(View view){
        showToast();
        startActivity(new Intent(getApplicationContext(), StuffActivity.class));
    }

    public void sources(View view){
        showToast();
        startActivity(new Intent(getApplicationContext(), SourceActivity.class));
    }

}

