package io.github.mikovali.boilerplate.android;

import android.os.Bundle;
import android.support.annotation.Nullable;

public class Activity extends android.app.Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TestingLibBridge.testing();
    }
}
