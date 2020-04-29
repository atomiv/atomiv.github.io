---
layout: page
title: Blog
description: Our Insights – Knowledgebase
---

{% for post in site.posts reversed %}
<h3><a href="{{ site.url }}{{ post.url }}">{{ post.title }}</a></h3>
{% assign author = site.data.authors[post.author] %}

  <div class="date">
    Written by <a href="{{ author.web }}" target="_blank">{{ author.name }}</a> on {{ post.created | date: "%B %e, %Y" }}, last modified {{ post.modified | date: "%B %e, %Y" }}
  </div>
  
<hr/>
{{ post.excerpt }}
{% endfor %}