<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>CEP Finder</title>
</head>
<body>
<h1><%= "CEP Finder" %>
</h1>
<br/>
<form action="EnderecoController" method="post">
    CEP :
    <input type="text" name="cep"/>
    <button type="submit">Buscar</button>
</form>
<h3 style="color: red">${erro}</h3>
<h3 style="color: blue">${endereco.cep}</h3>
<h3 style="color: blue">${endereco.logradouro}</h3>
<h3 style="color: blue">${endereco.bairro}</h3>
<h3 style="color: blue">${endereco.uf}</h3>
</body>
</html>