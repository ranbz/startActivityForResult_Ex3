package prof.rbz.startactivityforresult_ex3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InputActivity extends AppCompatActivity  implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        Button one_btn= (Button) findViewById(R.id.one_btn);
        one_btn.setOnClickListener(this);

        Button two_btn= (Button) findViewById(R.id.two_btn);
        two_btn.setOnClickListener(this);

        Button three_btn= (Button) findViewById(R.id.three_btn);
        three_btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Button clickedButton = (Button) v;


        String Str1 = clickedButton.getText().toString();

        Intent intent= new Intent();
        intent.putExtra("clickedButton", Str1);
        setResult(1,intent);

        finish();

    }
}
