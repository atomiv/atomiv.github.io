---
title: Presentation
category: architecture
authors: [ valentina-cupac]
---

The Test Layer contains all the tests - unit tests, integration tests, e2e system tests, for testing the layers mentioned above.

The Test Layer contains all the automated tests - Unit tests, Integration tests and System tests. Testing the Domain Layer is done exclusively through unit tests, because the Domain Layer contains exclusively business logic, and any interfaces to external systems are mocked. Testing the Application Layer is also able to be done via unit tests, to test the application logic. Furthermore, Integration tests can be made for the entire Core Layer, and System tests for the Web Layer.

* **Unit Tests** for testing units: CustomerUnitTest, OrderUnitTest, ProductUnitTest
* **Integration Tests** for testing components / groups of components: CreateCustomerCommandTest, CreateOrderCommandTest, ViewCustomerQueryTest
* **System Tests** for testing the entire system \(backend and frontend\): This is covered within the Quality Assurance section \(Automated Testing\)