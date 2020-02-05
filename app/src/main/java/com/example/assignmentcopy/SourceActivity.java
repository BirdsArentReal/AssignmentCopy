package com.example.assignmentcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SourceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_source);
    }

    public void back(View view){
        Toast toast = Toast.makeText(getApplicationContext(), Database.showToast(), Toast.LENGTH_LONG);
        toast.show();
        startActivity(new Intent(getApplicationContext(), HomeActivity.class));
    }
}
