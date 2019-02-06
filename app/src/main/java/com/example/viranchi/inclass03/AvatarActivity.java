package com.example.viranchi.inclass03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.io.Serializable;

public class AvatarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avatar);

        final ImageButton imgBtnF1 = (ImageButton)findViewById(R.id.imgF1);
        imgBtnF1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AvatarActivity.this,MainActivity.class);
                intent.putExtra(MainActivity.SELECTED_AVATAR, R.drawable.avatar_f_1);
                intent.putExtra(MainActivity.RESULT_KEY, "Avatar Selected");
                setResult(MainActivity.RESULT_OK,intent);
                finish();
            }
        });

        final ImageButton imgBtnF2 = (ImageButton)findViewById(R.id.imgF2);
        imgBtnF2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AvatarActivity.this,MainActivity.class);
                intent.putExtra(MainActivity.SELECTED_AVATAR, R.drawable.avatar_f_2);
                intent.putExtra(MainActivity.RESULT_KEY, "Avatar Selected");
                setResult(MainActivity.RESULT_OK,intent);
                finish();
            }
        });

        final ImageButton imgBtnF3 = (ImageButton)findViewById(R.id.imgF3);
        imgBtnF3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AvatarActivity.this,MainActivity.class);
                intent.putExtra(MainActivity.SELECTED_AVATAR, R.drawable.avatar_f_3);
                intent.putExtra(MainActivity.RESULT_KEY, "Avatar Selected");
                setResult(MainActivity.RESULT_OK,intent);
                finish();
            }
        });

        final ImageButton imgBtnM1 = (ImageButton)findViewById(R.id.imgM1);
        imgBtnM1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AvatarActivity.this,MainActivity.class);
                intent.putExtra(MainActivity.SELECTED_AVATAR, R.drawable.avatar_m_1);
                intent.putExtra(MainActivity.RESULT_KEY, "Avatar Selected");
                setResult(MainActivity.RESULT_OK,intent);
                finish();
            }
        });

        final ImageButton imgBtnM2 = (ImageButton)findViewById(R.id.imgM2);
        imgBtnM2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AvatarActivity.this,MainActivity.class);
                intent.putExtra(MainActivity.SELECTED_AVATAR, R.drawable.avatar_m_2);
                intent.putExtra(MainActivity.RESULT_KEY, "Avatar Selected");
                setResult(MainActivity.RESULT_OK,intent);
                finish();
            }
        });

        final ImageButton imgBtnM3 = (ImageButton)findViewById(R.id.imgM3);
        imgBtnM3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AvatarActivity.this,MainActivity.class);
                intent.putExtra(MainActivity.SELECTED_AVATAR, R.drawable.avatar_m_3);
                intent.putExtra(MainActivity.RESULT_KEY, "Avatar Selected");
                setResult(MainActivity.RESULT_OK,intent);
                finish();
            }
        });

    }
}
