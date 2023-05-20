package com.github.muneebwanee.dash.ui.adapters.photoadapter;

import java.lang.System;

/**
 * Created by muneebwanee on 15/12/20.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0017J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u000e\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\nH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/github/muneebwanee/dash/ui/adapters/photoadapter/PhotoRecyclerAdapter;", "Lcom/github/muneebwanee/dash/ui/adapters/basedapter/BaseAdapter;", "Lcom/github/muneebwanee/dash/data/model/Photo;", "Lcom/github/muneebwanee/dash/ui/adapters/photoadapter/PhotoViewHolder;", "query", "Lcom/google/firebase/database/Query;", "(Lcom/google/firebase/database/Query;)V", "interfacePhotoAdapter", "Lcom/github/muneebwanee/dash/ui/adapters/photoadapter/InterfacePhotoAdapter;", "onBindViewHolder", "", "holder", "position", "", "model", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onDataChanged", "onError", "e", "Lcom/google/firebase/database/DatabaseError;", "onRecyclerAdapterListener", "setFilter", "filter", "", "startFilter", "app_debug"})
public final class PhotoRecyclerAdapter extends com.github.muneebwanee.dash.ui.adapters.basedapter.BaseAdapter<com.github.muneebwanee.dash.data.model.Photo, com.github.muneebwanee.dash.ui.adapters.photoadapter.PhotoViewHolder> {
    private final com.google.firebase.database.Query query = null;
    private com.github.muneebwanee.dash.ui.adapters.photoadapter.InterfacePhotoAdapter interfacePhotoAdapter;
    
    public PhotoRecyclerAdapter(@org.jetbrains.annotations.NotNull
    com.google.firebase.database.Query query) {
        super(null);
    }
    
    public final void setFilter(@org.jetbrains.annotations.NotNull
    java.lang.String filter) {
    }
    
    @java.lang.Override
    public void startFilter() {
    }
    
    @java.lang.Override
    public void onDataChanged() {
    }
    
    @java.lang.Override
    public void onError(@org.jetbrains.annotations.NotNull
    com.google.firebase.database.DatabaseError e) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.github.muneebwanee.dash.ui.adapters.photoadapter.PhotoViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.github.muneebwanee.dash.ui.adapters.photoadapter.PhotoViewHolder holder, int position, @org.jetbrains.annotations.NotNull
    com.github.muneebwanee.dash.data.model.Photo model) {
    }
    
    public final void onRecyclerAdapterListener(@org.jetbrains.annotations.NotNull
    com.github.muneebwanee.dash.ui.adapters.photoadapter.InterfacePhotoAdapter interfacePhotoAdapter) {
    }
}