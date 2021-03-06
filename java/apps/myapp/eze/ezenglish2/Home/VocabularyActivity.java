package apps.myapp.eze.ezenglish2.Home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import apps.myapp.eze.ezenglish2.Vocabulary.CommonWords.CommonWordsRecyclerViewLessonI;
import apps.myapp.eze.ezenglish2.R;
import apps.myapp.eze.ezenglish2.Vocabulary.Verbs.VerbsActivity;

import apps.myapp.eze.ezenglish2.Vocabulary.CommonWords.CommonWordsRecyclerViewLessonI;
import apps.myapp.eze.ezenglish2.Vocabulary.Verbs.VerbsActivity;

public class VocabularyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(apps.myapp.eze.ezenglish2.R.layout.activity_vocabulary);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void display_common_words (View view){
        Intent common_words = new Intent(this,CommonWordsRecyclerViewLessonI.class);
        startActivity(common_words);
    }
    public void display_verbs (View view){
        Intent verbs = new Intent(this,VerbsActivity.class);
        startActivity(verbs);
    }
}
