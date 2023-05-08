package com.github.muneebwanee.dash.services.social;

import java.lang.System;

/**
 * Created by muneebwanee on 15/12/20.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0017J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/github/muneebwanee/dash/services/social/InteractorMonitorService;", "Lcom/github/muneebwanee/dash/services/social/InterfaceMonitorService;", "context", "Landroid/content/Context;", "firebase", "Lcom/github/muneebwanee/dash/data/rxFirebase/InterfaceFirebase;", "(Landroid/content/Context;Lcom/github/muneebwanee/dash/data/rxFirebase/InterfaceFirebase;)V", "gerSocialStatus", "", "setPermission", "status", "", "app_debug"})
public final class InteractorMonitorService implements com.github.muneebwanee.dash.services.social.InterfaceMonitorService {
    private final android.content.Context context = null;
    private final com.github.muneebwanee.dash.data.rxFirebase.InterfaceFirebase firebase = null;
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void gerSocialStatus() {
    }
    
    @java.lang.Override()
    public void setPermission(boolean status) {
    }
    
    @javax.inject.Inject()
    public InteractorMonitorService(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.github.muneebwanee.dash.data.rxFirebase.InterfaceFirebase firebase) {
        super();
    }
}