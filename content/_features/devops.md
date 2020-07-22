---
title: title

---


<table>
  {% for row in site.data.backend.architecture %}
    {% if forloop.first %}
    <tr>
      {% for pair in row %}
        <th>{{ pair[0] }}</th>
      {% endfor %}
    </tr>
    {% endif %}

    {% tablerow pair in row %}
      {% if pair[1] == "y" %}
      <i class="fas fa-check"></i>
      {% elsif pair[1] == "n" %}
      <i class="far fa-clock"></i>
      {% else %}
      {{ pair[1] }}
      {% endif %}

    {% endtablerow %}
  {% endfor %}
</table>



<table>
  {% for row in site.data.backend.application %}
    {% if forloop.first %}
    <tr>
      {% for pair in row %}
        <th>{{ pair[0] }}</th>
      {% endfor %}
    </tr>
    {% endif %}

    {% tablerow pair in row %}
      {% if pair[1] == "y" %}
      <i class="fas fa-check"></i>
      {% elsif pair[1] == "n" %}
      <i class="far fa-clock"></i>
      {% else %}
      {{ pair[1] }}
      {% endif %}

    {% endtablerow %}
  {% endfor %}
</table>


<table>
  {% for row in site.data.backend.domain %}
    {% if forloop.first %}
    <tr>
      {% for pair in row %}
        <th>{{ pair[0] }}</th>
      {% endfor %}
    </tr>
    {% endif %}

    {% tablerow pair in row %}
      {% if pair[1] == "y" %}
      <i class="fas fa-check"></i>
      {% elsif pair[1] == "n" %}
      <i class="far fa-clock"></i>
      {% else %}
      {{ pair[1] }}
      {% endif %}

    {% endtablerow %}
  {% endfor %}
</table>

<table>
  {% for row in site.data.backend.common %}
    {% if forloop.first %}
    <tr>
      {% for pair in row %}
        <th>{{ pair[0] }}</th>
      {% endfor %}
    </tr>
    {% endif %}

    {% tablerow pair in row %}
      {% if pair[1] == "y" %}
      <i class="fas fa-check"></i>
      {% elsif pair[1] == "n" %}
      <i class="far fa-clock"></i>
      {% else %}
      {{ pair[1] }}
      {% endif %}

    {% endtablerow %}
  {% endfor %}
</table>