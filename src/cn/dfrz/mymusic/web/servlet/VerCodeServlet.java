package cn.dfrz.mymusic.web.servlet;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.vcode.utils.VerifyCode;


public class VerCodeServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//创建验证码
		VerifyCode vc = new VerifyCode();
		
		//得到验证码图片
		BufferedImage image = vc.getImage();
		
		//把验证码上的文本保存到session中
		request.getSession().setAttribute("session_vc", vc.getText());

		//把图片响应给客户
		VerifyCode.output(image, response.getOutputStream());
	}

}
