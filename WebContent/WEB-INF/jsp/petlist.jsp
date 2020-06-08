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
<title>${type.tname}</title>
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
				<li><a href="top.jsp">トップページ</a></li>
				<li><a href="petlist?tid=0">ウーパールーパー</a></li>
				<li><a href="petlist?tid=1">ワンちゃん</a></li>
				<li><a href="petlist?tid=2">ネコちゃん</a></li>
			</ul>
		</nav>
	</header>
</body>

	<main>
		<div class="pet_box">
			<section>
				<c:forEach var = "plist" items = "${plist}">
					<img alt="" src="image/uprp_01.jpg">	<!-- 分からないので保留 -->
					<span>${plist.birthDate}</span><span>${plist.sex}</span><span>￥${plist.price}</span>
					<div class="txt">${plist.description}</div>
					<div class="btn">
						<!-- <a href="#">編集</a>
						<a href="#">削除</a> -->
					<a href="BookingCheck">予約</a>
					</div>
				</c:forEach>
			</section>
		</div>
		<div class="insert"><a href="petinsert.html">ペット追加</a></div>
	</main>
</html>