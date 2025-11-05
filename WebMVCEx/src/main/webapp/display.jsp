<!-- File: display.jsp -->
<html>
<head>
    <title>Employee Table</title>
    <style>
        table {
            border-collapse: collapse;
            width: 50%;
            margin: 20px auto;
            font-family: Arial, sans-serif;
        }
        th, td {
            border: 1px solid #ccc;
            padding: 12px;
            text-align: left;
        }
        th {
            background-color: #4CAF50;
            color: white;
        }
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
        .back-link {
            text-align: center;
            margin-top: 20px;
        }
    </style>
</head>
<body>

<h2 style="text-align:center;">Employee Details</h2>

<table>
    <tr>
        <th>Field</th>
        <th>Value</th>
    </tr>

    <%
        // Get Employee object from request
        com.example.Employee emp = (com.example.Employee) request.getAttribute("emp");

        // Print each field in a table row
        out.println("<tr><td><strong>No</strong></td><td>" + emp.getNo() + "</td></tr>");
        out.println("<tr><td><strong>Name</strong></td><td>" + emp.getName() + "</td></tr>");
        out.println("<tr><td><strong>Email</strong></td><td>" + emp.getEmail() + "</td></tr>");
    %>
</table>



</body>
</html>