package com.github.muneebwanee.dash.ui.fragments.notifications;

import androidx.recyclerview.widget.LinearLayoutManager;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NotifyMessageFragment_MembersInjector
    implements MembersInjector<NotifyMessageFragment> {
  private final Provider<InterfaceInteractorNotifyMessage<InterfaceViewNotifyMessage>>
      interactorProvider;

  private final Provider<LinearLayoutManager> layoutMProvider;

  public NotifyMessageFragment_MembersInjector(
      Provider<InterfaceInteractorNotifyMessage<InterfaceViewNotifyMessage>> interactorProvider,
      Provider<LinearLayoutManager> layoutMProvider) {
    this.interactorProvider = interactorProvider;
    this.layoutMProvider = layoutMProvider;
  }

  public static MembersInjector<NotifyMessageFragment> create(
      Provider<InterfaceInteractorNotifyMessage<InterfaceViewNotifyMessage>> interactorProvider,
      Provider<LinearLayoutManager> layoutMProvider) {
    return new NotifyMessageFragment_MembersInjector(interactorProvider, layoutMProvider);
  }

  @Override
  public void injectMembers(NotifyMessageFragment instance) {
    injectInteractor(instance, interactorProvider.get());
    injectLayoutM(instance, layoutMProvider.get());
  }

  public static void injectInteractor(
      NotifyMessageFragment instance,
      InterfaceInteractorNotifyMessage<InterfaceViewNotifyMessage> interactor) {
    instance.interactor = interactor;
  }

  public static void injectLayoutM(NotifyMessageFragment instance, LinearLayoutManager layoutM) {
    instance.layoutM = layoutM;
  }
}
