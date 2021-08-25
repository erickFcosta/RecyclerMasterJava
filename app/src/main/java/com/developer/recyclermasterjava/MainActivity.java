package com.developer.recyclermasterjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.developer.recyclermasterjava.model.Email;
import com.developer.recyclermasterjava.model.Emails;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EmailAdapter emailAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailAdapter = new EmailAdapter(new ArrayList<>(Emails.fakeEmails()));

        RecyclerView rv = findViewById(R.id.recyclerview_view_main);
        rv.setAdapter(emailAdapter);

    }
}