---
title: Setup
category: dotnet
authors: [ valentina-cupac, milan-vidakovic ]
---

## SQL Server Configuration

### SQL Server Configuration Manager

1. In the Windows Start Menu, search for "SQLServerManager14.msc" (this is the SQL Server Configuration Manager for SQL Server 2017).
2. Inside the tree "SQL Server Configuration Manager (Local)", select "SQL Server Network Configuration", then select "Protocols for MSSQLSERVER" (note: instead of MSSQLSERVER, you might see a different name depending on the name used when installing SQL Server)
3. Ensure that "TCP/IP" and "Named Pipes" are "Enabled" (if they are not, then right-hand click and select "Enable")
4. Right-hand click on "TCP/IP", select "Properties", then go to the "IP Addresses" tab, scroll to the bottom to see "IPAll" and check that "TCP Port" is 1433 (this is the standard port, but if it's another port, then take note of the port since this is relevant for connnection strings)
5. After you've saved all these changes, you can exit SQL Server Configuration Manager (restarting SQL Server will be done below, via SQL Server Management Studio).

### SQL Server Management Studio

1. Run "SQL Server Management Studio 17" from the Windows Start Menu.
2. Connect to the server (localhost).
3. Right-hand click on the server, and click on "Properties".
4. Click on the "Security" tab and for "Server authentication", ensure that "SQL Server and Windows Authentication mode" is selected.
5. Click on the "Connections" tab and ensure that "Allow remote connections to this server" is selected.
6. Exit Properties.
7. Go to "Security" folder, then "Logins" folder and ensure that "sa" is enabled (if not, enable it).
8. Right-hand click on "sa" and select "Properties", on the "General" tab you can set the Password if you have forgotten it. Alternatively, you can exit the properties and create another user if not using sa (which is what's recommended for production for security reasons to create an application-specific user and assign permissions for the database). This is important for the connection string. Exit these properties.
9. Right-hand click on the server and click on "Restart". This will apply any changes which were done in "SQL Server Configuration Manager" and "SQL Server Management Studio" in the steps above. 

### Firewall Configuration

1. Run "Windows Defender Firewall with Advanced Security" from the Windows Start Menu.
2. Click on "Inbound Rules" > "New Rule".
3. Select type "Port", and click on Next.
4. Select "TCP and for "Specific local ports" write 1433 (or if you had another port above, then write that port), then "Next".
5. Select "Allow the connection", then "Next" and "Next".
6. In the "Name" textbox, you can write something descriptive like: SQL Server Port (1433)

### IP Config

1. Run "cmd"
2. Type in the command: ipcofig
3. See the Ethernet Adapter IPv4 Address. (This is relevant for the SQL Connection string)

### Connection Parameters

1. The result from "IP Config" (e.g. 192.168.56.1) will be used as the Host for the connection string.
2. The port that was set in "SQL Server Configuration Manager" (generally 1433) will be used as the Port for the connection string.
3. The username and password (e.g. for sa user or another specially created user) will be used as credentials for the connection string.