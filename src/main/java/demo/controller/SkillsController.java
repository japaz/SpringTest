package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import demo.entity.Skill;
import demo.repository.SkillRepository;

@Controller
public class SkillsController {
	
	@Autowired
	SkillRepository skillRepository;
	
	@RequestMapping(value="/skills",method=RequestMethod.GET)
	public String skillsList(Model model) {
		model.addAttribute("skills", skillRepository.findAll());
		return "skills";
	}
	
	@RequestMapping(value="/skills",method=RequestMethod.POST)
	public String developersAdd(@RequestParam String label, 
						@RequestParam String description, Model model) {
		
		Skill newSkill = new Skill();
		newSkill.setLabel(label);
		newSkill.setDescription(description);
		skillRepository.save(newSkill);
		
		model.addAttribute("skill", newSkill);
//		return "redirect:/skill/" + newSkill.getId();
		return "redirect:/skills";
	}
}
