package com.darts.Controller;

import java.security.Principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.darts.domain.Stats;
import com.darts.domain.User;
import com.darts.repository.UserRepository;
import com.darts.service.AuthenticationFacade;
import com.darts.service.CustomAuthenticationProvider;
import com.darts.service.NewsService;
import com.darts.service.StatsService;
import com.darts.service.UserService;

@Controller
public class HomeController {
	
    private final Logger log = LoggerFactory.getLogger(this.getClass());
   
	private NewsService newsService;
	private UserService userService; 
	private StatsService statsService;
	private AuthenticationFacade authFac;
	
	@Autowired
	public void setNewsService(NewsService newsService) {
		this.newsService = newsService;
	}
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@Autowired
	public void setStatsService(StatsService statsService) {
		this.statsService = statsService;
	}
	
	@Autowired
	public void setAuthFac(AuthenticationFacade authFac) {
		this.authFac = authFac;
	}

	@RequestMapping("/")
	public String index( Model model) {
		return "index";
	}
	
	@RequestMapping("/login")
	public String login( Model model) {
		return "auth/login";
	}
	
	@RequestMapping("/news")
	public String news( Model model) {
		model.addAttribute("news", newsService.getNews());
		return "news";
	}
	
	@RequestMapping("/news/{link}")
	public String searchContent(@PathVariable(value="link") String link, Model model) throws Exception {
		if (link.equals("")) 
			throw new Exception("Page does not exist");
		System.out.println("title: "+link);
		model.addAttribute("news", newsService.getNewsContent(link));
		return "content";
	}
	
	
	@RequestMapping("/tipps")
	public String tipps( Model model) {
		return "tipps";
	}
	
	@RequestMapping("/play")
	public String play( Model model) {
		return "play";
	}
	
	@RequestMapping("/stat")
	public String showUserStat(Model model) throws Exception {
		model.addAttribute("stats", statsService.showUserStat(userService.getId(authFac.getAuthenticatedUser())));
		return "stats";
	}
	
	@RequestMapping("/registration")
	public String registration( Model model) {
		model.addAttribute("user", new User());
		return "registration";
	}
	
	@PostMapping("/reg")
    public String reg(@ModelAttribute User user) {
		log.info("New user!");
		log.debug(user.getFirstname());
		log.debug(user.getLastname());
		log.debug(user.getEmail());
		log.debug(user.getPassword());
		userService.registerUser(user);
        return "auth/login";
    }
	
}
