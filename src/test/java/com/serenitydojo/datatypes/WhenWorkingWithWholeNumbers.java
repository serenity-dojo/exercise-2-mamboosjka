package com.serenitydojo.datatypes;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithWholeNumbers {
    @Test
    public void addingNumbersTogether() {
        final int initialYear = 1985;
        final int timeJump = 2015 - initialYear;
        final int targetYear = initialYear + timeJump;

        // TODO: create a new int variable called timeJump and assign it a value
        //  Next, add this variable to initialYear and assign the result to targetYear, so that targetYear is equal to 2015

        assertThat(targetYear, equalTo(2015));
    }
}
