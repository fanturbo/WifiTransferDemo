package pub.war3.wifitransferdemo;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/**
 * Created by turbo on 2017/2/9.
 */

public class App extends Application {
    private static Context mContext;

    @Override
    public void onCreate() {
        mContext = this;
    }

    public static Context getAppContext() {
        return mContext;
    }
}
