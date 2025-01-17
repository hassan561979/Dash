package com.github.muneebwanee.dash.app;

import java.lang.System;

/**
 * Created by muneebwanee on 15/12/20.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"Lcom/github/muneebwanee/dash/app/Dash;", "Landroid/app/Application;", "()V", "onCreate", "", "Companion", "app_debug"})
public final class Dash extends android.app.Application {
    @org.jetbrains.annotations.NotNull
    public static final com.github.muneebwanee.dash.app.Dash.Companion Companion = null;
    public static com.github.muneebwanee.dash.di.component.AppComponent appComponent;
    public static com.chrisplus.rootmanager.RootManager root;
    
    public Dash() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public static final com.github.muneebwanee.dash.di.component.AppComponent getAppComponent() {
        return null;
    }
    
    public static final void setAppComponent(@org.jetbrains.annotations.NotNull
    com.github.muneebwanee.dash.di.component.AppComponent p0) {
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/github/muneebwanee/dash/app/Dash$Companion;", "", "()V", "appComponent", "Lcom/github/muneebwanee/dash/di/component/AppComponent;", "getAppComponent$annotations", "getAppComponent", "()Lcom/github/muneebwanee/dash/di/component/AppComponent;", "setAppComponent", "(Lcom/github/muneebwanee/dash/di/component/AppComponent;)V", "root", "Lcom/chrisplus/rootmanager/RootManager;", "getRoot", "()Lcom/chrisplus/rootmanager/RootManager;", "setRoot", "(Lcom/chrisplus/rootmanager/RootManager;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.github.muneebwanee.dash.di.component.AppComponent getAppComponent() {
            return null;
        }
        
        @kotlin.jvm.JvmStatic
        @java.lang.Deprecated
        public static void getAppComponent$annotations() {
        }
        
        public final void setAppComponent(@org.jetbrains.annotations.NotNull
        com.github.muneebwanee.dash.di.component.AppComponent p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.chrisplus.rootmanager.RootManager getRoot() {
            return null;
        }
        
        public final void setRoot(@org.jetbrains.annotations.NotNull
        com.chrisplus.rootmanager.RootManager p0) {
        }
    }
}