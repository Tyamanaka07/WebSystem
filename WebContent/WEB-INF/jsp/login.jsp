<!-- 作成者 山中健裕 -->

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
<title>ログイン</title>
</head>
<body>
	<header>
		<div class="top">
			<ul>
				<li><a href="#">　</a></li>
				<li><a href="#">　</a></li>
			</ul>
			<h1><a href="topDiagram">Nakagawa's</a></h1>
		</div>
	</header>


	<main class="sub">
	<p>${mes}</p>
		<form class="logininput" action="login" method="post">
			ユーザー名：<input type="text" name="name">　
			パスワード：<input type="password" name="pass"><br>
			<input class="loginbtn" type="submit" value="ログイン">
		</form>
	</main>
</body>
</html>