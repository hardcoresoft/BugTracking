package th.co.hardcoresoft.bugtracking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class AccessController {

	protected String username;
	protected String password;
//
//	@Autowired
//	private AuthenticationManager authenticationManager;
//
//	@RequestMapping(value = "/login", method = { RequestMethod.POST, RequestMethod.GET })
//	public @ResponseBody String authentication(@RequestParam("j_username") String userName,
//			@RequestParam("j_password") String password, HttpServletRequest request) {
//
//		this.username = userName;
//		this.password = password;
//
//		Authentication authenticationToken = new UsernamePasswordAuthenticationToken(userName, password);
//		try {
//
//			Authentication authentication = authenticationManager.authenticate(authenticationToken);
//
//			SecurityContext securityContext = SecurityContextHolder.getContext();
//
//			securityContext.setAuthentication(authentication);
//
//			HttpSession session = request.getSession();
//			session.setAttribute("SPRING_SECURITY_CONTEXT", securityContext);
//
//			return "redirect:/success";
//		} catch (AuthenticationException ex) {
//			return "redirect:/login";
//		}
//	}

	@RequestMapping("/login")
	public String login(Model model, @RequestParam(required = false) String message) {
		model.addAttribute("message", message);
		
//		ModelAndView modelAndView = new ModelAndView("/login");
		
		return "access/login";
	}

	@RequestMapping(value = "/denied")
	public String denied() {
		return "access/denied";
	}

	@RequestMapping(value = "/login/failure")
	public String loginFailure(Model model) {
		String message = "Invalid Username or Password!";
		model.addAttribute("message", message);
		return "redirect:/login";
	}

	@RequestMapping(value = "/logout/success")
	public String logoutSuccess() {
		//String message = "Logout Success!";
//		return "redirect:/login?message=" + message;
		return "redirect:/login";
	}
}
