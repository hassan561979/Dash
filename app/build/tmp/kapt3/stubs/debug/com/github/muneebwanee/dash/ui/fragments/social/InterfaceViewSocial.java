package com.github.muneebwanee.dash.ui.fragments.social;

import java.lang.System;

/**
 * Created by muneebwanee on 15/12/20.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/github/muneebwanee/dash/ui/fragments/social/InterfaceViewSocial;", "Lcom/github/muneebwanee/dash/ui/activities/base/InterfaceView;", "setValuePermission", "", "dataSnapshot", "Lcom/google/firebase/database/DataSnapshot;", "successResult", "app_debug"})
public abstract interface InterfaceViewSocial extends com.github.muneebwanee.dash.ui.activities.base.InterfaceView {
    
    public abstract void setValuePermission(@org.jetbrains.annotations.NotNull
    com.google.firebase.database.DataSnapshot dataSnapshot);
    
    public abstract void successResult(@org.jetbrains.annotations.NotNull
    com.google.firebase.database.DataSnapshot dataSnapshot);
}