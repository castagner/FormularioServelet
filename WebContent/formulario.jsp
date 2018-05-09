<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro formulario</title>
</head>
<body>
<form action="ServFormulario" method="post">

    <input type ="radio" name="options" id="option1" autocomplete="off" checked> Fisica
    <input type="radio" name="options" id="option2" autocomplete="off" checked> Juridica <br>

CPF / CNPJ: <input type="text" name="cnpjCpf"/> <br>
Nome:<input type="text" name="nome"/> <br>
Data Nasc.:<input type="text" name="dataNasc"/> <br>
Endereço:<input type="text" name="end"/> <br>
Complemento: <input type="text" name="comp"/> <br>
Cidade: <input type="text" name="cidade"/> <br>
Estado
<select class="form-control" id="estado">
      <option>AM</option>
      <option>BA</option>
      <option>CE</option>
      <option>SP</option>
      <option>RJ</option>
    </select> <br>
CEP:<input type="text" name="cep"/> <br>
E-mail: <input type="text" name="email"/> <br>
        <font color="red"> <center>Não indique e-mail que possua bloqueio para mensagens automaticas (anti-SPAM) </center></font> <br>
Confirme o e-mail: <input type="text" name ="confEmail"/> <br>
Senha: <input type="text" name="senha"/> 
 
    <br> <input type="submit" value="Salvar">
</form>
</body>
</html>