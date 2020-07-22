{% for item in site.data.framework.docs %}


	{% assign current_index = forloop.index0 %}
	{% assign next_index = current_index | plus: 1 %}
	{% assign prev_index = current_index | minus: 1 %}


	{% if item.url == page.category %}

		URL: {{ item.url }} <br/>
		PREV_CAT: {{ site.data.framework.docs[prev_index].url }} <br/>
		NEXT_CAT: {{ site.data.framework.docs[next_index].url }} <br/>

	{% for entry in item.submenuitems %}

	{% assign current_index2 = forloop.index0 %}
	{% assign next_index2 = current_index2 | plus: 1 %}
	{% assign prev_index2 = current_index2 | minus: 1 %}

		{% if entry.url == page.url %}
			CURRENT PAGE: {{ entry.title }} <br/>
			{{ entry.url }} <br><br />
			PREV_PP: {{ item.submenuitems[prev_index2].url }} <br/><br/>
			NEXT_PP: {{ item.submenuitems[next_index2].url }} <br/><br/>
		{% endif %}

	{% endfor %}
	{% endif %}
{% endfor %}

--------------------------

{% for item in site.data.framework.docs %}

	{% if item.url == page.category %}

	{% for entry in item.submenuitems %}

	{% assign current_index = forloop.index0 %}
	{% assign next_index = current_index | plus: 1 %}
	{% assign prev_index = current_index | minus: 1 %}

		{% if entry.url == page.url %}
			CURRENT PAGE: {{ entry.title }} <br/>
			{{ entry.url }} <br><br />
			{% unless forloop.first %}
				PREV_PP: {{ item.submenuitems[prev_index].url }} <br/><br/>
			{% endunless %}
			{% unless forloop.last %}
				NEXT_PP: {{ item.submenuitems[next_index].url }} <br/><br/>
			{% endunless %}
		{% endif %}

	{% endfor %}
	{% endif %}
{% endfor %}

----------------------------
{% if index_length > current_index and entry.url == page.url %}


							{% assign index_length = forloop.length | minus: 1 %}

							{{ index_length }} <br/>
							{{ current_index }}