package eecs1022.mcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EntryForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mortgage_layout);
        Button button=findViewById(R.id.compute);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClicked(v);
            }
        });
    }

    public void buttonClicked(View v){
        EditText principleView=findViewById(R.id.principle);
        String principle=principleView.getText().toString();

        EditText amortizationView=findViewById(R.id.amortization);
        String amortization=amortizationView.getText().toString();

        EditText rateView=findViewById(R.id.interest_rate);
        String interest_rate=rateView.getText().toString();

        MortgageModel mortgageModel=new MortgageModel(principle,amortization,interest_rate);
        String myMortgage=mortgageModel.computePayment();

        ((TextView)findViewById(R.id.result)).setText(myMortgage);
    }
}
