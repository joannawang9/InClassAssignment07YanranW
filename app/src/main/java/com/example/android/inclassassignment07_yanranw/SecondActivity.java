package com.example.android.inclassassignment07_yanranw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    Brand b;
    TextView brandInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent main = getIntent();
        b = (Brand)main.getSerializableExtra(Keys.BRAND);
        brandInfo = findViewById(R.id.brand);
        brandInfo.setText(b.toString());


    }
    public void submitBrand(View view){
        Intent data = new Intent(this,MainActivity.class);
        data.putExtra(Keys.BRAND,b);
        setResult(RESULT_OK,data);
        finish();
    }
}
