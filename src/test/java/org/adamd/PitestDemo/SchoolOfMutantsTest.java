package org.adamd.PitestDemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SchoolOfMutantsTest {

    private SchoolOfMutants schoolOfMutants;
    private final Integer MUTANTCOUNTS = 1;

    @BeforeEach
    public void setup() {
        schoolOfMutants = new SchoolOfMutants();
    }

    @Test
    public void smokeTest() {

        Assertions
            .assertDoesNotThrow(() ->
                                    schoolOfMutants.trainMutants(MUTANTCOUNTS));
    }
}
