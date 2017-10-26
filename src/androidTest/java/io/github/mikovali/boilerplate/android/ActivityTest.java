package io.github.mikovali.boilerplate.android;

import android.support.test.filters.MediumTest;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.hasChildCount;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@MediumTest
public final class ActivityTest {

    @Rule public final ActivityTestRule<Activity> activityTestRule
            = new ActivityTestRule<>(Activity.class);

    @Test
    public void contentViewIsEmpty() {
        onView(withId(android.R.id.content))
                .check(matches(hasChildCount(0)));
    }
}
