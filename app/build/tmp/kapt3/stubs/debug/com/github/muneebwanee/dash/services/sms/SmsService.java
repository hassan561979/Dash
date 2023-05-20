package com.github.muneebwanee.dash.services.sms;

import java.lang.System;

/**
 * Created by muneebwanee on 15/12/20.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\"\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0016J\f\u0010\u0014\u001a\u00020\u000b*\u00020\u0010H\u0002R$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0015"}, d2 = {"Lcom/github/muneebwanee/dash/services/sms/SmsService;", "Lcom/github/muneebwanee/dash/services/base/BaseService;", "Lcom/github/muneebwanee/dash/services/sms/InterfaceServiceSms;", "()V", "interactor", "Lcom/github/muneebwanee/dash/services/sms/InterfaceInteractorSms;", "getInteractor", "()Lcom/github/muneebwanee/dash/services/sms/InterfaceInteractorSms;", "setInteractor", "(Lcom/github/muneebwanee/dash/services/sms/InterfaceInteractorSms;)V", "onCreate", "", "onDestroy", "onStartCommand", "", "intent", "Landroid/content/Intent;", "flags", "startId", "stopServiceSms", "setSmsIntent", "app_debug"})
public final class SmsService extends com.github.muneebwanee.dash.services.base.BaseService implements com.github.muneebwanee.dash.services.sms.InterfaceServiceSms {
    @javax.inject.Inject
    public com.github.muneebwanee.dash.services.sms.InterfaceInteractorSms<com.github.muneebwanee.dash.services.sms.InterfaceServiceSms> interactor;
    
    public SmsService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.github.muneebwanee.dash.services.sms.InterfaceInteractorSms<com.github.muneebwanee.dash.services.sms.InterfaceServiceSms> getInteractor() {
        return null;
    }
    
    public final void setInteractor(@org.jetbrains.annotations.NotNull
    com.github.muneebwanee.dash.services.sms.InterfaceInteractorSms<com.github.muneebwanee.dash.services.sms.InterfaceServiceSms> p0) {
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @java.lang.Override
    public int onStartCommand(@org.jetbrains.annotations.Nullable
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    private final void setSmsIntent(android.content.Intent $this$setSmsIntent) {
    }
    
    @java.lang.Override
    public void stopServiceSms() {
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
}