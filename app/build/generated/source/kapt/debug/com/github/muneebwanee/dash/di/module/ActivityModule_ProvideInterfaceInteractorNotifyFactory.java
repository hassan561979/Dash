package com.github.muneebwanee.dash.di.module;

import com.github.muneebwanee.dash.ui.fragments.notifications.InteractorNotifyMessage;
import com.github.muneebwanee.dash.ui.fragments.notifications.InterfaceInteractorNotifyMessage;
import com.github.muneebwanee.dash.ui.fragments.notifications.InterfaceViewNotifyMessage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideInterfaceInteractorNotifyFactory
    implements Factory<InterfaceInteractorNotifyMessage<InterfaceViewNotifyMessage>> {
  private final ActivityModule module;

  private final Provider<InteractorNotifyMessage<InterfaceViewNotifyMessage>> interactorProvider;

  public ActivityModule_ProvideInterfaceInteractorNotifyFactory(
      ActivityModule module,
      Provider<InteractorNotifyMessage<InterfaceViewNotifyMessage>> interactorProvider) {
    this.module = module;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public InterfaceInteractorNotifyMessage<InterfaceViewNotifyMessage> get() {
    return Preconditions.checkNotNull(
        module.provideInterfaceInteractorNotify(interactorProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ActivityModule_ProvideInterfaceInteractorNotifyFactory create(
      ActivityModule module,
      Provider<InteractorNotifyMessage<InterfaceViewNotifyMessage>> interactorProvider) {
    return new ActivityModule_ProvideInterfaceInteractorNotifyFactory(module, interactorProvider);
  }

  public static InterfaceInteractorNotifyMessage<InterfaceViewNotifyMessage>
      proxyProvideInterfaceInteractorNotify(
          ActivityModule instance, InteractorNotifyMessage<InterfaceViewNotifyMessage> interactor) {
    return Preconditions.checkNotNull(
        instance.provideInterfaceInteractorNotify(interactor),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
