package com.your.company;

import com.nulabinc.zxcvbn.matchers.Dictionary;
import com.nulabinc.zxcvbn.matchers.Keyboard;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ResourceTest {

    @Test
    public void testLayoutsLoaded() {
        ArrayList neededKeyboards = new ArrayList(Arrays.asList(
                "mac_keypad",
                "keypad",
                "dvorak",
                "jis",
                "qwerty",
                "qwertz",
                "japanese_kana"
        ));


        Assert.assertTrue(neededKeyboards.containsAll(Keyboard.ALL_KEYBOARDS.keySet()));
        Assert.assertTrue(Keyboard.ALL_KEYBOARDS.keySet().containsAll(neededKeyboards));

        Assert.assertTrue(Keyboard.ALL_KEYBOARDS.get("dvorak").isSlanted());
        Assert.assertTrue(Keyboard.ALL_KEYBOARDS.get("qwerty").isSlanted());
        Assert.assertTrue(Keyboard.ALL_KEYBOARDS.get("jis").isSlanted());
        Assert.assertTrue(Keyboard.ALL_KEYBOARDS.get("qwertz").isSlanted());
        Assert.assertTrue(Keyboard.ALL_KEYBOARDS.get("japanese_kana").isSlanted());
        Assert.assertFalse(Keyboard.ALL_KEYBOARDS.get("mac_keypad").isSlanted());
        Assert.assertFalse(Keyboard.ALL_KEYBOARDS.get("keypad").isSlanted());
    }

    @Test
    public void testDictionariesLoaded() {
        ArrayList neededDictionaries = new ArrayList(Arrays.asList(
                "english_wikipedia",
                "female_names",
                "male_names",
                "passwords",
                "surnames",
                "us_tv_and_film",
                "kanji",
                "german"
        ));

        Assert.assertTrue(neededDictionaries.containsAll(Dictionary.FREQUENCY_LISTS.keySet()));
        Assert.assertTrue(Dictionary.FREQUENCY_LISTS.keySet().containsAll(neededDictionaries));
    }
}
