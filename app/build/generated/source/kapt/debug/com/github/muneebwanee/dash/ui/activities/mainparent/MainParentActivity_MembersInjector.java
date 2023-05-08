package com.github.muneebwanee.dash.ui.activities.mainparent;

import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainParentActivity_MembersInjector
    implements MembersInjector<MainParentActivity> {
  private final Provider<InterfaceInteractorMainParent<InterfaceViewMainParent>>
      interactorParentProvider;

  public MainParentActivity_MembersInjector(
      Provider<InterfaceInteractorMainParent<InterfaceViewMainParent>> interactorParentProvider) {
    this.interactorParentProvider = interactorParentProvider;
  }

  public static MembersInjector<MainParentActivity> create(
      Provider<InterfaceInteractorMainParent<InterfaceViewMainParent>> interactorParentProvider) {
    return new MainParentActivity_MembersInjector(interactorParentProvider);
  }

  @Override
  public void injectMembers(MainParentActivity instance) {
    injectInteractorParent(instance, interactorParentProvider.get());
  }

  public static void injectInteractorParent(
      MainParentActivity instance,
      InterfaceInteractorMainParent<InterfaceViewMainParent> interactorParent) {
    instance.interactorParent = interactorParent;
  }
}
