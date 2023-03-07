package egovframework.wini.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.wini.main.service.MainService;
import egovframework.wini.main.vo.MainVO;

@Controller
public class MainController {

	@Autowired
	MainService mService;
	
	@RequestMapping(value ="/main.do")
	public String mainPage(Model model) {
			List<MainVO> list = mService.getList();
			System.out.println("=====================");
			System.out.println(list);
			model.addAttribute("list", list);
		return "views/main/mainPage";
	}
}
