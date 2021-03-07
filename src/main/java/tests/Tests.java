package tests;

import base.BeforeAfterTests;
import org.testng.annotations.Test;

/**
 * @author Anastasiia Bondarenko
 */
public class Tests extends BeforeAfterTests {

    @Test(priority = 1)
    public void exercise1() {

        exercise1.getExercise1Url()
                .click_b1_button()
                .click_b1_button()
                .click_b1_button()
                .check_text_in_trail_box("b1b1b1")
                .click_check_solution()
                .check_text_in_trail_box("OK. Good answer");
    }

    @Test(priority = 2)
    public void exercise2() {

        exercise2.getExercise2Url()
                .put_text_into_t14("Anything expect mouth campaign.")
                .click_b1_button()
                .check_text_in_trail_box("t14:Anything expect mouth campaign.b1")
                .click_check_solution()
                .check_text_in_trail_box("OK. Good answer");
    }

    @Test(priority = 3)
    public void exercise3()  {
        exercise3.getExercise3Url()
                .select_option("Beluga Brown")
                .check_text_in_trail_box("s13:v0")
                .click_check_solution()
                .check_text_in_trail_box("OK. Good answer");
    }

    @Test(priority = 4)
    public void exercise4() {

        String options[] = {"v00","v51","v22","v23"};

        exercise4.getExercise4Url()
                .choose_options(options)
                .check_text_in_trail_box("[0, 5, 2, 2]")
                .click_check_solution()
                .check_text_in_trail_box("OK. Good answer");
    }
}
