package ru.maslova.ProjectEmployees_v2.service;

import org.springframework.stereotype.Service;
import ru.maslova.ProjectEmployees_v2.entity.BonusCard;

import java.time.LocalDate;

@Service
public class CalculateBonusCardService implements BonusService {

    @Override
    public double calculate(BonusCard bonusCard, int workDays) {
        LocalDate date = LocalDate.now(); // получаем текущую дату
        int year = date.getYear();

        int yearDays;

        if((year % 4) == 0){
            yearDays = 366;
        } else {
            yearDays = 365;
        }

        return bonusCard.getEmployee().getSalary() * yearDays * bonusCard.getBonus().getCoefficient()/workDays;

    }
}
