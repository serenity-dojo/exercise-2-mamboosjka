package com.serenitydojo.datatypes;

import org.junit.Test;

import java.util.Locale;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithStrings {

    @Test
    public void convertToLowerCase() {
        final String bookTitle = "The Cat In The Hat";

        final String lowerCaseTitle = bookTitle.toLowerCase(Locale.ROOT);
        // TODO: Convert the book title to lower case and assign it to the lowerCaseTitle variable

        assertThat(lowerCaseTitle, equalTo("the cat in the hat"));

    }

    @Test
    public void convertToUpperCase() {
        final String bookTitle = "The Cat In The Hat";

        final String upperCaseTitle = bookTitle.toUpperCase(Locale.ROOT);
        // TODO: Convert the book title to upper case and assign it to the lowerCaseTitle variable

        assertThat(upperCaseTitle, equalTo("THE CAT IN THE HAT"));
    }

    @Test
    public void trimExtraSpaces() {
        final String bookTitle = "  The Cat In The Hat    ";

        final String trimmedTitle = bookTitle.trim();
        // TODO: Trim the spaces before and after the title text

        assertThat(trimmedTitle, equalTo("The Cat In The Hat"));
    }

    @Test
    public void findTheLengthOfAString() {
        final String bookTitle = "The Cat In The Hat";

        final int length = bookTitle.length();
        // TODO: Find the number of characters in the string

        assertThat(length, equalTo(18));
    }

    @Test
    public void replacingAText() {
        final String bookTitle = "The Cat In The Hat";

        final String updatedTitle = bookTitle.replace("Cat", "Dog");
        // TODO: Replace the word "Cat" with "Dog

        assertThat(updatedTitle, equalTo("The Dog In The Hat"));
    }
}
