<!DOCTYPE html>
<html lang="br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro de Usuário</title>
    <link rel="stylesheet" type="text/css" href="cadastroCliente.css">
</head>
<body>
<form onsubmit="" method="post" action="">
    <h1>Cadastro do Cliente</h1>
    <label>Nome:* </label><input type="text" id="nome" name="nome" required>

    <label>Email:* </label><input type="email" id="email" name="email" required>

    <label>Telefone:* </label><input type="telefone" id="telefone" name="telefone" class="input-padrao" required
                                     placeholder="(DDD)00000-0000">

    <label for="endereco">Endereço:* </label><input type="text" id="endereco" name="endereco" required>

    <label>Ponto de Referência:</label><textarea name="message" cols="50"></textarea>

    <label for="Senha">Senha:* </label><input type="password" name="senha" id="senha ">

    <input type="submit" id="Cadastrar" value="Cadastrar-se">
</form>
</body>
</html>