package wildaps.com.helloword;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.SeekBar;

public class hellow extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wildapps);
        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        ll.setGravity(Gravity.CENTER);
        EditText myEditText = new EditText(this);
        SeekBar mySeekBar = new SeekBar(this);
        Button myBtn = new Button(this);
        myEditText.setText("Text Goes Here!");
        mySeekBar.setProgress(50);
        myBtn.setText("Click Here !!");
        int lHeight = LinearLayout.LayoutParams.WRAP_CONTENT;
        int lWidth = 500;
        LinearLayout.LayoutParams params= new LinearLayout.LayoutParams(lWidth,lHeight);
        params.setMargins(10, 10, 10, 10);
        ll.addView(myEditText, params);
        ll.addView(mySeekBar, params);
        ll.addView(myBtn, params);
        setContentView(ll);
    }

}
