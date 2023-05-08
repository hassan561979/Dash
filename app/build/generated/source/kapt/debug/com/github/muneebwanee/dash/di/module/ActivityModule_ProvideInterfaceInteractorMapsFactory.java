package com.github.muneebwanee.dash.di.module;

import com.github.muneebwanee.dash.ui.fragments.maps.InteractorMaps;
import com.github.muneebwanee.dash.ui.fragments.maps.InterfaceInteractorMaps;
import com.github.muneebwanee.dash.ui.fragments.maps.InterfaceViewMaps;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideInterfaceInteractorMapsFactory
    implements Factory<InterfaceInteractorMaps<InterfaceViewMaps>> {
  private final ActivityModule module;

  private final Provider<InteractorMaps<InterfaceViewMaps>> interactorProvider;

  public ActivityModule_ProvideInterfaceInteractorMapsFactory(
      ActivityModule module, Provider<InteractorMaps<InterfaceViewMaps>> interactorProvider) {
    this.module = module;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public InterfaceInteractorMaps<InterfaceViewMaps> get() {
    return Preconditions.checkNotNull(
        module.provideInterfaceInteractorMaps(interactorProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ActivityModule_ProvideInterfaceInteractorMapsFactory create(
      ActivityModule module, Provider<InteractorMaps<InterfaceViewMaps>> interactorProvider) {
    return new ActivityModule_ProvideInterfaceInteractorMapsFactory(module, interactorProvider);
  }

  public static InterfaceInteractorMaps<InterfaceViewMaps> proxyProvideInterfaceInteractorMaps(
      ActivityModule instance, InteractorMaps<InterfaceViewMaps> interactor) {
    return Preconditions.checkNotNull(
        instance.provideInterfaceInteractorMaps(interactor),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
