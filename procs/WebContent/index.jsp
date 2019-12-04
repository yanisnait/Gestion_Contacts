<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import =  "dao.DAOContact"
    import = "domain.Contact"
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> PROCS</title>
</head>
<body>

<h1> Projet PROCS </h1>
	<form method="post" action="inscription"> <!--  action doit etre indiquer dans le web xml  et config route -->
      <fieldset>
          <legend>Inscription</legend>
          <p>Vous pouvez vous inscrire via ce formulaire.</p>

          <label for="lastname"> Nom <span class="requis">*</span></label>
          <input type="text" id="lastname" name="LASTNAME" value="" size="20" maxlength="60" />
          <br />
          
          <label for="firstname"> Prenom <span class="requis">*</span></label>
          <input type="text" id="firstname" name="FIRSTNAME" value="" size="20" maxlength="60" />
          <br />

          <label for="email">Email <span class="requis">*</span></label>
          <input type="text" id="email" name="EMAIL" value="" size="20" maxlength="20" />
          <br />

          <label for="phones"> Télephone <span class="requis">*</span></label>
          <input type="text" id="phones" name="PHONES" value="" size="20" maxlength="20" />
          <br />

          <label for="adresse">Adresse</label>
          <input type="text" id="address" name="ADDRESS" value="" size="20" maxlength="20" />
          <br />

          <input type="submit" value="Inscription" class="sansLabel" />
          <br />
      </fieldset>
	</form>
</body>
</html>