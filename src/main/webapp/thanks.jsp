<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" type="text/css" href="style/thank.css">
</head>

<body>
    <section id="left">
        <h1>Thank you for joining our survey!</h1>

        <p>Here is the information you provided:</p>

        <label id="user_label">Email:</label>
        <span id="user_span">${user.email}</span><br>
        <label id="user_label">First Name:</label>
        <span id="user_span">${user.firstName}</span><br>
        <label id="user_label">Last Name:</label>
        <span id="user_span">${user.lastName}</span><br>
        <label id="user_label">Date of Birth:</label>
        <span id="user_span">${user.dateOfBirth}</span><br>

        <br>

        <label>How did you hear about us?</label><br>
        <span>${survey.method}</span><br>
        <label>Would you like to receive announcements about news CDs and special offers?</label><br>
        <div class="survey-option">${survey.firstYes}</div>
        <div class="survey-option">${survey.secondYes}</div>
        <label>Please contact me by:</label><br>
        <span>${survey.contact}</span><br>

        <p>To enter another survey, click on the Back button
            in your browser or the Refresh button shown below.</p>

        <form action="survey" method="get">
            <input type="hidden" name="action" value="join">
            <input type="submit" value="Return">
        </form>
    </section>
    
    <section id="right">
        <img src="image/thankyou.jpg" alt="thankyou">
    </section>

</body>
</html>