package com.github.muneebwanee.dash.ui.activities.register;

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
public final class InteractorRegister_Factory<V extends InterfaceViewRegister>
    implements Factory<InteractorRegister<V>> {
  private final Provider<FragmentManager> supportFragmentProvider;

  private final Provider<Context> contextProvider;

  private final Provider<InterfaceFirebase> firebaseProvider;

  public InteractorRegister_Factory(
      Provider<FragmentManager> supportFragmentProvider,
      Provider<Context> contextProvider,
      Provider<InterfaceFirebase> firebaseProvider) {
    this.supportFragmentProvider = supportFragmentProvider;
    this.contextProvider = contextProvider;
    this.firebaseProvider = firebaseProvider;
  }

  @Override
  public InteractorRegister<V> get() {
    return new InteractorRegister<V>(
        supportFragmentProvider.get(), contextProvider.get(), firebaseProvider.get());
  }

  public static <V extends InterfaceViewRegister> InteractorRegister_Factory<V> create(
      Provider<FragmentManager> supportFragmentProvider,
      Provider<Context> contextProvider,
      Provider<InterfaceFirebase> firebaseProvider) {
    return new InteractorRegister_Factory<V>(
        supportFragmentProvider, contextProvider, firebaseProvider);
  }
}
