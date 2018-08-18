package apps.myapp.eze.ezenglish2.Home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import apps.myapp.eze.ezenglish2.GrammarLessonI.GrammarLessonIMainActivity;
import apps.myapp.eze.ezenglish2.GrammarLessonII.GrammarLessonIIMainActivity;
import apps.myapp.eze.ezenglish2.GrammarLessonIII.GrammarLessonIIIMainActivity;
import apps.myapp.eze.ezenglish2.R;

import apps.myapp.eze.ezenglish2.GrammarLessonI.GrammarLessonIMainActivity;

public class GrammarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(apps.myapp.eze.ezenglish2.R.layout.activity_grammar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void grammarDisplayLessonI(View view){
        Intent lessonI = new Intent(this,GrammarLessonIMainActivity.class);
        startActivity(lessonI);
    }
    public void grammarDisplayLessonII(View view){
        Intent lessonI = new Intent(this,GrammarLessonIIMainActivity.class);
        startActivity(lessonI);
    }
    public void grammarDisplayLessonIII(View view){
        Intent lessonI = new Intent(this,GrammarLessonIIIMainActivity.class);
        startActivity(lessonI);
    }
}
