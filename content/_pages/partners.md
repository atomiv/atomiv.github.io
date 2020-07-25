---
layout: page
# drive
title: Partners
description: Services
figure-class: figure-features3
image-class: 
# image: /img/features/feat0.svg
image: /img/features/services9.svg
alt: services
---



<article class="ov-services">
    <div class="container">
        {% for sitepartner in site.data.partners.docs %}
            {% for partner in site.partners %}
            {% if sitepartner.name == partner.name %}
            <div class="row ov-services-row"> 
                <div class="col-12">
                    <div class="d-md-flex justify-content-between">
                        <!-- logo -->
                        <div class="order-1">
                            <img height="" width="" src="{{ site.url }}/img/partners/{{ partner.company_logo }}?v=4"
                            alt="{{partner.company_name}}" class="serv-logo">
                        </div>
                        <div class="order-0">
                            <h5>{{ partner.name }} </h5>
                            <h6>{{ partner.position }}</h6>
                        </div>                        
                    </div>
                    {{ partner.content | markdownify }}
                </div>
            </div>
            <hr>
            {% endif %}            
            {% endfor %}
        {% endfor %}
    </div>
</article>


<!-- <i class="fa fa-globe"></i> -->
