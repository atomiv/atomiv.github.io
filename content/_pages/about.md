---
# layout: page
layout: page
title: Meet our authors
description: Atomiv is an all-in-one template to help IT teams build high quality software faster. It is built specifically for enterprise software development needs, covering project management, architecture and development. Atomiv is rooted in best practices in enterprise architecture, providing a standardized software solution template. This provides your software teams with a clean architecture foundation, so that they can quickly and easily build quality software. Atomiv is open source (MIT licence) so it can be freely used both for commercial purposes.
figure-class: figure-features2
image-class:
image: /img/about/about2.svg
alt: about
---

<!-- Promo / Benefits -->
<article class="ov-about">
    <div class="container">
        <div class="about-intro">
            <p>{{ page.description }}</p>
        </div>
        <!-- site.authors -->
            {% assign authors = site.authors | sort: 'weight' %}
            {% for author in authors %}
            <div class="row ov-about-row">
                <div class="col-12">
                    <div class="d-md-flex align-items-center">
                        <div>
                            <!-- TO DO VC increment version number when changing image -->
                            <img height="100" width="100" src="{{ site.url }}/img/about/team/{{ author.photo }}?v=4" alt="{{author.name}}"
                            class="img-fluid w-100 profile-img">
                        </div>
                        <div>
                            <h5>{{ author.name }}</h5>
                            <h6>{{ author.position }}</h6>
                            <p>{{ author.content | markdownify }}</p>
                            {% if author.city and author.country %}
                            <p class="mb-1 mb-md-0">{{ author.city}}, {{ author.country }}</p>
                            {% endif %}
                            {% if author.degree and author.university %}
                            <p class="mt-0 mb-4 mb-md-3">{{ author.degree }} | {{ author.university }}</p>
                            {% endif %}
                            <div style="">
                                {% if author.linkedin %}
                                <a href="{{ author.linkedin }}" target="_blank"><i class="fab fa-linkedin"></i></a>
                                {% endif %}
                                {% if author.xing %}
                                <a href="{{ author.xing }}" target="_blank"><i class="fab fa-xing"></i></a>
                                {% endif %}
                                {% if author.github %}
                                <a href="{{ author.github }}" target="_blank"><i class="fab fa-github"></i></a>
                                {% endif %}
                                {% if author.website %}
                                <a href="{{ author.website }}" target="_blank"><i class="fa fa-globe"></i></a>
                                {% endif %}
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            {% endfor %}
    </div>
</article>



