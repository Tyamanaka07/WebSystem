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
<title>${type.tname}</title>
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
</body>

	<main>
		<div class="pet_box">
			<c:forEach var = "plist" items = "${plist}">
				<section>
					<img alt="" src="${plist.f_path}">
					<span>${plist.birthDate}</span><span>${plist.sex}</span><span>￥${plist.price}</span>
					<div class="txt">${plist.description}</div>
					<div class="btn">
						<!-- <a href="#">編集</a>
						<a href="#">削除</a> -->
					<c:if test="${user.uid!=null}">
						<a href="bookingCheck?pid=${plist.pid}">予約</a>
					</c:if>
					<c:if test="${user.uid==null}">
						<a href="login">予約</a>
					</c:if>
					</div>
				</section>
			</c:forEach>

		</div>
		<!--<div class="insert"><a href="petinsert.html">ペット追加</a></div> -->
	</main>
</html>