package uuch.com.android_activityanim;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.MediumTest;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Created by aaron on 16/7/11.
 * 自定义的单元测试类
 */

@MediumTest
@RunWith(AndroidJUnit4.class)
public class MTest {

    @Test
    private void test1() {
        assertEquals("result:", 123, 100 + 23);
    }
}
