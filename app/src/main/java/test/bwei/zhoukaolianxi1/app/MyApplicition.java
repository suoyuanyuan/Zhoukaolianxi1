package test.bwei.zhoukaolianxi1.app;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by 大白 on 2017/11/4.
 */

public class MyApplicition extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Fresco.initialize(this);
    }
}
