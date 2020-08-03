---
title: .NET
category: docker
authors: [ boban-bojkovski, valentina-cupac ]
---

## Step 1 - Containerization

Goal is to containerize a .NET application.

### Create project

Create a new .NET project by following instructions for [installing the Atomiv .NET Template](https://atomiv.org/templates/dotnet/get-started).
  
### View Dockerfile

The following is the Dockerfile which is created automatically after 


```text
FROM mcr.microsoft.com/dotnet/core/aspnet:3.1-nanoserver-1903 AS base
WORKDIR /app
EXPOSE 80
EXPOSE 443

FROM mcr.microsoft.com/dotnet/core/sdk:3.1-nanoserver-1903 AS build
WORKDIR /src/Web/MyWebShop.Web.RestApi
RUN dotnet restore "MyWebShop.Web.RestApi.csproj"
RUN dotnet build "MyWebShop.Web.RestApi.csproj" -c Release -o /app/build

FROM build AS publish
RUN dotnet publish "MyWebShop.Web.RestApi.csproj" -c Release -o /app/publish

FROM base AS final
WORKDIR /app
COPY --from=publish /app/publish .
ENTRYPOINT ["dotnet", "MyWebShop.Web.RestApi.dll"]

```

### Build Image
  
Some text.
  
### Run Container
  
Some text.

### Run Application
  
Some text.

### Stop Container
  
Some text.

### Delete Images

Some text.