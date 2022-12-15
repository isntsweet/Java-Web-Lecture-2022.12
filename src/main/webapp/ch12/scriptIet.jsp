<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- JSP 주석문 --%>
<%!
	private String name = "듀크";
	public String getName(){
		return name;
	}
%>
<%-- JSP 주석문 --%>
<% 
	int age = 19;
	String age_ = request.getParameter("age");
	request.setAttribute("age", age_);
	try{
		age = Integer.parseInt(age_);	
	} catch(Exception e) { }
	pageContext.setAttribute("age", 19);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버 변수/메소드 선언</title>
</head>
<body>
	<h1>안녕하세요 <%= name %>님!!!</h1>
	<h1>당신의 나이는 <%= age -3 %>세 입니까?</h1>
	<h1>Page context: %{agePage}</h1>
	<h1>Request context: ${age}</h1>
</body>
</html>