---
layout: page
title: About
vversion2: 4
description: About Atomiv
---

<!-- Banner -->
<header class="ov-banner">
    <div class="container">
        <h1>Meet our authors</h1>
        <div class="d-flex justify-content-center">
            <figure class="figure-features2">
                <img height="" width="" src="{{ site.url }}/img/about/about2.svg" alt="architecture" class="img-fluid">
            </figure>
        </div>
    </div>
</header>



<!-- Promo / Benefits -->
<article class="ov-about">
    <div class="container">
        <div class="about-intro">
            <!-- Intro -->
            <p>Atomiv is an all-in-one template to help IT teams build high quality software faster. It is built specifically for enterprise software development needs, covering project management, architecture and development. Atomiv is rooted in best practices in enterprise architecture, providing a standardized software solution template. This provides your software teams with a clean architecture foundation, so that they can quickly and easily build quality software. Atomiv is open source (MIT licence) so it can be freely used both for commercial purposes.</p>
        </div>
        {% for author in site.authors %}
		<div class="row ov-about-row">
            <div class="col-12">
                <!-- align-items-end -->
                <div class="d-md-flex align-items-center">
                    <div>
                        <!-- image can be on the right side -->
                        <img height="100" width="100" src="{{ site.url }}/img/about/team/{{ author.photo }}" alt="{{author.name}}"
                        class="img-fluid w-100 profile-img">
                    </div>
                    <div>
                        <h5>{{ author.name }}</h5>
                        <h6>{{ author.position }}</h6>
                        <p>{{ author.content | markdownify }}</p>
                        <div>
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

















<!-- TODO: VC: This is older text, see whether it can be incorporated -->

<!--

Ready to accelerate your enterprise software development teams and deliver successful software projects? Welcome to Atomiv.
What is the Atomiv?
Atomiv is a high-quality high-performance architecture framework built for software enterprise teams. It is rooted in best practices in enterprise architecture, providing a standardized software solution template. This provides your software teams with a clean architecture foundation, so that they can quickly and easily build quality software - accelerate your development whilst retaining high quality.
Atomiv is open source (MIT licence) so it can be freely used both for commercial and non-commercial purposes.
How can Atomiv help you?
Atomiv is designed to support your software teams:
Develop high quality & high performance software
Develop software faster than ever before
Develop software in a standardized way
Easily grow your teams with new members
Atomiv is designed to support your organization:
Deliver on time & budget
Increase profitability & decrease costs
Make your customers happy



Principles

Atomiv has an engineering-oriented approach to software. Our belief is that a lot of software development can be systematized, and that we want to achieve organizational success without too much reliance on having to hire A-players. Thus, it is designed to work well both on teams with lots of seniors but also with juniors.

Atomiv is founded upon the following three principles.

Quality principle

Speed principle

Standardization principle

Quality principle
Quality software is a prerequisite for producing software which works well, with minimal defects and with low maintenance costs, and overall providing a good customer experience. When projects don't start with a quality architecture and accumulate technical debt over time, it reaches a point when there are too many bugs, the software is unusable, new features cause system breakdown, developers lose productivity and overall leading to customer dissatisfaction. It is essential that projects are started with a solid quality architectural foundation - this is exactly the core focus of Atomiv, to help you develop modular, flexible, extensible and maintainable software.

Speed principle
However, even though we recognize the importance the importance of quality, we are also familiar with the time pressures faced in software projects - to deliver early, to deliver fast, whereby in reality, in the short-term, development speed becomes more important than quality, even though quality is essential for long-term development speed. This is a major barrier for organizations looking to setup quality system architecture. This is where Atomiv comes in - it provides a template for the solution architecture as well as components to reduce development time.

Standardization principle
Last, but not least we come to standardization - the principle to standardize project structure so that we can systemically achieve quality and speed across our software projects. This also increases re-use and provides organizations with higher flexibility to organize development teams and incorporate new members, and avoids to the "re-invent the wheel" syndrome. It also makes project success a part of the organization, rather than relying on a few "talented" "A-player" individuals. Atomiv did not invent anything new, it simply took existing best practices and provided a standardized templated solution.

Licensed under the MIT license. This means you’re free to use it for commercial and non-commercial purposes.
Copyright © 2019 Optivem All Rights Reserved.


Support
You can send questions, improvement suggestions and issue reports on GitHub. These will be used to further improve our open source software.

-->


