package com.codecool.tddsaboteur;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class AnagramCheckerTest {

    private AnagramChecker anagramChecker;

    @BeforeEach
    void setUp() {
        this.anagramChecker = new AnagramChecker();
    }

    @Test
    public void smokeTest() {
        assertFalse(false);
    }
}