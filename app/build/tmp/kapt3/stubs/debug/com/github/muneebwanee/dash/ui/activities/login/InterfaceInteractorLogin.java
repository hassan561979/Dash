package com.github.muneebwanee.dash.ui.activities.login;

import java.lang.System;

/**
 * Created by muneebwanee on 15/12/20.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lcom/github/muneebwanee/dash/ui/activities/login/InterfaceInteractorLogin;", "V", "Lcom/github/muneebwanee/dash/ui/activities/login/InterfaceViewLogin;", "Lcom/github/muneebwanee/dash/ui/activities/base/InterfaceInteractor;", "signInDisposable", "", "email", "", "pass", "app_debug"})
@com.github.muneebwanee.dash.di.PerActivity()
public abstract interface InterfaceInteractorLogin<V extends com.github.muneebwanee.dash.ui.activities.login.InterfaceViewLogin> extends com.github.muneebwanee.dash.ui.activities.base.InterfaceInteractor<V> {
    
    public abstract void signInDisposable(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String pass);
}