---
title: Overview
category: recruitment
---

## Overview

Recruitment - in the context of collaborative technology projects - denotes a broad set of business processes and human activities that enable cross-functional teams to optimize their collective efficacy by adding complimentary skillsets, hard and soft.

Each set of recruiting activities is heavily dependent upon the specific organisational needs, and will differ substantially from case to case. However, there are a set of core ingredients that form the kernel of a typical recruitment process.

What we'll do in this article is explore the fictional use case of a Berlin-based startup building Observability software, in order to examine the common threads of a well-designed recruitment lifecycle, and outline the different considerations involved at each stage.

Below is a set of resources which may be useful if you want to explore any of these topics in greater detail:
* http://booleanblackbelt.com/
* https://www.sourcing.games/
* https://www.socialtalent.com/blog
* https://builtin.com/tech-recruiter-resources
* https://theundercoverrecruiter.com/

Please email me at fergus.obrien.navstar@gmail.com if you would like me to go into more detail on any of these topics, or if you have any suggestions to improve the clarity and structure of this exposition.


## Define

The primary recruiter and the key stakeholders must get together to define the organisational needs, and lay out a recruitment roadmap for a given time period. In many cases, this may mean looking forward across the coming 12 month period, and then breaking that down further in terms of prioritisation.

From the outcome of this process, we might decide that the ideal hiring roadmap for our fictional startup should look something like this:
* Q1 ー 1 Senior Backend Enginer
* Q2 ー 2 Mid-level Backend Engineers
* Q3 ー 1 Senior Frontend Engineer + 1 Junior Frontend Engineer
* Q4 ー UX Specialist + Devops Engineer + Customer Support Engineer

Once we have this high-level overview, and have reconciled it with the annual hiring budget, we are now in a position to operate at item level.

1. Define the ideal profile, in terms of the following:
  - Hard skills (what they bring to the table on day 1)
     - golang and/or c++
     - distributed systems
     - has worked on projects from ideation to production
     - 5-7 years of enterprise experience
  - Soft skills (what personal characteristics will be important in being successful)
     - potential for leading a team
     - interested in mentoring + development
     - works well in an autonomous environment
  - Motivation (why they want to make this change)
     - not impressed by current state of market
     - disillusioned by small contribution in big company
     - interested by specific technical challenge

   
## Anticipate

There are going to be some recurring resources that we need throughout the recruiting process. Because this is a hybrid exercise, most of these resources will fall under the category of marketing materials. So we make an index of the available resources at our disposal:

* Website
* Collateral documents (explaining product) or demo videos
* Relevant team bios
* Company blog
* Links to press, publicity or announcements
* A simple app outlining key info
* Any other online/offline resources that add value

Build a list of important background factors, which may include such things as:
  - Ideal target companies
  - Companies to avoid (clients, partners, investor network etc)
  - Relevant companies that are experiencing layoffs
  - Former colleagues from group network
  
Map out the Interview Process
  - Who is going to be involved
  - How will it be structured
  - What review mechanisms do we need  

Devise a search strategy:
  - Where are we going to find these individuals (e.g. Linkedin, Job Board, Referral, Employee Network etc)
  - Who is going to be in charge of the deliverables (e.g. Recruiter, Recruitment Project Manager, Founding team etc)
  - Review process (e.g. Friday status update meeting)

## Identify

In the talent landscape of 2020, the process of identification is indelibly entwined with the technical act of boolean querying. Boolean queries are a means of interrogating datasets so as to obtain results that suit your needs.

One of our biggest data sets for software engineers is LinkedIn, so we might use this platform as our primary locus of talent identification. But, every online database that is publicly/privately accessible, can be queried for relevant results. Github, StackOverflow, Job Boards, Meetup, Event Databases, University Lists (and so on) can be used along similar lines. The querying syntax and the UI will differ, but the fundamentals should remain similar.

Example Search Query: (”software engineer” OR “senior engineer” OR “senior software”) AND (observability OR metrics OR traces OR logs OR tracing OR logging) AND (c++ OR golang)

This is starter search-string, intended to give us enough information to conduct the next segment of our search. By trawling the results from the starter-search, we equip ourselves with a library of keywords, market data and pattern data which enables us to continually iterate on our query formulation. Each current stage of the search powers the subsequent stage, from an information perspective. So our next two searches may look like this:

Example Search Query #2: (”software engineer” OR “senior engineer” OR “senior software”) AND (observability) AND (metrics OR traces OR logs OR tracing OR logging) AND (c++ OR golang) NOT (director OR principal OR chief OR freelance OR freelancer OR contractor)

