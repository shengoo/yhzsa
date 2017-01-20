package com.sheng00.yhzs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by UC206612 on 2017/1/20.
 */

public class BaseActivity extends AppCompatActivity {

    @Override
    public Intent getSupportParentActivityIntent() {
        finish();
        return null;
    }

}
