package ru.maslova.ProjectEmployees_v2.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ru.maslova.ProjectEmployees_v2.entity.Bonus;
import ru.maslova.ProjectEmployees_v2.entity.BonusCard;
import ru.maslova.ProjectEmployees_v2.entity.Employee;
import ru.maslova.ProjectEmployees_v2.repository.BonusRepository;
import ru.maslova.ProjectEmployees_v2.repository.EmployeeRepository;
import ru.maslova.ProjectEmployees_v2.service.CalculateBonusCardService;

import java.util.Optional;

@Slf4j
@Controller
public class BonusController {
    @Autowired
    private BonusRepository bonusRepository;
    private EmployeeRepository employeeRepository;

    @GetMapping("/list-bonus")
    public ModelAndView getAllBonus(){
        ModelAndView mav = new ModelAndView("list-bonus");
        mav.addObject("bonus", bonusRepository.findAll());
        return mav;
    }
    @GetMapping("/addBonusForm")
    public ModelAndView addBonusForm(){
        ModelAndView mav = new ModelAndView("add-bonus-form");
        Bonus bonus = new Bonus();
        mav.addObject("bonus", bonus);
        return mav;
    }
    @PostMapping("/saveBonus")
    public String saveBonus (@ModelAttribute Bonus bonus){
        bonusRepository.save(bonus);
        return "redirect:/list-bonus";
    }
    @GetMapping("/showUpdateFormBonus")
    public ModelAndView showUpdateForm(@RequestParam Long bonusId){
        ModelAndView mav = new ModelAndView("add-bonus-form");
        Optional<Bonus> optionalBonus = bonusRepository.findById(bonusId);
        Bonus bonus = new Bonus();
        if(optionalBonus.isPresent()){
            bonus = optionalBonus.get();
        }
        mav.addObject("bonus", bonus);
        return mav;
    }
    @GetMapping("/deleteBonus")
    public String deleteBonus (@RequestParam Long bonusId){
        bonusRepository.deleteById(bonusId);
        return "redirect:/list-bonus";
    }

// контроллер бонусной карты
//@GetMapping("/bonusCard")
//public ModelAndView addBobusCardForm(@RequestParam Long employeeId){
//        ModelAndView mav = new ModelAndView("add-bonus-card-form");
//        Optional<Employee> optionalEmployee = employeeRepository.findById(employeeId);
//        Employee employee = new Employee();
//        if(optionalEmployee.isPresent()){
//            employee = optionalEmployee.get();
//        }
//        mav.addObject("employee", employee);
//        return mav;
//    BonusCard bonusCard = new BonusCard();
//
//
//    CalculateBonusCardService calculateBonusCardService = new CalculateBonusCardService();
//    calculateBonusCardService.calculate(bonusCard,365);
//    }
}
