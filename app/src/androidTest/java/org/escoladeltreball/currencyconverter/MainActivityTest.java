package org.escoladeltreball.currencyconverter;

import android.support.test.espresso.action.ViewActions;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by pep on 31/10/2017.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> testRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void bntConvertTestNoInput() {
        onView(withId(R.id.btnConvert)).perform(click());
        onView(withId(R.id.etTo)).check(matches(withText("0.0")));
    }

    @Test
    public void bntConvertTest() {
        onView(withId(R.id.etFrom)).perform(typeText("10.0"), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.btnConvert)).perform(click());
        onView(withId(R.id.etTo)).check(matches(withText("12.0")));
    }

}