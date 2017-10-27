package io.github.mikovali.boilerplate.android;

public class Application extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        setupTimber();
    }

    // Timber

    protected void setupTimber() {
    }
}
