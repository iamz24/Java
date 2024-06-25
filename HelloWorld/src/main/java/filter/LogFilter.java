package filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = "/*") // /* chặn tất cả đường dẫn có mở đầu bằng /, hoặc sau cụ thể hóa url thì chỉ có url chỉ định mới chạy qua filter
public class LogFilter implements Filter{ // luồng chạy sẽ chạy vào log filter trước khi chạy đến đích
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) //chain là chuỗi filter
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("Log filter");//trước khi chạy xong sẽ in ra màn hình console dòng chữ
//		String key = request.getParameter("key"); //giả sử url gửi đi có chứa một tham số key, ta get key ra
//		if (key != null) { //nếu url gửi đi có key thì cho qua
//			chain.doFilter(request, response);//gọi hàm để cho đi tiếp, nếu không gọi thì nó sẽ chỉ đứng ở hàm filter và sẽ trả về trang trắng
//		} else { //nếu key bị trống thì chặn lại và in ra là no permission!
//			PrintWriter pw = response.getWriter();
//			pw.println("No Permission!");
//		}
		
		chain.doFilter(request, response);
	}
}
