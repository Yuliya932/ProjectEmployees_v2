package ru.maslova.ProjectEmployees_v2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.maslova.ProjectEmployees_v2.entity.Bonus;

public interface BonusRepository extends JpaRepository<Bonus, Long> {
}
