# MJSearchBar -- 接入说明文档 V1.0.0
## 1. SDK集成

在根目录的 **build.gradle** 里加入下面的maven库

```
allprojects {
   	repositories {
   		...
   		maven { url "https://jitpack.io" }
   	}
   }
```

在 app/build.gradle 的dependencies里添加引用

```
implementation 'com.mjdy.ad:searchbar:1.0.0'
```

## 2. 接入代码

### 2.1 初始化
在application的onCreate里面加入

```
MJSearchBar.init(this, "yourChannelId");
```

> yourAppId 需要替换为您的ID

### 2.2 开启searchbar页面

```
 MJSearchBar.start(this);
```

> this 为 Activity

### 2.3 自定义奖励提示(可选)

调用 **MJSearchBar.setRewardListener** 设置监听，获得奖励会有onReward回调，然后可自行处理奖励文本，通过 **MJSearchBar.sendMessage**显示


```
       MJSearchBar.setRewardListener(new RewardListener() {
            @Override
            public void onReward(RewardModel rewardModel) {

                MJSearchBar.sendMessage(rewardModel.getId(), "i get " + rewardModel.getCoin());

            }
        });
```

> 该监听设置一次即可