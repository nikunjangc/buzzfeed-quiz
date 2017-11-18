package nyc.c4q.buzzfeedquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View v){
        switch (v.getId()){
            case R.id.quizz_btn1:
                Intent intent=new Intent(MainActivity.this, bookActivity.class);
                startActivity(intent);

                break;

            case R.id.quizz_btn2:
                Intent intent1=new Intent(MainActivity.this, guessTheAge.class);
                startActivity(intent1);
                break;

        }
    }
}

