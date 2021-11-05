package Day04;

import java.util.Arrays;
import java.util.List;

public enum Currency {
    USD(Arrays.asList("USA")),EUR(Arrays.asList("France","Germany")),CHF(Arrays.asList("Switzerland")),HUF(Arrays.asList("Hungary"));

    private List<String> countriesWhereUsed;

    Currency(List<String> countriesWhereUsed) {
        this.countriesWhereUsed = countriesWhereUsed;
    }

    public List<String> getCountriesWhereUsed() {
        return countriesWhereUsed;
    }
}