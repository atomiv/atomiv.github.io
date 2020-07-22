---
title: Other
---

{{ site.data.data[0].name }}
{{ site.data.data[0].description }}

{% include architecture.csv %}

----------------------------------

{% for item in site.data.samplelist.toc %}
<h3>{{item.title}}</h3>
<ul>
{% for entry in item.subfolderitems %}
<li>{{entry.title}}</li>
{% endfor %}
</ul>
{% endfor %}

--------------------------------

<a href="/">apple</a>

--------------------------------
BBELOW IS CODE FROM A PLUGIN

<table>
  <thead>
    <tr>
    {% for header in site.data.example.keys %}
      <td>{{header}}</td>
    {% endfor %}
    </tr>
  </thead>
  <tbody>
    {% for row in site.data.example.content %}
    <tr>
    {% for column in row %}
      <td>{{column}}</td>
    {% endfor %}
    </tr>
    {% endfor %}
  </tbody>
</table>

-----------------------
{% for row in site.data.example.content_hash %}
<tr>
  <td>{{row.h1}}</td>
  <td>{{row.h3}}</td>
</tr>
{% endfor %}