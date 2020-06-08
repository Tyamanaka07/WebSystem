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
				<li><a href="bookinglist.html">予約一覧</a></li>
				<li><a href="login.html">ログアウト</a></li>
			</ul>
			<h1><a href="top.html">Nakagawa's</a></h1>
		</div>
		<nav>
			<ul>
				<li><a href="top.html">トップページ</a></li>
				<li><a href="index.html">ウーパールーパー</a></li>
				<li><a href="#">ワンちゃん</a></li>
				<li><a href="#">ネコちゃん</a></li>
			</ul>
		</nav>
	</header>

	<main class="mainsub">
	<h2>全ユーザーの予約一覧</h2>
		<table class="booking_list">
			<tr>
			<th></th><th>種類</th><th>ユーザー名</th><th>電話番号</th><th>予約日時</th><th></th>
			</tr>
			<c:forEach var="booking" items="${blist}">
			<tr>
			<td><img alt="" src="image/uprp_01.jpg"></td><td>${ booking.type.tname }</td><td>${ user.uname }</td><td>${ booking.telNum }</td>
			<td>${ booking.bookingDate }<td><a href="bookingUpdate?bid=${ booking.bid }">変更</a><a href="bookingDelete?bid=${ booking.bid }">削除</a></td>
			</tr>
			</c:forEach>
		</table>
	</main>

</body>
</html>