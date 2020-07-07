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
        
<!-- ------------------------------------------------------------------ -->

{% for author in site.data.authors.docs %}

{% for siteauthor in site.authors %}

{% if author.name == siteauthor.name %}

<!-- to show the content. if you want to show teh name, say: siteauthor.name -->
<p>Author: {{ siteauthor.name }}</p>
<p>{{ siteauthor.position }}</p>

{% endif %}            
{% endfor %}
{% endfor %}

    </div>
</article>

