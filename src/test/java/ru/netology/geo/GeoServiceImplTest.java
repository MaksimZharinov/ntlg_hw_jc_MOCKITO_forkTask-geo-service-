package ru.netology.geo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

class GeoServiceImplTest {

    @ParameterizedTest
    @CsvSource(value = {
            "172., RUSSIA",
            "96., USA"
    })
    void byIpTest(String ip, Country country) {
        GeoService geoService = new GeoServiceImpl();

        Location result = geoService.byIp(ip);
        Country expected = country;

        Assertions.assertEquals(expected, result.getCountry());
    }
}