package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView story_TV;
    private Button topButton;
    private Button bottomButton;
    private int currentStoryBoard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        story_TV = findViewById(R.id.storyTextView);
        topButton = findViewById(R.id.buttonTop);
        bottomButton = findViewById(R.id.buttonBottom);

        // initial storyboard
        currentStoryBoard = 1;
        createSB1();

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(currentStoryBoard)
                {
                    case 1:
                        createSB3();
                        break;
                    case 2:
                        createSB3();
                        break;
                    case 3:
                        createEND6();
                        break;
                    default:
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(currentStoryBoard)
                {
                    case 1:
                        createSB2();
                        break;
                    case 2:
                        createEND4();
                        break;
                    case 3:
                        createEND5();
                        break;
                    default:
                }
            }
        });

    }

    // methods for layouts
    public void createSB1()
    {
        story_TV.setText(R.string.T1_Story);

        topButton.setEnabled(true);
        topButton.setVisibility(View.VISIBLE);
        topButton.setText(R.string.T1_Ans1);

        bottomButton.setEnabled(true);
        bottomButton.setVisibility(View.VISIBLE);
        bottomButton.setText(R.string.T1_Ans2);

        currentStoryBoard = 1;
    }

    public void createSB2()
    {
        story_TV.setText(R.string.T2_Story);

        topButton.setEnabled(true);
        topButton.setVisibility(View.VISIBLE);
        topButton.setText(R.string.T2_Ans1);

        bottomButton.setEnabled(true);
        bottomButton.setVisibility(View.VISIBLE);
        bottomButton.setText(R.string.T2_Ans2);

        currentStoryBoard = 2;
    }

    public void createSB3()
    {
        story_TV.setText(R.string.T3_Story);

        topButton.setEnabled(true);
        topButton.setVisibility(View.VISIBLE);
        topButton.setText(R.string.T3_Ans1);

        bottomButton.setEnabled(true);
        bottomButton.setVisibility(View.VISIBLE);
        bottomButton.setText(R.string.T3_Ans2);

        currentStoryBoard = 3;
    }

    public void createEND4()
    {
        story_TV.setText(R.string.T4_End);

        topButton.setEnabled(false);
        topButton.setVisibility(View.INVISIBLE);

        bottomButton.setEnabled(false);
        bottomButton.setVisibility(View.INVISIBLE);

        currentStoryBoard = 4;
    }

    public void createEND5()
    {
        story_TV.setText(R.string.T5_End);

        topButton.setEnabled(false);
        topButton.setVisibility(View.INVISIBLE);

        bottomButton.setEnabled(false);
        bottomButton.setVisibility(View.INVISIBLE);

        currentStoryBoard = 5;
    }
    public void createEND6()
    {
        story_TV.setText(R.string.T6_End);

        topButton.setEnabled(false);
        topButton.setVisibility(View.INVISIBLE);

        bottomButton.setEnabled(false);
        bottomButton.setVisibility(View.INVISIBLE);

        currentStoryBoard = 6;
    }
}
