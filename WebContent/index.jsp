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
			<h:outputStylesheet library="css" name="Login.css"/>
			<title>Login Page</title>
		</h:head>
		<h:body>
			<h:div class="login-page">
  				<h:div class="form">
    				<h:form class="register-form">
      					<h:input type="text" placeholder="name"/>
     					<h:input type="password" placeholder="password"/>
      					<h:input type="text" placeholder="email address"/>
      					<h:button>create</h:button>
      					<p class="message">Already registered? <a href="#">Sign In</a></p>
    				</h:form>
    				<h:form class="login-form">
      					<h:input type="text" placeholder="username"/>
      					<h:input type="password" placeholder="password"/>
      					<h:button>login</h:button>
      					<p class="message">Not registered? <a href="#">Create an account</a></p>
    				</h:form>
  				</h:div>
			</h:div>
			<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
			<script src="js/login.js"></script>
		</h:body>
	</f:view>
</html>
