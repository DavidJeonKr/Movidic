<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
		
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery-cookie/1.4.1/jquery.cookie.min.js"></script>
	

</head>
<body>
	<!-- user화면 템플릿 -->
	
	<tiles:insertAttribute name="header" />
	
	<tiles:insertAttribute name="body" />
	<tiles:insertAttribute name="footer" />
	
	
	
</body>
</html>