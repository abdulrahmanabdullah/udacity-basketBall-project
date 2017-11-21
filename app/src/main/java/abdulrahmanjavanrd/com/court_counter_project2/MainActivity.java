package abdulrahmanjavanrd.com.court_counter_project2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // declare Views .
    TextView txvScoreA, txvScoreB;
    // sum points ..
    int scoreTeamA;
    int scoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txvScoreA = findViewById(R.id.txv_score_a);
        txvScoreB = findViewById(R.id.txv_score_b);
    }

    /*************** Start Team A methods ************************/
    public void addThreeScoreTemaA(View view) {
        scoreTeamA += 3;
        displayScoreTeamA(scoreTeamA);
    }

    public void addTwoScoreTeamA(View view) {
        scoreTeamA += 2;
        displayScoreTeamA(scoreTeamA);
    }

    public void addFreeScoreTeamA(View view) {
        scoreTeamA++;
        displayScoreTeamA(scoreTeamA);
    }

    private void displayScoreTeamA(int s) {
        txvScoreA.setText(String.valueOf(s));
    }
    /*************** End Team A methods ************************/
    /*************** Start Team B methods ************************/
    public void addThreeScoreTemaB(View view) {
        scoreTeamB += 3;
        displayScoreTeamB(scoreTeamB);
    }

    public void addTwoScoreTeamB(View view) {
        scoreTeamB += 2;
        displayScoreTeamB(scoreTeamB);
    }

    public void addFreeScoreTeamB(View view) {
        scoreTeamB++;
        displayScoreTeamB(scoreTeamB);
    }

    private void displayScoreTeamB(int s) {
        txvScoreB.setText(String.valueOf(s));
    }
    /*************** End  Team B methods ************************/


    /********* Reset All scores . ***********/
    public void restAllScores(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
    }
}
