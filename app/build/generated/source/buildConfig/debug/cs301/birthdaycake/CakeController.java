package cs301.birthdaycake;

import android.util.Log;
import android.view.View;

public class CakeController implements View.OnClickListener{
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
}
