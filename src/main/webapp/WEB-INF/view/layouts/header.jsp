<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap2.min.css"
	rel="stylesheet" type="text/css">
<link
	href="${pageContext.request.contextPath}/resources/css/demo.css"
	rel="stylesheet" type="text/css">
<script src="<c:url value='/resources/jquery/jquery-3.3.1.min.js' />"></script>
<script src="<c:url value='/resources/bootstrap/bootstrap2.min.js' />"></script>
<c:url var="pattern" value="/resources/img/bg1.jpg" />
<c:url var="slide1" value="/resources/img/slide1.jpg" />
<c:url var="slide2" value="/resources/img/slide2.jpg" />
<c:url var="slide3" value="/resources/img/slide3.jpg" />
<c:url var="slide4" value="/resources/img/slide4.jpg" />
<c:url var="socialmedia1" value="/resources/img/socialmedia1.jpg" />
<c:url var="recruitment" value="/resources/img/recruitment.jpg" />
</head>
<body>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">