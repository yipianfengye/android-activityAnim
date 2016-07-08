package uuch.com.android_activityanim;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ExpandedMenuView;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button1 = null;
    private Button button2 = null;
    private Button button3 = null;
    private Button button4 = null;
    private Button button5 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        initListener();
    }

    /**
     * 实现组件的初始化操作
     */
    private void initView() {
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
    }

    /**
     * 实现组件的初始化监听
     */
    private void initListener() {
        /**
         * 点击按钮,实现Activity的跳转操作
         * 通过overridePendingTransition方法的方式实现activity的跳转动画
         */
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_top, R.anim.slide_in_top);

                /*button1.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        overridePendingTransition(R.anim.slide_in_top, R.anim.slide_in_top);
                    }
                }, 1000);*/
                /*new Thread(new Runnable() {
                    @Override
                    public void run() {
                        overridePendingTransition(R.anim.slide_in_top, R.anim.slide_in_top);
                    }
                }).start();*/


            }
        });

        /**
         * 点击按钮,实现Activity的跳转操作
         * 通过定义style的方式实现activity的跳转动画
         */
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        /**
         * 点击按钮,实现Activity的跳转操作
         * 通过android5.0及以上代码的方式实现activity的跳转动画
         */
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ThreeActivity.class);
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());
            }
        });

        /**
         * 点击按钮,实现Activity的跳转操作
         * 通过android5.0及以上style的方式实现activity的跳转动画
         */
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FourActivity.class);
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());
                finishAfterTransition();
            }
        });

        /**
         * 点击按钮,实现Activity的跳转操作
         * 通过android5.0及以上共享组件的方式实现activity的跳转动画
         */
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FiveActivity.class);
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, button5, "shareNames").toBundle());
            }
        });
    }
}
