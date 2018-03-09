package com.example.android.inclassassignment07_yanranw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText mName;
    EditText mHistory;
    CheckBox mLocal;
    EditText mInformation;
    Button submit;
    TextView display;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = findViewById(R.id.name);
        mHistory = findViewById(R.id.history);
        mLocal = findViewById(R.id.checkbox);
        mInformation = findViewById(R.id.information);
        submit = findViewById(R.id.submit);
        display = (TextView)findViewById(R.id.display);

    }

    public void onClick(View view){
        String name = mName.getText().toString();
        String history = mHistory.getText().toString();
        int historyLength;
        try{
            historyLength = Integer.parseInt(history);
        }catch(NumberFormatException ex){
            historyLength = 0;
        }
        boolean isLocal = mLocal.isChecked();
        String information = mInformation.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        Brand b = new Brand(name,historyLength,isLocal,information);
        intent.putExtra(Keys.BRAND,b);
        startActivityForResult(intent,RequestCodes.ADD_PERSON);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == RequestCodes.ADD_PERSON && resultCode == RESULT_OK) {
            Brand b = (Brand) data.getSerializableExtra(Keys.BRAND);
            display.setText(b.toString());
        }
    }



}
