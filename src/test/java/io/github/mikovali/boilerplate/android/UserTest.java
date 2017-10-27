package io.github.mikovali.boilerplate.android;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class UserTest {

    @Test
    public void constructorParameters() {
        User user = new User("name");

        assertThat(user.name()).isEqualTo("name");
    }
}
