package uuch.com.android_activityanim;

import android.content.Context;
import android.provider.Settings;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.MediumTest;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;


import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@MediumTest
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentationTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("uuch.com.android_activityanim", appContext.getPackageName());
    }

    @Test
    public void test2() {
        boolean result = "18210741899".matches("\\d{11}");
        Log.i("tag", "#####:" + result);
        /**
         * 验证邮箱
         */
        assertEquals("result:", result, true);
    }
}