package apps.myapp.eze.ezenglish2.Vocabulary.CommonWords;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import apps.myapp.eze.ezenglish2.R;

public class CommonWordsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(apps.myapp.eze.ezenglish2.R.layout.activity_common_words);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
