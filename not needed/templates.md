---
# layout: templates-layout
# layout: sidebar-template
title: Templates
description: Templates
---

hello

templates.md



<div class="container">
{% assign categories = site.templates | group_by: "category" %}

{% for category in site.templates-categories %}
    {% assign current-category = categories | where: 'name', category | first %}
    {% assign category-templates = current-category.items %}
    <p>{{ category }}</p>
        {% for item in category-templates %}
        <!-- li class="collapsed" -->
        <!-- item.title -->
        <!-- a href="{{ site.baseurl }}{{ item.url }} -->
        <p>{{ item.title }}</p>
        {% endfor %}
{% endfor %}
</div>


<!-- ---------------------- -->
