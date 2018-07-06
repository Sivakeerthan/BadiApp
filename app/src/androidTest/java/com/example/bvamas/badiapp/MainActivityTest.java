package com.example.bvamas.badiapp;

import android.Manifest;
import android.support.test.espresso.Espresso;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;

import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> mMainActivityActivityTestRule =
            new ActivityTestRule<MainActivity>(MainActivity.class);
    @Test
    public void clickListViewButton_opensListActivity() throws Exception{
      onView(ViewMatchers.withId(R.id.btnlist)).perform(click());
      onView(ViewMatchers.withId(R.id.badiliste)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}
