package com.xiongyi.cg.controller.base;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.xiongyi.cg.entity.Page;
import com.xiongyi.cg.util.Logger;
import com.xiongyi.cg.util.PageData;
import com.xiongyi.cg.util.UuidUtil;

/**
 * @author GUXIONG
 *
 */
public class BaseController {
	protected Logger logger = Logger.getLogger(this.getClass());
	
	/**
	 * new PageData对象
	 * @return
	 */
	public PageData getPageData() {
		return new PageData(this.getRequest());
	}
	
	/**
	 * 得到ModelAndView对象
	 * @return
	 */
	public ModelAndView getModelAndView() {
		return new ModelAndView();
	}

	/**得到request对象
	 * @return
	 */
	public HttpServletRequest getRequest() {
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		return request;
	}
	
	/**得到32位的uuid
	 * @return
	 */
	public String get32UUID(){
		return UuidUtil.get32UUID();
	}
	
	/**得到分页列表的信息
	 * @return
	 */
	public Page getPage(){
		return new Page();
	}
	
	public static void logBefore(Logger logger, String interfaceName){
		logger.info("");
		logger.info("start");
		logger.info(interfaceName);
	}
	
	public static void logAfter(Logger logger){
		logger.info("end");
		logger.info("");
	}

}
