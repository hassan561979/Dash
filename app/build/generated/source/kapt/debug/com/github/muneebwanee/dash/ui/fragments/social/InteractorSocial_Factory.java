package com.github.muneebwanee.dash.ui.fragments.social;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.github.muneebwanee.dash.data.rxFirebase.InterfaceFirebase;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class InteractorSocial_Factory<V extends InterfaceViewSocial>
    implements Factory<InteractorSocial<V>> {
  private final Provider<FragmentManager> supportFragmentProvider;

  private final Provider<Context> contextProvider;

  private final Provider<InterfaceFirebase> firebaseProvider;

  public InteractorSocial_Factory(
      Provider<FragmentManager> supportFragmentProvider,
      Provider<Context> contextProvider,
      Provider<InterfaceFirebase> firebaseProvider) {
    this.supportFragmentProvider = supportFragmentProvider;
    this.contextProvider = contextProvider;
    this.firebaseProvider = firebaseProvider;
  }

  @Override
  public InteractorSocial<V> get() {
    return new InteractorSocial<V>(
        supportFragmentProvider.get(), contextProvider.get(), firebaseProvider.get());
  }

  public static <V extends InterfaceViewSocial> InteractorSocial_Factory<V> create(
      Provider<FragmentManager> supportFragmentProvider,
      Provider<Context> contextProvider,
      Provider<InterfaceFirebase> firebaseProvider) {
    return new InteractorSocial_Factory<V>(
        supportFragmentProvider, contextProvider, firebaseProvider);
  }
}
