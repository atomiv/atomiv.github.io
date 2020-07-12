---
title: Backend
---

<!-- <h2>Technical Features</h2> -->


  {% for backend_hash in site.data.backend %}
  {% assign backend = backend_hash[1] %}
<div clas="table-responsive">
    <table class="table">
    <colgroup>
        <col width="80%" />
        <col width="10%" />
        <col width="10%" />
    </colgroup>
        {% for row in backend %}
        {% if forloop.first %}
        <thread>
            <tr>
                {% for pair in row %}
                <th>{{ pair[0] }}</th>
                {% endfor %}
            </tr>
        </thread>
        {% endif %}
        <tbody>
            {% tablerow pair in row %}
                {% if pair[1] == "y" %}
                <i class="fas fa-check"></i>
                {% elsif pair[1] == "p" %}
                <i class="far fa-clock"></i>
                {% elsif pair[1] == "n" %}
                <i class="far fa-clock"></i>
                {% else %}
                {{ pair[1] }}
                {% endif %}
            {% endtablerow %}
        </tbody>
        {% endfor %}
    </table>
</div>
  {% endfor %}
