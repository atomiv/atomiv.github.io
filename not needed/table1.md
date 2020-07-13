{% comment %}
assign row = site.data.authors[0]
{% endcomment %}

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

-----------------------------------

----------------------------------------------------

{% for item in site.data.samplelist.toc %}
<h3>{{item.title}}</h3>
<ul>
{% for entry in item.subfolderitems %}
<li>{{entry.page}}</li>
{% endfor %}
</ul>
{% endfor %}




| Priority apples | Second priority | Third priority |
|-------|--------|---------|
| ambrosia | gala | red delicious |
| pink lady | jazz | macintosh |
| honeycrisp | granny smith | fuji |




<table class="" style="width: 100%">
    <colgroup>
        <col width="30%" />
        <col width="70%" />
    </colgroup>
    <thead>
        <tr class="header">
            <th>Field</th>
            <th>Description</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td markdown="span">First column **fields**</td>
            <td markdown="span">Some descriptive text. This is a markdown link to [Google](http://google.com). Or see [some link][mydoc_tags].</td>
        </tr>
        <tr>
            <td markdown="span">Second column **fields**</td>
            <td markdown="span">Some more descriptive text.
            </td>
        </tr>
    </tbody>
</table>


------------------

<table>
  {% for row in site.data.authors2 %}
    {% if forloop.first %}
    <tr>
      {% for pair in row %}
        <th>{{ pair[0] }}</th>
      {% endfor %}
    </tr>
    {% endif %}

    {% tablerow pair in row %}
      {{ pair[1] }}
    {% endtablerow %}
  {% endfor %}
</table>

