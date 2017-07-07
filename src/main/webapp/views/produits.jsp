<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="s" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<!DOCTYPE html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Produits</title>
<link  rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<SCRIPT language="javascript" type="text/javascript">
      function setOperation(action,id){
    	  var form = document.createElement("form");
    	   form.method = "POST";
    	   form.action = "/strutsApp/produits.do";
    	   var element1 = document.createElement("INPUT");         
    	    element1.name="operation"
    	    element1.value = action;
    	    element1.type = 'hidden';
    	    form.appendChild(element1);
    	    var reference = document.createElement("INPUT");         
    	    reference.name="reference"
    	    reference.value = id;
    	    reference.type = 'text';
    	    form.appendChild(reference);
    	    document.body.appendChild(form);
    	  // form.operation.value=action
    	  // form.id.value=id
    	  
    form.submit();
       // document.forms[2].operation.value=valeur;
      }
      
      function setOperation1(valeur){
          document.forms[1].operation.value=valeur;
        }
    </SCRIPT>
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
				<th>REF</th><th>DES</th><th>PRIX</th><th>QTE</th><th>PROMO</th><th>SUPP</th><th>UPD</th>
			</tr>
			<logic:iterate id="monProduit" name="produitForms" scope="session">
				<tr>
					<td><bean:write name="monProduit" property="reference"/></td>
					<td><bean:write name="monProduit" property="designation"/></td>
					<td><bean:write name="monProduit" property="prix"/></td>
					<td><bean:write name="monProduit" property="quantite"/></td>
					<td><bean:write name="monProduit" property="promo"/></td>
					<td><button  class="btn btn-danger" onclick="setOperation('supprimer','<bean:write name="monProduit" property="reference"/>');">Supprimer</button>
					</td>
					<td><button class="btn btn-success" onclick="setOperation('modifier','<bean:write name="monProduit" property="reference"/>');">Modifier</button>
					</td>
					
				</tr>
	  				<p></p>
			</logic:iterate>
		</table>
	</div>
	<div>
	 
		<s:form action="operations.do" focusIndex="reference">
        <s:hidden property="operation" value="aucune"/>  
        
        <table>
          <tr>
            <td>
              <bean:message key="app.saisirproduit.libelle.reference"/>:
            </td>
            <td>
              <s:text property="reference"/>
            </td>
          </tr>
          <tr>
            <td colspan="2" align="center">
              <s:submit property="submit" styleClass="btn btn-default" onclick="setOperation1('ajouter');" value="ajouter"/>
              <s:submit property="submit" styleClass="btn btn-default" onclick="setOperation1('modifier');" value="aodifier"/>
              <s:submit property="submit" styleClass="btn btn-default" onclick="setOperation1('supprimer');" value="supprimer"/>
              
            </td>
          </tr>
        </table>
      </s:form>
	</div>
	</div>
	
	</div>
</body>
</html>