package com.example.benzait27.raconte_moi;

/**
 * Created by BENZ on 06/02/2017.
 */

import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule public final ActivityRule<MainActivity> main = new ActivityRule<>(MainActivity.class);

    @Test
    public void shouldBeAbleToLaunchMainScreen() {
        onView(withText("hello")).check(ViewAssertions.matches(isDisplayed()));
    }
}
