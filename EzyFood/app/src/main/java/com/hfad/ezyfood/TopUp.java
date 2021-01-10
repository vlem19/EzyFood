package com.hfad.ezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TopUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_up2);

        final double[] count = {0};

            final TextView textDes = (TextView)findViewById(R.id.text_desc);
            final EditText payAmount = (EditText) findViewById(R.id.paid_amount);
            Button btnPaid = (Button)findViewById(R.id.btn_paid);

            textDes.setText("Balance: " + count[0]);
            btnPaid.setText("Top Up");
            btnPaid.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    String uangbayar = payAmount.getText().toString().trim();

                    double ub = Double.parseDouble(uangbayar);
                    count[0] = (count[0] + ub);
                    textDes.setText("Balance: " + count[0]);
                }
            });
    }
}