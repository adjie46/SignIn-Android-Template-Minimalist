package adjie.kurniawan.signintemplate_minimalist.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import adjie.kurniawan.signintemplate_minimalist.BaseActivity;
import adjie.kurniawan.signintemplate_minimalist.R;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    private Button mBtnGetStarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mBtnGetStarted = findViewById(R.id.btn_getStarted);

        initialize();
    }

    private void initialize() {
        mBtnGetStarted.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_getStarted) {
            startActivity(SignInActivity.class);
        }
    }
}