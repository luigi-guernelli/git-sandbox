<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="it">
<head>
    <meta charset="UTF-8">
    <title>Login Utente</title>
    <link rel="stylesheet" href="css/stile.css"> <!-- Collegamento al tuo CSS personalizzato -->
</head>
<body>

    <h2>Login</h2>

    <form action="login" method="post">
        <label for="email">Email:</label><br>
        <input type="email" id="email" name="email" required><br><br>

        <label for="password">Password:</label><br>
        <input type="password" id="password" name="password" required><br><br>

        <input type="submit" value="Accedi">
    </form>

    <p>Non hai un account? <a href="register.jsp">Registrati qui</a></p>

</body>
</html>
