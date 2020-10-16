package com.jacob.mnativetools;

/**
 * 反射相关工具类
 */
public class MReflectTool {

    static {
        System.loadLibrary("mreflect-tools");
    }

    /**
     * 破解 @hide 限制的方法、变量
     * @param targetSdkVersion -- getApplication().getApplicationInfo().targetSdkVersion
     * @param sdkVersion -- Build.VERSION.SDK_INT
     * @return
     */
    public static native boolean crackHideMethod(int targetSdkVersion, int sdkVersion);
}
