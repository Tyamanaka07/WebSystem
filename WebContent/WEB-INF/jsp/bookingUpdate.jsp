<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css/style.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Dancing+Script:wght@700&family=Open+Sans+Condensed:wght@300&display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=M+PLUS+Rounded+1c&display=swap" rel="stylesheet">
<title>予約変更</title>
</head>
<body>
	<header>
		<div class="topDiagram">
			<ul>
				<li><a href="bookinglist">予約一覧</a></li>
				<li><a href="login">ログアウト</a></li>
			</ul>
			<h1><a href="topDiagram">Nakagawa's</a></h1>
		</div>
		<nav>
			<ul>
				<li><a href="topDiagram">トップページ</a></li>
				<li><a href="index.html">ウーパールーパー</a></li>
				<li><a href="#">ワンちゃん</a></li>
				<li><a href="#">ネコちゃん</a></li>
			</ul>
		</nav>
	</header>

	<main class="mainsub">
		<h2>予約変更</h2>
		<div class="booking">
			<img alt="" src="image/uprp_01.jpg">
			<span>2020/2/2生まれ</span><span>♀</span><span>￥10000</span>
			<div>おとなしい子です。</div>
			<form class="input" action="login" method="post">
				この子の予約日時を
				<label><input type="datetime-local" min="2020-06-03T00:00" /></label>
				に<input class="btn2" type="submit" value="変更">します
			</form>
		</div>
	</main>

</body>
