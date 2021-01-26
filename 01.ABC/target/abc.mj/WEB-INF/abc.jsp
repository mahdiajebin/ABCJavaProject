
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>    
    <title>ABC-Counter[Dynamic]</title>
    <link rel="stylesheet" href="format.css"></link>
</head>
<body> 

  <div class="divBody">
    <h1>ABC Counter [Dynamic]</h1>  
    
    <form action="abc">
    	<label> Display Mode :</label>
    	<select name= "displaymode" id ="displaymode">
    	<option value ="abc" selected="selected" >All </option>
    	<option value ="vow"> Vowels</option>
    	<option value ="con" > Consonant</option>
    	</select>
    	
    	<input type="submit" value="build abc"> </input>
    
    </form>  
    
    <hr />    
    <c:forEach items="${abc}" var="row">
    
    	
	   		<div class='divScenario ${row.highlight}'>
	             <span class="uletter">${row.upperCase }</span>
	             <span class="number">${row.number}</span>
	             <span class="lletter">${row.lowerCase }</span>
	       </div>
       
	   	</c:forEach>
	   	<br/>
	   	author is :${author}
	   	
  </div>        
</body>
<script type="text/javascript">

document.getElementById("displaymode").value='${displaymode}';

</script>

</html>