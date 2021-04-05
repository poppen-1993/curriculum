package Study;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Controller() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 呼び出し元Jspからデータ受け取り
		request.setCharacterEncoding("UTF-8");
		String jsp = request.getParameter("fromJsp");

		System.out.println(request.getParameter("fromJsp"));

		// 呼び出し先Jspに渡すデータセット
		request.setAttribute("fromServlet", jsp + " + サーブレットで追加");

		// result.jsp にページ遷移
		RequestDispatcher dispatch = request.getRequestDispatcher("result.jsp");
		dispatch.forward(request, response);
	}
}
