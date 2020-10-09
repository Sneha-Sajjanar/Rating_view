package com.example.rate_us;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView titleRate, resultRate;
    ImageView emoji;

    Button button;
    RatingBar rateStars;
    String answervalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titleRate = findViewById(R.id.rating_title);
        resultRate = findViewById(R.id.rating_result);
        emoji = findViewById(R.id.emoji);
        button = findViewById(R.id.btn_Submit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Thank You! for the Feedback ", Toast.LENGTH_LONG).show();
               // RateUs.this.finish();


            }
        });



        rateStars = findViewById(R.id.rateStars);



        rateStars.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                answervalue = String.valueOf((int) (rateStars.getRating()));

                if (answervalue.equals("1")){
                    emoji.setImageResource(R.drawable.one);
                    resultRate.setText("Bad");
                }
                else if (answervalue.equals("2")){
                    emoji.setImageResource(R.drawable.two);

                    resultRate.setText("Not Bad");
                }
                else if (answervalue.equals("3")){
                    emoji.setImageResource(R.drawable.three);

                    resultRate.setText("Nice!");
                }
                else if (answervalue.equals("4")){
                    emoji.setImageResource(R.drawable.four);

                    resultRate.setText("Good Job!");
                }
                else if (answervalue.equals("5")){
                    emoji.setImageResource(R.drawable.five);

                    resultRate.setText("Awesome!");
                }
                else {
                    Toast.makeText(getApplicationContext(), "No Point", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }


}




