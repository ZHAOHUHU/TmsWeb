
package shenzhen.teamway.tms9000.portal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import shenzhen.teamway.tms9000.portal.domain.User;
import shenzhen.teamway.tms9000.portal.service.UserService;
import shenzhen.teamway.tms9000.portal.util.ConstantUtils;


@Controller
public class LoginController {
	private static Logger logger = LoggerFactory.getLogger(LoginController.class);
	@Autowired
    private UserService userService;

    @RequestMapping(value = {"/", "index.html"})
    public String loginPage() {
        return "login";
    }

    @RequestMapping(value = "/loginCheck.html")
    public String loginCheck(@RequestParam("userName") String userName, @RequestParam("password") String password, Model model) {
        boolean isValid = userService.hasMatchUser(userName, password);
        if (isValid) {
            model.addAttribute("message", "Hello, " + userName);
        }
        else {
            model.addAttribute("message", "user error.");
        }
        return "resultPage";
    }

	/**
	 * 用户登录
	 * 
	 * @return
	 */
	@RequestMapping("/protalLogin.html")
	public ModelAndView login(HttpServletRequest request ,User user) {
		Map<String,String> map= new HashMap<String,String>();
		try {
			if(request.getSession().getAttribute("validateCode") == null) {
				ModelAndView view = new ModelAndView("redirect:"+"/");
				map.put("msg", "长时间未操作，请重新登录");
				map.put("userName", user.getUserName());
				view.addAllObjects(map);
				return view;
			}
			
			if(!request.getSession().getAttribute("validateCode").equals(user.getVerifyCode().toUpperCase())) {
				ModelAndView view = new ModelAndView("redirect:"+"/");
				map.put("msg", "验证码错误");
				map.put("userName", user.getUserName());
				view.addAllObjects(map);
				return view;
			}
			
			User userInfo;
			userInfo = userService.getUserByName(user.getUserName());
			if (userInfo == null) {
				ModelAndView view = new ModelAndView("redirect:"+"/");
				map.put("msg", "用户名不存在");
				map.put("userName", user.getUserName());
				view.addAllObjects(map);
				return view;
			}
			
			String pwd = user.getPassword();
//			pwd = MD5Util.string2MD5(pwd);
			if(!pwd.equals(userInfo.getPassword())) {
				ModelAndView view = new ModelAndView("redirect:"+"/");
				map.put("msg", "密码错误");
				map.put("userName", user.getUserName());
				view.addAllObjects(map);
				return view;
			}
			
			ModelAndView view = null;
//			if("0".equals(userInfo.getIs_first_login())) {
//				view = new ModelAndView("updatePassword");
//			} else {
//				view = new ModelAndView("index");
//			}
			view = new ModelAndView("index1");
			request.getSession().setAttribute(ConstantUtils.SESSION_USER_, userInfo);
			request.getSession().setAttribute("msg", "ss");
			return view;
		} catch (Exception e) {
			ModelAndView view = new ModelAndView("redirect:"+"/");
			map.put("msg", "连接超时");
			map.put("userName", user.getUserName());
			view.addAllObjects(map);
			logger.error("user login err:"+e.getMessage());
			return view;
		}
	}
    
	
	/**
	 * 页面转发请求
	 * @param page
	 * @return
	 */
	@RequestMapping("/redirect")
	public String redirect(String page){
		return page;
	}
	
	/**
	 * 退出
	 */
	@RequestMapping(value="/logout.html",method=RequestMethod.POST)
	public void logout(HttpServletRequest request , HttpServletResponse response){
		request.getSession().setAttribute(ConstantUtils.SESSION_USER_,null);
	}
    
	/**
	 * 获取登录用户菜单资源
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/merchantUserMenus.html")
	public void merchantUserMenus(HttpServletRequest request,
			HttpServletResponse response) {
		/*Role role = new Role();
		role.setRoleId(1);*/
		User user =(User) request.getSession().getAttribute(ConstantUtils.SESSION_USER_);
//		List<Menu> list = menuService.queryMenusByUser(user);
		/*List<Menu> list = menuService.queryMenuByUser(role);*/
//		String json = JSON.toJSONString(list);
		PrintWriter pw = null;
		try {
			response.setCharacterEncoding("UTF-8");
//			System.out.println(json);
			//json = new String(json.getBytes("ISO-8859-1"),"UTF-8");
			pw = response.getWriter();
//			pw.write(json);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
