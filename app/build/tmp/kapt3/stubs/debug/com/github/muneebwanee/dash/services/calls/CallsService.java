package com.github.muneebwanee.dash.services.calls;

import java.lang.System;

/**
 * Created by muneebwanee on 15/12/20.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\"\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0016J\f\u0010\u0017\u001a\u00020\u000f*\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/github/muneebwanee/dash/services/calls/CallsService;", "Lcom/github/muneebwanee/dash/services/base/BaseService;", "Lcom/github/muneebwanee/dash/services/calls/InterfaceServiceCalls;", "()V", "callType", "", "interactor", "Lcom/github/muneebwanee/dash/services/calls/InterfaceInteractorCalls;", "getInteractor", "()Lcom/github/muneebwanee/dash/services/calls/InterfaceInteractorCalls;", "setInteractor", "(Lcom/github/muneebwanee/dash/services/calls/InterfaceInteractorCalls;)V", "phoneNumber", "", "onCreate", "", "onDestroy", "onStartCommand", "intent", "Landroid/content/Intent;", "flags", "startId", "stopServiceCalls", "setCallIntent", "app_debug"})
public final class CallsService extends com.github.muneebwanee.dash.services.base.BaseService implements com.github.muneebwanee.dash.services.calls.InterfaceServiceCalls {
    private java.lang.String phoneNumber;
    private int callType;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.github.muneebwanee.dash.services.calls.InterfaceInteractorCalls<com.github.muneebwanee.dash.services.calls.InterfaceServiceCalls> interactor;
    
    @org.jetbrains.annotations.NotNull()
    public final com.github.muneebwanee.dash.services.calls.InterfaceInteractorCalls<com.github.muneebwanee.dash.services.calls.InterfaceServiceCalls> getInteractor() {
        return null;
    }
    
    public final void setInteractor(@org.jetbrains.annotations.NotNull()
    com.github.muneebwanee.dash.services.calls.InterfaceInteractorCalls<com.github.muneebwanee.dash.services.calls.InterfaceServiceCalls> p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    private final void setCallIntent(@org.jetbrains.annotations.NotNull()
    android.content.Intent $this$setCallIntent) {
    }
    
    @java.lang.Override()
    public void stopServiceCalls() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public CallsService() {
        super();
    }
}