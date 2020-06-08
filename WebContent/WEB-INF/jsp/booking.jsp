<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="Model.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css/style.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Dancing+Script:wght@700&family=Open+Sans+Condensed:wght@300&display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=M+PLUS+Rounded+1c&display=swap" rel="stylesheet">
<title>ペット予約</title>
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
		<h2>新規予約</h2>
		<div class="booking">
			<img alt="" src="image/uprp_01.jpg">
			<span>${ p.birthDate }生まれ</span><span>${ p.sex }</span><span>${ p.price }</span>
			<div>${ p.description }</div><br>
			<form class="input" action="booking" method="post">
				日時：
				<label><input type="datetime-local" min="2020-06-03T00:00" /></label>
				　　電話番号：<input type="text" name="telNum"><br>
				この子を<input class="btn2" type="submit" value="予約">します
			</form>
		</div>
	</main>

</body>
</html>