package adjie.kurniawan.signintemplate_minimalist;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {

    /*intent*/
    public void startActivity(Class aClass) {
        Intent activity = new Intent(this, aClass);
        activity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(activity);
    }

}
