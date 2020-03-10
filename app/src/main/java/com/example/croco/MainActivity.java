package com.example.croco;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.provider.Telephony;
import android.view.View;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void gmailButton(View view){
        Intent intent = getPackageManager().getLaunchIntentForPackage("com.google.android.gm");
        if (intent != null){
            startActivity(intent);
        }

    }
    public void contactButton(View view){
        Intent intent = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
        startActivity(intent);
    }

    public void whatsappButton(View view){
        Intent intent = getPackageManager().getLaunchIntentForPackage("com.whatsapp");
        if (intent != null){
            startActivity(intent);
        }
    }
    public void assistantButton(View view){
        Intent intent = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.googleassistant");
        if (intent != null){
            startActivity(intent);
        }
    }
}


