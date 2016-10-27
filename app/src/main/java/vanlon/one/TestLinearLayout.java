package vanlon.one;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by admin on 2016/9/18.
 */
public class TestLinearLayout extends LinearLayout {
    String tag="TestLinearLayout";
    public TestLinearLayout(Context context) {
        super(context);
    }

    public TestLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TestLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
//        Log.i(tag,"parent:dispatchTouchEvent="+super.dispatchTouchEvent(ev));
        return super.dispatchTouchEvent(ev);
    }
    private String m="aaaaaa";
    String n="hhhh";
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.i(tag,"parent:onInterceptTouchEvent="+super.onInterceptTouchEvent(ev));

        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.i(tag,"onInterceptTouchEvent:"+"MotionEvent.ACTION_DOWN");
                break;
            case  MotionEvent.ACTION_MOVE:
                Log.i(tag,"onInterceptTouchEvent:"+"MotionEvent.ACTION_MOVE");
                Log.i(tag,m);
//                m="cccccc";
                break;
//            case MotionEvent.ACTION_UP:
//                Log.i(tag,m+"");
//                break;

        }
        return true;
    }
    float startY=0;
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float endY;
//        Log.i(tag,"onTouchEvent");
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                startY=event.getY();
//                Log.i(tag,"onTouchEvent:"+"MotionEvent.ACTION_DOWN");
//                m="vvvvvvvvvvv";
                break;
//            case MotionEvent.ACTION_MOVE:
//                Log.i(tag,"onTouchEvent:"+"MotionEvent.ACTION_MOVE");
//                break;
            case MotionEvent.ACTION_UP:
                endY=event.getY();
                Log.i(tag,(startY)+"");
                Log.i(tag,endY+"");
                Log.i(tag,(endY-startY)+"");
                break;
//
        }
        return true;
    }
}
