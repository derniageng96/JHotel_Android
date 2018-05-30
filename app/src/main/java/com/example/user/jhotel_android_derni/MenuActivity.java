package com.example.user.jhotel_android_derni;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    ImageButton ButtonRoom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        final ImageButton ButtonRoom = (ImageButton) findViewById(R.id.roomButton);
        final ImageButton ButtonAttractions = (ImageButton) findViewById(R.id.attractionsButton);
        final ImageButton ButtonFacebook = (ImageButton) findViewById(R.id.facebookButton);

        ButtonRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regisInt = new Intent(MenuActivity.this, MainActivity.class);
                MenuActivity.this.startActivity(regisInt);
            }
        });

        ButtonAttractions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regisInt = new Intent(MenuActivity.this, AttractionsActivity.class);
                MenuActivity.this.startActivity(regisInt);
            }
        });

        ButtonFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent facebookIntent = openFacebook(MenuActivity.this);
                startActivity(facebookIntent);
            }
        });
    }

    public static Intent openFacebook(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("fb://page/1654770518149142"));
        } catch (Exception e){

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.facebook.com/awashimahotel/"));
        }


    }
}
