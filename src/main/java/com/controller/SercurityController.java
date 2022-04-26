package com.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.user.CrmUser;

@Controller
public class SercurityController {

   @RequestMapping(value = { "/", "/welcome" }, method = RequestMethod.GET)
   public String welcomePage(Model model) {
       model.addAttribute("title", "Welcome");
       model.addAttribute("message", "This is welcome page!");
       return "welcomePage";
   }

   @RequestMapping(value = "/admin", method = RequestMethod.GET)
   public String adminPage(Model model) {
       return "adminPage";
   }

   @RequestMapping(value = "/login", method = RequestMethod.GET)
   public String loginPage(Model model ) {
     
       return "loginPage";
   }

   @RequestMapping(value = "/logoutSuccessful", method = RequestMethod.GET)
   public String logoutSuccessfulPage(Model model) {
       model.addAttribute("title", "Logout");
       return "logoutSuccessfulPage";
   }

   @RequestMapping(value = "/userInfo", method = RequestMethod.GET)
   public String userInfo(Model model, Principal principal) {
 
       // Sau khi user login thanh cong se co principal
       String userName = principal.getName();

       System.out.println("User Name: "+ userName);

       return "userInfoPage";
   }

   @RequestMapping(value = "/403", method = RequestMethod.GET)
   public String accessDenied(Model model, Principal principal) {
       
       if (principal != null) {
           model.addAttribute("message", "Hi " + principal.getName()
                   + "<br> You do not have permission to access this page!");
       } else {
           model.addAttribute("msg",
                   "You do not have permission to access this page!");
       }
       return "access-denied";
   }
//   @Autowired
//   //@Qualifier("clientService")
//   public void setClientService(ClientService clientService){
//       this.clientService=clientService;
//   }

   @RequestMapping(value = "registration", method = RequestMethod.GET)
   public String reg(Model model){
       model.addAttribute("client", new CrmUser());
       return "registration";
   }

   @RequestMapping(value = "registration/add", method = RequestMethod.POST)
   public String addUser(@ModelAttribute CrmUser client){
       
   return "home";
   }
}