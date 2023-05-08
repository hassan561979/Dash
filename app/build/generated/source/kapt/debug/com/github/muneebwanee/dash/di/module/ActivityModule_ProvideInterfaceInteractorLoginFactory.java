package com.github.muneebwanee.dash.di.module;

import com.github.muneebwanee.dash.ui.activities.login.InteractorLogin;
import com.github.muneebwanee.dash.ui.activities.login.InterfaceInteractorLogin;
import com.github.muneebwanee.dash.ui.activities.login.InterfaceViewLogin;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideInterfaceInteractorLoginFactory
    implements Factory<InterfaceInteractorLogin<InterfaceViewLogin>> {
  private final ActivityModule module;

  private final Provider<InteractorLogin<InterfaceViewLogin>> interactorProvider;

  public ActivityModule_ProvideInterfaceInteractorLoginFactory(
      ActivityModule module, Provider<InteractorLogin<InterfaceViewLogin>> interactorProvider) {
    this.module = module;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public InterfaceInteractorLogin<InterfaceViewLogin> get() {
    return Preconditions.checkNotNull(
        module.provideInterfaceInteractorLogin(interactorProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ActivityModule_ProvideInterfaceInteractorLoginFactory create(
      ActivityModule module, Provider<InteractorLogin<InterfaceViewLogin>> interactorProvider) {
    return new ActivityModule_ProvideInterfaceInteractorLoginFactory(module, interactorProvider);
  }

  public static InterfaceInteractorLogin<InterfaceViewLogin> proxyProvideInterfaceInteractorLogin(
      ActivityModule instance, InteractorLogin<InterfaceViewLogin> interactor) {
    return Preconditions.checkNotNull(
        instance.provideInterfaceInteractorLogin(interactor),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
