package apps.myapp.eze.ezenglish2.Home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import apps.myapp.eze.ezenglish2.R;
import apps.myapp.eze.ezenglish2.Evaluation.Grammar.StartingScreenActivityGrammar;
import apps.myapp.eze.ezenglish2.Evaluation.Vocabulary.StartingScreenActivityVocabulary;

import apps.myapp.eze.ezenglish2.Evaluation.Grammar.StartingScreenActivityGrammar;
import apps.myapp.eze.ezenglish2.Evaluation.Vocabulary.StartingScreenActivityVocabulary;

public class EvaluationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(apps.myapp.eze.ezenglish2.R.layout.activity_evaluation);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void evaluationGrammar(View view){
        Intent lessonI = new Intent(this,StartingScreenActivityGrammar.class);
        startActivity(lessonI);
    }
    public void evaluationVocabulary(View view){
        Intent lessonI = new Intent(this,StartingScreenActivityVocabulary.class);
        startActivity(lessonI);
    }
}
