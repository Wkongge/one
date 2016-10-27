package vanlon.one;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * Created by admin on 2016/9/18.
 */
public class TestButton extends Button {

    String tag="TestLinearLayout";
    public TestButton(Context context) {
        super(context);
    }

    public TestButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TestButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i(tag,"dispatchTouchEvent="+super.dispatchTouchEvent(ev));
        return super.dispatchTouchEvent(ev);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i(tag,"onTouchEvent="+super.onTouchEvent(event));
        return super.onTouchEvent(event);
    }
}
