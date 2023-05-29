package com.example.operaciones;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText num1EditText, num2EditText;
    Button sumButton, subtractButton, multiplyButton, divideButton;
    TextView resultTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1EditText = findViewById(R.id.num1EditText);
        num2EditText = findViewById(R.id.num2EditText);
        sumButton = findViewById(R.id.sumButton);
        subtractButton = findViewById(R.id.subtractButton);
        multiplyButton = findViewById(R.id.multiplyButton);
        divideButton = findViewById(R.id.divideButton);
        resultTextView = findViewById(R.id.resultTextView);

        sumButton.setOnClickListener(view -> {
            double num1 = Double.parseDouble(num1EditText.getText().toString());
            double num2 = Double.parseDouble(num2EditText.getText().toString());
            double result = num1 + num2;
            resultTextView.setText(String.valueOf(result));
        });

        subtractButton.setOnClickListener(view -> {
            double num1 = Double.parseDouble(num1EditText.getText().toString());
            double num2 = Double.parseDouble(num2EditText.getText().toString());
            double result = num1 - num2;
            resultTextView.setText(String.valueOf(result));
        });

        multiplyButton.setOnClickListener(view -> {
            double num1 = Double.parseDouble(num1EditText.getText().toString());
            double num2 = Double.parseDouble(num2EditText.getText().toString());
            double result = num1 * num2;
            resultTextView.setText(String.valueOf(result));
        });

        divideButton.setOnClickListener(view -> {
            double num1 = Double.parseDouble(num1EditText.getText().toString());
            double num2 = Double.parseDouble(num2EditText.getText().toString());
            double result = num1 / num2;
            resultTextView.setText(String.valueOf(result));
        });
    }

    @Override
    public void onClick(View v) {

    }
}