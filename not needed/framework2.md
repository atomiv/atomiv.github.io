---
# layout: templates
# layout: sidebar-framework
title: Framework
description: Framework
---


hello there
this is the framework main page


<ul>
    {% for staff_member in site.frameworks %}
      <li>
        
        <h2>{{ framework.title }}</a></h2>
      </li>
    {% endfor %}
  </ul>


<!-- TODO: VC: Adding in details regarding the templates -->

<!--
TEMPLATES

These would be row-based, including title, paragraph and then a screencast, and it would also link to the menu items

Backend (screencast: installing and running template in Visual Studio, shows Swagger)
Frontend (screencast: installing and running template in Visual Studio Code, shows screen)
QA (screencast: installing and running template in Visual Studio, shows Test Explorer)
DevOps (future)
PM (future)
BA (future)
Process (screencast: viewing/downloading the templates for documents/process)
-->
>>>>>>>



