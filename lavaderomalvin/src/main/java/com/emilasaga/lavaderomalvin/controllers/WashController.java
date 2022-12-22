package com.emilasaga.lavaderomalvin.controllers;

import com.emilasaga.lavaderomalvin.core.wash.dtos.WashDTO;
import com.emilasaga.lavaderomalvin.core.wash.model.Wash;
import com.emilasaga.lavaderomalvin.core.wash.enums.WashStatus;
import com.emilasaga.lavaderomalvin.core.wash.usecases.UpdateWash;
import com.emilasaga.lavaderomalvin.repositories.WashRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/washes/")
public class WashController {

    @Autowired
    private WashRepository washRepository;
    @Autowired
    private UpdateWash updateWash;

    @GetMapping("showForm")
    public String showWashForm(Wash wash) {
        return "add-wash";
    }

    @GetMapping("list")
    public String washes(Model model) {
        model.addAttribute("washes", this.washRepository.findAll());
        return "index";
    }

    @PostMapping("add")
    public String addWash(@Validated Wash wash, BindingResult result, Model model) {
        if(result.hasErrors()) {
            return "add-wash";
        }
        wash.setStatus(WashStatus.CREATED);

        this.washRepository.save(wash);
        return "redirect:list";
    }

    @GetMapping("edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Wash wash = this.washRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid wash id : " + id));

        model.addAttribute("wash", wash);
        return "update-wash";
    }

    @PostMapping("update/{id}")
    public String updateWash(@PathVariable("id") long id, @Validated WashDTO wash, BindingResult result, Model model) {

        if(result.hasErrors()) {
            return "update-wash";
        }

        updateWash.execute(id, wash);
        // get all washes ( with update)
        model.addAttribute("washes", this.washRepository.findAll());
        return "index";
    }

    @GetMapping("delete/{id}")
    public String deleteWash(@PathVariable ("id") long id, Model model) {

        Wash wash = this.washRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid wash id : " + id));

        this.washRepository.delete(wash);
        model.addAttribute("washes", this.washRepository.findAll());
        return "index";

    }
}
