package org.adamd.PitestDemo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

/**
 * To stress test mutation analysis tool.
 *
 * @see https://pitest.org/quickstart/mutators/
 */
@Slf4j
@NoArgsConstructor
@RequiredArgsConstructor
public class SchoolOfMutants {

    private final Integer SOMECONST = 11;
    private final Integer ANOTHERCONST = 2;
    private final Integer SOMEFACTOR = -2; // Invert Negatives Mutator

    @NonNull
    private Boolean isBoosted; // Constructor Call Mutator

    /**
     * Creating enough conditions, boundaries and mathetical operators to hit all mutators an
     * analysis tool could provide.
     *
     * @param nMutants
     * @return
     */
    public Integer trainMutants(Integer nMutants) {
        Integer superMutants = nMutants;

        if (nMutants > 0) { // Conditionals Boundary Mutator, Remove Conditionals Mutator
            superMutants = (nMutants / 2) - SOMEFACTOR; // Math Mutator, Inline Constant Mutator
            if (nMutants % 2 == 0) {
                ++superMutants; //Increments Mutator
            } else if (nMutants == SOMECONST) { // Negate Conditionals Mutator
                subTraining(superMutants - SOMEFACTOR); // Void Method Call Mutator
            } else {
                isBoosted = instantBoost(); // Non Void Method Call Mutator
            }
        }
        if (isBoosted) {
            superMutants *= ANOTHERCONST;
        }

        return superMutants; // Return Values Mutator, Empty returns
    }

    private void subTraining(int nMutants) {
        log.info("Sub training for {} mutants", nMutants);
    }

    private boolean instantBoost() {
        log.info("School got an instant boost");
        return true; //False returns Mutato
    }

}
