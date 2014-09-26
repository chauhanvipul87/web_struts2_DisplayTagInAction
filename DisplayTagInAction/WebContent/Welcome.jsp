<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>  
<html>
<head>
	<title>Welcome</title>
</head>
<body>
	<h2><font color=red>Welcome to Java Tech Knowledge</font></h2>
   <display:table name="lst">
    <display:column property="id" title="ID" />
    <display:column property="name" titleKey="label.test" />
    <display:column property="email" title="Test" />
    <display:column property="status"  />
	<display:column property="description" title="Comments" />
  </display:table> 
</body>
</html>
