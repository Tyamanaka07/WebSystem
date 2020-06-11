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
<title>エラー</title>
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
				<li><a href="petlist?tid=1">ウーパールーパー</a></li>
				<li><a href="petlist?tid=2">ワンちゃん</a></li>
				<li><a href="petlist?tid=3">ネコちゃん</a></li>
			</ul>
		</nav>
	</header>

	<main class="mainsub">
		<h2>エラー</h2>
		<h4>${mes}</h4>
	</main>
</body>
</html>