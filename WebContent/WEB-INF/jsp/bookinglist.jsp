<!-- @author 中川伶丞 -->


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="Model.User" %>
<% User user = (User) session.getAttribute("user"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css/style.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Dancing+Script:wght@700&family=Open+Sans+Condensed:wght@300&display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=M+PLUS+Rounded+1c&display=swap" rel="stylesheet">
<title>予約一覧</title>
</head>
<body>
	<header>
		<div class="top">
			<ul>
				<c:if test="${user.uid!=null}">
				<li><a href="bookinglist">予約一覧</a></li>
				<li><a href="logout">ログアウト</a></li>
			</c:if>
			<c:if test="${user.uid==null}">
				<li><a href="login">ログイン</a></li>
			</c:if>
			</ul>
			<h1><a href="topDiagram">Nakagawa's</a></h1>
		</div>
		<nav>
			<ul>
				<li><a href="topDiagram">トップページ</a></li>
				<li><a href="plist.jsp?tid=1">ウーパールーパー</a></li>
				<li><a href="plist.jsp?tid=2">ワンちゃん</a></li>
				<li><a href="plist.jsp?tid=3">ネコちゃん</a></li>
			</ul>
		</nav>
	</header>

	<main class="mainsub">
	<h2>${user.uname}様の予約一覧</h2>
		<table class="booking_list">
			<tr>
			<th></th><th>種類</th><th>生年月日</th><th>性別</th><th>予約日時</th><th></th>
			</tr>
			<c:forEach var="booking" items="${blist}">
			<tr>
			<td><img alt="" src="image/uprp_01.jpg"></td>
			<td>${booking.type.tname}</td>
			<td>${booking.pet.birthDate}</td>
			<td>${booking.pet.sex}</td>
			<td>${booking.bookingDate}</td>

			<td><a href="bookingUpdate?bid=${ booking.bid }">変更</a><a href="bookingDelete?bid=${ booking.bid }">削除</a></td>
			</tr>
			</c:forEach>
		</table>
	</main>

</body>
</html>