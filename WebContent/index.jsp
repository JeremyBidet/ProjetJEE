<!-- auto-generated with eclipse wizard: JSF (xhtml) page template -->

<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html
	xmlns="http://www.w3.org/1999/xhtml"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:ui="http://xmlns.jcp.org/jsf/facelets"
	xmlns:p="http://primefaces.org/ui">

<f:view>
<h:head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
	<h:outputStylesheet library="css" name="style.css"/>
	<title>Login Page</title>
</h:head>

<h:body>
	<h:form id="login_form">
		<h1><h:outputText value="Title"/></h1>
		
		<p:growl id="growl" showDetail="false" sticky="false" life="3000" />
		
		<h:panelGrid id="login_panel" columns="1" cellpadding="5">
			<p:inputText placeholder="Username" id="username" required="true" value="#{authentication.username}"
					requiredMessage="Username field cannot be empty"/>
		
			<p:password placeholder="Password" id="password" required="true" value="#{authentication.password}"
		            requiredMessage="Password field cannot be empty"/>
		
			<p:inputText placeholder="RPPS number" id="rpps" required="false" value="#{authentication.rpps}"
					requiredMessage="RPPS number cannot be empty"/>
		
			<p:commandButton value="Login" update="login_form" actionListener="#{authentication.login}"/>
		</h:panelGrid>
	</h:form>
</h:body>
</f:view>

</html>