Example Search Query #3: (”software engineer” OR “senior engineer” OR “senior software”) AND (observability) AND (metrics OR traces OR logs OR tracing OR logging OR monitoring OR aggregation) AND (c++ OR golang) NOT (director OR principal OR chief OR freelance OR freelancer OR contractor OR "devops engineer" OR recruiter OR "engineering manager")

This process can be repeated ad infinitum. Typically, OR clauses will increase the number of results returned, whereas AND/NOT clauses will reduce the number of results returned. By consciously controlling this interplay between the widening and narrowing of results, we can maximize our chances of identiying the right people with the right skills in the right places.

## Engage

How do we establish contact with them? What are the different options? How much are we prepared to invest in each outgoing communication? What are we expecting in terms of success metrics? Do we adopt a volume-based approach, or a quality based approach? Do we know who is going to be responsible for this vast body of work?

We need to make sure that the messaging is carefully scripted, trying to optimize for the following components:
* tone
* credibility
* context
* personalization
* clarity

We might come up with the following intro message:

Name,

I’ve read all about your work @ insert_company_name doing insert_personalized_content.

We are a Berlin based engineering team focused on setting the direction of Observability for the next 10-20 years. After working in Google’s Distributed Tracing team for a combined 30+ years, we realized that it’s possible and preferable to combine Metrics, Traces & Logs under one single intuitive UI. Check out our backgrounds here and here, or check out our demo here.

After securing $3M in Series A funding from our preferred investors, we’re looking to scale the Backend engineering team with further energy, knowledge and enthusiasm. From what we’ve read about your background, you would be a perfect fit. Please take a look at the formal requirements here.

Would you be open to jumping on a call to discuss in more detail?

Best regards,
Recruiter 

The messaging must be continually improved, updated, critiqued, and optimized (A/B testing, hiring manager feedback, cross-team collaboration etc). 

Eventually, we will end up with a scenario where we have interested candidates ready to interview.

## Screen

Now we have candidates in play, we need to assess them according to the criteria that we outlined earlier (hard skills, soft skills, motivation). We will carry out an interview process which optimizes on all elements of our organisational requirements. At a framework level, it might look something like this:

- Stage 1 --> Motivation Screening 
   - basic assessment, addressing overall suitability and important contextual information. The agenda might look like this:
      - candidate introduces background and experience
      - recruiter introduces company and team
      - bilateral Q&A

- Stage 2 --> Light Technical Screening
   - verbal assessment of technical credentials, conducted by hiring manager or somebody else with technical know how. The agenda might look like this: 
      - candidate talks about past project history
      - interviewer asks for specific details around project requirements, team structure, technical decisions, problems encountered etc
      - direction of interview is driven by the interplay between both parties

- Stage 3 --> Written Technical Assessment
   - written assessment of technical credentials: either improvised, or using an established online assessor (e.g. HackerRank, Codesignal, Codility etc)
      - should not be so time intensive that it puts off potential candidates

- Stage 4 --> Final Screening 
   - holistic conversation focused on future contribution and addressing information assymetry. The agenda might look like this:
      - interviewer gets feedback on interview process so far
      - interviewer talks about a typical working day at the company
      - interviewer talks about specific challenges that might be encountered 
      - candidate asks questions
      
- Stage 5 --> Offer Preparation + Release
   - employment details are finalized, compensation levels agreed, contracts are exchanged and signed

## On-board

Now that all of this work has been done, it's essential that a thorough on-boarding process is carried out to ensure that the transition passes as smoothly as possible. Some of the key questions that need to be addressed:
   - How was Week 1?
   - How was Month 1?
   - How is the relationship between new hire and manager?
   - What does the rest of the team look like?
   - Is the new hire working on things discussed beforehand?
   - How does the new hire enjoy the day-to-day working culture?
   - What changes would the new hire make if in charge?
   - What is the new hire expected to accomplish by the end of the quarter?
   - What is the new hire expected to accomplish by the end of the year?
   - Does the new hire think that this is achievable?

## Conclusions

* Recruitment is an optimization challenge where competing priorities seek expression in formal business schema. These competing priorities can often be characterized in terms of:
      - short-term v long-term
      - static v evolving
      - top-down v bottom-up
      - budget
      - market conditions
      - need to screen v need to sell
* There is no singular best solution to this optimization challenge.
      - all you can do is find the best model for your given organisational needs
      - it will require thinking about the organisation across multiple dimensions: marketing, sales, engineering, biz ops, public relations etc
* Recruiting is a team game, and requires great planning, communication, collaboration and agility
      - everyone in the business can be a recruiter
      - a healthy recruiting function is a good indicator of a healthy business
      
