package com.pay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value = "index")
	public String index() {
		return "index";
	}
	@RequestMapping(value = "index2")
	public String index2() {
		return "index2";
	}
	@RequestMapping(value = "/pages/charts/chartjs")
	public String chartjs() {
		return "/pages/charts/chartjs";
	}
	@RequestMapping(value = "/pages/charts/flot")
	public String flot() {
		return "/pages/charts/flot";
	}
	@RequestMapping(value = "/pages/charts/inline")
	public String inline() {
		return "/pages/charts/inline";
	}
	@RequestMapping(value = "/pages/charts/morris")
	public String morris() {
		return "/pages/charts/morris";
	}
	@RequestMapping(value = "/pages/examples/404")
	public String error_404() {
		return "/pages/examples/404";
	}
	@RequestMapping(value = "/pages/examples/500")
	public String error_500() {
		return "/pages/examples/500";
	}
	@RequestMapping(value = "/pages/examples/blank")
	public String blank() {
		return "/pages/examples/blank";
	}
	@RequestMapping(value = "/pages/examples/invoice-print")
	public String invoic_print() {
		return "/pages/examples/invoice-print";
	}
	@RequestMapping(value = "/pages/examples/invoice")
	public String invoice() {
		return "/pages/examples/invoice";
	}
	@RequestMapping(value = "/pages/examples/lockscreen")
	public String lockscreen() {
		return "/pages/examples/lockscreen";
	}
	@RequestMapping(value = "/pages/examples/login")
	public String login() {
		return "/pages/examples/login";
	}
	@RequestMapping(value = "/pages/examples/profile")
	public String profile() {
		return "/pages/examples/profile";
	}
	@RequestMapping(value = "/pages/examples/register")
	public String register() {
		return "/pages/examples/register";
	}
	@RequestMapping(value = "/pages/forms/advanced")
	public String advanced() {
		return "/pages/forms/advanced";
	}
	@RequestMapping(value = "/pages/forms/editors")
	public String editors() {
		return "/pages/forms/editors";
	}
	@RequestMapping(value = "/pages/forms/general")
	public String general() {
		return "/pages/forms/general";
	}
	@RequestMapping(value = "/pages/layout/boxed")
	public String boxed() {
		return "/pages/layout/boxed";
	}
	@RequestMapping(value = "/pages/layout/collapsed-sidebar")
	public String collapsed_sidebar() {
		return "/pages/layout/collapsed-sidebar";
	}
	@RequestMapping(value = "/pages/layout/fixed")
	public String fixed() {
		return "/pages/layout/fixed";
	}
	@RequestMapping(value = "/pages/layout/top-nav")
	public String top_nav() {
		return "/pages/layout/top-nav";
	}
	@RequestMapping(value = "/pages/mailbox/compose")
	public String compose() {
		return "/pages/mailbox/compose";
	}
	@RequestMapping(value = "/pages/mailbox/mailbox")
	public String mailbox() {
		return "/pages/mailbox/mailbox";
	}
	@RequestMapping(value = "/pages/mailbox/read-mail")
	public String read_mail() {
		return "/pages/mailbox/read-mail";
	}
	@RequestMapping(value = "/pages/tables/data")
	public String data() {
		return "/pages/tables/data";
	}
	@RequestMapping(value = "/pages/tables/simple")
	public String simple() {
		return "/pages/tables/simple";
	}
	@RequestMapping(value = "/pages/UI/buttons")
	public String buttons() {
		return "/pages/UI/buttons";
	}
	@RequestMapping(value = "/pages/UI/icons")
	public String icons() {
		return "/pages/UI/icons";
	}
	@RequestMapping(value = "/pages/UI/modals")
	public String modals() {
		return "/pages/UI/sliders";
	}
	@RequestMapping(value = "/pages/UI/sliders")
	public String sliders() {
		return "/pages/UI/sliders";
	}
	
	@RequestMapping(value = "/pages/UI/timeline")
	public String timeline() {
		return "ui_general";
	}
	@RequestMapping(value = "/pages/UI/ui-general")
	public String ui_general() {
		return "/pages/UI/ui-general";
	}
	@RequestMapping(value = "/pages/calendar")
	public String calendar() {
		return "/pages/calendar";
	}
	@RequestMapping(value = "/pages/widgets")
	public String widgets() {
		return "/pages/widgets";
	}
	
}
