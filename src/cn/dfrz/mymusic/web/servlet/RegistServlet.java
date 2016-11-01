package cn.dfrz.mymusic.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;


import javax.mail.Authenticator;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.dfrz.mymusic.entity.User;
import cn.dfrz.mymusic.service.UserService;
import cn.itcast.commons.CommonUtils;


public class RegistServlet extends HttpServlet {
	UserService userService = new UserService();
	

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//处理编码
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String action = "userList";
		String ac = request.getParameter("action");
		if (ac != null) {
			action = ac;
		}
		if("checkUserName".equals(action))
		{
			checkUserName(request, response);
		}else if("regist".equals(action))
		{
			
				try {
					regist(request, response);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		else if("checkUserEmail".equals(action))
		{
			checkUserEmail(request, response);
		}
		else if("active".equals(action))
		{
			active(request, response);
		}
	
		
		
	}
	
	public void regist(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		
		
		//封装表单数据（封装到User对象中）
				User form = CommonUtils.toBean(request.getParameterMap(), User.class);
				
				
				form.setUserid(CommonUtils.uuid());
				form.setCode(CommonUtils.uuid()+CommonUtils.uuid());
				//得到存放在session里的值（验证码的值)
				String vercode = (String)request.getSession().getAttribute("session_vc");

				//验证码和输入验证码表单数据不正确时
				if(!vercode.equalsIgnoreCase(form.getVercode()))
				{
					request.setAttribute("message", "验证码错误！");
					request.setAttribute("user", form);
					request.getRequestDispatcher("/music/regist.jsp").forward(request, response);
				
				}
					
				
					//调用regist方法把表单数据存进去
					userService.regist(form);
//					response.getWriter().print("<h1>注册成功</h1><a href='"
//					+request.getContextPath()+"/music/login.jsp"+"'>点击登录</a>");
					response.getWriter().print("<script>alert('注册成功')</script>");
					response.sendRedirect(request.getContextPath()+"/music/login.jsp");
				
					
					 final Properties props = new Properties();
					  // 表示SMTP发送邮件，需要进行身份验证
				        props.put("mail.smtp.auth", "true");
				        props.put("mail.smtp.host", "smtp.126.com");
				        
				        // 发件人的账号
				        props.put("mail.user", "binter_chen@126.com");
				        // 访问SMTP服务时需要提供的密码
				        props.put("mail.password", "chen0337");
				        
				        // 构建授权信息，用于进行SMTP进行身份验证
				        Authenticator authenticator = new Authenticator() {
				            @Override
				            protected PasswordAuthentication getPasswordAuthentication() {
				                // 用户名、密码
				                String userName = props.getProperty("mail.user");
				                String password = props.getProperty("mail.password");
				                return new PasswordAuthentication(userName, password);
				            }
				        };
				        
				        /**
				         * 用户注册时发送邮箱
				         */
				        // 使用环境属性和授权信息，创建邮件会话
				        Session mailSession = Session.getDefaultInstance(props, authenticator);
				        MimeMessage message = new MimeMessage(mailSession);
				        InternetAddress fm = new InternetAddress(props.getProperty("mail.user"));
				       
						message.setFrom(fm);
						
				        // 设置收件人
				        InternetAddress to = new InternetAddress(form.getEmail());
				        
						message.setRecipient(RecipientType.TO, to);
						
				        // 设置邮件标题
				        message.setSubject("邮箱激活");
				        message.setContent("<h1><a href='http://localhost:8080/"+request.getContextPath()+"/RegistServlet?action=active&userid="+form.getUserid()+"'>点击完成激活</a></h1>", "text/html;charset=gbk");
//				        message.setText("cccc");
				        // 发送邮件
				        Transport.send(message);
	}
	
	//检查用户名是否存在
	public void checkUserName(HttpServletRequest request,
			HttpServletResponse response) throws IOException
	{
		String username = request.getParameter("username");
		
		User user = userService.fingByUsername(username);
		PrintWriter out = response.getWriter();
		if (user == null) {//用户名不存在
			out.print(true);
		} else if(user != null){//用户名存在
			out.print(false);
		}

	}
	
	//检查Email是否已经存在
	public void checkUserEmail(HttpServletRequest request,
			HttpServletResponse response) throws IOException
	{
		String userEmail = request.getParameter("email");
		User user = userService.findByUserEmail(userEmail);
		PrintWriter out = response.getWriter();
		if (user == null) {
			out.print(true);
		} else if(user != null){
			out.print(false);
		}

	}
	
	public void active(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		String userid = request.getParameter("userid");
		userService.active(userid);
		request.setAttribute("mes", "激活成功");
		request.getRequestDispatcher("/music/message.jsp").forward(request, response);
	}
	

}
