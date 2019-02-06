package com.example.viranchi.inclass03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        final TextView txtNameValue = (TextView)findViewById(R.id.txtNameVal);
        final TextView txtEmailValue = (TextView)findViewById(R.id.txtEmailVal);
        final TextView txtDeptValue = (TextView)findViewById(R.id.txtDepartmentVal);
        final TextView txtMoodValue = (TextView)findViewById(R.id.txtMood);

        final ImageView imgChosenAvatar = (ImageView)findViewById(R.id.imgDisplayAvatar);
        final ImageView imgChosenMood = (ImageView)findViewById(R.id.imgDisplayMood);

        if (getIntent().getExtras() != null){
            Profile person = (Profile) getIntent().getExtras().getSerializable(MainActivity.PROFILE_KEY);
            txtNameValue.setText(person.getName());
            txtEmailValue.setText(person.getEmail());
            txtDeptValue.setText(person.getDepartment());
            txtMoodValue.setText("I am " + person.getMood() + "!");
            imgChosenAvatar.setImageResource(person.getImgAvatarId());
            imgChosenMood.setImageResource(person.getImgMoodId());
        }
    }
}
