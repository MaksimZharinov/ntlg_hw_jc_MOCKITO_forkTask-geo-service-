package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.entity.Country;

import static org.junit.jupiter.api.Assertions.*;

class LocalizationServiceImplTest {

    @ParameterizedTest
    @CsvSource(value = {
            "Welcome, USA",
            "Добро пожаловать, RUSSIA"
    })
    void localeTest(String msg, Country country) {
        LocalizationService localizationService = new LocalizationServiceImpl();

        String result = localizationService.locale(country);
        String expected = msg;

        Assertions.assertEquals(expected, result);
    }
}