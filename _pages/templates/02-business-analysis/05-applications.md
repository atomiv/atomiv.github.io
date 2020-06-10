---
layout: templates
title: Applications
permalink: /business-analysis/applications        
vversion: 2                
---


## {{page.permalink}} 


# Applications

## ACME Identity

ACME Identity is an Identity Server, a microservice which handles the identities for all ACME employees and ACME subsidaries. A general requirement is that all ACME applications are multi-tenant applications.

ACME Identity URL: https://identity.acme-estore.com

ACME has multiple subsidiaries including:

* ACME USA Inc.
* ACME Deutschland GmbH
* ACME Serbia d.o.o.

ACME Identity contains screens for:

* Registering employees
* Authenticating employees
* Handling forgotten passwords and password resets

ACME Identity uses the OpenID Connect mechanism, so that when other ACME applications connect to it they can use token-based authentication, so that security is centralized.

The data which is managed by ACME Identity is:

* Subsidaries: Name, Country
* Employees: First Name, Last Name, Phone, Email, Photo, Subsidiary, Roles

## ACME Backoffice

ACME Backoffice is an application used by backoffice employees within ACME globally. 

ACME Backoffice URL: https://backoffice.acme-estore.com

When a user logs in, ACME Backoffice enables them to do the following:

* Employees can login and can manage orders, customers and products. 
* Managers can view analytics regarding order sales.
* Administrators can configure subsidiaries.

ACME Backoffice is integrated with the following:

* ACME IdentityServer \(to authenticate employees\)
* ACME ERP which contains products, product inventory, warehouses, suppliers, etc.

### Login

ACME Backoffice checks whether the employee is already logged into ACME Identity. 

* If they are already logged in, then they can proceed.
* If they are not already logged in, then it redirects the employee to ACME Identity, and when authenticated, returns back to ACME Backoffice.

### Navigation Bar

The navigation bar is displayed on all screens for authenticated users.

On the left hand side::

* ACME logo
* Subsidiary name \(name of the subsidiary where the logged in employee is employed\)

On the right hand side:

* Orders
* Customers
* Products
* Analytics \(this is only available for employees who have the manager role\)
* Admin \(this is only available for employees who have the administrator role\)

### Order List Page

Employees can see an orders data table, with the following details:

* Order Number \(unique number identifying the order\)
* Order Date \(when the order was made\)
* Customer Name \(name of the customer who placed the order\)
* Customer Surname \(surname of the customer who placed the order\)
* Total Price \(total price for the order\)
* Order Status \(Placed, Packed, Shipped, Delivered, Cancelled, Delivery Failed\)
* Delivery Date \(the forecast delivery date if the order was not yet delivered\)

Additionally, there is a "New Order" button which is used when some customers don't create an order online but instead call ACME via the phone, so then orders are able to be placed on behalf of customers by ACME employees \(in this case the system marks the order as manually created by the specific employee\).

### Order Detail Page

When the employee selects an order they can click on "View" to open the order. It is possible for employees to manually edit the order on behalf of the customer \(in this case the system marks the order as manually edited by the specific employee\). Orders can be manually edited only before they are "Shipped".

Initially, when an order was confirmed by the customer on the ACME Online Store, its status is is "Placed". The employee can then click buttons "Packed" \(if the order was successfully packed\) or "Cancelled" \(if the customer called to cancel the order or if the order was not able to be fulfilled or any other reason\). Once then employee clicks on "Packed", then the next buttons that appear is "Shipped" \(when the order is loaded to the shipping company truck\) or "Cancelled". After the order is "Shipped", then the employee is not able to set status any further.

_From that point onwards, since ACME Backoffice is connected to ACME ERP, which is connected to shippers, ACME Backoffice synchronizes order statuses as follows: the ACME ERP gets statuses from the shipping company "Delivered" \(the order was delivered to the customer\) or "Delivery Failed" \(the order could not be delivered to the customer for some reason\)._

### Customer List Page

Employees can see the list of customers, as well as filter and search through customers.

### Customer Detail Page

When an employee selects a customer and clicks on "View", then the Customer Detail page appears.

Employees cannot change any details, they can only view customer details. They can also view the details associated with customers, such as their order history.

However, they can deactivate certain customers and reactivate previously deactivated customers. This can be used if for any reason they want to block purchases from certain customers.

### Category List Page

Employees can see the list of product categories. They can add additional categories. There is also a default category, called "Other", which represents unclassified products.

Categories are:

* Laptops
* Monitors
* PCs
* Phones
* Headphones
* Keyboards
* TVs

### Product List Page

Employees can see the list of products, as well as filter and search through products.

_Note: The list of products comes from ACME ERP, so ACME Backoffice synchronizes with ACME ERP to get the product listing._

### Product Detail Page

When an employee selects a product and clicks on "View", then the Product Detail page appears.

