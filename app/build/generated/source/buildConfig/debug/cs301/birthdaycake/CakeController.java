package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {
    private CakeView cakeView;
    private CakeModel cakeModel;
    public CakeController (CakeView cake) {
        cakeView = cake;
        cakeModel = cakeView.getCakeModel();
    }

    public void onClick(View v){
        Log.d("ooga", "booga");
        cakeModel.candleLit = false;
        cakeView.invalidate();
    }
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
        Log.d("ooga", "booga" + isChecked);
        cakeModel.candles = isChecked;
        cakeView.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        cakeModel.numCandles = i;
        cakeView.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
