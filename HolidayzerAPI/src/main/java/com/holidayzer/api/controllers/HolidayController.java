package com.holidayzer.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/holiday")
public class HolidayController {
    static Holiday[] listHolidays = {
        new Holiday("01-01-2024", "Confraternização Mundial"),
        new Holiday("12-02-2024", "Carnaval"),
        new Holiday("13-02-2024", "Carnaval"),
        new Holiday("29-03-2024", "Sexta-feira Santa"),
        new Holiday("21-04-2024", "Tiradentes"),
        new Holiday("01-05-2024", "Dia do Trabalho"),
        new Holiday("30-05-2024", "Corpus Christi"),
        new Holiday("07-09-2024", "Independência do Brasil"),
        new Holiday("12-10-2024", "Nossa Senhora Aparecida"),
        new Holiday("02-11-2024", "Finados"),
        new Holiday("15-11-2024", "Proclamação da República"),
        new Holiday("20-11-2024", "Dia Nacional de Zumbi e da Consciência Negra"),
        new Holiday("25-12-2024", "Natal")
    };

    @GetMapping
    public Holiday[] getHolidays() {        
        return listHolidays;
    }

    @GetMapping("/{date}")
    public String getHolidayByDate(@PathVariable("date") String date) {
        for (int i = 0; i < listHolidays.length; i++) {
            if (date.equals(listHolidays[i].getDate())) {
                return "Dia " + listHolidays[i].getDate() + " é " + listHolidays[i].getName() + "! 🎉";
            }
        }

        return "Dia " + date + " não é feriado 🥲";
    }
}
