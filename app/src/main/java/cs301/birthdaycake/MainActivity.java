package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.Switch;
import android.widget.SeekBar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        CakeView cakeView = findViewById(R.id.cakeview);
        CakeController cakeCont = new CakeController(cakeView);

        Button blowout = findViewById(R.id.blowOut);
        blowout.setOnClickListener(cakeCont);

        Switch candles = findViewById(R.id.switch2);
        candles.setOnCheckedChangeListener(cakeCont);

        SeekBar seekbar = findViewById(R.id.seekBar);
        seekbar.setOnSeekBarChangeListener(cakeCont);



    }

    public void goodbye(View button){
        Log.i("button","Goodbye.");
        finishAffinity();
    }
}
