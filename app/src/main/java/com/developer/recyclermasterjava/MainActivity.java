package com.developer.recyclermasterjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.icu.text.SimpleDateFormat;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import com.developer.recyclermasterjava.model.Email;
import com.developer.recyclermasterjava.model.Emails;
//import com.mooveit.library.Fakeit;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private EmailAdapter emailAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Fakeit.init();
        setContentView(R.layout.activity_main);

        emailAdapter = new EmailAdapter(new ArrayList<>(Emails.fakeEmails()));

        final RecyclerView rv = findViewById(R.id.recyclerview_view_main);
        rv.setAdapter(emailAdapter);

        findViewById(R.id.fab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addEmail();
                rv.scrollToPosition(0);
            }
        });
    }
    private void addEmail() {
        emailAdapter.getEmails().add(0, Email.EmailBuilder.builder()
            .setStared(false)
            .setUnread(true)
            .setUser("kblinho")
            .setSubject("teste de email")
            .setDate("8 mai")
            .setPreview("preview---------------")
            .build()
        );
        /*try {
            Date sdf = null;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                sdf = new SimpleDateFormat("dd/mm/yyyy", new Locale("pt", "BR")).parse(
                        Fakeit.dateTime().dateFormatter()
                );
            }

            StringBuilder preview = new StringBuilder();
            for (int i=0; i<10; i++) {
                preview.append(Fakeit.lorem().words());
                preview.append(" ");
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                emailAdapter.getEmails().add(0, Email.EmailBuilder.builder()
                    .setStared(false)
                    .setUnread(true)
                    .setUser(Fakeit.name().firstName())
                    .setSubject(Fakeit.rockBand().name())
                    .setDate(new SimpleDateFormat("d mmm",
                             new Locale("pt", "BR")).format(sdf))
                    .setPreview(preview.toString())
                    .build()
                );
            }
        } catch (ParseException e) {
        }*/
        emailAdapter.notifyItemInserted(0);
    }
}