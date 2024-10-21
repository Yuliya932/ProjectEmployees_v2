package ru.maslova.ProjectEmployees_v2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BonusCard {
    private Employee employee;

    private Bonus bonus;


}
