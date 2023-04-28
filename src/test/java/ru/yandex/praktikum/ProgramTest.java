package ru.yandex.praktikum;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProgramTest {
    @Test
    public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);
        assertTrue("Должно вернуться true, так как пользователь совершеннолетний", isAdult);
    }

    @Test
    public void checkIsAdultWhenAgeIsLessThan18False() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(17);
        assertFalse("Должно вернуться false, так как пользователь несовершеннолетний", isAdult);
    }

    @Test
    public void checkIsAdultWhenAgeIs18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(18);
        assertTrue("Должно вернуться true, так как пользователь совершеннолетний", isAdult);
    }


}
