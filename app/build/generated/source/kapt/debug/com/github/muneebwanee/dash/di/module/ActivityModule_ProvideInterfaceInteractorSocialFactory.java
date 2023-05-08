package com.github.muneebwanee.dash.di.module;

import com.github.muneebwanee.dash.ui.fragments.social.InteractorSocial;
import com.github.muneebwanee.dash.ui.fragments.social.InterfaceInteractorSocial;
import com.github.muneebwanee.dash.ui.fragments.social.InterfaceViewSocial;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideInterfaceInteractorSocialFactory
    implements Factory<InterfaceInteractorSocial<InterfaceViewSocial>> {
  private final ActivityModule module;

  private final Provider<InteractorSocial<InterfaceViewSocial>> interactorProvider;

  public ActivityModule_ProvideInterfaceInteractorSocialFactory(
      ActivityModule module, Provider<InteractorSocial<InterfaceViewSocial>> interactorProvider) {
    this.module = module;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public InterfaceInteractorSocial<InterfaceViewSocial> get() {
    return Preconditions.checkNotNull(
        module.provideInterfaceInteractorSocial(interactorProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ActivityModule_ProvideInterfaceInteractorSocialFactory create(
      ActivityModule module, Provider<InteractorSocial<InterfaceViewSocial>> interactorProvider) {
    return new ActivityModule_ProvideInterfaceInteractorSocialFactory(module, interactorProvider);
  }

  public static InterfaceInteractorSocial<InterfaceViewSocial>
      proxyProvideInterfaceInteractorSocial(
          ActivityModule instance, InteractorSocial<InterfaceViewSocial> interactor) {
    return Preconditions.checkNotNull(
        instance.provideInterfaceInteractorSocial(interactor),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
