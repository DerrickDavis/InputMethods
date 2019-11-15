package com.example.inputmethods42;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView mtvName, mtvPhone, mtvAddress, mtvNote;
    EditText metName, metPhone, metAddress, metNote;
    RadioGroup radioDelGroup;
    RadioButton radioDelvButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtvName = findViewById(R.id.tv_name);
        mtvAddress = findViewById(R.id.tv_address);
        mtvPhone = findViewById(R.id.tv_phone);
        mtvNote = findViewById(R.id.tv_note);
        metName = findViewById(R.id.et_name);
        metPhone = findViewById(R.id.et_phone);
        metAddress = findViewById(R.id.et_address);
        metNote = findViewById(R.id.et_note);
        radioDelGroup = findViewById(R.id.rg_deliveryOptions);
        radioDelGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.rb_delivery_option1:
                        Toast.makeText(MainActivity.this, R.string.same_day, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb_delivery_option2:
                        Toast.makeText(MainActivity.this, R.string.next_day, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb_delivery_option3:
                        Toast.makeText(MainActivity.this, R.string.pick_up, Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }


}