Employees can set product prices and they can also upload photos for the products. employees can also unlist and relist products, which will affect whether or not they are available to customers on the ACME Online Store. Employees can also set some products as "Featured" \(checkbox\). Employees can set the categories for the products, whereby a product can belong only to one category.

_Note: The default retail prices come from ACME ERP and the default category is "Other", but here they can be edited by employees, i.e. setting eStore prices which are different from the physical store prices._

## ACME eStore

### Navigation Bar

On the left hand side \(this is shown regardless of whether the customer is logged in\):

* ACME logo
* Title "ACME eStore"

On the right hand side \(this is shown if the customer is logged in\):

* My Orders \(enables customer to view their orders\)
* My Shopping Cart \(enables customer to view their shopping cart, there's also a number shown next to the shopping cart which indicates the number of products added, so that the customer can see whether the shopping cart is empty or not\)
* My Profile \(user can view/edit their personal details\)
* Log Out \(this signs out the customer\)

On the right hand side \(this is shown if the customer is not logged in\):

* Register \(to create a new account, for new customers\)
* Login \(to login, for existing customers\)

On the right hand side \(this is shown regardless of whether the customer is logged in\):

* Language switcher \(customer is able to switch the language, which affects translations, number formatting and date formatting\)

### Home Page

There's a left navigation bar, showing the categories:

* If the customer clicks on a category, then that causes filtering for the content pane \(i.e. for "Featured Products" and "All Products"\)

The content page has the following:

* Featured Products
* Shopping recommendations
* All Products

Featured Products:

* This section shows the set of products that are marked as featured
* There's a slider which has the following:
  * Previous button \(see previous featured product\)
  * Next button \(see next featured product\), also moving to the next product is automatically activated at certain time intervals
  * Pagination \(shown as circles, so that the customer can jump to a product\)
* Within each slide, we see the following:
  * Product Name \(large font\)
  * Product Price \(large font\)
  * Product Image \(large size\)
  * "Add to Cart" button \(large size\)

Shopping recommendations:

* This section shows the set of personalized products based on the customer's shopping history, products recently viewed, and location.
* Products are displayed in the same manner as the section Featured Products.

All Products:

* There's a filter:
  * Product Name \(autocomplete\)
  * Product Price \(range representing lower and upper price limits\)
  * Category Filter \(this is synchronized with the category selection on the left hand side\)
* There are sort by options:
  * Sort by name - this sorts by name in ascending order
  * Sort by cheapest - this sorts by cheapest products first
  * Sort by expensive - this sorts by expensive products first
  * Sort by popular - this sorts by products most frequently bought
* Products are displayed in a grid, there is also pagination and results per page
* For each product, we see:
  * Product Name
  * Product Price
  * Product Image
  * "Add to Cart" button 

### Product Detail Page

When the customer clicks on a product \(from "Featured Products" or "All Products"\), then they can see the product details which are as follows:

* Product Name
* Product Description
* Product Price
* Product Image
* "Add to Cart" button 

_Note: In the future, we will also additionally consider below this to have "Recommended Products" \(i.e. products which appeared frequently in the shopping cart with this product by other customers\)._

### Shopping Cart Page

When the customer clicks on the "Shopping Cart", they can see the products they've added to the cart.

Order:

* Shows the list of products selected:
  * Product Name
  * Product Price
  * Quantity
  * X \(to remove the Product\)
* Shows the aggregate calculations:
  * Subtotal \(based on the product prices and quanitites above, summed\)
  * Shipping \(the shipping cost based on the selected shipping option\)
  * Total \(subtotal + shipping\)

Shipping:

* Customer name
* Customer surname
* Customer email
* Customer phone
* Customer street address
* Customer street address 2 \(optional\)
* City
* Zip code
* Country \(autocomplete\)
* Shipping option:
  * Standard shipping \(free\)
  * Priority shipping \(has medium cost\)
  * One day shipping \(has highest cost\)

Finally, there is a "Confirm" button, which confirms the order.

_Note: In the future we may consider also payment options, e.g. credit cart / PayPal, e.g. PayPal developer, Visa developer, Mastercard test account, etc.\). May also consider discounts and country-specific additional charges, also discount coupons, promotions, etc._

### Orders Page

The customer is able to view their orders. The table has columns:

* Order Number \(unique number identifying the order\)
* Order Date \(when the order was made\)
* Customer Name \(name of the customer who placed the order\)
* Customer Surname \(surname of the customer who placed the order\)
* Total Price \(total price for the order\)
* Order Status \(Placed, Packed, Shipped, Delivered, Cancelled, Delivery Failed\)
* Delivery Date \(the forecast delivery date if the order was not yet delivered\)

### Order Detail Page

When the customer selects an order, they can view all the order details \(which is the same as the details that they had confirmed on the "Shopping Cart" page for an order.

Furthermore, they are able to "Cancel" an order \(if it wasn't "Shipped yet"\).

_Note: In the future, may consider requesting cancellation which could then be approved / rejected by employees._

