<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=ISO-8859-1" language="java" pageEncoding="UTF-8" errorPage="" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" scope="request" />
<c:set var="assets" value="${ctx}/app_src/assets" scope="request" />
<c:set var="bootstrap" value="${ctx}/app_src/bootstrap" scope="request" />
<c:set var="css" value="${ctx}/app_src/css" scope="request" />
<c:set var="js" value="${ctx}/app_src/js" scope="request" />
<c:set var="popperjs" value="${ctx}/app_src/popperjs" scope="request" />

<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="More Shop, uma plataforma de divulgação de lojas de terceiros">
    <meta name="author" content="GGTEAM Inc., GGTEAM, More Shop CEOs">
    <!-- Icon -->
    <link rel="icon" href="${assets}/logoIcon01.svg" />
    
    <!-- Bootstrap CSS -->
    <link href="${bootstrap}/css/bootstrap.min.css" rel="stylesheet">
    