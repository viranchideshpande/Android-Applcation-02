package com.example.viranchi.inclass03;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final static String SELECTED_AVATAR = "selected_Avt";
    final static String RESULT_KEY = "result";
    final static int REQ_CODE = 1001;
    private ImageView imgViewTheAvatar = null;
    private int avtId = -1;
    final static String EMAIL_PATTERN = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    final static String PROFILE_KEY = "Profile";


    // Method for return of activity without disturbing state of variables
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQ_CODE)
        {
            if (resultCode == RESULT_OK && data.getExtras().containsKey(RESULT_KEY))
            {
                avtId = data.getExtras().getInt(SELECTED_AVATAR);
                imgViewTheAvatar.setImageResource(avtId);
            }else {
                //error
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Profile person = new Profile();
        final EditText edtTxtNameVal = (EditText)findViewById(R.id.edtName);
        final EditText edtTxtEmailVal = (EditText)findViewById(R.id.edtEmail);


        RadioGroup rgDept = (RadioGroup)findViewById(R.id.rdGrpDepartment);
        rgDept.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                RadioButton checkedBtn = (RadioButton) findViewById(checkedId);
                person.setDepartment(checkedBtn.getText().toString());
            }
        });

        final ImageView imgMood = (ImageView)findViewById(R.id.imgViewMood);
        final TextView txtMoodWords = (TextView)findViewById(R.id.txtMood);

        SeekBar seekMoodBar = (SeekBar) findViewById(R.id.seekBarMood);
        seekMoodBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                 if (progress == 0)
                 {
                     imgMood.setImageResource(R.drawable.angry);
                     txtMoodWords.setText("Your Current Mood: Angry");
                     person.setMood("Angry");
                     person.setImgMoodId(R.drawable.angry);
                 }
                 else if (progress == 1)
                 {
                     imgMood.setImageResource(R.drawable.sad);
                     txtMoodWords.setText("Your Current Mood: Sad");
                     person.setMood("Sad");
                     person.setImgMoodId(R.drawable.sad);
                 }else if (progress == 2)
                 {
                     imgMood.setImageResource(R.drawable.happy);
                     txtMoodWords.setText("Your Current Mood: Happy");
                     person.setMood("Happy");
                     person.setImgMoodId(R.drawable.happy);
                 }
                 else if (progress == 3)
                 {
                     imgMood.setImageResource(R.drawable.awesome);
                     txtMoodWords.setText("Your Current Mood: Awesome");
                     person.setMood("Awesome");
                     person.setImgMoodId(R.drawable.awesome);
                 }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        imgViewTheAvatar = (ImageView) findViewById(R.id.imgViewAvatar);
        imgViewTheAvatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AvatarActivity.class);
                startActivityForResult(intent,REQ_CODE);
            }
        });

        findViewById(R.id.btnSubmit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edtTxtNameVal.getText().toString().length() == 0)
                    Toast.makeText(MainActivity.this, "Please enter the Name", Toast.LENGTH_LONG).show();
                else if (!(edtTxtEmailVal.getText().toString().matches(EMAIL_PATTERN)))
                    Toast.makeText(MainActivity.this, "Please enter correct Email", Toast.LENGTH_LONG).show();
                else if (avtId == -1)
                    Toast.makeText(MainActivity.this, "Please select an avatar", Toast.LENGTH_LONG).show();
                else
                {
                    person.setName(edtTxtNameVal.getText().toString());
                    person.setEmail(edtTxtEmailVal.getText().toString());
                    person.setImgAvatarId(avtId);
                    Intent intent = new Intent(MainActivity.this,DisplayActivity.class);
                    intent.putExtra(PROFILE_KEY,person);
                    startActivity(intent);
                }
            }
        });

    }
}
