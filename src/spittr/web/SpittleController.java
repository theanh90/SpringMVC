package spittr.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import spittr.Spittle;
import spittr.data.SpittleRepository;

@Controller
@RequestMapping("/spittles")
public class SpittleController {
	final String MAX_LONG_AS_STRING = "20";
	
	private SpittleRepository spittleRepository;

	@Autowired
	public SpittleController(SpittleRepository spittleRepository) {
		this.spittleRepository = spittleRepository;
	}

	// @RequestMapping(method = RequestMethod.GET)
	// public String spittles(Model model) {
	//
	// List<Spittle> ls = new ArrayList<>();
	// ls = spittleRepository.findSpittles(Long.MAX_VALUE, 20);
	// for (Spittle s : ls) {
	// System.out.println(s.toString());
	// }
	// model.addAttribute(ls);
	// return "spittles";
	// }

	
	// ?? tại sao return List mà nó map dc với file spittle.jsp ??
	// =====> vì @RequestMapping là "/spittles", nên default nó map với string "spittles"
	@RequestMapping(method = RequestMethod.GET)
	public List<Spittle> spittles(@RequestParam(value="max", defaultValue=MAX_LONG_AS_STRING) long max, 
								  @RequestParam(value="count", defaultValue="20") int count) {
		
		return spittleRepository.findSpittles(max, count);		
	}
}
