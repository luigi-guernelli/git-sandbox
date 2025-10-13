<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="it">
<head>
    <meta charset="UTF-8">
    <title>Registrazione Utente</title>
    <link rel="stylesheet" href="css/stile.css"> <!-- collegamento al tuo CSS -->
</head>
<body>

    <h2>Registrazione</h2>

    <form action="register" method="post">
        <label for="username">Nome utente:</label><br>
        <input type="text" id="username" name="username" required><br><br>

        <label for="email">Email:</label><br>
        <input type="email" id="email" name="email" required><br><br>

        <label for="password">Password:</label><br>
        <input type="password" id="password" name="password" required><br><br>

        <input type="submit" value="Registrati">
    </form>

    <p>Hai già un account? <a href="login.jsp">Effettua il login</a></p>

</body>
</html>
