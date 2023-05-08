package com.github.muneebwanee.dash.ui.fragments.recording;

import java.lang.System;

/**
 * Created by muneebwanee on 15/12/20.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\bg\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u0005H&\u00a8\u0006\u000b"}, d2 = {"Lcom/github/muneebwanee/dash/ui/fragments/recording/InterfaceInteractorRecording;", "V", "Lcom/github/muneebwanee/dash/ui/fragments/recording/InterfaceViewRecording;", "Lcom/github/muneebwanee/dash/ui/activities/base/InterfaceInteractor;", "getRecordAudio", "", "time", "", "stopAudioRecordHolder", "valueEventEnableRecording", "valueEventTimerRecording", "app_debug"})
@com.github.muneebwanee.dash.di.PerActivity()
public abstract interface InterfaceInteractorRecording<V extends com.github.muneebwanee.dash.ui.fragments.recording.InterfaceViewRecording> extends com.github.muneebwanee.dash.ui.activities.base.InterfaceInteractor<V> {
    
    public abstract void stopAudioRecordHolder();
    
    public abstract void getRecordAudio(long time);
    
    public abstract void valueEventEnableRecording();
    
    public abstract void valueEventTimerRecording();
}