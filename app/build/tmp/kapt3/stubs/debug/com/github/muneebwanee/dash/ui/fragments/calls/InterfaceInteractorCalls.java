package com.github.muneebwanee.dash.ui.fragments.calls;

import java.lang.System;

/**
 * Created by muneebwanee on 15/12/20.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bg\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/github/muneebwanee/dash/ui/fragments/calls/InterfaceInteractorCalls;", "V", "Lcom/github/muneebwanee/dash/ui/fragments/calls/InterfaceViewCalls;", "Lcom/github/muneebwanee/dash/ui/activities/base/InterfaceInteractor;", "stopAudioCallHolder", "", "app_debug"})
@com.github.muneebwanee.dash.di.PerActivity
public abstract interface InterfaceInteractorCalls<V extends com.github.muneebwanee.dash.ui.fragments.calls.InterfaceViewCalls> extends com.github.muneebwanee.dash.ui.activities.base.InterfaceInteractor<V> {
    
    public abstract void stopAudioCallHolder();
}