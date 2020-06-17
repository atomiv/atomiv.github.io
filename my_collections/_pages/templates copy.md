---
layout: templates-layout
title: Templates
description: Templates
vversion2: 30
# permalink: /templates/
---

hello

templates.md


--------------------------

------------------------------
<!-- sort: "category" -->
<!-- | sort: "name" -->
<!--  filtering.. assign newcars = site.my_collection | where: "category", "new"

---
category: 'new'
abbrev: vet
---
corvette content

 -->
<!-- sorting... ssign allcarssorted = site.my_collection | sort: "category" -->


<!-- This groups your cars and then sort groups by name that is the category. -->
<!-- group_by: "category" | sort: "name" -->
<div class="container">
{% assign groups = site.templates | group_by: "category" %}

{% for group in groups %}
<!-- li><a href="{{course.url}}">{{course.title}}</a></li -->
    <p>{{ group.name}}</p>
        {% for item in group.items %}
        <p>{{ item.abbrev }}</p>
        {% endfor %}
{% endfor %}
</div>

----------------------

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
        <p>{{ item.abbrev }}</p>
        {% endfor %}
{% endfor %}
</div>




<!-- ----------------------------------------------- -->


				<ul class="list-unstyled components">

				{% assign categories = site.templates | group_by: "category" %}
				
				{% for category in site.templates-categories %}
    				{% assign current-category = categories | where: 'name', category | first %}
    				{% assign category-templates = current-category.items %}


					<li>
						<!-- href="#{{ item.href }}" -->
						<a class="{% if category == page.category %}active44{% endif %}"
						href="{{ item.suburl }}" data-toggle="collapse" aria-expanded="false">
							{{ category }}
						</a>

						{% for item in category-templates %}
						<ul class="collapse list-unstyled
						{% if item.vversion4 == page.vversion4 %}show{% endif %}
						" id="{{ item.url }}">

							<li class="{% if item.url == page.url %}active{% endif %}">
								<!-- a href="{{ site.baseurl }}{{ item.url }} -->
								<a href="{{ item.url }}">
									{{ item.title }}
								</a>
							</li>
						</ul>
						{% endfor %}
					</li>
					
				{% endfor %}										
				</ul>