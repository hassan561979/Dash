package com.github.muneebwanee.dash.utils.checkForegroundApp;

import java.lang.System;

/**
 * Created by muneebwanee on 15/12/20.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/github/muneebwanee/dash/utils/checkForegroundApp/CheckForegroundApp;", "Lcom/github/muneebwanee/dash/utils/checkForegroundApp/CheckDetector;", "()V", "getForegroundPostLollipop", "", "context", "Landroid/content/Context;", "getForegroundPreLollipop", "app_debug"})
public final class CheckForegroundApp implements com.github.muneebwanee.dash.utils.checkForegroundApp.CheckDetector {
    
    @org.jetbrains.annotations.Nullable()
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.LOLLIPOP_MR1)
    @java.lang.Override()
    public java.lang.String getForegroundPostLollipop(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getForegroundPreLollipop(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public CheckForegroundApp() {
        super();
    }
}