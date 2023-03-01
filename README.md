# Simple Spring Lifelog Server

![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)![MongoDB](https://img.shields.io/badge/MongoDB-%234ea94b.svg?style=for-the-badge&logo=mongodb&logoColor=white)

## Description
* A simple lifelog server developed in Spring Boot Framework that serves REST APIs to retrieve metadata of lifelog moments stored in MongoDB database.
* **Base URL**: https://lifefoster-sv.computing.dcu.ie/lsc
## List of REST APIs

<details>
<summary><code>GET</code> <code><b>/metadata</b></code> <code>(get a preview of a subset of metadata)</code></summary>

##### Parameters

> None

##### Responses

> | http code     | content-type                      | 
> |---------------|-----------------------------------|
> | `200`         | `application/json`        	      |

</details>

<details>
<summary><code>GET</code> <code><b>/metadata/date-list</b></code> <code>(get a list of date available in the lifelog)</code></summary>

##### Parameters

> None

##### Responses

> | http code     | content-type                      | 
> |---------------|-----------------------------------|
> | `200`         | `application/json`        	      |

</details>

<details>
<summary><code>GET</code> <code><b>/metadata/filter-by-date</b></code> <code>(get a list of moment ids in )</code></summary>

##### Parameters

> | name              |  type     | data type      | description                         |
> |-------------------|-----------|----------------|-------------------------------------|
> | `date` |  required| string    | The date of the lifelog data       					 |

##### Responses

> | http code     | content-type                      | 
> |---------------|-----------------------------------|
> | `200`         | `application/json`        	      |

</details>

<details>
<summary><code>GET</code> <code><b>/metadata/get-metadata-by-id</b></code> <code>(get a list of moment ids in )</code></summary>

##### Parameters

> | name              |  type     | data type      | description                         |
> |-------------------|-----------|----------------|-------------------------------------|
> | `id` |  required  |  string   | The id of the moment      					 		 |

##### Responses

> | http code     | content-type                      | 
> |---------------|-----------------------------------|
> | `200`         | `application/json`        	      |

</details>

