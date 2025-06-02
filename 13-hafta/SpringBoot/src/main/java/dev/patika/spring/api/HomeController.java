package dev.patika.spring.api;

import dev.patika.spring.business.concretes.CurrencyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    //Bean ile Dependency Injection
    private final CurrencyService currencyService;

    public HomeController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @GetMapping("")
    public String showCurrency() {
        return currencyService.getCurrency();
    }
}
