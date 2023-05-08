package com.github.muneebwanee.dash.di.component;

import java.lang.System;

/**
 * Created by muneebwanee on 15/12/20.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lcom/github/muneebwanee/dash/di/component/AppComponent;", "", "getInterfaceFirebase", "Lcom/github/muneebwanee/dash/data/rxFirebase/InterfaceFirebase;", "inject", "", "app", "Lcom/github/muneebwanee/dash/app/Dash;", "accessibilityDataService", "Lcom/github/muneebwanee/dash/services/accessibilityData/AccessibilityDataService;", "notificationService", "Lcom/github/muneebwanee/dash/services/notificationService/NotificationService;", "app_debug"})
@dagger.Component(modules = {com.github.muneebwanee.dash.di.module.AppModule.class, com.github.muneebwanee.dash.di.module.FirebaseModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.github.muneebwanee.dash.app.Dash app);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.github.muneebwanee.dash.services.accessibilityData.AccessibilityDataService accessibilityDataService);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.github.muneebwanee.dash.services.notificationService.NotificationService notificationService);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.github.muneebwanee.dash.data.rxFirebase.InterfaceFirebase getInterfaceFirebase();
}