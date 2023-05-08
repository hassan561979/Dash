package com.github.muneebwanee.dash.di.module;

import com.github.muneebwanee.dash.ui.fragments.photo.InteractorPhoto;
import com.github.muneebwanee.dash.ui.fragments.photo.InterfaceInteractorPhoto;
import com.github.muneebwanee.dash.ui.fragments.photo.InterfaceViewPhoto;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideInterfaceInteractorPhotoFactory
    implements Factory<InterfaceInteractorPhoto<InterfaceViewPhoto>> {
  private final ActivityModule module;

  private final Provider<InteractorPhoto<InterfaceViewPhoto>> interactorProvider;

  public ActivityModule_ProvideInterfaceInteractorPhotoFactory(
      ActivityModule module, Provider<InteractorPhoto<InterfaceViewPhoto>> interactorProvider) {
    this.module = module;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public InterfaceInteractorPhoto<InterfaceViewPhoto> get() {
    return Preconditions.checkNotNull(
        module.provideInterfaceInteractorPhoto(interactorProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ActivityModule_ProvideInterfaceInteractorPhotoFactory create(
      ActivityModule module, Provider<InteractorPhoto<InterfaceViewPhoto>> interactorProvider) {
    return new ActivityModule_ProvideInterfaceInteractorPhotoFactory(module, interactorProvider);
  }

  public static InterfaceInteractorPhoto<InterfaceViewPhoto> proxyProvideInterfaceInteractorPhoto(
      ActivityModule instance, InteractorPhoto<InterfaceViewPhoto> interactor) {
    return Preconditions.checkNotNull(
        instance.provideInterfaceInteractorPhoto(interactor),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
