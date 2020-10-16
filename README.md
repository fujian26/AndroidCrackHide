# AndroidCrackHide
可以让 Android 9 以后 @hide 相关字段、方法能够正常被反射逻辑获取到，主要原理利用修改虚拟机 Runtime 相关数据实现，目前已兼容到 Android 11。

详细使用方法
```
MReflectTool.crackHideMethod(getApplication().getApplicationInfo().targetSdkVersion, Build.VERSION.SDK_INT);
```
