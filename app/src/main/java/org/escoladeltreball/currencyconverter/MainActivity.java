package org.escoladeltreball.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etFrom, etTo;
    private Button btnConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setup();
    }

    private void setup() {
        etFrom = (EditText) findViewById(R.id.etFrom);
        etTo = (EditText) findViewById(R.id.etTo);
        btnConvert = (Button) findViewById(R.id.btnConvert);
        btnConvert.setOnClickListener(view -> convert());
    }

    private void convert() {
        double from = 0;
        try {
            from = Double.parseDouble(etFrom.getText().toString());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        Double to = from * 1.2;
        etTo.setText(String.valueOf(to));
    }
}
