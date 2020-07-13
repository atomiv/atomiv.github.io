---
title: title

exercises: [Burpees, Squats, Pull ups, Push ups]
reps: [50, 40, 30, 20, 10]




displayCol: [1,2,4]
---

{% comment %}
title: Frontend

Frontend... Angular, React, Vue
{% endcomment %}


<table class="responsive-table table">
  <thead>
    <tr>
      <th scope="col">Round</th>
      {% for exercise in page.exercises %}
      <th scope="col">{{ exercise }}</th>
      {% endfor %}
    </tr>
  </thead>
  <tbody>
    {% assign total = 0 %}
    {% for rep in page.reps %}
    {% assign total = total | plus: rep %}
    <tr>
      <th scope="row">Round {{ forloop.index }}</th>
      {% for exercise in page.exercises %}
      <td data-title="{{ exercise }}"> {{ rep }} </td>
      {% endfor %}
    </tr>
    {% endfor %}
  </tbody>
  <tfoot>
    <tr>
      <th scope="row">Sum</th>
      {% for exercise in page.exercises %}
        <td>{{ total }}</td>
      {% endfor %}
    </tr>
  </tfoot>
</table>





|Title  |Link  |
|---|---|
{% for my_post in site.posts -%}
{% if my_post.title -%}
|{{ my_post.title }}  |[Click Here]({{ my_post.url }})  |
{% endif %}
{%- endfor -%}





{% assign equipment = site.data.equipment %}

<table>
{% for item in equipment %}
  {% if forloop.first == true %}
    <tr>
    {% for field in item %}
      {% if page.displayCol contains forloop.index %}
      <th>{{ field[0] }}</th>
      {% endif %}
    {% endfor %}
    </tr>
  {% endif %}

  <tr>
  {% for field in item %}
    {% if page.displayCol contains forloop.index %}
    <td>{{ field[1] }}</td>
    {% endif %}
  {% endfor %}
  </tr>

{% endfor %}
</table>



{% assign equipment = site.data.equipment %}
{% comment %}Here is the setup for displayed columns{% endcomment %}
{% assign displayCol = "1,2,4" | split: "," %}

<table>
{% for item in equipment %}
  {% if forloop.first == true %}
    <tr>
    {% for field in item %}
      {% assign indexToStr = forloop.index | append: "" %}
      {% if displayCol contains indexToStr %}
      <th>{{ field[0] }}</th>
      {% endif %}
    {% endfor %}
    </tr>
  {% endif %}

  <tr>
  {% for field in item %}
    {% assign indexToStr = forloop.index | append: "" %}
    {% if displayCol contains indexToStr %}
    <td>{{ field[1] }}</td>
    {% endif %}
  {% endfor %}
  </tr>

{% endfor %}
</table>