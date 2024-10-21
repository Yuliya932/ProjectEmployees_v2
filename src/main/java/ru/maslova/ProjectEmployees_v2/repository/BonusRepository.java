package ru.maslova.ProjectEmployees_v2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.maslova.ProjectEmployees_v2.entity.Bonus;
import ru.maslova.ProjectEmployees_v2.entity.Role;

public interface BonusRepository extends JpaRepository<Bonus, Long> {
    Bonus findByPosition (String name);
}
