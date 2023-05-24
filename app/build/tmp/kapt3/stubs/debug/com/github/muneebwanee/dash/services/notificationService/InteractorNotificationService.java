package com.github.muneebwanee.dash.services.notificationService;

import java.lang.System;

/**
 * Created by muneebwanee on 15/12/20.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0016J8\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\fH\u0002J8\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/github/muneebwanee/dash/services/notificationService/InteractorNotificationService;", "Lcom/github/muneebwanee/dash/services/notificationService/InterfaceNotificationListener;", "context", "Landroid/content/Context;", "firebase", "Lcom/github/muneebwanee/dash/data/rxFirebase/InterfaceFirebase;", "(Landroid/content/Context;Lcom/github/muneebwanee/dash/data/rxFirebase/InterfaceFirebase;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "getNotificationExists", "", "id", "", "exec", "Lkotlin/Function0;", "setData", "type", "", "text", "title", "nameImage", "urlImage", "setDataMessageNotification", "image", "Landroid/graphics/Bitmap;", "setRunService", "run", "", "app_debug"})
public final class InteractorNotificationService implements com.github.muneebwanee.dash.services.notificationService.InterfaceNotificationListener {
    private final android.content.Context context = null;
    private final com.github.muneebwanee.dash.data.rxFirebase.InterfaceFirebase firebase = null;
    private io.reactivex.disposables.CompositeDisposable disposable;
    
    @javax.inject.Inject
    public InteractorNotificationService(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.github.muneebwanee.dash.data.rxFirebase.InterfaceFirebase firebase) {
        super();
    }
    
    @java.lang.Override
    public void setRunService(boolean run) {
    }
    
    @java.lang.Override
    public void getNotificationExists(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> exec) {
    }
    
    @java.lang.Override
    public void setDataMessageNotification(int type, @org.jetbrains.annotations.Nullable
    java.lang.String text, @org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.String nameImage, @org.jetbrains.annotations.Nullable
    android.graphics.Bitmap image) {
    }
    
    private final void setData(int type, java.lang.String text, java.lang.String title, java.lang.String nameImage, java.lang.String urlImage) {
    }
}