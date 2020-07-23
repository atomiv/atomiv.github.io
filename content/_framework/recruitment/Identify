---
title: Identify
category: recruitment
authors: [ fergus-obrien ]
---

### Identify

Assuming that there is some element of active sourcing required as part of the recruitment strategy, there will likely be need for the Recruiter to construct a set of boolean queries that surface prospective candidates with relevant skills and backgrounds. Boolean queries are a syntactically governed method of interrogating datasets so as to obtain relevant results.

One of the largest professional services datasets is curated by LinkedIn, and as such, this is a common locus for many active identification campaigns. However, every online database that is publicly/privately accessible, can be queried for relevant results. Github, StackOverflow, Job Boards, Meetup, Event Databases, University Lists (and so on) can be used along similar lines.

First order of business is to review the boolean guidelines on your platform of choice. In the case of LinkedIn, these read as follows:

> * **Quoted searches**: For an exact phrase, enclose the phrase in quotation marks. For example, type "product manager". You can also use quotation marks if you want to find someone with a multi-word title.
>    * LinkedIn search only supports standard, straight quotation marks ("). Other software or websites may use special symbols that our system does not recognize. Curly quotation marks (“), also known as smart quotes or typographer's quotes, aren't supported.
>    * In order to optimize overall site performance, stop words such as "by", "in", "with", etc. aren't used.
> * **NOT searches**: Type the word NOT (capital letters) immediately before a search term to exclude it from your search results. This typically limits your search results. For example, "programmer NOT manager".
> * **OR searches**: Type the word OR (capital letters) to see results that include one or more items in a list. This typically broadens your search results. For example, > "sales OR marketing OR advertising”.
> * **AND searches**: AND searches: Type the word AND (capital letters) to see results that include all items in a list. This typically limits your search results. For example, "accountant AND finance AND CPA".

> Note: You don't need to use AND. If your search has two or more terms, you'll automatically see results that include all of them.
> Parenthetical searches - To do a complex search, you can combine terms using parentheses. For example, to find people who have "VP" in their profiles, but exclude > "assistant to VP" or SVPs, type VP NOT (assistant OR SVP).
> When handling searches, the overall order to precedence is:

> * Quotes [""]
> * Parentheses [()]
> * NOT
> * AND
> * OR
> * Important:

> * The + and - operators are not officially supported by LinkedIn. Using AND in place of + and NOT in place of - makes a query much easier to read and guarantees that we'll handle the search correctly.
> * When using NOT, AND, or OR operators, you must type them in uppercase letters.
> * We don't support wildcard "*" searches.
> * Boolean search will work in the keyword field in Recruiter and Linkedin.com, and will work in the Company, title, and keyword field in Sales Navigator.

Now that we have been briefed on the way in which queries are parsed, we can start to formulate our own starter query, using the information put together in the definition phase earlier. 

>   - **Example Search Query #1:** (”software engineer” OR “senior engineer” OR “senior software”) AND (observability OR metrics OR traces OR logs OR tracing OR logging) AND (c++ OR golang)

This is starter search-string, intended to give us enough information to conduct the next segment of our search. By trawling the results from the starter-search, we equip ourselves with a library of keywords, market data and pattern data which enables us to continually iterate on our query formulation. Each current stage of the search powers the subsequent stage, from an information perspective. So our next two searches may look like this:

>  - **Example Search Query #2:** (”software engineer” OR “senior engineer” OR “senior software”) AND (observability) AND (metrics OR traces OR logs OR tracing OR logging) AND (c++ OR golang) NOT (director OR principal OR chief OR freelance OR freelancer OR contractor)

>   - **Example Search Query #3:** (”software engineer” OR “senior engineer” OR “senior software”) AND (observability) AND (metrics OR traces OR logs OR tracing OR logging OR monitoring OR aggregation) AND (c++ OR golang) NOT (director OR principal OR chief OR freelance OR freelancer OR contractor OR "devops engineer" OR recruiter OR "engineering manager")

This process can be repeated ad infinitum. Typically, **OR clauses** will increase the number of results returned, whereas **AND/NOT** clauses will reduce the number of results returned. By consciously controlling this interplay between the widening and narrowing of results, we can maximize our chances of identifying the right people with the right skills in the right places.


