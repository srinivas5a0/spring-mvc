package rcc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import rcc.services.IStoreService;

@Controller
@RequestMapping("/stores")
public class StoreController {

	private IStoreService storeService;

	@Autowired
	public StoreController(IStoreService _storeService) {
		storeService = _storeService;
	}

	@RequestMapping(method = RequestMethod.GET)
	private String stores(Model model) {
		// TODO Auto-generated method stub
		model.addAttribute("storesList",storeService.GetAllStores(20));

		return "stores";
	}
}
