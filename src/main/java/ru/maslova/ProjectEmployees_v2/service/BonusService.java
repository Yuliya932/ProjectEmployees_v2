package ru.maslova.ProjectEmployees_v2.service;

import org.springframework.stereotype.Service;
import ru.maslova.ProjectEmployees_v2.entity.BonusCard;

@Service
public interface BonusService {

    double calculate (BonusCard bonusCard, int workDays);
}
