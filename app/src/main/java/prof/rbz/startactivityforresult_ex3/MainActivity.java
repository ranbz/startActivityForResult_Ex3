package prof.rbz.startactivityforresult_ex3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {

    Button M_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        M_btn= (Button) findViewById(R.id.M_btn);
        M_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, InputActivity.class);

                //  startActivity(intent);

                startActivityForResult(intent , 10);

            }
        });

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent incomingIntentWithResult) {

        String Ans=incomingIntentWithResult.getStringExtra("clickedButton");

        M_btn.setText(Ans);

    }
}
