<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html>
<head></head>
<body>
	<h1> Bienvenue <bean:write name="helloWorldForm" property="message"/></h1>
</body>
</html>