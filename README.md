# BaseKotlin
framework base kotlin

#### kotlin 配置  
1. Android studio 3.0 已经自带了kotlin的使用插件，不需要再进行安装
2. 创建一个kotlin文件，点击问价左上角的config 选择版本
3. 配置完之后，如果还是现实kotlin not config，则点击rebuild 进行编译项目，如果还是显示，则重新启动 Android studio即可
4. kotlin已经集成了语法库和扩展库，如果想使用扩展库，只需要在app/build.gradle中添加 apply plugin: 'kotlin-android-extensions' 启用扩展库即可
