package wildaps.com.helloword;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;

/**
 * Created by wildan on 10/4/2015.
 */
public class Hello extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Configuration config = getResources().getConfiguration();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
/**
 * Check the device orientation and act accordingly
 */
        if (config.orientation == Configuration.ORIENTATION_LANDSCAPE) {
/**
 * Landscape mode of the device
 */
            LmFragment lmfragment = new LmFragment();
            fragmentTransaction.replace(android.R.id.content, lmfragment);
        }else{
/**
 * Portrait mode of the device
 */
            CobaFragment cbfragment = new CobaFragment();
            fragmentTransaction.replace(android.R.id.content, cbfragment);
        }
        fragmentTransaction.commit();
    }
}