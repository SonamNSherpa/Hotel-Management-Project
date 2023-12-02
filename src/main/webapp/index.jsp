<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page  import="com.namaste.model.Order" %>
        <%@ page  import="java.util.List" %>
          <%@ page  import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hotel Management Project</title>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Josefin+Sans:wght@400;500;700&display=swap" rel="stylesheet">
<link rel="stylesheet" href="index.css">
</head>
<body>

	<div class="foodSet">
		<div>
			<form action="chooseSet" class="form" method="get">
			<%
			if (request.getAttribute("insertRes") != null) {
			%>
			<span style="color: green; font-size: 20px"> <%=request.getAttribute("insertRes")%>
			</span>
			<%
			} else {
			%>
			<span style="color: red; font-size: 20px"> <%=request.getAttribute("insertRes")%>
			</span>
			<%
			}
			%>
			<div class="title">Breakfast Menu</div>
			<div class="title-menu">Starters</div>
			<div class="section">
				<div class="menu-options">
				<div>
					<div>1. Garlic Bread</div>
						<div>2. French Fries</div>
					</div>
					<div>
						<div>3. Muffins</div>
						<div>4. Cinnamon Rolls</div>
						</div>
				</div>
				<div>
						Choose One Starter from the above options <input class="number-box" 
						type="number" min="1" max="4" name="starter">
				</div>
			</div>

			<div class="title-menu">Main</div>
			<div class="section">
				<div class="menu-options">
					<div>
						<div>1. Egg and toast</div>
							<div>2. Omlette</div>
						</div>
					<div>
						<div>3. Pancakes</div>
						<div>4.French toast</div>
					</div>
				</div>
				<div>
					Choose One Main from the above options <input class="number-box"
					type="number" min="1" max="4" name="main">
				</div>
			</div>

			<div class="title-menu">Drinks</div>
			<div class="section">
				<div class="menu-options">
					<div>
						<div>1. Coffee</div>
						<div>2. Orange juice</div>
					</div>
	
					<div>
						<div>3. Pineapple Juice</div>
						<div>4.French toast</div>
					</div>
				</div>
				<div>
					Choose One Drink from the above options <input class="number-box"
					type="number" min="1" max="4" name="drink">
				</div>
				</div>
				<input type="submit" class="submit-button" value="Submit Breakfast"
					name="order">
			</form>
		</div>

		<div>
			<form action="chooseSet" class="form" method="get">
			<%
			if (request.getAttribute("insertRes") != null) {
			%>
			<span style="color: green; font-size: 20px"> <%=request.getAttribute("insertRes")%>
			</span>
			<%
			} else {
			%>
			<span style="color: red; font-size: 20px"> <%=request.getAttribute("insertRes")%>
			</span>
			<%
			}
			%>
			
			<div class="title">Lunch Menu</div>
			<div class="title-menu">Starters</div>
			<div class="section">
				<div class="menu-options">
					<div>
						<div>1. Samosa</div>
						<div>2. Samosa Chaat</div>
					</div>
					<div>
						<div>3. Chicken 65</div>
						<div>4. Pakora</div>
					</div>
				</div>
				<div>
					Choose One Starter from the above options <input
						class="number-box" type="number" min="1" max="4" name="starter">
				</div>
			</div>

			<div class="title-menu">Main</div>
				<div class="section">
					<div class="menu-options">
						<div>
							<div>1. Butter Chicken</div>
							<div>2. Tikka Masala</div>
						</div>
						<div>
							<div>3. Biryani</div>
							<div>4.Tandoori Chicken</div>
						</div>
					</div>
					<div>
						Choose One Main from the above options <input class="number-box"
							type="number" min="1" max="4" name="main">
					</div>
				</div>

			<div class="title-menu">Drinks</div>
			<div class="section">
				<div class="menu-options">
					<div>
						<div>1. Lassi</div>
						<div>2. Chai</div>
					</div>
					<div>
						<div>3. Beer</div>
						<div>4. Chaas</div>
					</div>
				</div>
				<div>
					Choose One Drink from the above options <input class="number-box"
							type="number" min="1" max="4" name="drink">
				</div>
			</div>
				<input type="submit" class="submit-button" value="Submit Lunch"
					name="order">
			</form>
		</div>
		<div class="readData">
			<form action="readOrder" method="get">
				<%
				if (request.getAttribute("orders") != null) {
					List<Order> orders = (List) request.getAttribute("orders");
				%>
				<table border="1" class="table">

				<tr>
					<th>Order Number</th>
					<th>Starter</th>
					<th>Main Dish</th>
					<th>Main Drink</th>
					<th>Price</th>
				</tr>

				<%
				for (Order order : orders) {
					%>
					<tr>
						<td><%=order.getOrderId()%></td>
						<td><%=order.getStarter()%></td>
						<td><%=order.getMainDish()%></td>
						<td><%=order.getDrink()%></td>
						<td><%=order.getPrice()%></td>
					</tr>
					<%
					}
					%>
				</table>
				<%
				}
				%>
				<input type="submit" value="Show Orders" class="submit-button">
			</form>
		</div>
	</div>




</body>
</html>