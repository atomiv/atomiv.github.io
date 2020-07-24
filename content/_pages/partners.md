---
layout: page
# drive
title: Services that drive IT
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
                    <div class="d-md-flex align-items-center2">
                        <div>
                            <!-- TO DO VC increment version number when changing image -->
                            <img height="100" width="100" src="{{ site.url }}/img/about/team/{{ partner.photo }}?v=4" alt="{{partner.name}}"
                            class="img-fluid w-100 profile-serv-img">
                        </div>
                        <div>
                            <div class="d-flex justify-content-between">
                                <!-- logo -->
                                <img height="" width="" src="{{ site.url }}/img/partners/{{ partner.company_logo }}?v=4"
                                alt="{{partner.name}}" class="serv-logo">
                                <!-- social media -->
                                <div class="d-flex align-items-center">
                                    <a href="{{ partner.linkedin }}" target="_blank" >
                                        <i class="fab fa-linkedin" style="vertical-align: middle;"></i>
                                    </a>
                                    <a href="{{ partner.company_website }}" target="_blank">
                                        <img height="24" width="" src="{{ site.url }}/img/partners/{{ partner.company_logo_thumb }}?v=4" alt="{{partner.company_name}}" class=""><span class="logo-sm-name" >{{partner.company_name}}</span>
                                    </a>
                                </div>
                            </div>
                            <h5>{{ partner.name }} </h5>
                            <h6>{{ partner.position }}</h6>
                            <p>{{ partner.content | markdownify }}</p>



                        </div>
                    </div>
                </div>
            </div>
            {% endif %}            
            {% endfor %}
        {% endfor %}
    </div>
</article>


<!-- <i class="fa fa-globe"></i> -->