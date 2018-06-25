package com.example.peterson.todoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    EditText edtUpdate;
    Button button;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        edtUpdate = (EditText) findViewById(R.id.edtUpdate);
        button = (Button) findViewById(R.id.btnUpdateSave);

//        set focus on edittext
        edtUpdate.requestFocus();

        String receive = getIntent().getStringExtra("passingEdit");
        position = getIntent().getIntExtra("val",0);

        edtUpdate.setText(receive);
        //Place the cursor at the end of text in edittext
        edtUpdate.setSelection(edtUpdate.getText().length());

    }


    public void onClickAdd(View view) {
                Intent data = new Intent();
                data.putExtra("return", edtUpdate.getText().toString());
                data.putExtra("pos",position);
                setResult(RESULT_OK, data);
                finish();
    }
}
