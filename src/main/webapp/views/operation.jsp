<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<html:html >
  <html>
    <head>
      <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
      <title>untitled</title>
      <SCRIPT language="javascript" type="text/javascript">
      function setOperation(valeur){
        document.forms[0].operation.value=valeur;
      }
    </SCRIPT>
    </head>
    <body>
      <html:form action="operations.do" focusIndex="reference">
        <html:hidden property="operation" value="aucune"/>
        <table>
          <tr>
            <td>
              <bean:message key="app.saisirproduit.libelle.reference"/>:
            </td>
            <td>
              <html:text property="reference"/>
            </td>
          </tr>
          <tr>
            <td colspan="2" align="center">
              <html:submit onclick="setOperation('ajouter');">Ajouter</html:submit>
              <html:submit onclick="setOperation('modifier');">Modifier</html:submit>
              <html:submit onclick="setOperation('supprimer');">Supprimer</html:submit>
            </td>
          </tr>
        </table>
      </html:form>
    </body>
  </html>
</html:html>