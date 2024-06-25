package filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@WebFilter("/admin/*")
public class AdminFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest req = (HttpServletRequest) request; //ép kiểu về httpservletrequest để lấy session
		HttpSession session = req.getSession(); // lấy session ra, có thì lấy ra chưa có thì tạo mới
		Object key = session.getAttribute("loginUser");//lấy username ra gán vào key
		if (key != null && String.valueOf(key).equals("admin")) { 
			// thường thực tế sẽ set điều kiện là một class user (đối tượng) để lấy thuộc tính tùy biến, 
			//chứ không phải fix cứng như này dẫn tới kẻ tấn công dễ dàng bypass bằng việc thêm parameter
			chain.doFilter(request, response);
		} else {
			PrintWriter pw = response.getWriter();
			pw.println("No Permission!");
		}
	}

}
