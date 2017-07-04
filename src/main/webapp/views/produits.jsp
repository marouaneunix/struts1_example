<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="s" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<!DOCTYPE html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Produits</title>
<link  rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
</head>
<body>
	<div class="container">
	<div class="row">
		<div class="col-md-4">
		<s:form action="produits">
			<div class="form-group">
	    		<label for="reference">Reference</label>
	    		<s:text styleClass="form-control" property="reference" />
	  		</div>
	  		<div class="form-group">
	    		<label for="designation">Designation</label>
	    		<s:text styleClass="form-control" property="designation" />
	  		</div>
	  		<div class="form-group">
	    		<label for="prix">Prix</label>
	    		<s:text styleClass="form-control" property="prix" />
	  		</div>
	  		<div class="form-group">
	    		<label for="quantite">Quantite</label>
	    		<s:text styleClass="form-control" property="quantite" />
	  		</div>
	  		<div class="checkbox">
			    <label>
			    <s:checkbox property="promo" /> Check me out
			    </label>
  			</div>
			<s:submit property="submit" styleClass="btn btn-default" value="Save"/>
		</s:form>
		</div>
		<div class="col-md-8">
	
		<table class="table table-bordered">
			<tr>
				<th>REF</th><th>DES</th><th>PRIX</th><th>QTE</th><th>PROMO</th>
			</tr>
			<logic:iterate id="monProduit" name="produitForms" scope="session">
				<tr>
					<td><bean:write name="monProduit" property="reference"/></td>
					<td><bean:write name="monProduit" property="designation"/></td>
					<td><bean:write name="monProduit" property="prix"/></td>
					<td><bean:write name="monProduit" property="quantite"/></td>
					<td><bean:write name="monProduit" property="promo"/></td>
				</tr>
	  				<p></p>
			</logic:iterate>
		</table>
	</div>
	</div>
	
	</div>
</body>
</html>