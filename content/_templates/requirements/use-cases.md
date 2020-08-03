---
title: Use Cases
category: requirements
authors: [ valentina-cupac ]
---


## Data Access

There are many Businesses which have Business accounts on ACME Corporation. Each Business can only access the customers and orders which are related to them \(data privacy\).

## Business Use Cases

### Administrators

Commands:

* Register a subsidary
* Edit the list of employees within a subsidiary
* Deactivate employees within a subsidiary

Queries:

* View all list of all employees within a subsidiary
* Deactivate a subsidiary

### Procurement Managers

Commands:

* Add products in the product catalog
* Edit products in the product catalog
* Unlist products in the product catalog \(i.e. products which are no longer sold\)
* Relist products in the product catalog \(i.e. these products become active again\)
* Select list of possible suppliers for products
* Specify default \(preferred\) supplier for each product

Queries:

* Browse products in the product catalog 
* View products in the product catalog

### Pricing Managers

Commands:

* Set the retail price for each product
* Set promotional discounts for all or some products

Queries:

* Browse products in the product catalog 
* View products in the product catalog

## Sales Use Cases

### Customers

Commands:

* Register Customer account
* Browse products in the Product Catalog
* Add products to the Shopping Cart
* Remove products from the Shopping Cart
* Submit Order based on products in the Shopping Cart
* Make online payments for Orders
* Create draft orders
* Edit the draft orders they had created
* Submit the draft orders
* Archive shipped orders

Queries:

* Filter and search for their orders - including filtering by order status and dates \(order submission date and order delivery date\)
* View their own orders

### Warehouse Employees

Commands:

* Pack an Order
* Ship an Order

Queries:

* Browse Orders
* View Orders

## Purchasing Use Cases

### System

Commands:

* Automatically create Purchases Orders when stock falls below certain minimum
* Automatically send invoices \(on behalf of the Suppliers\) for shipped Purchase Orders
* Automatically pay \(on behalf of the Business\) for Invoices received from Suppliers based on payment terms

Queries:

* Check daily inventory levels and whether its within the minimum stock requirements level

### Suppliers

Commands:

* Register Supplier account
* Approve Purchase Orders
* Reject Purchase Orders
* Ship Purchase Orders
* Send invoices for Purchase Orders



