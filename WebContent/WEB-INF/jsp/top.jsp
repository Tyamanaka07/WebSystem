<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
				<!-- <li><a href="bookinglist.jsp">予約一覧</a></li>
				<li><a href="login.jsp">ログアウト</a></li> -->
				<li><a href="login.jsp">ログイン</a></li>
			</ul>
			<h1><a href="topDiagram">Nakagawa's</a></h1>
		</div>
		<nav>
			<ul>
				<li><a href="topDiagram">トップページ</a></li>
				<li><a href="petlist?tid=0">ウーパールーパー</a></li>
				<li><a href="petlist?tid=1">ワンちゃん</a></li>
				<li><a href="petlist?tid=2">ネコちゃん</a></li>
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