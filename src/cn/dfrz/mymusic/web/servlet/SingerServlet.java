package cn.dfrz.mymusic.web.servlet;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import cn.dfrz.mymusic.entity.Singer;
import cn.dfrz.mymusic.service.SingerService;

public class SingerServlet extends HttpServlet {
	
	SingerService singerService = new SingerService();


	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			String methodName = request.getParameter("method");
			if(methodName.equals("viewSinger"))
			{
				viewSinger(request, response);
			}else if(methodName.equals("addSinger"))
			{
				addSinger(request, response);
			}
	}
	public void viewSinger(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		//get提交处理乱码问题
//		String singerName=new String(request.getParameter("singerName").getBytes("iso-8859-1"),"UTF-8");
//		String singerName = request.getParameter("singerName");
//		Singer singer = singerService.findByName(singerName);
//		if(singer == null)
//		{
//			request.setAttribute("errorname", "没有找到该歌手");
//			request.getRequestDispatcher("/music/viewsinger.jsp").forward(request, response);
//			
//		}
//		else {
//			request.setAttribute("singername", singer);
//			request.getRequestDispatcher("/music/search.jsp").forward(request, response);
//		}
//		System.out.println(singerName);
		
		List<Singer> singerList = singerService.find();
		
		if(singerList.isEmpty())
		{
			request.setAttribute("singerNotFind", "没有歌手");
			request.getRequestDispatcher("/music/singerlist.jsp").forward(request, response);
		}
		else{
			
			request.setAttribute("singername", singerList);
			request.getRequestDispatcher("/music/singerlist.jsp").forward(request, response);
		}
		
	}
	
	public void addSinger(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		response.setContentType("text/html;charset=utf-8");
//		
//		// 创建工厂
//		DiskFileItemFactory dfif = new DiskFileItemFactory();
//		// 使用工厂创建解析器对象
//		ServletFileUpload fileUpload = new ServletFileUpload(dfif);
//		try {
//			// 使用解析器对象解析request，得到FileItem列表
//			List<FileItem> list = fileUpload.parseRequest(request);
//			// 遍历所有表单项
//		
//			for(FileItem fileItem : list) {
//				
//				// 如果当前表单项为普通表单项
//				if(fileItem.isFormField()) {
////					// 获取当前表单项的字段名称
////					String fieldName = fileItem.getFieldName();
////					
////					// 如果当前表单项的字段名为username
////					if(fieldName.equals("singername")) {
////						// 打印当前表单项的内容，即用户在username表单项中输入的内容
////						response.getWriter().print("用户名：" + fileItem.getString() + "<br/>");
////					}
//					
//					FileItem f1 = list.get(0);
//					response.getWriter().print(f1.getString("utf-8"));
//					System.out.println(f1.getString("utf-8"));
//				} else {//如果当前表单项不是普通表单项，说明就是文件字段
//					String name = fileItem.getName();//获取上传文件的名称
//					// 如果上传的文件名称为空，即没有指定上传文件
//					if(name == null || name.isEmpty()) {
//						continue;
//					}
//					// 获取真实路径，对应${项目目录}/uploads，当然，这个目录必须存在
//					String savepath = this.getServletContext().getRealPath("/music/files");
//					// 通过uploads目录和文件名称来创建File对象
//					File file = new File(savepath, name);
//					// 把上传文件保存到指定位置
//					fileItem.write(file);
//					// 打印上传文件的名称
//					response.getWriter().print("上传文件名：" + name + "<br/>");
//					// 打印上传文件的大小
//					response.getWriter().print("上传文件大小：" + fileItem.getSize() + "<br/>");
//					// 打印上传文件的类型
//					response.getWriter().print("上传文件类型：" + fileItem.getContentType() + "<br/>");
//				}
//			}
//		} catch (Exception e) {
//			throw new ServletException(e);
//		} 

		response.setContentType("text/html;charset=utf-8");
//		String singerName = request.getParameter("singername");
		
		DiskFileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload fileUpload = new ServletFileUpload(factory);
		try {
			List<FileItem> fileItemList = fileUpload.parseRequest(request);
			String singername = fileItemList.get(0).getString("utf-8");
			String sex = fileItemList.get(1).getString("utf-8");
			String singerinfo = fileItemList.get(2).getString("utf-8");
			String singerregion = fileItemList.get(3).getString("utf-8");
			String singerattention = fileItemList.get(4).getString("utf-8");
			
			FileItem f5 = fileItemList.get(5);
			

			String root = this.getServletContext().getRealPath("/music/files");
			String singerimage = f5.getName();//获取上传的文件名称
			File file = new File(root,singerimage);
			
				f5.write(file);
			Singer singern = singerService.findByName(singername);
			if(singern == null)
			{
				Singer singer = new Singer(1, singername, sex, singerinfo, singerregion, 100, singerimage);
				singerService.addSinger(singer);
				request.getRequestDispatcher("/music/index.jsp").forward(request, response);
				return;
			}else{
				request.setAttribute("addsingername", "该歌手已经存在");
				request.getRequestDispatcher("/music/manager/addsinger.jsp").forward(request, response);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	
	
	





}
