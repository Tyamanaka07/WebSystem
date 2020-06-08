<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
				<li><a href="bookinglist.jsp">予約一覧</a></li>
				<li><a href="login.jsp">ログアウト</a></li>
			<h1><a href="top.jsp">Nakagawa's</a></h1>
		</div>
		<nav>
			<ul>
				<li><a href="top.html">トップページ</a></li>
				<li><a href="plist.jsp?tid=1">ウーパールーパー</a></li>
				<li><a href="plist.jsp?tid=2">ワンちゃん</a></li>
				<li><a href="plist.jsp?tid=3">ネコちゃん</a></li>
			</ul>
		</nav>
	</header>

	<main class="mainsub">
	<h2>${user.name}様の予約一覧</h2>
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

			<td><a href="bookingUpdate">変更</a><a href="bookingDelete">削除</a></td>
			</tr>
			</c:forEach>
		</table>
	</main>

</body>
</html>