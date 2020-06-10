<!-- 中川伶丞 -->


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="Model.Pet" %>
<%@ page import="Model.User" %>
<% Pet p = (Pet) request.getAttribute("Pet");%>
<% User u = (User) request.getAttribute("User");%>
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
		<h2>新規予約</h2>
		<div class="booking">
			<img alt="" src="<%= p.getF_path() %>">
			<span><%= p.getBirthDate() %></span><span><%= p.getSex() %></span><span>￥<%= p.getPrice() %></span>
			<div><%= p.getDescription() %></div><br>
			<form class="input" action="bookingCheck" method="post">
				日時：
				<label><input type="datetime-local" name="bookingDateStr"  min="2020-06-03T00:00" /></label>
				<input type="hidden" name="pid" value=<%= p.getPid() %>>
				<input type="hidden" name="tid" value=<%= p.getType().getTid() %>>
				<input type="hidden" name="uid" value=<%= u.getUid() %>>
				　　電話番号：<input type="text" name="telNum"><br>
				この子を<input class="btn2" type="submit" value="予約">します
			</form>
		</div>
	</main>

</body>
</html>