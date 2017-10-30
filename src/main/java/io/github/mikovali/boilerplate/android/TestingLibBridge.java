package io.github.mikovali.boilerplate.android;

public final class TestingLibBridge {

    static {
        System.loadLibrary("testing-lib-bridge");
    }

    public static native void testing();
}
