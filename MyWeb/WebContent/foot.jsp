<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//컨텍스트 얻기
	String myctx= request.getContextPath();			//절대경로 만들때 사용한다

%>


</article>
        <!-- aside : 사이드메뉴가 들어감------------- -->
        <aside>
            <!-- aside -->
            <nav>
            <ul>
                <li><a href="<%=myctx%>/example/ex08_form.jsp">form</a></li>
                <li><a href="menu2.jsp">menu2</a></li>
                <li><a href="menu3.jsp">menu3</a></li>
                <li><a href="menu4.jsp">menu4</a></li>
            </ul>
            </nav>
        </aside>

        <div class="clear"></div>
        <!-- footer: copyright --------------------->
        <footer>Copyright</footer>

    </div>
</body>
</html>
<!-- ex27_template.html -->