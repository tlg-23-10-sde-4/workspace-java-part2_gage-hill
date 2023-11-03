package com.entertainment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TelevisionTest {
    private Television tv;

    @Before
    public void setUp() {
        tv = new Television();
    }

    @Test(expected = InvalidChannelException.class)
    public void changeChannel_shouldThrowInvalidChannelException_whenInvalid_upperBound() throws InvalidChannelException {
        try {
            tv.changeChannel(1000); // should throw IllegalArgumentException
            fail("Should have thrown IllegalArgumentException"); // if not call 'fail' the test
        }
        catch (IllegalArgumentException e) {
            String expected = "Invalid volume: 0. Allowed range: [0,999].";
            assertEquals(expected, e.getMessage());
        }
    }

    @Test(expected = InvalidChannelException.class)
    public void changeChannel_shouldThrowInvalidChannelException_whenInvalid_lowerBound() throws InvalidChannelException {
        try {
            tv.changeChannel(0);
            fail("Should have thrown IllegalArgumentException");
        }
        catch (IllegalArgumentException e) {
            String expected = "Invalid volume: 0. Allowed range: [0,999].";
            assertEquals(expected, e.getMessage());
        }
    }

    @Test
    public void changeChannel_shouldStoreValue_whenValid_upperBound() throws InvalidChannelException {
        tv.changeChannel(999);
        assertEquals(999, tv.getCurrentChannel());
    }

    @Test
    public void changeChannel_shouldStoreValue_whenValid_lowerBound() throws InvalidChannelException {
        tv.changeChannel(1);
        assertEquals(1, tv.getCurrentChannel());
    }

    @Test
    public void setVolume_shouldThrowIllegalArgumentException_whenInValid_upperBound() {
        try {
            tv.setVolume(101);
            fail("Should have thrown IllegalArgumentException");
        }
        catch (IllegalArgumentException e) {
            String expected = "Invalid volume: 101. Allowed range: [0,100].";
            assertEquals(expected, e.getMessage());
        }
    }

    @Test
    public void setVolume_shouldThrowIllegalArgumentException_whenInValid_lowerBound() {
        try {
            tv.setVolume(-1);
            fail("Should have thrown IllegalArgumentException");
        }
        catch (IllegalArgumentException e) {
            String expected = "Invalid volume: -1. Allowed range: [0,100].";
            assertEquals(expected, e.getMessage());
        }
    }

    @Test
    public void setVolume_shouldStoreValue_whenValid_upperBound() {
        tv.setVolume(100);
        assertEquals(100, tv.getVolume());
    }

    @Test
    public void setVolume_shouldStoreValue_whenValid_lowerBound() {
        tv.setVolume(0);
        assertEquals(0, tv.getVolume());
    }
}