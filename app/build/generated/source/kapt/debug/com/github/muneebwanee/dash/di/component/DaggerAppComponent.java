package com.github.muneebwanee.dash.di.component;

import com.github.muneebwanee.dash.app.Dash;
import com.github.muneebwanee.dash.data.rxFirebase.InterfaceFirebase;
import com.github.muneebwanee.dash.di.module.AppModule;
import com.github.muneebwanee.dash.di.module.AppModule_ProvideContextFactory;
import com.github.muneebwanee.dash.di.module.FirebaseModule;
import com.github.muneebwanee.dash.di.module.FirebaseModule_ProvideDatabaseReferenceFactory;
import com.github.muneebwanee.dash.di.module.FirebaseModule_ProvideFirebaseAuthFactory;
import com.github.muneebwanee.dash.di.module.FirebaseModule_ProvideFirebaseDatabaseFactory;
import com.github.muneebwanee.dash.di.module.FirebaseModule_ProvideFirebaseStorageFactory;
import com.github.muneebwanee.dash.di.module.FirebaseModule_ProvideInterfaceFirebaseFactory;
import com.github.muneebwanee.dash.di.module.FirebaseModule_ProvideStorageReferenceFactory;
import com.github.muneebwanee.dash.services.accessibilityData.AccessibilityDataService;
import com.github.muneebwanee.dash.services.accessibilityData.AccessibilityDataService_MembersInjector;
import com.github.muneebwanee.dash.services.accessibilityData.InteractorAccessibilityData;
import com.github.muneebwanee.dash.services.notificationService.InteractorNotificationService;
import com.github.muneebwanee.dash.services.notificationService.NotificationService;
import com.github.muneebwanee.dash.services.notificationService.NotificationService_MembersInjector;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.storage.StorageReference;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private AppModule appModule;

  private FirebaseModule firebaseModule;

  private DaggerAppComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  private InteractorAccessibilityData getInteractorAccessibilityData() {
    return new InteractorAccessibilityData(
        AppModule_ProvideContextFactory.proxyProvideContext(appModule), getInterfaceFirebase());
  }

  private InteractorNotificationService getInteractorNotificationService() {
    return new InteractorNotificationService(
        AppModule_ProvideContextFactory.proxyProvideContext(appModule), getInterfaceFirebase());
  }

  private DatabaseReference getDatabaseReference() {
    return FirebaseModule_ProvideDatabaseReferenceFactory.proxyProvideDatabaseReference(
        firebaseModule,
        FirebaseModule_ProvideFirebaseDatabaseFactory.proxyProvideFirebaseDatabase(firebaseModule));
  }

  private StorageReference getStorageReference() {
    return FirebaseModule_ProvideStorageReferenceFactory.proxyProvideStorageReference(
        firebaseModule,
        FirebaseModule_ProvideFirebaseStorageFactory.proxyProvideFirebaseStorage(firebaseModule));
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.appModule = builder.appModule;
    this.firebaseModule = builder.firebaseModule;
  }

  @Override
  public void inject(Dash app) {}

  @Override
  public void inject(AccessibilityDataService accessibilityDataService) {
    injectAccessibilityDataService(accessibilityDataService);
  }

  @Override
  public void inject(NotificationService notificationService) {
    injectNotificationService(notificationService);
  }

  @Override
  public InterfaceFirebase getInterfaceFirebase() {
    return FirebaseModule_ProvideInterfaceFirebaseFactory.proxyProvideInterfaceFirebase(
        firebaseModule,
        AppModule_ProvideContextFactory.proxyProvideContext(appModule),
        FirebaseModule_ProvideFirebaseAuthFactory.proxyProvideFirebaseAuth(firebaseModule),
        getDatabaseReference(),
        getStorageReference());
  }

  @CanIgnoreReturnValue
  private AccessibilityDataService injectAccessibilityDataService(
      AccessibilityDataService instance) {
    AccessibilityDataService_MembersInjector.injectInteractor(
        instance, getInteractorAccessibilityData());
    return instance;
  }

  @CanIgnoreReturnValue
  private NotificationService injectNotificationService(NotificationService instance) {
    NotificationService_MembersInjector.injectInteractor(
        instance, getInteractorNotificationService());
    return instance;
  }

  public static final class Builder {
    private AppModule appModule;

    private FirebaseModule firebaseModule;

    private Builder() {}

    public AppComponent build() {
      if (appModule == null) {
        throw new IllegalStateException(AppModule.class.getCanonicalName() + " must be set");
      }
      if (firebaseModule == null) {
        this.firebaseModule = new FirebaseModule();
      }
      return new DaggerAppComponent(this);
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder firebaseModule(FirebaseModule firebaseModule) {
      this.firebaseModule = Preconditions.checkNotNull(firebaseModule);
      return this;
    }
  }
}
