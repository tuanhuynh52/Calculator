package com.example.tuanhuynh.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RectangleCalculator extends AppCompatActivity {

    private static EditText WIDTH;
    private static EditText HEIGHT;
    private static Button calButton;
    private static double areaResult;
    private static double periResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle_calculator);

        WIDTH = (EditText)findViewById(R.id.width);
        HEIGHT = (EditText)findViewById(R.id.height);
        calButton = (Button)findViewById(R.id.button);

        calButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double width = Double.parseDouble(WIDTH.getText().toString());
                double height = Double.parseDouble(HEIGHT.getText().toString());
                areaResult = (width * height);
                periResult = ((width + height) / 2);
                TextView result = (TextView) findViewById(R.id.resultText);
                result.setText("Area is: " + areaResult + "\n" + "Perimeter is: " + periResult);

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_rectangle_calculator, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
