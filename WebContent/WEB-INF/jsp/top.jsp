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
<title>トップページ</title>
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

	<main>
		<div class="toppage">Welcome to Nakagawa's!</div>
		<div class="source">
			<h3>出典</h3>
			<a href="http://ulabo.com/">ウーパールーパーラボ</a>
		</div>
	</main>

</body>
</html>