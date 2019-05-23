package com.mjdy.searchbarsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.mjdy.libsearchbar.MJSearchBar;
import com.mjdy.libsearchbar.RewardListener;
import com.mjdy.libsearchbar.models.RewardModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // 设置奖励监听，非必须
        MJSearchBar.setRewardListener(new RewardListener() {
            @Override
            public void onReward(RewardModel rewardModel) {

                // 同步 or 异步处理奖励结果. 可通过 rewardModel.getCoin() 获取奖励的金币数

                MJSearchBar.sendMessage(rewardModel.getId(), "恭喜你得到了 " + rewardModel.getCoin() + " 万美元");


            }
        });

    }

    public void start(View view) {
        MJSearchBar.start(this);  // 启动搜索页
    }

}
